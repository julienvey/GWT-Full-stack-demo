package com.zenika.resanet.server.handler;

import com.zenika.resanet.server.service.mock.ServiceFactory;
import com.zenika.resanet.shared.dispatch.action.SaveOperatorAction;
import com.zenika.resanet.shared.dispatch.result.VoidResult;
import net.customware.gwt.dispatch.server.ActionHandler;
import net.customware.gwt.dispatch.server.ExecutionContext;
import net.customware.gwt.dispatch.shared.DispatchException;

public class SaveOperatorHandler implements ActionHandler<SaveOperatorAction, VoidResult> {

    @Override
    public Class<SaveOperatorAction> getActionType() {
        return SaveOperatorAction.class;
    }

    @Override
    public VoidResult execute(SaveOperatorAction action, ExecutionContext context) throws DispatchException {
        return ServiceFactory.getUserService().save(action.getOperator());
    }

    @Override
    public void rollback(SaveOperatorAction action, VoidResult result, ExecutionContext context) throws DispatchException {
    }
}
