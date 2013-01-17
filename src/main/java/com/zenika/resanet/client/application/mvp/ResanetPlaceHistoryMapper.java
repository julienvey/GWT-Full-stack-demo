package com.zenika.resanet.client.application.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.zenika.resanet.client.view.login.LoginPlace;
import com.zenika.resanet.client.view.operator.OperatorPlace;

@WithTokenizers({LoginPlace.Tokenizer.class, OperatorPlace.Tokenizer.class})
public interface ResanetPlaceHistoryMapper extends PlaceHistoryMapper {
}
