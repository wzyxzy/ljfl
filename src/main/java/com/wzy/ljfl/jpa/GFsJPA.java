package com.wzy.ljfl.jpa;


import com.wzy.ljfl.entity.GFsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface GFsJPA extends JpaRepository<GFsEntity,Long>, JpaSpecificationExecutor<GFsEntity>, Serializable {
}
