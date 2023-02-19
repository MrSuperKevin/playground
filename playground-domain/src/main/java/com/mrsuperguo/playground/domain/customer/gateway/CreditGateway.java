package com.mrsuperguo.playground.domain.customer.gateway;

import com.mrsuperguo.playground.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
