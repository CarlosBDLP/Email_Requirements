package flujo;

import javax.swing.*;

public class Ejercicio_Email_for {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Introduce tu direccion de  email, teniendo en cuenta los siguientes requisitos:\n" +
                "\n" +
                "⚈ Debe tener una @\n" +
                "⚈ No debe tener más de una @\n" +
                "⚈ Debe tener un punto\n" +
                "⚈ La dirección de email debe tener al menos 4 caracteres.");

        String email = JOptionPane.showInputDialog("Introduce tu correo electronico");

        for (int i = 0; email.length() < 4; i++) {
            JOptionPane.showMessageDialog(null, "No has cumplido uno de los requisitos ");
            email = JOptionPane.showInputDialog("Introduce tu correo electronico");

            for (int j = 0; !email.contains("."); j++) {
                JOptionPane.showMessageDialog(null, "No has cumplido uno de los requisitos ");
                email = JOptionPane.showInputDialog("Introduce tu correo electronico");

                for (int z = 0; !email.contains("@"); z++) {
                    JOptionPane.showMessageDialog(null, "No has cumplido uno de los requisitos ");
                    email = JOptionPane.showInputDialog("Introduce tu correo electronico");
                }
            }


        }
    }
}

