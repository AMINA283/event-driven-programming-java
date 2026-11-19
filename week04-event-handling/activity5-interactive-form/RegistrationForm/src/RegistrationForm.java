/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import javax.swing.JOptionPane;
public class RegistrationForm extends javax.swing.JFrame {

    

    public RegistrationForm() {
    initComponents();
    setLocationRelativeTo(null);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        otherRadio = new javax.swing.JRadioButton();
        sportsCheck = new javax.swing.JCheckBox();
        musicCheck = new javax.swing.JCheckBox();
        readingCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        countryBox = new javax.swing.JComboBox<>();
        commentsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Registration Form");

        nameLabel.setText("Full Name:");

        passwordLabel.setText("Password:");

        genderLabel.setText("Gender:");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("Email:");

        buttonGroup1.add(maleRadio);
        maleRadio.setText("Male");

        buttonGroup1.add(femaleRadio);
        femaleRadio.setText("Female");

        buttonGroup1.add(otherRadio);
        otherRadio.setText("other");
        otherRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherRadioActionPerformed(evt);
            }
        });

        sportsCheck.setText("sport");
        sportsCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsCheckActionPerformed(evt);
            }
        });

        musicCheck.setText("music");
        musicCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicCheckActionPerformed(evt);
            }
        });

        readingCheck.setText("reading");
        readingCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readingCheckActionPerformed(evt);
            }
        });

        jLabel1.setText("interest:");

        countryLabel.setText("Country:");

        countryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kenya", "Tanzania", "Uganda", "Rwanda" }));
        countryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryBoxActionPerformed(evt);
            }
        });

        commentsLabel.setText("Comments:");

        commentsArea.setColumns(30);
        commentsArea.setRows(3);
        jScrollPane1.setViewportView(commentsArea);

        submitButton.setBackground(new java.awt.Color(102, 255, 102));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 0, 0));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        statusLabel.setText("Status: Ready");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel)
                            .addComponent(nameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(genderLabel)
                                    .addComponent(countryLabel)
                                    .addComponent(commentsLabel)
                                    .addComponent(submitButton)
                                    .addComponent(statusLabel))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(emailField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sportsCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(musicCheck))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(maleRadio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(femaleRadio))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(otherRadio)
                                    .addComponent(readingCheck)))
                            .addComponent(countryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(clearButton)
                                .addGap(48, 48, 48)
                                .addComponent(exitButton)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio)
                    .addComponent(otherRadio))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sportsCheck)
                    .addComponent(musicCheck)
                    .addComponent(readingCheck))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLabel)
                    .addComponent(countryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commentsLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addGap(26, 26, 26)
                .addComponent(statusLabel)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void otherRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherRadioActionPerformed

    private void sportsCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sportsCheckActionPerformed

    private void musicCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicCheckActionPerformed

    private void readingCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readingCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_readingCheckActionPerformed

    private void countryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        nameField.setText("");
emailField.setText("");
passwordField.setText("");

buttonGroup1.clearSelection();

sportsCheck.setSelected(false);
musicCheck.setSelected(false);
readingCheck.setSelected(false);

countryBox.setSelectedIndex(0);
commentsArea.setText("");

statusLabel.setText("Status: Form cleared");
statusLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       int choice = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to exit?",
        "Confirm Exit",
        JOptionPane.YES_NO_OPTION
);

if (choice == JOptionPane.YES_OPTION) {
    System.exit(0);
}
    }//GEN-LAST:event_exitButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String name = nameField.getText().trim();
String email = emailField.getText().trim();
String password = new String(passwordField.getPassword());

if (name.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter your name");
    return;
}

if (email.isEmpty() || !email.contains("@")) {
    JOptionPane.showMessageDialog(this, "Please enter a valid email");
    return;
}

if (password.length() < 6) {
    JOptionPane.showMessageDialog(this, "Password must be at least 6 characters");
    return;
}

String gender = "Not specified";

if (maleRadio.isSelected()) {
    gender = "Male";
} else if (femaleRadio.isSelected()) {
    gender = "Female";
} else if (otherRadio.isSelected()) {
    gender = "Other";
}

String interests = "";

if (sportsCheck.isSelected()) interests += "Sports ";
if (musicCheck.isSelected()) interests += "Music ";
if (readingCheck.isSelected()) interests += "Reading ";

String country = countryBox.getSelectedItem().toString();
String comments = commentsArea.getText().trim();

String message = "Registration Successful!\n\n"
        + "Name: " + name + "\n"
        + "Email: " + email + "\n"
        + "Gender: " + gender + "\n"
        + "Interests: " + (interests.isEmpty() ? "None" : interests) + "\n"
        + "Country: " + country + "\n"
        + "Comments: " + (comments.isEmpty() ? "None" : comments);

JOptionPane.showMessageDialog(this, message, "Registration Complete",
        JOptionPane.INFORMATION_MESSAGE);

statusLabel.setText("Registration submitted successfully!");
statusLabel.setForeground(Color.GREEN.darker());
    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea commentsArea;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JComboBox<String> countryBox;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JCheckBox musicCheck;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton otherRadio;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox readingCheck;
    private javax.swing.JCheckBox sportsCheck;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
