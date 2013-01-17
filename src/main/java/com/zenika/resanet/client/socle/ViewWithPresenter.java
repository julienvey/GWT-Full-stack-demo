package com.zenika.resanet.client.socle;

public interface ViewWithPresenter<P extends Presenter> extends View {

    void setPresenter(P presenter);

}