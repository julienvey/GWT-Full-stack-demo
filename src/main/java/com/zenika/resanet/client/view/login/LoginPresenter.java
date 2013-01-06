package com.zenika.resanet.client.view.login;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.zenika.resanet.client.socle.ActivityPresenter;
import com.zenika.resanet.client.view.operateur.OperateurPlace;

@Singleton
public class LoginPresenter extends ActivityPresenter<LoginView> {

    @Inject
    PlaceController placeController;

    @Inject
    public LoginPresenter(LoginView display, EventBus eventBus) {
        super(display, eventBus);
        display.setPresenter(this);
    }

    @Override
    public void doStart() {
    }

    public void reset() {
        view.getLoginInput().setValue("");
        view.getPasswordInput().setValue("");
    }

    public void connect() {
        // TODO
        placeController.goTo(new OperateurPlace(""));
    }
}
