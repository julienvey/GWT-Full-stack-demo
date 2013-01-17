package com.zenika.resanet.client.view.operator;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.zenika.resanet.shared.dto.Operator;

public class OperatorPlace extends Place {

    private Operator operator;

    public OperatorPlace(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    @Prefix("operator")
    public static class Tokenizer implements PlaceTokenizer<OperatorPlace> {
        @Override
        public OperatorPlace getPlace(String token) {
            return new OperatorPlace(null);
        }

        @Override
        public String getToken(OperatorPlace operatorPlace) {
            Operator op = operatorPlace.getOperator();
            if (op != null) {
                return op.getLogin();
            }
            return null;
        }
    }
}
