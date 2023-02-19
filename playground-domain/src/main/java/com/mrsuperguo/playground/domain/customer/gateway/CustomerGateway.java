package com.mrsuperguo.playground.domain.customer.gateway;

import com.mrsuperguo.playground.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
