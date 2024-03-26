/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import domen.Osoba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author student2
 */
public class RadSaBazom {

    public void sacuvajOsobu(Osoba o) {
        try {
            // povezi sa bazom
            String url = "jdbc:mysql://localhost:3306/java_radionica";
            Connection konekcija = DriverManager.getConnection(url, "root", "");
            System.out.println("Usepsno uspostavljena veza");

            String upit = "INSERT INTO osoba VALUES(?,?,?, ?)";
            //za parametrizovane
            PreparedStatement ps = konekcija.prepareStatement(upit);
            ps.setString(1, o.getJmbg());
            ps.setString(2, o.getIme());
            ps.setString(3, o.getPrezime());
            ps.setInt(4, o.getStarost());

            ps.executeUpdate();
            System.out.println("Sačuvana osoba");
            ps.close();
            konekcija.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void obrisiOsobu(Osoba o) {
        try {
            // povezi sa bazom
            String url = "jdbc:mysql://localhost:3306/java_radionica";
            Connection konekcija = DriverManager.getConnection(url, "root", "");
            System.out.println("Usepsno uspostavljena veza");

            String upit = "DELETE FROM OSOBA WHERE jmbg = '" + o.getJmbg() + "'";
            System.out.println(upit);
            java.sql.Statement s = konekcija.createStatement();
            int row = s.executeUpdate(upit);

            System.out.println("row: " + row);

            System.out.println("Izbrisana osoba");
            s.close();
            konekcija.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void prikaziSveOsobe() {
        try {
            // povezi sa bazom
            String url = "jdbc:mysql://localhost:3306/java_radionica";
            Connection konekcija = DriverManager.getConnection(url, "root", "");
            System.out.println("Usepsno uspostavljena veza");

            String upit = "SELECT * FROM osoba ORDER BY prezime";
            java.sql.Statement s = konekcija.createStatement();
            java.sql.ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                String jmbg = rs.getString("jmbg");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                int starost = rs.getInt("starost");

                System.out.println(jmbg + "\t" + ime + "\t" + prezime + "\t" + starost);

            }

            s.close();
            konekcija.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void azurirajOsobu(Osoba o, String ime, String prezime, int god) {
        try {
            // povezi sa bazom
            String url = "jdbc:mysql://localhost:3306/java_radionica";
            Connection konekcija = DriverManager.getConnection(url, "root", "");
            System.out.println("Usepsno uspostavljena veza");

            String upit = "UPDATE OSOBA SET ime = ?, prezime = ?, starost = ? WHERE jmbg = ? ";
            PreparedStatement ps = konekcija.prepareStatement(upit);
            ps.setString(1, ime);
            ps.setString(2, prezime);
            ps.setInt(3, god);
            ps.setString(4, o.getJmbg());
            ps.executeUpdate();
            System.out.println("Usepsno apdejtovana osoba");
            ps.close();
            konekcija.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
