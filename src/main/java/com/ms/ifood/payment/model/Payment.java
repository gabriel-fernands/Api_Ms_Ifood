package com.ms.ifood.payment.model;

import com.ms.ifood.payment.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

    @Entity
    @Table(name = "pagamentos")
    @Data
    @EqualsAndHashCode(of = "id")
    public class Payment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotNull
        @Positive
        private BigDecimal valor;
        @NotBlank
        @Size(max = 100)
        private String nome;
        @NotBlank
        @Size(max = 19)
        private  String numero;
        @NotBlank
        @Size(max = 7)
        private String expiracao;
        @NotBlank
        @Size(max = 3,min = 3)
        private String codigo;
        @NotNull
        @Enumerated(EnumType.STRING)
        private Status status;
        @NotNull
        private Long pedidoId;
        @NotNull
        private Long formaDePagamentoId;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public @NotNull @Positive BigDecimal getValor() {
            return valor;
        }

        public void setValor(@NotNull @Positive BigDecimal valor) {
            this.valor = valor;
        }

        public @NotBlank @Size(max = 100) String getNome() {
            return nome;
        }

        public void setNome(@NotBlank @Size(max = 100) String nome) {
            this.nome = nome;
        }

        public @NotBlank @Size(max = 19) String getNumero() {
            return numero;
        }

        public void setNumero(@NotBlank @Size(max = 19) String numero) {
            this.numero = numero;
        }

        public @NotBlank @Size(max = 7) String getExpiracao() {
            return expiracao;
        }

        public void setExpiracao(@NotBlank @Size(max = 7) String expiracao) {
            this.expiracao = expiracao;
        }

        public @NotBlank @Size(max = 3, min = 3) String getCodigo() {
            return codigo;
        }

        public void setCodigo(@NotBlank @Size(max = 3, min = 3) String codigo) {
            this.codigo = codigo;
        }

        public @NotNull Status getStatus() {
            return status;
        }

        public void setStatus(@NotNull Status status) {
            this.status = status;
        }

        public @NotNull Long getPedidoId() {
            return pedidoId;
        }

        public void setPedidoId(@NotNull Long pedidoId) {
            this.pedidoId = pedidoId;
        }

        public @NotNull Long getFormaDePagamentoId() {
            return formaDePagamentoId;
        }

        public void setFormaDePagamentoId(@NotNull Long formaDePagamentoId) {
            this.formaDePagamentoId = formaDePagamentoId;
        }
    }


