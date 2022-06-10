package DAO;

import DTO.NhatKyChiDTO;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class NhatKyChiDAO {

    private mysqlConnect mySQL = new mysqlConnect();

    public NhatKyChiDAO() {

    }

    public ArrayList<NhatKyChiDTO> list() {
        ArrayList<NhatKyChiDTO> dschi = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NhatKyChi";
            ResultSet rs = mySQL.executeQuery(sql);

            while (rs.next()) {
                String ID = rs.getString("ID");
                String ngay = rs.getString("Ngay");
                String mucchi = rs.getString("MucChi");
                double sotien = rs.getDouble("SoTien");
                String ghichu = rs.getString("Ghichu");
                
                NhatKyChiDTO nhatkyDTO = new NhatKyChiDTO(ID, ngay, mucchi, ghichu, sotien);
                dschi.add(nhatkyDTO);
            }
            rs.close();
            mySQL.disConnect();
        } catch (SQLException ex) {
            Logger.getLogger(NhatKyChiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dschi;
    }

    public void add(NhatKyChiDTO mucchi) {
        String sql = "INSERT INTO NhatKyChi VALUES("
                + "'" + mucchi.getID() + "', "
                + "'" + mucchi.getNgay() + "', "
                + "'" + mucchi.getMucchi() + "', "
                + "'" + mucchi.getSotien() + "', "
                + "'" + mucchi.getGhichu() + "')";
        mySQL.executeUpdate(sql);
    }
}
