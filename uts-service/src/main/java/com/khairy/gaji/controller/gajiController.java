/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khairy.gaji.controller;

import com.khairy.gaji.entity.gaji;
import com.khairy.gaji.service.gajiService;
import com.khairy.gaji.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Khairy
 */
@RestController
@RequestMapping("/gaji")
public class gajiController {
    @Autowired
    private gajiService gajiService;
    
    @PostMapping("/")
    public gaji savegaji(@RequestBody gaji gaji){
        return gajiService.savegaji(gaji);
    }
    
    @GetMapping("{id}")
    public ResponseTemplateVO getPegawai(@PathVariable("id") Long gajiId){
        return gajiService.getgaji(gajiId);
    }
}
