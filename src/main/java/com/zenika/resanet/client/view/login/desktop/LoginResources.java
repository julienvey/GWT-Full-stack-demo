package com.zenika.resanet.client.view.login.desktop;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Singleton;

@Singleton
public interface LoginResources extends ClientBundle {

    @Source("logo.gif")
    ImageResource logo();

    @Source("login.css")
    Style style();

    interface Style extends CssResource {
        String logo();
    }
}
