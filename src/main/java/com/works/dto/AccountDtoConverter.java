package com.works.dto;

import com.works.models.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDtoConverter {

    private final CustomerDtoConverter customerDtoConverter;
    private final TransactionDto transactionDto;

    public AccountDtoConverter(CustomerDtoConverter customerDtoConverter, TransactionDto transactionDto) {
        this.customerDtoConverter = customerDtoConverter;
        this.transactionDto = transactionDto;
    }

    public AccountDto convert(Account from){
        return new AccountDto(from.getId(),
                from.getBalance(),
                from.getCreationDate(),
                customerDtoConverter.convertToAccountCustomer(from.getCustomer(),
                        from.getTransaction().stream().map(t -> transactionDto));
    }
}
