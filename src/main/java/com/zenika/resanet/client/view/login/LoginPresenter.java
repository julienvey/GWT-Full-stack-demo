package com.zenika.resanet.client.view.login;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.zenika.resanet.client.socle.ActivityPresenter;
import com.zenika.resanet.client.view.operator.OperatorPlace;
import com.zenika.resanet.shared.dispatch.action.AuthenticateAction;
import com.zenika.resanet.shared.dispatch.result.AuthenticateResult;
import net.customware.gwt.dispatch.client.DispatchAsync;

@Singleton
public class LoginPresenter extends ActivityPresenter<LoginView> {

    @Inject
    PlaceController placeController;

    @Inject
    DispatchAsync dispatchAsync;

    @Inject
    public LoginPresenter(LoginView display, EventBus eventBus) {
        super(display, eventBus);
        display.setPresenter(this);
    }

    @Override
    public void doStart() {
    }

    public void reset() {
        view.getLoginInput().setValue(null);
        view.getPasswordInput().setValue(null);
    }

    public void connect() {
        dispatchAsync.execute(new AuthenticateAction(view.getLoginInput().getValue(), view.getPasswordInput().getValue()),
                new AsyncCallback<AuthenticateResult>() {
                    @Override
                    public void onFailure(Throwable throwable) {
                        Window.alert("Échec de l'authentification");
                    }

                    @Override
                    public void onSuccess(AuthenticateResult authenticateResult) {
                        placeController.goTo(new OperatorPlace(authenticateResult.getOperator()));
                    }
                });
    }
}
