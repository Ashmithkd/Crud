package com.crudApplication.crud.mobile.service;

import com.crudApplication.crud.mobile.entity.Mobile;
import com.crudApplication.crud.mobile.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileServiceImpl implements MobileService{
    @Autowired
    MobileRepository mobileRepository;
    @Override
    public void createMobile(Mobile mobile) {
     mobileRepository.save(mobile);
    }

    @Override
    public List<Mobile> getAllMobiles() {
        return mobileRepository.findAll();
    }

    @Override
    public void deleteMobile(Long id) {
        mobileRepository.deleteById(id);
    }

    @Override
    public Mobile getMobile(Long id) {
        return mobileRepository.getMobileById(id);
    }

    @Override
    public void updateMobile(Long id,String brand, int ram, int storage, String model) {
       Mobile mobile=mobileRepository.getMobileById(id);
       mobile.setBrand(brand);
       mobile.setRam(ram);
       mobile.setStorage(storage);
       mobile.setModel(model);
       mobileRepository.save(mobile);
    }
}
