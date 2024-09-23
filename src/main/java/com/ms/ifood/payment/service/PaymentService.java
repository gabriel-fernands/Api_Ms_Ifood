package com.ms.ifood.payment.service;

import com.ms.ifood.payment.dtos.PaymentDto;
import com.ms.ifood.payment.enums.Status;
import com.ms.ifood.payment.maperDtos.ResponsePaymentDtos;
import com.ms.ifood.payment.maperDtos.ResponseToEntity;
import com.ms.ifood.payment.model.Payment;
import com.ms.ifood.payment.repository.PaymentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository repository;
    private final ResponsePaymentDtos paymentDto;
    private final ResponseToEntity toEntity;


    public PaymentService(PaymentRepository repository, ResponsePaymentDtos paymentDto,ResponseToEntity toEntity) {
        this.repository = repository;
        this.paymentDto = paymentDto;
        this.toEntity = toEntity;
    }
    public Page<PaymentDto> obterTodos(Pageable paginacao) {
        return repository.findAll(paginacao)
                .map(paymentDto::convertToDto);
    }

    public PaymentDto obterPorId(Long id) {
        return repository.findById(id)
                .map(paymentDto::convertToDto)
                .orElseThrow(() -> new RuntimeException("Entidade não encontrada"));
    }
    public PaymentDto atualizarPayment(Long id, PaymentDto paymentDto){
        Payment payment = this.toEntity.convertToEntity(paymentDto);
        payment.setId(id);
        return this.paymentDto.convertToDto(repository.save(payment));
    }

    public PaymentDto criarPagamento(PaymentDto paymentDto) {
        Payment payment = this.toEntity.convertToEntity(paymentDto);
        payment.setStatus(Status.devolverStatus(0));
        return this.paymentDto.convertToDto(repository.save(payment));
    }
    public void excluirPagamento(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Pagamento com ID " + id + " não encontrado.");
        }
        repository.deleteById(id);
    }

    }