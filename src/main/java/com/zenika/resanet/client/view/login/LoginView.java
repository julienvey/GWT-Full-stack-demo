package com.zenika.resanet.client.view.login;

import com.google.gwt.user.client.ui.HasValue;
import com.zenika.resanet.client.socle.View;

public interface LoginView extends View {

    HasValue<String> getLoginInput();

    HasValue<String> getPasswordInput();
}
