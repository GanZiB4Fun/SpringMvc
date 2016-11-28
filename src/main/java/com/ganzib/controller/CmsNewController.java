package com.ganzib.controller;

import com.ganzib.model.CmsNewsEntity;
import com.ganzib.repository.CmsNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by GanZiB on 16/11/28.
 */
@Controller
@RequestMapping("/cmsnew")
public class CmsNewController {

    @Autowired
    private CmsNewRepository cmsNewRepository;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String newList(ModelMap modelMap){
        List<CmsNewsEntity> cmsNewsEntities = cmsNewRepository.findAll();
        modelMap.addAttribute("newList",cmsNewsEntities);
        return "cmsnew/list";
    }

}
