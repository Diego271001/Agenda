import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame{
   static int opc;
    JPanel panel;
    JButton btnAlta, btnBuscar, btnEditar, btnEliminar;
    JLabel lblTitulo;
    
    public Menu(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(250, 200); 
      JLabel lblTitulo = new JLabel("Selecciona lo que desea hacer: ");
      btnAlta = new JButton ("Dar de Alta");
      btnBuscar = new JButton("Buscar");
      btnEditar = new JButton("Editar");
      btnEliminar = new JButton("Eliminar");
      
      btnAlta.addMouseListener(new alta());
      btnBuscar.addMouseListener(new buscar());
      btnEditar.addMouseListener(new editar());
      btnEliminar.addMouseListener(new eliminar());
      
      setLayout(new GridLayout(5,5));
      setTitle("MENU PRINCIPAL");
      add(lblTitulo);
      add(btnAlta);
      add(btnBuscar);
      add(btnEditar);
      add(btnEliminar);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false);
    }
    
    private class alta extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         Alta alta = new Alta(); 
      }
    }
    
    private class buscar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         Buscar bus = new Buscar();
      }
    }
    
    private class editar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         Editar ed = new Editar();
      }
    }
    
    private class eliminar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         Eliminar eli = new Eliminar();
      }
    }
   
}
