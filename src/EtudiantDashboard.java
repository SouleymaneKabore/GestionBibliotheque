import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EtudiantDashboard extends JFrame {
    public EtudiantDashboard() {
        setTitle("Tableau de bord de l'Étudiant");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton searchBookButton = new JButton("Rechercher un livre");
        JButton borrowBookButton = new JButton("Emprunter un livre");

        add(searchBookButton);
        add(borrowBookButton);

        searchBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListeLivresScreen();  // Ouvrir fenêtre de liste des livres
            }
        });

        setVisible(true);
    }
}
