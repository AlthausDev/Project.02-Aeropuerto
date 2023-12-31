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
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalidas = new javax.swing.JButton();
        btnLlegadas = new javax.swing.JButton();
        btnAirlines = new javax.swing.JButton();
        btnFlightRecaudacion = new javax.swing.JButton();
        btnDiaryFlight = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(5, 0, 0, 5));

        btnSalidas.setText("Panel de Salidas");
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });
        add(btnSalidas);

        btnLlegadas.setText("Panel de Llegadas");
        btnLlegadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlegadasActionPerformed(evt);
            }
        });
        add(btnLlegadas);

        btnAirlines.setText("Vuelos por Compañias Aereas");
        btnAirlines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlinesActionPerformed(evt);
            }
        });
        add(btnAirlines);

        btnFlightRecaudacion.setText("Recaudacion por vuelos");
        btnFlightRecaudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightRecaudacionActionPerformed(evt);
            }
        });
        add(btnFlightRecaudacion);

        btnDiaryFlight.setText("Registro de Vuelos Diarios");
        btnDiaryFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaryFlightActionPerformed(evt);
            }
        });
        add(btnDiaryFlight);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAirlinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlinesActionPerformed
        cardLayout.show(mainPanel, "VuelosPorCompania");
    }//GEN-LAST:event_btnAirlinesActionPerformed

    private void btnFlightRecaudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightRecaudacionActionPerformed
        cardLayout.show(mainPanel, "Recaudaciones");
    }//GEN-LAST:event_btnFlightRecaudacionActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
       cardLayout.show(mainPanel, "Salidas");
    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnDiaryFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaryFlightActionPerformed
        cardLayout.show(mainPanel, "VuelosPrevistos");
    }//GEN-LAST:event_btnDiaryFlightActionPerformed

    private void btnLlegadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlegadasActionPerformed
        cardLayout.show(mainPanel, "Llegadas");
    }//GEN-LAST:event_btnLlegadasActionPerformed

 public void initialize(CardLayout cardLayout, JPanel mainPanel) {
        btnSalidas.addActionListener(evt -> cardLayout.show(mainPanel, "Salidas"));
        btnLlegadas.addActionListener(evt -> cardLayout.show(mainPanel, "Llegadas"));
        btnAirlines.addActionListener(evt -> cardLayout.show(mainPanel, "VuelosPorCompania"));
        btnFlightRecaudacion.addActionListener(evt -> cardLayout.show(mainPanel, "Recaudaciones"));
        btnDiaryFlight.addActionListener(evt -> cardLayout.show(mainPanel, "VuelosPrevistos"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAirlines;
    private javax.swing.JButton btnDiaryFlight;
    private javax.swing.JButton btnFlightRecaudacion;
    private javax.swing.JButton btnLlegadas;
    private javax.swing.JButton btnSalidas;
    // End of variables declaration//GEN-END:variables
}
