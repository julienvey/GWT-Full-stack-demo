package com.zenika.resanet.client.socle;


import com.google.web.bindery.event.shared.EventBus;

public abstract class SimplePresenter<D extends View> implements Presenter {

    protected final D view;

    protected final EventBus eventBus;

    public SimplePresenter(D view, EventBus eventBus) {
        this.view = view;
        this.eventBus = eventBus;
    }

    @Override
    public D getView() {
        return view;
    }

}
