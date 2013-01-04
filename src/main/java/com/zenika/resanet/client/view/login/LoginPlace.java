package com.zenika.resanet.client.view.login;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class LoginPlace extends Place {

    @Prefix("login")
    public static class Tokenizer implements PlaceTokenizer<LoginPlace> {
        @Override
        public LoginPlace getPlace(String s) {
            return new LoginPlace();
        }

        @Override
        public String getToken(LoginPlace loginPlace) {
            return "";
        }
    }

}
