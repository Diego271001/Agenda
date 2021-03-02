import javax.swing.*;
import java.awt.event.*;

public class Ingreso extends JFrame{
    JPanel panel;
    JButton btnIngresar, btnSalir, btnLimpiar;
    JTextField txtUsuario;
    JPasswordField contraseña;
    JLabel lblUsuario;
    JLabel lblContraseña;
  
    public Ingreso(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(280, 180); 
      JLabel lblUsuario = new JLabel("Usuario");
      txtUsuario = new JTextField(20);
      JLabel lblContraseña = new JLabel("Contraseña");
      contraseña = new JPasswordField(20);
      
      btnIngresar = new JButton ("Ingresar");
      btnLimpiar = new JButton("Limpiar");
      btnSalir = new JButton("Salir");
      
      btnIngresar.addMouseListener(new Ingresar());
      btnLimpiar.addMouseListener(new Limpiar());
      btnSalir.addMouseListener(new Salir());

      panel = new JPanel();
      setTitle("Agenda de Diego Alatorre");
      panel.add(lblUsuario);
      panel.add(txtUsuario);
      panel.add(lblContraseña);
      panel.add(contraseña);
      panel.add(btnIngresar);
      panel.add(btnLimpiar);
      panel.add(btnSalir);
      setContentPane(panel);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
    }
    
    private void cerrar(){
      setVisible(false);
    }
    
    private class Ingresar extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         String usuario = txtUsuario.getText();
         String password = new String(contraseña.getPassword());
         
             if(usuario.isEmpty() && password.isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y la contraseña");
                txtUsuario.requestFocus();
              
              }else{
          
                 if(usuario.equals("Diego") && password.equals("2021")){
                 
                   JOptionPane.showMessageDialog(null, "Bienvenido a la agenda de Diego Alatorre");
                   cerrar();
                   Menu m = new Menu();
                }else{
        
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña son incorrectos !!!", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtUsuario.setText(null);
                    contraseña.setText(null);
                    txtUsuario.requestFocus();
                 }
              }
           }
        }
      
   private class Limpiar extends MouseAdapter{
       public void mouseClicked(MouseEvent event){
         txtUsuario.setText(null); 
         contraseña.setText(null);
         txtUsuario.requestFocus();
       }
   }
  
   private class Salir extends MouseAdapter{
     public void mouseClicked(MouseEvent event){
         JOptionPane.showMessageDialog(null, "Diego Alatorre Diaz ;)","PROGRAMADOR", JOptionPane.WARNING_MESSAGE);
         System.exit(0);
    }
  }

}