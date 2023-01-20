package com.works.dto;

import com.works.models.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {

    public TransactionDto convert(Transaction from){
    return new TransactionDto(from.getId(),
        from.getTransactionType(),
        from.getAmount(),
        from.getTransactionDate());
        }
}