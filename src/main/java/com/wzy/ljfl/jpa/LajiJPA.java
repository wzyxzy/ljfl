package com.wzy.ljfl.jpa;

import com.wzy.ljfl.entity.LajiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface LajiJPA extends JpaRepository<LajiEntity,Long>, JpaSpecificationExecutor<LajiEntity>, Serializable {
}
