/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jr02_3;

import baza.RadSaBazom;
import domen.Osoba;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student2
 */
public class JR02_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba o = new Osoba("1", "Nevena", "Vidakovic", 22);
        RadSaBazom rsb = new RadSaBazom();
        rsb.sacuvajOsobu(o);
        
        //rsb.obrisiOsobu(new Osoba("1"));
        rsb.azurirajOsobu(o, "Neven", "Vidakovic", 10);
        rsb.prikaziSveOsobe();
    }

}
