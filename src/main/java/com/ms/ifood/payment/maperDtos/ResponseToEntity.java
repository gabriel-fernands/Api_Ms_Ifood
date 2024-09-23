package com.ms.ifood.payment.maperDtos;

import com.ms.ifood.payment.dtos.PaymentDto;
import com.ms.ifood.payment.model.Payment;

public class ResponseToEntity {

    public Payment convertToEntity(PaymentDto paymentDto) {
        Payment payment = new Payment();
        payment.setId(paymentDto.getId());
        payment.setStatus(paymentDto.getStatus());
        payment.setCodigo(payment.getCodigo());
        payment.setExpiracao(payment.getExpiracao());
        payment.setFormaDePagamentoId(paymentDto.getFormaDePagamentoId());
        payment.setNome(payment.getNome());
        payment.setNumero(payment.getNumero());
        payment.setPedidoId(paymentDto.getPedidoId());
        payment.setValor(payment.getValor());

        return payment;
    }
}
