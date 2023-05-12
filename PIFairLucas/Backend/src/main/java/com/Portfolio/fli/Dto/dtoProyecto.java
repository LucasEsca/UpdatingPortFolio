/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Portfolio.fli.Dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Usuario
 */
public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String img;
    
    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String img) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.img = img;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
        public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}