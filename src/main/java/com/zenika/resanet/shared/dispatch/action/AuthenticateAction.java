package com.zenika.resanet.shared.dispatch.action;

import com.zenika.resanet.shared.dispatch.result.AuthenticateResult;
import net.customware.gwt.dispatch.shared.Action;

public class AuthenticateAction implements Action<AuthenticateResult> {

    private String email;
    private String password;

    public AuthenticateAction() {
    }

    public AuthenticateAction(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
