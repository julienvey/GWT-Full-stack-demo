package com.zenika.resanet.client.view.operator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.zenika.resanet.client.socle.ActivityPresenter;
import com.zenika.resanet.shared.dispatch.action.SaveOperatorAction;
import com.zenika.resanet.shared.dispatch.result.VoidResult;
import com.zenika.resanet.shared.dto.Operator;
import com.zenika.resanet.shared.dto.OperatorRole;
import net.customware.gwt.dispatch.client.DispatchAsync;

@Singleton
public class OperatorPresenter extends ActivityPresenter<OperatorView> {

    @Inject
    PlaceController placeController;

    @Inject
    DispatchAsync dispatchAsync;

    @Inject
    public OperatorPresenter(OperatorView display, EventBus eventBus) {
        super(display, eventBus);
        display.setPresenter(this);
    }

    @Override
    public void doStart() {
        OperatorPlace currentPlace = (OperatorPlace) placeController.getWhere();
        Operator operator = currentPlace.getOperator();
        if (operator != null) {
            view.getLoginInput().setValue(operator.getLogin());
            view.getMailInput().setValue(operator.getEmail());
            view.getPhoneInput().setValue(operator.getPhone());
            view.getRoleInput().setValue(operator.getRole().name());
            view.getFirstNameInput().setValue(operator.getFirstName());
            view.getLastNameInput().setValue(operator.getLastName());
            view.getPasswordInput().setValue(operator.getPassword());
        }
    }

    @Override
    public void reset() {
        view.getLoginInput().setValue(null);
        view.getMailInput().setValue(null);
        view.getPhoneInput().setValue(null);
        view.getRoleInput().setValue(null);
        view.getFirstNameInput().setValue(null);
        view.getLastNameInput().setValue(null);
        view.getPasswordInput().setValue(null);
    }

    public void saveOperator() {
        Operator operator = new Operator();
        operator.setLogin(view.getLoginInput().getValue());
        operator.setEmail(view.getMailInput().getValue());
        operator.setPhone(view.getPhoneInput().getValue());
        operator.setRole(OperatorRole.valueOf(view.getRoleInput().getValue()));
        operator.setFirstName(view.getFirstNameInput().getValue());
        operator.setLastName(view.getLastNameInput().getValue());
        operator.setPassword(view.getPasswordInput().getValue());

        dispatchAsync.execute(new SaveOperatorAction(operator), new AsyncCallback<VoidResult>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert("Échec de la sauvegarde de l'opérateur");
                GWT.log(throwable.getMessage());
            }

            @Override
            public void onSuccess(VoidResult voidResult) {
                Window.alert("Opérateur sauvegardé avec succès");
            }
        });
    }
}
