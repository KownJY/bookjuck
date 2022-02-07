package com.project.bookjuck.user;

import com.project.bookjuck.CsUtils;
import com.project.bookjuck.user.model.CustomerEntity;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerMapper mapper;

    @Autowired
    private CsUtils csUtils;

    //조인.
    public int insCustomer(CustomerEntity entity){
        String hashedUpw = BCrypt.hashpw(entity.getUpw(), BCrypt.gensalt());
        entity.setUpw(hashedUpw);

        try {
            return mapper.insCustomer(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    //로그인
    public int selCustomer(CustomerEntity entity) {
        CustomerEntity customerEntity = null;

        try {
            customerEntity = mapper.selCustomer(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

        if (customerEntity == null) {
            return 2;
        } else if (!BCrypt.checkpw(entity.getUpw(), customerEntity.getUpw())) {
            return 3;
        }

        csUtils.setLoginUser(customerEntity);
        return 1;

    }


}
