import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JComboBox<String> userTypeComboBox;

    public LoginScreen() {
        setTitle("Connexion");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Champs de connexion
        JLabel userLabel = new JLabel("Utilisateur:");
        userField = new JTextField();
        JLabel passLabel = new JLabel("Mot de passe:");
        passField = new JPasswordField();

        // Sélection du type d'utilisateur
        JLabel userTypeLabel = new JLabel("Type d'utilisateur:");
        String[] userTypes = {"Bibliothécaire", "Étudiant"};
        userTypeComboBox = new JComboBox<>(userTypes);

        // Bouton de connexion
        loginButton = new JButton("Connexion");

        // Ajouter des composants
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(userTypeLabel);
        add(userTypeComboBox);
        add(new JLabel());  // Pour occuper l'espace vide
        add(loginButton);

        // Gérer la connexion
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userType = (String) userTypeComboBox.getSelectedItem();
                if (userType.equals("Bibliothécaire")) {
                    new BibliothecaireDashboard();  // Ouvrir tableau de bord bibliothécaire
                } else {
                    new EtudiantDashboard();  // Ouvrir tableau de bord étudiant
                }
                dispose();  // Fermer la fenêtre de connexion
            }
        });

        setVisible(true);
    }
}
