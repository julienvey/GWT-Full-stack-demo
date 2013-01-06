package com.zenika.resanet.client.application.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.zenika.resanet.client.view.login.LoginPlace;
import com.zenika.resanet.client.view.operateur.OperateurPlace;

@WithTokenizers({LoginPlace.Tokenizer.class, OperateurPlace.Tokenizer.class})
public interface ResanetPlaceHistoryMapper extends PlaceHistoryMapper {
}
