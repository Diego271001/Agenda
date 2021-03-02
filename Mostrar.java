import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Mostrar extends JPanel{
   JTable tabla;
   JButton btnCerrar;
   JScrollPane scroll = new JScrollPane();
   ManejoPersona mp = new ManejoPersona();
   ArrayList<Persona> datosPer = new ArrayList<Persona>();
   
   public Mostrar(){
     datosPer = mp.datos();
     String titulos [] = {"Nombre", "Telefono", "Correo", "Cumpleaños"};
     String info[][] = obtenerDatos();
     setLayout(new GridLayout());
     btnCerrar = new JButton("Cerrar");

     tabla = new JTable(info, titulos);
     tabla.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
     scroll.setViewportView(tabla);
     add(scroll);
   }
   
   private String[][] obtenerDatos(){
     int x=0;
     String informacion[][] = new String[datosPer.size()][4];
     Iterator<Persona> itrPersona = datosPer.iterator();
     while(itrPersona.hasNext()){
        Persona persona = itrPersona.next();
           informacion[x][0] = persona.getNombre();
           informacion[x][1] = persona.getTelefono();
           informacion[x][2] = persona.getCorreo();
           informacion[x][3] = persona.getCumple();
        x++;
     }
     return informacion;
   }
}
