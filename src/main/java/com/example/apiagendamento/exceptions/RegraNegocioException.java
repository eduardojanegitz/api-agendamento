package com.example.apiagendamento.exceptions;

public class RegraNegocioException extends RuntimeException {
    public RegraNegocioException(String mensagemErro) {
        super(mensagemErro);
    }
}
