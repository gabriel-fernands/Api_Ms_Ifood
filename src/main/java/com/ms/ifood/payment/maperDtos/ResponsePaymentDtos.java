package com.ms.ifood.payment.maperDtos;

import com.ms.ifood.payment.dtos.PaymentDto;
import com.ms.ifood.payment.model.Payment;
import org.springframework.stereotype.Component;


@Component
public class ResponsePaymentDtos {

    public PaymentDto convertToDto(Payment payment) {
        PaymentDto dto = new PaymentDto();
        dto.setId(payment.getId());
        dto.setCodigo(payment.getCodigo());
        dto.setExpiracao(payment.getExpiracao());
        dto.setFormaDePagamentoId(payment.getFormaDePagamentoId());
        dto.setNome(payment.getNome());
        dto.setNumero(payment.getNumero());
        dto.setPedidoId(payment.getPedidoId());
        dto.setStatus(payment.getStatus());
        dto.setValor(payment.getValor());
        return dto;
    }
    }

