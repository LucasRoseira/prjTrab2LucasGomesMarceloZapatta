/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Atendente;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.ButtonGroup;

/**
 *
 * @author Lucas Roseira && Marcelo Zapatta
 */
public class GuiAtendente extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroCliente
     */
    public GuiAtendente(ArrayList<Atendente> c) {
        initComponents();
        this.setLocationRelativeTo(null);
        cadastro = c;

        bgpTurno.add(rdbManha);
        bgpTurno.add(rdbTarde);
        bgpTurno.add(rdbNoite);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpTurno = new javax.swing.ButtonGroup();
        lblRegFuncional = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRegFuncional = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        pnlTurno = new javax.swing.JLayeredPane();
        rdbManha = new javax.swing.JRadioButton();
        rdbTarde = new javax.swing.JRadioButton();
        rdbNoite = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Atendente");
        setResizable(false);

        lblRegFuncional.setText("Reg. Funcional");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereço");

        lblTelefone.setText("Telefone");

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtRegFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegFuncionalActionPerformed(evt);
            }
        });

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        pnlTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));
        pnlTurno.setEnabled(false);

        rdbManha.setSelected(true);
        rdbManha.setText("Manhã");
        rdbManha.setEnabled(false);

        rdbTarde.setText("Tarde");
        rdbTarde.setEnabled(false);

        rdbNoite.setText("Noite");
        rdbNoite.setEnabled(false);

        pnlTurno.setLayer(rdbManha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTurno.setLayer(rdbTarde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlTurno.setLayer(rdbNoite, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlTurnoLayout = new javax.swing.GroupLayout(pnlTurno);
        pnlTurno.setLayout(pnlTurnoLayout);
        pnlTurnoLayout.setHorizontalGroup(
            pnlTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTurnoLayout.createSequentialGroup()
                .addComponent(rdbManha)
                .addGap(18, 18, 18)
                .addComponent(rdbTarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbNoite)
                .addGap(20, 20, 20))
        );
        pnlTurnoLayout.setVerticalGroup(
            pnlTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbManha)
                    .addComponent(rdbTarde)
                    .addComponent(rdbNoite))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco)
                            .addComponent(lblTelefone)
                            .addComponent(lblRegFuncional))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(txtEndereco))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlTurno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegFuncional)
                    .addComponent(txtRegFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(pnlTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtRegFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegFuncionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegFuncionalActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String turno = "";

        txtRegFuncional.setEnabled(false);
        cadastro.get(posAtendente).setNome(txtNome.getText());
        cadastro.get(posAtendente).setEndereco(txtEndereco.getText());
        cadastro.get(posAtendente).setTelefone(txtTelefone.getText());

        if (rdbManha.isSelected()) {
            turno = "M";
        } else if (rdbTarde.isSelected()) {
            turno = "T";
        } else {
            turno = "N";
        }

        cadastro.get(posAtendente).setTurno(turno);

        txtRegFuncional.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        rdbManha.setSelected(true);

        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        pnlTurno.setEnabled(false);
        rdbManha.setEnabled(false);
        rdbTarde.setEnabled(false);
        rdbNoite.setEnabled(false);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtRegFuncional.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int x;
        for (x = 0; x < cadastro.size(); x++) {
            if (cadastro.get(x) instanceof Atendente) {
                if (((Atendente) cadastro.get(x)).getRegFunc().equals(txtRegFuncional.getText())) {
                    break;
                }
            }
        }

        if (x < cadastro.size()) {
            posAtendente = x; //localizou o objeto Atendente no ArrayList
        } else {
            posAtendente = -1;//não localizou o objeto Atendente no ArrayList
        }

        if (posAtendente >= 0) {
            txtRegFuncional.setText(cadastro.get(posAtendente).getRegFunc());
            txtNome.setText(cadastro.get(posAtendente).getNome());
            txtEndereco.setText(cadastro.get(posAtendente).getEndereco());
            txtTelefone.setText(cadastro.get(posAtendente).getTelefone());

            switch (cadastro.get(posAtendente).getTurno()) {
                case "M":
                    rdbManha.setSelected(true);
                    break;
                case "T":
                    rdbTarde.setSelected(true);
                    break;
                default:
                    rdbNoite.setSelected(true);
                    break;
            }

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } else {
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }

        txtRegFuncional.setEnabled(false);
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        pnlTurno.setEnabled(true);
        rdbManha.setEnabled(true);
        rdbNoite.setEnabled(true);
        rdbTarde.setEnabled(true);

        txtNome.requestFocus();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String turno = "";
        at = new Atendente(txtRegFuncional.getText(),
                txtNome.getText()
        );
        ((Atendente) at).setEndereco((txtEndereco.getText()));
        ((Atendente) at).setTelefone((txtTelefone.getText()));

        if (rdbManha.isSelected()) {
            turno = "M";
        } else if (rdbTarde.isSelected()) {
            turno = "T";
            ((Atendente) at).setTurno("T");
        } else {
            turno = "N";
        }

        ((Atendente) at).setTurno(turno);

        cadastro.add(at);

        txtRegFuncional.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        rdbManha.setSelected(true);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        pnlTurno.setEnabled(false);
        rdbManha.setEnabled(false);
        rdbTarde.setEnabled(false);
        rdbNoite.setEnabled(false);

        txtRegFuncional.requestFocus();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posAtendente >= 0) {
            cadastro.remove(posAtendente);
            posAtendente = -1;
        }

        txtRegFuncional.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        rdbManha.setSelected(true);

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        pnlTurno.setEnabled(false);
        rdbManha.setEnabled(false);
        rdbTarde.setEnabled(false);
        rdbNoite.setEnabled(false);

        txtRegFuncional.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpTurno;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRegFuncional;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLayeredPane pnlTurno;
    private javax.swing.JRadioButton rdbManha;
    private javax.swing.JRadioButton rdbNoite;
    private javax.swing.JRadioButton rdbTarde;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegFuncional;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Atendente> cadastro;
    private Atendente at = null;
    private int posAtendente;
}
