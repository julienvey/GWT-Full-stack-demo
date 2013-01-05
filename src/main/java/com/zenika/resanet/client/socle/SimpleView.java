package com.zenika.resanet.client.socle;

import com.google.gwt.user.client.ui.Composite;

public abstract class SimpleView<P extends Presenter> extends Composite {

    protected P presenter;

    public void setPresenter(P presenter) {
        this.presenter = presenter;
    }
}
