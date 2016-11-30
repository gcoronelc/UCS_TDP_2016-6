/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekaapp.view;

import javax.swing.JOptionPane;
import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.impl.ClienteServiceImpl;
import pe.egcc.eureka.service.spec.ClienteServiceSpec;

/**
 *
 * @author Docente
 */
public class ConClienteView extends javax.swing.JInternalFrame {

  /**
   * Creates new form ConClienteView
   */
  public ConClienteView() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    txtCodigo = new javax.swing.JTextField();
    btnConsultar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtRepo = new javax.swing.JTextArea();

    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("CONSULTAR CLIENTE");

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Código del cliente:");

    txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnConsultar.setText("Consultar");
    btnConsultar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConsultarActionPerformed(evt);
      }
    });

    txtRepo.setEditable(false);
    txtRepo.setColumns(20);
    txtRepo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
    txtRepo.setRows(5);
    jScrollPane1.setViewportView(txtRepo);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jScrollPane1)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(68, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
          .addComponent(txtCodigo)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(32, 32, 32)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    try {
      // Dato
      String codigo = txtCodigo.getText();
      // Proceso
      ClienteServiceSpec clienteService = new ClienteServiceImpl();
      Cliente bean = clienteService.getCliente(codigo);
      if(bean == null){
        throw new Exception("Código " + codigo + " no existe.");
      }
      // Reporte
      String repo = "";
      repo += "Código: " + bean.getCodigo() + "\n";
      repo += "Paterno: " + bean.getPaterno()+ "\n";
      repo += "Materno: " + bean.getMaterno()+ "\n";
      repo += "Nombre: " + bean.getNombre()+ "\n";
      repo += "Ciudad: " + bean.getCiudad() + "\n";
      repo += "Dirección: " + bean.getDireccion() + "\n";
      txtRepo.setText(repo);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
  }//GEN-LAST:event_btnConsultarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnConsultar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtCodigo;
  private javax.swing.JTextArea txtRepo;
  // End of variables declaration//GEN-END:variables
}
