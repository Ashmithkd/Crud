package com.crudApplication.crud.mobile.service;

import com.crudApplication.crud.mobile.entity.Mobile;
import org.springframework.stereotype.Service;

@Service
public interface MobileService {
    void createMobile(Mobile mobile);
}
