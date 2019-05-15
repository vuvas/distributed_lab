/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PatientDAOImp extends UnicastRemoteObject implements PatientDAO{

    public PatientDAOImp() throws RemoteException{
        super();
    }
    @Override
    public boolean SavePatientInformation(PatientData pd) throws RemoteException {
        try {
            String url = "jdbc:mysql://localhost:3306/labratory";
            Properties props = new Properties();
            props.setProperty("user", "root");
            props.setProperty("password", "123456");
            Connection connection = DriverManager.getConnection(url, props);
           
            String query = String.format("INSERT INTO `patientinformation`\n" +
                                "(`id`,\n" +
                                "`name`,\n" +
                                "`age`,\n" +
                                "`gender`,\n" +
                                "`address`)\n" +
                                "VALUES\n" +
                                "(%d,\n" +
                                "'%s',\n" +
                                "%d,\n" +
                                "'%s',\n" +
                                "'%s');",pd.getPatientId(),pd.getPatientName(),pd.getPatientAge(),pd.getPatientGender(),pd.getPatientAddress());
            PreparedStatement statement = connection.prepareStatement(query);
            statement.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public VoucherList GetVoucher(int clientId) throws RemoteException {
        ArrayList<Voucher> returnValue = new ArrayList<Voucher>();
        try {
            String url = "jdbc:mysql://localhost:3306/labratory";
            Properties props = new Properties();
            props.setProperty("user", "root");
            props.setProperty("password", "123456");
            Connection connection = DriverManager.getConnection(url, props);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM voucher WHERE patientId=? and isActive = 1");
            statement.setLong(1, clientId);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Voucher vou = new Voucher();
                vou.setVoucherId(rs.getInt("idvoucher"));
                vou.setClientId(rs.getInt("patientId"));
                vou.setItem(rs.getString("item"));
                vou.setItemCount(rs.getInt("itemCount"));
                vou.setItemPrice(rs.getDouble("itemPrice"));
                vou.setVoucherType("LA");
                vou.setIsActive(rs.getBoolean("isActive"));
                returnValue.add(vou);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        VoucherList vr = new VoucherList();
        vr.setVouchers(returnValue);
        return vr;
    }

    @Override
    public void UpdateVoucherToSeen(int voucherId) throws RemoteException {
         try {
            String query = "UPDATE `voucher` SET `isActive` = '0' WHERE (`idvoucher` = ?);";
            String url = "jdbc:mysql://localhost:3306/labratory";
            Properties props = new Properties();
            props.setProperty("user", "root");
            props.setProperty("password", "123456");
            Connection connection = DriverManager.getConnection(url, props);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, voucherId);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
