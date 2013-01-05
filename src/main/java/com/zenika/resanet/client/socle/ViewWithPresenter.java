package com.zenika.resanet.client.socle;

import com.google.gwt.user.client.ui.Widget;

public interface ViewWithPresenter<P extends Presenter> extends View {

    void setPresenter(P presenter);

}