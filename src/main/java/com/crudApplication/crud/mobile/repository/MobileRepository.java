package com.crudApplication.crud.mobile.repository;

import com.crudApplication.crud.mobile.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile,Long> {
}
