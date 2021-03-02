public class Persona {
    private String Nombre;
    private String Telefono;
    private String Correo;
    private String Cumple;
    
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public String getTelefono(){
     return Telefono;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
    
    public String getCorreo(){
     return Correo;
    }
    
    public void setCorreo(String correo){
        this.Correo = correo;
    }
   
   public String getCumple(){
     return Cumple;
    }
    
    public void setCumple(String cumple){
        this.Cumple = cumple;
    }  
}