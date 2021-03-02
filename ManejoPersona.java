import java.util.*;
public class ManejoPersona{

   static ArrayList<Persona> Arrperson = new ArrayList<Persona>(); 
   private Persona objPersona;
   
   public ManejoPersona(){  }
   
   public void agregar(String nom, String tel, String correo, String cumple){
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setTelefono(tel);
    objPersona.setCorreo(correo);
    objPersona.setCumple(cumple);
    Arrperson.add(objPersona);
   }
	
  public ArrayList datos(){
     return Arrperson;
   }
  }