package com.zenika.resanet.client.view.login.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Widget;
import com.zenika.resanet.client.view.login.LoginView;


public class LoginDesktopView extends Composite implements LoginView {

    interface LoginDesktopViewUiBinder extends UiBinder<Widget, LoginDesktopView> {

    }
    private static LoginDesktopViewUiBinder binder = GWT.create(LoginDesktopViewUiBinder.class);

    public LoginDesktopView() {
        initWidget(binder.createAndBindUi(this));
    }

    @Override
    public HasValue<String> getLoginInput() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HasValue<String> getPasswordInput() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}