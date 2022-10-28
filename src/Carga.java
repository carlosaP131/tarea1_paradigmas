/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labdessw09
 */
public class Carga {
    private double Peso;

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Carga "+ getPeso() + " KG";
    }

    public Carga(double Peso) {
        this.Peso = Peso;
    }

    public Carga() {
    }

    
}
