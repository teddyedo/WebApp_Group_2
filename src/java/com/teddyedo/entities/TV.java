/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teddyedo.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author edoal
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TV extends Apparecchio {
    
    @Basic
    @Getter
    @Setter
    private int numeroPorteHDMI;

    @Basic
    @Getter
    @Setter
    private int pollici;
   
}
