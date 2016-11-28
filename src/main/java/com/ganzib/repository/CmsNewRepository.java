package com.ganzib.repository;

import com.ganzib.model.CmsNewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

/**
 * Created by GanZiB on 16/11/28.
 */
@Resource
public interface CmsNewRepository extends JpaRepository<CmsNewsEntity ,Integer>{
}
