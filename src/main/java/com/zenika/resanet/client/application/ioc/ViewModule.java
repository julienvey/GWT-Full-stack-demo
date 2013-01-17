package com.zenika.resanet.client.application.ioc;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.zenika.resanet.client.view.login.LoginView;
import com.zenika.resanet.client.view.login.desktop.LoginDesktopView;
import com.zenika.resanet.client.view.operator.OperatorView;
import com.zenika.resanet.client.view.operator.desktop.OperatorDesktopView;

public class ViewModule extends AbstractGinModule {

    @Override
    public void configure() {
        bind(LoginView.class).to(LoginDesktopView.class).in(Singleton.class);

        bind(OperatorView.class).to(OperatorDesktopView.class).in(Singleton.class);

    }
}
