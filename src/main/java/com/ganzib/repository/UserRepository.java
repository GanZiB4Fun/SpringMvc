package com.ganzib.repository;

import com.ganzib.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

/**
 * Created by GanZiB on 16/11/28.
 */
@Resource
public interface UserRepository extends JpaRepository<UserEntity,Integer>{



}
