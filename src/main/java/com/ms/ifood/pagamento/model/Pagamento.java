package com.ms.ifood.pagamento.model;

import com.ms.ifood.pagamento.enums.Status;
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
public class Pagamento {
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

}
