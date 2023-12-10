/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pa.althaus.dam.javaproyect.aeropuerto.view.panels;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Imper
 */
public class MainPanel extends javax.swing.JPanel {
    
    private JPanel mainPanel;
    private CardLayout cardLayout;

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
    }

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(mainPanel, "Salidas");
    }

    private void btnLlegadasActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(mainPanel, "Llegadas");
    }

    private void btnVuelosPorCompaniaActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(mainPanel, "VuelosPorCompania");
    }

    private void btnRecaudacionesActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(mainPanel, "Recaudaciones");
    }

    private void btnVuelosPrevistosActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(mainPanel, "VuelosPrevistos");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPanel = new javax.swing.JButton();
        btnAirlines = new javax.swing.JButton();
        btnFlight = new javax.swing.JButton();
        btnDiaryFlight = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(4, 0, 0, 5));

        btnPanel.setText("Panel de Informacion");
        btnPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanelActionPerformed(evt);
            }
        });
        add(btnPanel);

        btnAirlines.setText("Compañias Aereas");
        btnAirlines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlinesActionPerformed(evt);
            }
        });
        add(btnAirlines);

        btnFlight.setText("Vuelos");
        btnFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightActionPerformed(evt);
            }
        });
        add(btnFlight);

        btnDiaryFlight.setText("Registro de Vuelos Diarios");
        btnDiaryFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaryFlightActionPerformed(evt);
            }
        });
        add(btnDiaryFlight);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAirlinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlinesActionPerformed
        //AirlinesView frm = new AirlinesView();
        //frm.setVisible(true);
    }//GEN-LAST:event_btnAirlinesActionPerformed

    private void btnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFlightActionPerformed

    private void btnPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPanelActionPerformed

    private void btnDiaryFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaryFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDiaryFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAirlines;
    private javax.swing.JButton btnDiaryFlight;
    private javax.swing.JButton btnFlight;
    private javax.swing.JButton btnPanel;
    // End of variables declaration//GEN-END:variables
}