package com.zenika.resanet.client.view.resources;

import com.google.gwt.i18n.client.Messages;
import com.google.inject.Singleton;

@Singleton
public interface ResanetMessages extends Messages {

    @DefaultMessage("Login")
    String login();

    @DefaultMessage("Mot de passe")
    String password();

    @DefaultMessage("Reset")
    String reset();

    @DefaultMessage("Se connecter")
    String connect();

    @DefaultMessage("Nom")
    String lastName();

    @DefaultMessage("Prénom")
    String firstName();

    @DefaultMessage("Téléphone")
    String phone();

    @DefaultMessage("Email")
    String email();

    @DefaultMessage("Role")
    String role();

    @DefaultMessage("Sauvegarder les modifications")
    String saveModifications();
}
