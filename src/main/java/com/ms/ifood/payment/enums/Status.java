package com.ms.ifood.payment.enums;

public enum Status {
    CRIADO,
    CONFIRMADO,
    CANCELADO;

    public static Status devolverStatus(Integer status) {
        return switch (status) {
            case 0 -> CRIADO;
            case 1 -> CONFIRMADO;
            case 2 -> CANCELADO;
            default -> throw new RuntimeException("Status de cadastro invalido");
        };
    }
}


