import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliothecaireDashboard extends JFrame {
    public BibliothecaireDashboard() {
        setTitle("Tableau de bord du Bibliothécaire");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton addBookButton = new JButton("Ajouter un livre");
        JButton removeBookButton = new JButton("Supprimer un livre");
        JButton viewBooksButton = new JButton("Voir les livres");

        add(addBookButton);
        add(removeBookButton);
        add(viewBooksButton);

        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AjouterLivreScreen();  // Ouvre la fenêtre d'ajout de livre
            }
        });

        viewBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListeLivresScreen();  // Ouvre la fenêtre de liste des livres
            }
        });

        setVisible(true);
    }
}
