/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khairy.gaji.service;

import com.khairy.gaji.entity.gaji;
import com.khairy.gaji.repository.gajiRepository;
import com.khairy.gaji.vo.ResponseTemplateVO;
import com.khairy.gaji.vo.pegawai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Khairy
 */
@Service
public class gajiService {
    @Autowired
    private gajiRepository gajiRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public gaji savegaji(gaji gaji){
        return gajiRepository.save(gaji);
    }
    
    public ResponseTemplateVO getgaji(Long gajiId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        gaji gaji = 
                gajiRepository.findBygajiId(gajiId);
        pegawai pegawai = 
        restTemplate.getForObject("http://localhost:9001/pegawai/"
                + gaji.getpegawaiId(), pegawai.class);
        vo.setgaji(gaji);
        vo.setpegawai(pegawai); 
        return vo;
    }
    
}
