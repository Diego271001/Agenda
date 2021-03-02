import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Alta extends JFrame{
    JPanel panel; 
    JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;
    JButton btnRegistrar, btnLimpiar, btnAtras,btnMostrar;
    JLabel lblTitulo, lblNombre, lblTelefono, lblCorreo, lblCumple;
    ManejoPersona mpA = new ManejoPersona();
    Mostrar mostrar = new Mostrar();
    
    public Alta(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(500, 200); 
      JLabel lblTitulo = new JLabel(" REGISTRAR USUARIOS ");
      btnRegistrar = new JButton ("REGISTRAR");
      btnLimpiar = new JButton("LIMPIAR");
      btnAtras = new JButton("ATRAS");
      btnMostrar = new JButton("MOSTRAR");
      JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
      txtNombre = new JTextField(20);
      JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
      txtTelefono = new JTextField(15);
      JLabel lblCorreo = new JLabel("Correo: ", JLabel.RIGHT);
      txtCorreo = new JTextField(20);
      JLabel lblCumple = new JLabel("Cumpleaños:    dd/mm/aaaa ", JLabel.RIGHT);
      txtCumple = new JTextField(10);
     
      btnRegistrar.addMouseListener(new Registrar());
      btnLimpiar.addMouseListener(new Limpiar());
      btnAtras.addMouseListener(new Atras());
      btnMostrar.addMouseListener(new Mostrar());

      setTitle("ALTA");
      setLayout(new GridLayout(6,4));
      add(lblNombre);
      add(txtNombre);
      add(lblTelefono);
      add(txtTelefono);
      add(lblCorreo);
      add(txtCorreo);
      add(lblCumple);
      add(txtCumple);
      add(btnRegistrar);
      add(btnLimpiar);
      add(btnAtras);
      //add(btnMostrar);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false); 
    }
    
    private class Registrar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         if (txtNombre.getText()==null||txtNombre.getText().isEmpty()){ 
   
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
          }else
           if(txtTelefono.getText()==null||txtTelefono.getText().isEmpty()){
          
           JOptionPane.showMessageDialog(null, "El telefono es obligatorio","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
          }else
            if(txtTelefono.getText() != null){
            int x = txtTelefono.getText().length();
            if(x<10 || x>10)
             JOptionPane.showMessageDialog(null, "El telefono es incorrecto","Aviso", JOptionPane.INFORMATION_MESSAGE);
          else{
            mpA.agregar(txtNombre.getText(), txtTelefono.getText(), txtCorreo.getText(), txtCumple.getText());
		  		JOptionPane.showMessageDialog(null, "Se guardarán los datos","Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);		
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtCumple.setText("");
            }
         }
      }
    }
    
    private class Limpiar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         txtNombre.setText(null); 
         txtTelefono.setText(null);
         txtCorreo.setText(null);
         txtCumple.setText(null);
         txtNombre.requestFocus();
      }
    }
    
    private class Atras extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         Menu m = new Menu();
         cerrar();
      }
    }
    
    private class Mostrar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         JFrameMostrar jfm = new JFrameMostrar();
         Menu m = new Menu();
         cerrar();
      }
    }
}