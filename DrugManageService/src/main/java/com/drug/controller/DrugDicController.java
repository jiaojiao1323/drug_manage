/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drug.controller;

import com.drug.entity.Drug;
import com.drug.service.DrugService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zjj
 */
@RestController
public class DrugDicController {
    
    @Autowired
    private DrugService drugService;
    
    @RequestMapping("/getByName")
    public List<Drug> getByName(@RequestParam("name") String name){
        return this.drugService.getByName(name);
    }
    
    @RequestMapping("/getAll")
    public List<Drug> getAll(){
        return this.drugService.getAll();
    }
}
