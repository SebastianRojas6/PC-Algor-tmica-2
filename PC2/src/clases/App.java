package clases;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Crear instancias de las clases
        Pelicula pelicula = new Pelicula("NombrePelicula", "Accion", "Español", "TituloDistribucion", "TituloOriginal",
                "http://urlpelicula.com", "ID123", "Apta todo público", true, 2022, "2022-01-01",
                "Resumen de la película",
                120, new String[] { "Director1", "Director2" }, new String[] { "Actor1", "Actor2" },
                new String[] { "Personaje1", "Personaje2" });

        funcion funcion = new funcion("Lunes", "18:00", "Sala1", pelicula.getNombre(), "FuncionID123", "100");

        Cineasta cineasta = new Cineasta("NombreCineasta", "NacionalidadCineasta",
                new String[] { "PeliculaDirigida1", "PeliculaDirigida2" },
                new String[] { "PeliculaActuada1", "PeliculaActuada2" },
                null);

        Cine cine = new Cine("NombreCine", "DireccionCine", "TelefonoCine");
        cine.setCartelera("Información de la cartelera...");

        // Crear la interfaz gráfica
        JFrame frame = new JFrame("Información de Cine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));

        JButton mostrarInformacionButton = new JButton("Mostrar Información");
        mostrarInformacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar información en el JTextArea
                textArea.setText("");
                textArea.append("Información de la Película:\n");
                textArea.append(pelicula.toString() + "\n\n");

                textArea.append("Información de la Función:\n");
                textArea.append(funcion.toString() + "\n\n");

                textArea.append("Información del Cineasta:\n");
                textArea.append(cineasta.toString() + "\n\n");

                textArea.append("Información del Cine:\n");
                textArea.append(cine.toString() + "\n");
            }
        });

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(mostrarInformacionButton)
                .addComponent(textArea, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(mostrarInformacionButton)
                .addComponent(textArea, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE));

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
