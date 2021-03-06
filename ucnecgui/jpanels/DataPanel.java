/*
 * Copyright (C) 2017 Universidad de Carabobo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ucnecgui.jpanels;

import java.util.ArrayList;

/**
 *
 * @author Leoncio Gómez
 */
public class DataPanel extends javax.swing.JPanel {

    private ArrayList<String> data;

    /**
     * Constructor de la clase DataPanel
     *
     * @param data Información a ser mostrada en el panel
     */
    public DataPanel(ArrayList<String> data) {
        this.data = data;
        initComponents();
        initializePanel();

    }

    /**
     * Inicializa el DataPanel, introduciendo el texto de la variable data en el
     * componente jTextArea dataViewer
     */
    public void initializePanel() {
        for (String string : data) {
            dataViewer.append(string + System.lineSeparator());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataViewer = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        dataViewer.setEditable(false);
        dataViewer.setBackground(new java.awt.Color(255, 255, 255));
        dataViewer.setColumns(100);
        dataViewer.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        dataViewer.setRows(5);
        jScrollPane2.setViewportView(dataViewer);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dataViewer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
