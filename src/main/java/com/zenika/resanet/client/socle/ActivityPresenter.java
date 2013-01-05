package com.zenika.resanet.client.socle;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;


public abstract class ActivityPresenter<D extends View> extends SimplePresenter<D> implements Activity {

    public ActivityPresenter(D display, EventBus eventBus) {
        super(display, eventBus);
    }

    @Override
    public void start(AcceptsOneWidget acceptsOneWidget, com.google.gwt.event.shared.EventBus eventBus) {
        reset();
        doStart();
        acceptsOneWidget.setWidget(view.asWidget());
    }

    public abstract void doStart();

    @Override
    public String mayStop() {
        return null;
    }

    @Override
    public void onCancel() {
    }

    @Override
    public void onStop() {
    }

    public abstract void reset();
}
