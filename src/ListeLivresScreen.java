import javax.swing.*;
import java.awt.*;

public class ListeLivresScreen extends JFrame {
    public ListeLivresScreen() {
        setTitle("Liste des Livres");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Simuler une liste de livres avec un tableau
        String[] columnNames = {"Titre", "Auteur", "Année", "Disponibilité"};
        Object[][] data = {
                {"Livre A", "Auteur 1", "2020", "Disponible"},
                {"Livre B", "Auteur 2", "2018", "Emprunté"},
                {"Livre C", "Auteur 3", "2021", "Disponible"}
        };

        JTable livresTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(livresTable);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
