package com.zenika.resanet.client.view.operateur.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.zenika.resanet.client.socle.SimpleView;
import com.zenika.resanet.client.view.login.desktop.LoginResources;
import com.zenika.resanet.client.view.operateur.OperateurPresenter;
import com.zenika.resanet.client.view.operateur.OperateurView;


public class OperateurDesktopView extends SimpleView<OperateurPresenter> implements OperateurView {

    interface OperateurDesktopViewUiBinder extends UiBinder<Widget, OperateurDesktopView> {
    }

    private static OperateurDesktopViewUiBinder uiBinder = GWT.create(OperateurDesktopViewUiBinder.class);

    @UiField(provided = true)
    protected LoginResources resources;

    @Inject
    public OperateurDesktopView(LoginResources resources) {
        this.resources = resources;
        initWidget(uiBinder.createAndBindUi(this));

    }
}