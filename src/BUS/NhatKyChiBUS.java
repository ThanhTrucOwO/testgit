/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhatKyChiDAO;
import DTO.NhatKyChiDTO;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class NhatKyChiBUS {
    private ArrayList<NhatKyChiDTO> listnk;
    
    public NhatKyChiBUS() {
        
    }
    
    public int remindID() {
        int max = 0;
        for (NhatKyChiDTO mucchi : listnk) {
            int id = Integer.parseInt(mucchi.getID());
            if (id > max) {
                max = id;
            }
        }

        return max + 1;
    }
    
    public void list() {
        NhatKyChiDAO nhatkyDAO = new NhatKyChiDAO();
        listnk = new ArrayList<>();
        listnk = nhatkyDAO.list();
    }
    
    public double total() {
        double s = 0;
        for (NhatKyChiDTO mucchi: listnk) {
            s += mucchi.getSotien();
        }
        return s;
    }
   
    
    public void add(NhatKyChiDTO mucchi) {
        listnk.add(mucchi);
        NhatKyChiDAO nhatkyDAO = new NhatKyChiDAO();
        nhatkyDAO.add(mucchi);
    }
}
