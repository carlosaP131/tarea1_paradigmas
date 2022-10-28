/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labdessw09
 */
public class Conejo extends Animal {
     private int Patas;
     final double Humbral=20;
    public Conejo() {
    }

    public Conejo(String Nombre, double Velocidad, double Aceleracion) {
        super(Nombre, Velocidad, Aceleracion);
    }

    @Override
    public void setVelocidad(double Velocidad) {
        //this.Velocidad = Velocidad;
        if (Velocidad > 30) {
            System.out.println("!PELIGRO¡");
        }
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getVelocidad() {
        return super.getVelocidad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     @Override
    public void Acelerar(double acelera) throws Limite_Velocidad_exepcion{
       
    
    }
}
