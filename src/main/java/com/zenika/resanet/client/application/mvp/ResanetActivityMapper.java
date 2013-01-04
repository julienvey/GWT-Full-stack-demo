package com.zenika.resanet.client.application.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.zenika.resanet.client.view.login.LoginPresenter;

public class ResanetActivityMapper implements ActivityMapper {

    @Inject
    LoginPresenter loginPresenter;

    @Override
    public Activity getActivity(Place place) {
       return loginPresenter;
    }

}
