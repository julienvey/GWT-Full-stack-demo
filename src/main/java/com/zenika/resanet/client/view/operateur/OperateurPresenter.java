package com.zenika.resanet.client.view.operateur;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.zenika.resanet.client.socle.ActivityPresenter;

@Singleton
public class OperateurPresenter extends ActivityPresenter<OperateurView> {

    @Inject
    public OperateurPresenter(OperateurView display, EventBus eventBus) {
        super(display, eventBus);
        display.setPresenter(this);
    }

    @Override
    public void doStart() {

    }

    @Override
    public void reset() {

    }
}
