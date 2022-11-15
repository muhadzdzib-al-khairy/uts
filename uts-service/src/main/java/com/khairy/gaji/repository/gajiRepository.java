/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.khairy.gaji.repository;

import com.khairy.gaji.entity.gaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Khairy
 */
@Repository
public interface gajiRepository extends JpaRepository<gaji, Long> {

    public gaji findBygajiId(Long gajiId);

}
