/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author student2
 */
public class Osoba {
    private String jmbg;
    private String ime;
    private String prezime;
    private int starost;

    public Osoba() {
    }

    public Osoba(String jmbg, String ime, String prezime, int starost) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Osoba(String jmbg) {
        this.jmbg = jmbg;
    }
    
    
}
