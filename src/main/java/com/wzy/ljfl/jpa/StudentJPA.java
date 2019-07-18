package com.wzy.ljfl.jpa;


import com.wzy.ljfl.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface StudentJPA extends JpaRepository<StudentEntity,Long>, JpaSpecificationExecutor<StudentEntity>, Serializable {
}
