package com.zenika.resanet.client.application.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.zenika.resanet.client.view.login.LoginPresenter;
import com.zenika.resanet.client.view.operateur.OperateurPlace;
import com.zenika.resanet.client.view.operateur.OperateurPresenter;

public class ResanetActivityMapper implements ActivityMapper {

    @Inject
    LoginPresenter loginPresenter;

    @Inject
    OperateurPresenter operateurPresenter;

    @Override
    public Activity getActivity(Place place) {
        if(place instanceof OperateurPlace){
            return operateurPresenter;
        }
       return loginPresenter;
    }

}
