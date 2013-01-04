package com.zenika.resanet.client.view.login;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.zenika.resanet.client.socle.ActivityPresenter;

public class LoginPresenter extends ActivityPresenter<LoginView> {

    @Inject
    public LoginPresenter(LoginView display, EventBus eventBus) {
        super(display, eventBus);
    }

    @Override
    public void doStart() {
    }


}
