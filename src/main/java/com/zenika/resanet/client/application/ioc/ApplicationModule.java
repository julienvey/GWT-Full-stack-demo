package com.zenika.resanet.client.application.ioc;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.zenika.resanet.client.application.mvp.ResanetActivityMapper;
import com.zenika.resanet.client.application.mvp.ResanetPlaceHistoryMapper;
import com.zenika.resanet.client.view.login.LoginPlace;

public class ApplicationModule extends AbstractGinModule {

    @Override
    public void configure() {
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

        bind(ActivityMapper.class).to(ResanetActivityMapper.class).in(Singleton.class);

        bind(PlaceHistoryMapper.class).to(ResanetPlaceHistoryMapper.class).in(Singleton.class);
    }

    @Provides
    @Singleton
    @Inject
    public PlaceController providePlaceController(EventBus eventBus){
        return new PlaceController(eventBus);
    }

    @Provides
    @Singleton
    @Inject
    public ActivityManager provideActivityManager(ActivityMapper activityMapper, EventBus eventBus) {
        return new ActivityManager(activityMapper, eventBus);
    }

    @Provides
    @Singleton
    @Inject
    public PlaceHistoryHandler providePlaceHistoryHandler(PlaceHistoryMapper historyMapper, PlaceController placeController, EventBus eventBus) {
        PlaceHistoryHandler handler = new PlaceHistoryHandler(historyMapper);
        handler.register(placeController, eventBus, new LoginPlace());
        return handler;
    }

}
