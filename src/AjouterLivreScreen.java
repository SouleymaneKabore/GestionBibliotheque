import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AjouterLivreScreen extends JFrame {
    private JTextField titreField, auteurField, anneeField;

    public AjouterLivreScreen() {
        setTitle("Ajouter un Livre");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Champs pour ajouter un livre
        titreField = new JTextField();
        auteurField = new JTextField();
        anneeField = new JTextField();

        add(new JLabel("Titre:"));
        add(titreField);
        add(new JLabel("Auteur:"));
        add(auteurField);
        add(new JLabel("Année de publication:"));
        add(anneeField);

        JButton ajouterButton = new JButton("Ajouter");
        add(ajouterButton);

        // Gérer l'ajout du livre
        ajouterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titre = titreField.getText();
                String auteur = auteurField.getText();
                String annee = anneeField.getText();

                // Ajouter le livre à la base de données (simulation ici)
                System.out.println("Livre ajouté: " + titre + " par " + auteur);
                dispose();  // Fermer la fenêtre après ajout
            }
        });

        setVisible(true);
    }
}
