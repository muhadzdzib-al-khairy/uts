/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khairy.gaji.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Khairy
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class gaji {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gajiId;
    private Long pegawaiId;
    private Long tunj_anak;
    private Long tunj_istri;
    private Long getGapok;
    private Long getGajiBersih;
    private String tanggal;

    public String getpegawaiId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
