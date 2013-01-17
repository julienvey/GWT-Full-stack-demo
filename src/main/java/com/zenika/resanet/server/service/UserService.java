package com.zenika.resanet.server.service;

import com.zenika.resanet.shared.dispatch.exception.OperatorNotFoundException;
import com.zenika.resanet.shared.dispatch.result.VoidResult;
import com.zenika.resanet.shared.dto.Operator;

public interface UserService {

    Operator authenticate(String email, String password) throws OperatorNotFoundException;

    VoidResult save(Operator operator);
}
