public class Caballo extends Animal{
   public int Patas;
   final double Humbral=60;
   private Carga carga = new Carga();
   

    public Caballo() {
    }

    public Caballo(int Patas) {
     
        this.Patas = Patas;
    }
   
   
   
   
   
   
    @Override
    public String toString() {
        if(carga!=null){
        return "el"+super.getNombre()+"va a "+super.getVelocidad()+"km/h" + this.getCarga().toString();
        } else {
            return "el"+super.getNombre()+"va a "+super.getVelocidad()+"km/h";
        }
       
        }

    @Override
    public void Acelerar(double acelera) throws Limite_Velocidad_exepcion{
        if(carga !=null && super.getVelocidad()+ acelera>Humbral){
            throw  new Limite_Velocidad_exepcion("exedio el limite ");
        }else 
        {
            super.setVelocidad(super.getVelocidad()+acelera);
        }
      
    }
    
    
    

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
    
   public void  quitarCarga(){
       this.carga=null;
   }

    @Override
    public void Sonido() {
        super.Sonido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setVelocidad(double Velocidad) {
        super.setVelocidad(Velocidad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getPatas() {
        return Patas;
    }

    public void setPatas(int Patas) {
        this.Patas = Patas;
    }
   
}
