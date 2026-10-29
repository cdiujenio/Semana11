import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        //VentanaPrincipal ventanita = new VentanaPrincipal();
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}
