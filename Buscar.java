import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Buscar extends JFrame{
    JPanel panel;
    JButton btnBuscar,btnAtras;
    JLabel lblEtiqueta;
    JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;
    JLabel lblNombre, lblTelefono, lblCorreo, lblCumple;
    ManejoPersona mp = new ManejoPersona();
    ArrayList<Persona> datosPer = new ArrayList<Persona>();
    
    public Buscar(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(500, 200); 
      JLabel lblEtiqueta = new JLabel("  BUSCAR USUARIO:  ");
      btnBuscar = new JButton("Buscar");
      btnAtras = new JButton("Atras");
      
      btnBuscar.addMouseListener(new buscar());
      btnAtras.addMouseListener(new atras());
      
      JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
      txtNombre = new JTextField(20);
      JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
      txtTelefono = new JTextField(15);
      txtTelefono.setEditable(false);
      JLabel lblCorreo = new JLabel("Correo: ", JLabel.RIGHT);
      txtCorreo = new JTextField(20);
      txtCorreo.setEditable(false);
      JLabel lblCumple = new JLabel("Cumpleaños:    dd/mm/aaaa ", JLabel.RIGHT);
      txtCumple = new JTextField(10);
      txtCumple.setEditable(false);
      
      setLayout(new GridLayout(5,3));
      setTitle("BUSQUEDA DE USUARIO");
      add(lblNombre);
      add(txtNombre);
      add(lblTelefono);
      add(txtTelefono);
      add(lblCorreo);
      add(txtCorreo);
      add(lblCumple);
      add(txtCumple);

      add(btnBuscar);
      add(btnAtras);

      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false);
    }
    
    private class buscar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         datosPer = mp.datos();
         boolean ban = false;
          if(txtNombre.getText()==null||txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio para iniciar la busqueda","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
           }else{
              int x=0;
              String nombre = txtNombre.getText();
              Iterator<Persona> itrPersona = datosPer.iterator();
              while(itrPersona.hasNext()){
                 Persona persona = itrPersona.next();
                 if(persona.getNombre().equals(nombre)){
                    ban = true;
                    txtTelefono.setText(persona.getTelefono());
                    txtCorreo.setText(persona.getCorreo());
                    txtCumple.setText(persona.getCumple());
                    JOptionPane.showMessageDialog(null, "El usuario se encontro con Exito!!!","Aviso", JOptionPane.INFORMATION_MESSAGE);
                 }
                 x++;
              } 
              if(ban==false){
               JOptionPane.showMessageDialog(null, "El usuario no fue encontrado !!","Aviso", JOptionPane.INFORMATION_MESSAGE);
               txtNombre.requestFocus();
               txtTelefono.setText("");
               txtCorreo.setText("");
               txtCumple.setText("");
             }    
          }

      }
    }
    
    private class atras extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         cerrar();
         Menu m = new Menu();
      }
    }
   
}
