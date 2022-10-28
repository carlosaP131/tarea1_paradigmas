/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labdessw09
 */
public abstract  class Animal {
    private String Nombre;
    private double Velocidad;
    //public double Aceleracion;
    private String codigo;
    

    public Animal() {
    }

    public Animal(String Nombre, double Velocidad, double Aceleracion) {
        this.Nombre = Nombre;
        this.Velocidad = Velocidad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
    
    public void Sonido(){
        
    }
    public void Acelerar(double acelera) throws Limite_Velocidad_exepcion{
        setVelocidad(getVelocidad()+acelera);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
