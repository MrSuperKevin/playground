package com.mrsuperguo.playground.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.mrsuperguo.playground.dto.CustomerAddCmd;
import com.mrsuperguo.playground.dto.CustomerListByNameQry;
import com.mrsuperguo.playground.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
