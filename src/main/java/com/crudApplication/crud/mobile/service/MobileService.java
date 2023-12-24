package com.crudApplication.crud.mobile.service;

import com.crudApplication.crud.mobile.entity.Mobile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MobileService {
    void createMobile(Mobile mobile);
    List<Mobile> getAllMobiles();
    void deleteMobile(Long id);
    Mobile getMobile(Long id);

    void updateMobile(Long id,String brand, int ram, int storage, String model);
}
