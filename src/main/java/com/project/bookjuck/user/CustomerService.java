package com.project.bookjuck.user;

import com.project.bookjuck.user.model.CustomerEntity;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerMapper mapper;
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


}
