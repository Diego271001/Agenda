import javax.swing.*;
import java.awt.*;

public class JFrameMostrar extends JFrame{
   Mostrar mostrar = new Mostrar();
   
    public JFrameMostrar(){  
      initComponents();
   }
   
   private void initComponents(){
      setSize(500, 200);
      setTitle("Contactos Registrados");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);  
   } 
   
   private void cerrar(){
      setVisible(false);
   }  
}
