package com.zenika.resanet.server.handler;

import com.zenika.resanet.server.service.mock.ServiceFactory;
import com.zenika.resanet.shared.dispatch.action.AuthenticateAction;
import com.zenika.resanet.shared.dispatch.result.AuthenticateResult;
import net.customware.gwt.dispatch.server.ActionHandler;
import net.customware.gwt.dispatch.server.ExecutionContext;
import net.customware.gwt.dispatch.shared.DispatchException;

public class AuthenticateHandler implements ActionHandler<AuthenticateAction, AuthenticateResult> {

    @Override
    public Class<AuthenticateAction> getActionType() {
        return AuthenticateAction.class;
    }

    @Override
    public AuthenticateResult execute(AuthenticateAction action, ExecutionContext context) throws DispatchException {
        return new AuthenticateResult(ServiceFactory.getUserService().authenticate(action.getEmail(), action.getPassword()));
    }

    @Override
    public void rollback(AuthenticateAction action, AuthenticateResult result, ExecutionContext context) throws DispatchException {

    }
}
