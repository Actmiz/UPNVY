/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infomart;

import static java.sql.DriverManager.registerDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Actmiz
 */
public class koneksi {
    private static Connection koneksi;

    /**
     * @return
     */
    public static Connection getkonesi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/infomart";
                String user = "root";
                String password = "";
                registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil");
            } catch (Exception e) {
                System.out.println("Error ");
            }
        }
        return koneksi;
    }

    public static void main(String args[]) {
        getkonesi();
    }
}
