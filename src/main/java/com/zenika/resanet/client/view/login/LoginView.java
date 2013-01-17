package com.zenika.resanet.client.view.login;

import com.google.gwt.user.client.ui.HasValue;
import com.zenika.resanet.client.socle.ViewWithPresenter;

public interface LoginView extends ViewWithPresenter<LoginPresenter> {

    HasValue<String> getLoginInput();

    HasValue<String> getPasswordInput();
}
