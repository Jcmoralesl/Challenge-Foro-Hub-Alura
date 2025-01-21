package com.challengeforohub.Foro.Hub.infra.errors;

import java.io.Serial;

public class IntegrityValidation extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;
    public IntegrityValidation(String s){
        super(s);
    }
}
