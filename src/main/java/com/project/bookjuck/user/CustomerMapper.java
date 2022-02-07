package com.project.bookjuck.user;

import com.project.bookjuck.user.model.CustomerEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

    int insCustomer(CustomerEntity entity);
    CustomerEntity selCustomer(CustomerEntity entity);
}
