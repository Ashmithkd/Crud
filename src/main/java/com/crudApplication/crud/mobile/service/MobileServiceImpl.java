package com.crudApplication.crud.mobile.service;

import com.crudApplication.crud.mobile.entity.Mobile;
import com.crudApplication.crud.mobile.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileServiceImpl implements MobileService{
    @Autowired
    MobileRepository mobileRepository;
    @Override
    public void createMobile(Mobile mobile) {
     mobileRepository.save(mobile);
    }
}
