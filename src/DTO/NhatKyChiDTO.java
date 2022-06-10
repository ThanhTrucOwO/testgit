/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LENOVO
 */
public class NhatKyChiDTO {
    private String ID, ngay, ghichu, mucchi;
    private double sotien;
    
    public NhatKyChiDTO() {
        this.ID = null;
        this.ngay = null;
        this.ghichu = null;
        this.mucchi = null;
        this.sotien = 0;
        
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        ngay = myDateObj.format(myFormatObj);
    }
    
    public NhatKyChiDTO(String ID, String ngay, String ghichu, String mucchi, double sotien) {
        this.ID = ID;
        this.ngay = ngay;
        this.ghichu = ghichu;
        this.mucchi = mucchi;
        this.sotien = sotien;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the ngay
     */
    public String getNgay() {
        return ngay;
    }

    /**
     * @param ngay the ngay to set
     */
    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    /**
     * @return the ghichu
     */
    public String getGhichu() {
        return ghichu;
    }

    /**
     * @param ghichu the ghichu to set
     */
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    /**
     * @return the mucchi
     */
    public String getMucchi() {
        return mucchi;
    }

    /**
     * @param mucchi the mucchi to set
     */
    public void setMucchi(String mucchi) {
        this.mucchi = mucchi;
    }

    /**
     * @return the sotien
     */
    public double getSotien() {
        return sotien;
    }

    /**
     * @param sotien the sotien to set
     */
    public void setSotien(double sotien) {
        this.sotien = sotien;
    }
    
    
}
