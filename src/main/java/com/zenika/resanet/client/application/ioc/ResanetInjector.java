package com.zenika.resanet.client.application.ioc;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;

@GinModules({ApplicationModule.class, ViewModule.class})
public interface ResanetInjector extends Ginjector {

    PlaceHistoryHandler getPlaceHistoryHandler();

    ActivityManager getActivityManager();
}
