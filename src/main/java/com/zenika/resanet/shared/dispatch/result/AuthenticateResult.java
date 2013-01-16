package com.zenika.resanet.shared.dispatch.result;

import com.zenika.resanet.shared.dto.Operator;
import net.customware.gwt.dispatch.shared.Result;

public class AuthenticateResult implements Result {

    private Operator operator;

    public AuthenticateResult() {
    }

    public AuthenticateResult(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }
}
