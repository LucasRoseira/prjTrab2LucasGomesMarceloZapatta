/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.*;
import java.util.ArrayList;

/**
 *
 * @author roseira && zapatta
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public GuiMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroQuarto = new javax.swing.JMenuItem();
        jMenuItemCadastroAtendente = new javax.swing.JMenuItem();
        jMenuItemCadastroHospede = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemReservarLiberar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel POO");
        setResizable(false);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroQuarto.setText("Quarto");
        jMenuItemCadastroQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroQuarto);

        jMenuItemCadastroAtendente.setText("Atendente");
        jMenuItemCadastroAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroAtendenteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroAtendente);

        jMenuItemCadastroHospede.setText("Hóspede");
        jMenuItemCadastroHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroHospedeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroHospede);

        jMenuBar1.add(jMenuCadastro);

        jMenuRegistro.setText("Registro");

        jMenuItemReservarLiberar.setText("Reservar/Liberar");
        jMenuItemReservarLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservarLiberarActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemReservarLiberar);

        jMenuBar1.add(jMenuRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroQuartoActionPerformed
        // TODO add your handling code here:
        new GuiQuarto(hotel).setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroQuartoActionPerformed

    private void jMenuItemCadastroAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroAtendenteActionPerformed
        // TODO add your handling code here:
        new GuiAtendente(atendentes).setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroAtendenteActionPerformed

    private void jMenuItemCadastroHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroHospedeActionPerformed
        // TODO add your handling code here:
        new GuiHospede(hospedes).setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroHospedeActionPerformed

    private void jMenuItemReservarLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservarLiberarActionPerformed
        // TODO add your handling code here:
        GuiReservaLiberaQuarto reservaLibera = new GuiReservaLiberaQuarto();
        reservaLibera.setVisible(true);
    }//GEN-LAST:event_jMenuItemReservarLiberarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadastroAtendente;
    private javax.swing.JMenuItem jMenuItemCadastroHospede;
    private javax.swing.JMenuItem jMenuItemCadastroQuarto;
    private javax.swing.JMenuItem jMenuItemReservarLiberar;
    private javax.swing.JMenu jMenuRegistro;
    // End of variables declaration//GEN-END:variables
    private ArrayList<QuartoHotel> hotel = new ArrayList<QuartoHotel>();
    private ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
    private ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
}
