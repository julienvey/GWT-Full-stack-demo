package com.zenika.resanet.client.view.login.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.zenika.resanet.client.socle.SimpleView;
import com.zenika.resanet.client.view.login.LoginPresenter;
import com.zenika.resanet.client.view.login.LoginView;


public class LoginDesktopView extends SimpleView<LoginPresenter> implements LoginView {

    interface LoginDesktopViewUiBinder extends UiBinder<Widget, LoginDesktopView> {
    }

    private static LoginDesktopViewUiBinder binder = GWT.create(LoginDesktopViewUiBinder.class);

    @UiField(provided = true)
    protected LoginResources resources;

    @UiField
    protected TextBox loginTextBox;

    @UiField
    protected PasswordTextBox passwordTextBox;

    @Inject
    public LoginDesktopView(LoginResources resources) {
        this.resources = resources;
        resources.style().ensureInjected();
        initWidget(binder.createAndBindUi(this));
    }

    @UiHandler("resetButton")
    public void handleResetButton(ClickEvent event) {
        presenter.reset();
    }

    @UiHandler("connectButton")
    public void handleConnectButton(ClickEvent event) {
        presenter.connect();
    }

    @Override
    public HasValue<String> getLoginInput() {
        return loginTextBox;
    }

    @Override
    public HasValue<String> getPasswordInput() {
        return passwordTextBox;
    }
}