package UI;

import javax.swing.*;

import styles.RoundedBorder;

import java.awt.*;

public class SignupFrame extends JFrame {

    public SignupFrame() {
        setTitle("Sign Up");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); //! un gestionnaire de placement standard de Swing
        setResizable(false);

        //! Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(2, 158, 54));
        leftPanel.setPreferredSize(new Dimension(960, 1080));

        JLabel title = new JLabel("YourPCB");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 80));

        leftPanel.setLayout(new GridBagLayout()); //! by default center
        leftPanel.add(title);

        //! Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);

        rightPanel.setLayout(new GridBagLayout()); //! Il place les composants dans une grille dont tu contrôles chaque cellule

        GridBagConstraints gbc = new GridBagConstraints(); //! gbc = position and control
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(15, 0, 15, 0); //! Insets(top, left, bottom, right) px margin
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel signUpLabel = new JLabel("SIGN UP");
        signUpLabel.setFont(new Font("SansSerif", Font.BOLD, 30));

        JLabel emailLabel = new JLabel("Email address");
        JTextField emailField = new JTextField(20);

        //! style email field
        emailField.setBorder(new RoundedBorder(10, new Color(200, 200, 200), 2));
       emailField.setFont(new Font("SansSerif", Font.PLAIN, 16));

       //! when we click at the field , the color change using override
       emailField.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                emailField.setBackground(new Color(245, 245, 245));
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                emailField.setBackground(new Color(255, 255, 255));
            }
        });

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20);

        //! style password field
        passwordField.setBorder(new RoundedBorder(10, new Color(200, 200, 200), 2));
       passwordField.setFont(new Font("SansSerif", Font.PLAIN, 16));

       //! when we click at the field , the color change using override
       passwordField.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                passwordField.setBackground(new Color(245, 245, 245));
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                passwordField.setBackground(new Color(255, 255, 255));
            }
        });

        JCheckBox rememberMe = new JCheckBox("Remember me");
        rememberMe.setBackground(Color.WHITE);
        rememberMe.setFocusPainted(false); //! remove the default style

        JButton registerBtn = new JButton("Register Account");
        registerBtn.setBackground(new Color(2, 158, 54));
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registerBtn.setFocusPainted(false); //! remove the default style

        registerBtn.addActionListener(e -> {
            if (emailField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (passwordField.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "Password required", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        });

        //! style button hover
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                registerBtn.setBackground(new Color(0, 130, 40));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                registerBtn.setBackground(new Color(2, 158, 54));
            }
        });

        JLabel loginLabel = new JLabel("Have an account ?");
        JButton loginBtn = new JButton("Sign in here");
        loginBtn.setContentAreaFilled(false);
        loginBtn.setBorderPainted(false);
        loginBtn.setForeground(new Color(0, 102, 204));
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JPanel linkPanel = new JPanel();
        linkPanel.setBackground(Color.WHITE);
        linkPanel.add(loginLabel);
        linkPanel.add(loginBtn);


        //! Place each component below the previous one by adding y++
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 25, 0);
        rightPanel.add(signUpLabel, gbc);

        gbc.gridy++;
        gbc.weighty = 0;
        gbc.insets = new Insets(0, 0, 2, 0);
        rightPanel.add(emailLabel, gbc);

        gbc.gridy++;
        gbc.weighty = 0;
        gbc.insets = new Insets(2, 0, 10, 0);
        rightPanel.add(emailField, gbc);

        gbc.gridy++;
        gbc.weighty = 0;
        gbc.insets = new Insets(0, 0, 2, 0);
        rightPanel.add(passwordLabel, gbc);

        gbc.gridy++;
        gbc.weighty = 0;
        gbc.insets = new Insets(2, 0, 10, 0);
        rightPanel.add(passwordField, gbc);

        gbc.gridy++;
        gbc.weighty = 0;
        rightPanel.add(rememberMe, gbc);

        gbc.gridy++;
        gbc.weighty = 0;
        gbc.ipady = 10; //! add 10px to y
        rightPanel.add(registerBtn, gbc);

        gbc.gridy++;
        gbc.weighty = 0;
        gbc.ipady = 0;
        rightPanel.add(linkPanel, gbc);


        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);
    }

    //! To test the page (everything will be imported to app.java)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SignupFrame frame = new SignupFrame();
            frame.setVisible(true);
        });
    }
}
