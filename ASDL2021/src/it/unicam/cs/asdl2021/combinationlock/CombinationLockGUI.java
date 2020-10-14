package it.unicam.cs.asdl2021.combinationlock;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * GUI per usare una combination lock che ha come combinazione tre lettere
 * maiuscole.
 * 
 * Le componenti della GUI sono state generate automaticamente con Apache
 * NetBeans IDE 12.0 - https://netbeans.org/
 * 
 * @author Luca Tesei
 */
public class CombinationLockGUI extends javax.swing.JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private CombinationLock c;

    /**
     * Creates new form CombinationLockGUI
     */
    public CombinationLockGUI() {
        this.c = new CombinationLock("AAA");
        initComponents();
        JOptionPane.showMessageDialog(this,
                "La combinazione iniziale è \"AAA\"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setList = new javax.swing.JSpinner();
        setButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        combinationLockImageLabel = new javax.swing.JLabel();
        newCombinationText = new javax.swing.JTextField();
        changeAndCloseButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        newCombinationLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setList.setModel(new javax.swing.SpinnerListModel(new String[] { "A",
                "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        setList.setBorder(javax.swing.BorderFactory
                .createLineBorder(new java.awt.Color(0, 0, 0)));

        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        combinationLockImageLabel
                .setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        combinationLockImageLabel.setForeground(new java.awt.Color(0, 255, 0));
        combinationLockImageLabel
                .setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        combinationLockImageLabel.setText("OPEN");

        newCombinationText.setText("AAA");

        changeAndCloseButton.setText("Change and Close");
        changeAndCloseButton
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(
                            java.awt.event.ActionEvent evt) {
                        changeAndCloseButtonActionPerformed(evt);
                    }
                });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        newCombinationLabel.setText("New Combination");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout
                                                                .createSequentialGroup()
                                                                .addGap(65, 65,
                                                                        65)
                                                                .addComponent(
                                                                        newCombinationText,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout
                                                                .createSequentialGroup()
                                                                .addGap(32, 32,
                                                                        32)
                                                                .addComponent(
                                                                        newCombinationLabel))
                                                        .addGroup(layout
                                                                .createSequentialGroup()
                                                                .addGap(7, 7, 7)
                                                                .addComponent(
                                                                        changeAndCloseButton)))
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        38,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(closeButton,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        90,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(setList,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        51,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(setButton)
                                                .addGap(74, 74, 74)
                                                .addComponent(openButton,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        127,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jSeparator2,
                                javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                .addComponent(jSeparator3,
                        javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                        .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(combinationLockImageLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 160,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)));
        layout.setVerticalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(setList,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(setButton).addComponent(openButton))
                        .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combinationLockImageLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout
                                                        .createSequentialGroup()
                                                        .addComponent(
                                                                newCombinationLabel)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(
                                                                newCombinationText,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                28,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(
                                                                changeAndCloseButton))
                                                .addComponent(jSeparator1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        99,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 18, Short.MAX_VALUE))
                                .addGroup(
                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                        layout.createSequentialGroup()
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addComponent(closeButton,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        54,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)))));

        pack();
    }// </editor-fold>

    /*
     * Associa l'azione corretta alla pressione del tasto Set
     */
    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Faccio il set della posizione indicata nello spinner
        String letter = (String) setList.getValue();
        this.c.setPosition(letter.charAt(0));
    }

    /*
     * Associa l'azione corretta alla pressione del tasto Open
     */
    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // apro e poi controllo se si è aperta
        this.c.open();
        if (this.c.isOpen()) {
            combinationLockImageLabel.setText("OPEN");
            combinationLockImageLabel.setForeground(Color.green);
            newCombinationText.setEnabled(true);
            changeAndCloseButton.setEnabled(true);
            closeButton.setEnabled(true);
            newCombinationLabel.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Combinazione non corretta!");
        }
    }

    /*
     * Associa l'azione corretta alla pressione del tasto Change and Close
     */
    private void changeAndCloseButtonActionPerformed(
            java.awt.event.ActionEvent evt) {
        // Richiudo con la nuova combinazione, ma controllo se è corretta:
        if (this.c.isOpen()) {
            try {
                this.c.lockAndChangeCombination(newCombinationText.getText());
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                return;
            }
            this.c.lock();
            combinationLockImageLabel.setText("CLOSED");
            combinationLockImageLabel.setForeground(Color.red);
            newCombinationText.setEnabled(false);
            changeAndCloseButton.setEnabled(false);
            closeButton.setEnabled(false);
            newCombinationLabel.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "La cassaforte è già chiusa!");
        }
    }

    /*
     * Associa l'azione corretta alla pressione del tasto Close
     */
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Richiudo e disabilito i pulsanti per chiudere e cambiare la
        // combinazione:
        if (this.c.isOpen()) {
            this.c.lock();
            combinationLockImageLabel.setText("CLOSED");
            combinationLockImageLabel.setForeground(Color.red);
            newCombinationText.setEnabled(false);
            changeAndCloseButton.setEnabled(false);
            closeButton.setEnabled(false);
            newCombinationLabel.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "La cassaforte è già chiusa!");
        }
    }

    /**
     * @param args
     *                 the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting
        // code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
         * html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger
                    .getLogger(CombinationLockGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger
                    .getLogger(CombinationLockGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger
                    .getLogger(CombinationLockGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger
                    .getLogger(CombinationLockGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CombinationLockGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton changeAndCloseButton;

    private javax.swing.JButton closeButton;

    private javax.swing.JLabel combinationLockImageLabel;

    private javax.swing.JSeparator jSeparator1;

    private javax.swing.JSeparator jSeparator2;

    private javax.swing.JSeparator jSeparator3;

    private javax.swing.JLabel newCombinationLabel;

    private javax.swing.JTextField newCombinationText;

    private javax.swing.JButton openButton;

    private javax.swing.JButton setButton;

    private javax.swing.JSpinner setList;
    // End of variables declaration
}
