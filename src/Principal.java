/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Principal {
    public static void main(String[] args) {
        
        Animal caballo = new Caballo(4);
        caballo.setNombre("Moro");
        caballo.setVelocidad(0);
        caballo.setCodigo("20-f1");
        caballo.setVelocidad(10);
//        Carga carga = new Carga();
//        carga.setPeso(30);
        System.out.println( caballo.toString());
//        conejo.setVelocidad(31);
     caballo.setVelocidad(20);
  System.out.println( caballo.toString());
//        System.out.println("La velocidad del conejo es : " +conejo.getVelocidad()+" km/h");
//       
    
    }
}
