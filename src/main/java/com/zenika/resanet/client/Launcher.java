package com.zenika.resanet.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.zenika.resanet.client.application.ioc.ResanetInjector;

public class Launcher implements EntryPoint {

    public static ResanetInjector INJECTOR = GWT.create(ResanetInjector.class);

    @Override
    public void onModuleLoad() {
        SimplePanel mainPanel = new SimplePanel();
        mainPanel.addStyleName("container");
        RootPanel.get().add(mainPanel);

        INJECTOR.getActivityManager().setDisplay(mainPanel);

        INJECTOR.getPlaceHistoryHandler().handleCurrentHistory();
    }
}
