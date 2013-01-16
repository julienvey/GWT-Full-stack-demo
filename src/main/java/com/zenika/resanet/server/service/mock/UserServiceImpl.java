package com.zenika.resanet.server.service.mock;

import com.zenika.resanet.server.service.UserService;
import com.zenika.resanet.shared.dto.Operator;
import com.zenika.resanet.shared.dispatch.exception.OperatorNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService{

    private Map<String, Operator> operators = new HashMap<String, Operator>();

    public UserServiceImpl() {
        Operator julien = new Operator();
        julien.setEmail("vey.julien@gmail.com");
        julien.setFirstName("Julien");
        julien.setLastName("Vey");
        julien.setPassword("julien");

        operators.put("vey.julien@gmail.com", julien);
    }

    @Override
    public Operator authenticate(String email, String password) throws OperatorNotFoundException {
        Operator operator = operators.get(email);
        if(operator == null || !operator.getPassword().equals(password)){
            throw new OperatorNotFoundException();
        }
        return operator;
    }
}
