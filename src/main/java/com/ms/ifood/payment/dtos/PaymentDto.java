package com.ms.ifood.payment.dtos;

import com.ms.ifood.payment.enums.Status;
import com.ms.ifood.payment.model.Payment;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class PaymentDto {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private  String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long pedidoId;
    private Long formaDePagamentoId;

    public PaymentDto(Payment payment) {
        this.nome = payment.getNome();
        this.codigo = payment.getCodigo();
        this.expiracao = payment.getExpiracao();
        this.numero = payment.getNumero();
        this.status = payment.getStatus();
        this.valor = payment.getValor();
        this.formaDePagamentoId = payment.getFormaDePagamentoId();
        this.pedidoId = payment.getPedidoId();
    }

    public PaymentDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(String expiracao) {
        this.expiracao = expiracao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getFormaDePagamentoId() {
        return formaDePagamentoId;
    }

    public void setFormaDePagamentoId(Long formaDePagamentoId) {
        this.formaDePagamentoId = formaDePagamentoId;
    }
}
