package com.zenika.resanet.client.view.operator;

import com.google.gwt.user.client.ui.HasValue;
import com.zenika.resanet.client.socle.ViewWithPresenter;

public interface OperatorView extends ViewWithPresenter<OperatorPresenter> {
    HasValue<String> getLoginInput();

    HasValue<String> getPhoneInput();

    HasValue<String> getMailInput();

    HasValue<String> getRoleInput();

    HasValue<String> getFirstNameInput();

    HasValue<String> getLastNameInput();

    HasValue<String> getPasswordInput();
}
