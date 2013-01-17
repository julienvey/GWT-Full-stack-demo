package com.zenika.resanet.shared.dispatch.action;

import com.zenika.resanet.shared.dispatch.result.VoidResult;
import com.zenika.resanet.shared.dto.Operator;
import net.customware.gwt.dispatch.shared.Action;

public class SaveOperatorAction implements Action<VoidResult> {

    Operator operator;

    public SaveOperatorAction() {
    }

    public SaveOperatorAction(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
