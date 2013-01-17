package com.zenika.resanet.server.service.mock;

import com.zenika.resanet.server.service.UserService;
import com.zenika.resanet.shared.dispatch.exception.OperatorNotFoundException;
import com.zenika.resanet.shared.dispatch.result.VoidResult;
import com.zenika.resanet.shared.dto.Operator;
import com.zenika.resanet.shared.dto.OperatorRole;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private Map<String, Operator> operators = new HashMap<String, Operator>();

    public UserServiceImpl() {
        Operator julien = new Operator();
        julien.setLogin("julien");
        julien.setEmail("vey.julien@gmail.com");
        julien.setFirstName("Julien");
        julien.setLastName("Vey");
        julien.setPassword("julien");
        julien.setPhone("1234567890");
        julien.setRole(OperatorRole.ADMINISTRATEUR);

        operators.put(julien.getLogin(), julien);
    }

    @Override
    public Operator authenticate(String email, String password) throws OperatorNotFoundException {
        Operator operator = operators.get(email);
        if (operator == null || !operator.getPassword().equals(password)) {
            throw new OperatorNotFoundException();
        }
        return operator;
    }

    @Override
    public VoidResult save(Operator operator) {
        operators.put(operator.getLogin(), operator);
        return new VoidResult();
    }
}
