package com.works.dto;

import com.works.models.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public AccounCustomerDto convertToAccountCustomer(Customer from){
        if (from.equals("")){
            return new AccounCustomerDto("","","");
        }else {
            return new AccounCustomerDto(from.getId(),from.getName(), from.getSurName());

        }
    }
}
