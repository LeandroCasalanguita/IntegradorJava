
package View;

import Controller.Orador;
import Controller.OradorController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OradorView extends javax.swing.JFrame {
    OradorController oradorControler = null;
    public OradorView() {
        initComponents();
        this.oradorControler = new OradorController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOradores = new javax.swing.JTable();
        btnModificarOrador = new javax.swing.JButton();
        btnEliminarOrador = new javax.swing.JButton();
        btnAgregarOrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Oradores");

        tablaOradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaOradores);

        btnModificarOrador.setText("Modificar Orador");
        btnModificarOrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarOradorActionPerformed(evt);
            }
        });

        btnEliminarOrador.setText("Eliminar Orador");
        btnEliminarOrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarOradorActionPerformed(evt);
            }
        });

        btnAgregarOrador.setText("Agregar Orador");
        btnAgregarOrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarOrador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarOrador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarOrador, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregarOrador, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnModificarOrador, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarOrador, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarOradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOradorActionPerformed
        Agregar add= new Agregar();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarOradorActionPerformed

    private void btnModificarOradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarOradorActionPerformed
            if(tablaOradores.getRowCount()>0){
                if( tablaOradores.getSelectedRow() != -1 ){
                    int id = Integer.parseInt(String.valueOf(tablaOradores.getValueAt(tablaOradores.getSelectedRow(),0)));
                    Modificar viewMod = new Modificar(id);
                    viewMod.setVisible(true);
                    viewMod.setLocationRelativeTo(null);
                    this.dispose();
                }
                else{
                    mostrarMensaje("Seleccione un Orador","error","No se pudo modificar");
                }
         }
        else{
            mostrarMensaje("No hay nada seleccionado para modificar","error","No se pudo modificar");
        }     
    }//GEN-LAST:event_btnModificarOradorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarOradores();

    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarOradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarOradorActionPerformed
                if(tablaOradores.getRowCount()>0){
            if( tablaOradores.getSelectedRow() != -1 ){
                int id = Integer.parseInt(String.valueOf(tablaOradores.getValueAt(tablaOradores.getSelectedRow(),0)));
                oradorControler.borrarOrador(id);
                mostrarMensaje("El orador fue eliminado","info","Orador eliminado");
                this.cargarOradores();
            }
            else{
                mostrarMensaje("Seleccione un Orador","error","No se pudo eliminar");
            }
         }
        else{
            mostrarMensaje("No hay nada seleccionado para eliminar","error","No se pudo eliminar");
        }
    }//GEN-LAST:event_btnEliminarOradorActionPerformed
    
    public void mostrarMensaje(String msj , String tipo, String titu){
         JOptionPane optionPane = new JOptionPane(msj);
            if(tipo.equals("info")){
               optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE); 
            }
            else if(tipo.equals("error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE); 
            }
        
        JDialog dialog = optionPane.createDialog(titu);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private void cargarOradores() {
        DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
            
        };
        
        String titulos [] = {"ID","Nombre","Apellido","Email", "Tema"};
        tabla.setColumnIdentifiers(titulos);
        
        List<Orador> listaOradores = new ArrayList<>(oradorControler.cargarOradores());
        if(listaOradores!=null){
            for(Orador ora:listaOradores){
                Object [ ] orador = {ora.getId(),ora.getNombre(),ora.getApellido(),ora.getEmail(),ora.getTema()};
                
                tabla.addRow(orador);
            }
        }
        tablaOradores.setModel(tabla);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarOrador;
    private javax.swing.JButton btnEliminarOrador;
    private javax.swing.JButton btnModificarOrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaOradores;
    // End of variables declaration//GEN-END:variables
}
