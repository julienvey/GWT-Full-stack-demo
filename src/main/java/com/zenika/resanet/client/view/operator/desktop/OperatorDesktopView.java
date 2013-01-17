package com.zenika.resanet.client.view.operator.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.zenika.resanet.client.socle.SimpleView;
import com.zenika.resanet.client.view.resources.ResanetMessages;
import com.zenika.resanet.client.view.resources.ResanetResources;
import com.zenika.resanet.client.view.operator.OperatorPresenter;
import com.zenika.resanet.client.view.operator.OperatorView;


public class OperatorDesktopView extends SimpleView<OperatorPresenter> implements OperatorView {

    interface OperateurDesktopViewUiBinder extends UiBinder<Widget, OperatorDesktopView> {

    }

    private static OperateurDesktopViewUiBinder uiBinder = GWT.create(OperateurDesktopViewUiBinder.class);

    @UiField(provided = true)
    protected ResanetResources resources;

    @UiField(provided = true)
    protected ResanetMessages messages;

    @UiField
    protected TextBox loginTextBox;

    @UiField
    protected TextBox phoneTextBox;

    @UiField
    protected TextBox mailTextBox;

    @UiField
    protected TextBox roleTextBox;

    @UiField
    protected TextBox firstNameTextBox;

    @UiField
    protected TextBox lastNameTextBox;

    @UiField
    protected PasswordTextBox passwordTextBox;

    @Inject
    public OperatorDesktopView(ResanetResources resources, ResanetMessages messages) {
        this.messages = messages;
        this.resources = resources;
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("saveButton")
    public void handleSaveButtonClicked(ClickEvent event) {
        presenter.saveOperator();
    }

    @Override
    public HasValue<String> getLoginInput() {
        return loginTextBox;
    }

    @Override
    public HasValue<String> getPhoneInput() {
        return phoneTextBox;
    }

    @Override
    public HasValue<String> getMailInput() {
        return mailTextBox;
    }

    @Override
    public HasValue<String> getRoleInput() {
        return roleTextBox;
    }

    @Override
    public HasValue<String> getFirstNameInput() {
        return firstNameTextBox;
    }

    @Override
    public HasValue<String> getLastNameInput() {
        return lastNameTextBox;
    }

    @Override
    public HasValue<String> getPasswordInput() {
        return passwordTextBox;
    }
}