package com.zenika.resanet.client.socle;


import com.google.web.bindery.event.shared.EventBus;

public abstract class SimplePresenter<D extends View> implements Presenter {

    protected final D display;

    protected final EventBus eventBus;

    public SimplePresenter(D display, EventBus eventBus) {
        this.display = display;
        this.eventBus = eventBus;
    }

    @Override
    public D getView() {
        return display;
    }

}
