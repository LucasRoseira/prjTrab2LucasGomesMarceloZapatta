/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.QuartoHotel;
import java.util.ArrayList;

/**
 *
 * @author roseira && zapatta
 */
public class GuiQuarto extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroQuarto
     */
    public GuiQuarto(ArrayList<QuartoHotel> h) {
        initComponents();
        this.setLocationRelativeTo(null);
        hotel = h;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumQuarto = new javax.swing.JLabel();
        lblValorDiaria = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtValorDiaria = new javax.swing.JTextField();
        txtNumQuarto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Quarto");
        setResizable(false);

        lblNumQuarto.setText("No. Quarto");

        lblValorDiaria.setText("Valor Diária");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtValorDiaria.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(lblValorDiaria)
                    .addComponent(lblNumQuarto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumQuarto)
                    .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorDiaria)
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnSair))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        int x;
        for (x = 0; x < hotel.size(); x++) {
            if (hotel.get(x) instanceof QuartoHotel
                    && hotel.get(x).getNumQuarto()
                    == Integer.parseInt(txtNumQuarto.getText())) {
                break;
            }
        }

        if (x < hotel.size()) {
            posQuarto = x; //localizou o objeto Hotel no ArrayList
        } else {
            posQuarto = -1;//não localizou o objeto Hotel no ArrayList
        }

        if (posQuarto >= 0) {
            txtNumQuarto.setText(String.valueOf(hotel.get(posQuarto).getNumQuarto()));
            txtValorDiaria.setText(String.valueOf(hotel.get(posQuarto).getValorDiaria()));

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
        } else {
            txtNumQuarto.setEnabled(true);
            txtValorDiaria.setText(null);
            txtValorDiaria.setEnabled(true);
            
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:

        //instanciação do objeto da classe QuartoHotel
        QuartoHotel hot = new QuartoHotel(Integer.parseInt(txtNumQuarto.getText()),
                Integer.parseInt(txtValorDiaria.getText()));

        //inserindo o quarto no ArrayList
        hotel.add(hot);

        txtNumQuarto.setText(null);
        txtValorDiaria.setText(null);
        txtValorDiaria.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblNumQuarto;
    private javax.swing.JLabel lblValorDiaria;
    private javax.swing.JTextField txtNumQuarto;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration//GEN-END:variables
    private ArrayList<QuartoHotel> hotel;
    private int posQuarto;
}