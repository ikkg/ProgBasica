package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogoContrasenia extends JOptionPane{
    private String respuesta;
    
    public DialogoContrasenia() {
	Object[] valores = { "Aceptar", "Cancelar"};
	respuesta = JOptionPane.showInputDialog("Introduce contraseņa");
    }
    
    public static void main(String[] args) {
	if(new DialogoContrasenia().respuesta.equals("damocles")) {
	    VentanaPrincipal v = new VentanaPrincipal();
	} else {
	    JOptionPane.showMessageDialog(null, "Lo siento, la contraseņa no es correcta", "Alert", JOptionPane.ERROR_MESSAGE);
	}
    }
}
