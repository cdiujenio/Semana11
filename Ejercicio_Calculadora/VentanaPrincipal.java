import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame{
    private JTextField txtNumero;
    private JButton btnSumar;
    private JLabel lblResultado;

    public VentanaPrincipal(){
        setTitle("Ventana Principal");
        setSize(500,300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        txtNumero = new JTextField(5);
        btnSumar = new JButton("Sumar 10");
        lblResultado= new JLabel("Resultado: ");
       
        panel.add(new JLabel("Ingrese Numero"));
        panel.add(txtNumero);
        panel.add(btnSumar);
        panel.add(lblResultado);

        add(panel);

        setVisible(true);

        btnSumar.addActionListener(e->{
            String sNumero = txtNumero.getText().toString();
            int iResultado = Integer.parseInt(sNumero)+10;
            lblResultado.setText("Resultado: "+iResultado);
        });
    }
}
