package com.zenika.resanet.client.view.operateur;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class OperateurPlace extends Place {

    private String operateurId;

    public OperateurPlace(String operateurId) {
        this.operateurId = operateurId;
    }

    public String getOperateurId() {
        return operateurId;
    }

    @Prefix("operateur")
    public static class Tokenizer implements PlaceTokenizer<OperateurPlace> {
        @Override
        public OperateurPlace getPlace(String token) {
            return new OperateurPlace(token);
        }

        @Override
        public String getToken(OperateurPlace operateurPlace) {
            return operateurPlace.getOperateurId();
        }
    }
}
