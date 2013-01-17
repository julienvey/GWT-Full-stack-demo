package com.zenika.resanet.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.zenika.resanet.server.handler.AuthenticateHandler;
import com.zenika.resanet.server.handler.SaveOperatorHandler;
import net.customware.gwt.dispatch.client.standard.StandardDispatchService;
import net.customware.gwt.dispatch.server.DefaultActionHandlerRegistry;
import net.customware.gwt.dispatch.server.Dispatch;
import net.customware.gwt.dispatch.server.InstanceActionHandlerRegistry;
import net.customware.gwt.dispatch.server.SimpleDispatch;
import net.customware.gwt.dispatch.shared.Action;
import net.customware.gwt.dispatch.shared.DispatchException;
import net.customware.gwt.dispatch.shared.Result;

public class SimpleDispatchServlet extends RemoteServiceServlet implements StandardDispatchService {

    private Dispatch dispatch;

    public SimpleDispatchServlet() {
        InstanceActionHandlerRegistry registry = new DefaultActionHandlerRegistry();
        registry.addHandler(new AuthenticateHandler());
        registry.addHandler(new SaveOperatorHandler());
        dispatch = new SimpleDispatch(registry);
    }

    public Result execute(Action<?> action) throws DispatchException {

        try {
            return dispatch.execute(action);
        } catch (RuntimeException e) {
            log("exception while executing " + action.getClass().getName() + ": " + e.getMessage(), e);
            throw e;
        }
    }

}