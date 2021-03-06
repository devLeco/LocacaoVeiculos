/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasPrincipais;

import classes.Carro;
import dados.CarrosDados;
import static dados.CarrosDados.lstCarros;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leandro
 */
public class CarroPrincipal extends javax.swing.JDialog {
    
    private void carregarTbCarros(List<Carro> lstCarros){
        try {
            DefaultTableModel modelo = (DefaultTableModel)tblCarro.getModel();
            modelo.getDataVector().removeAllElements();
            
            for (Carro carro : lstCarros) {
                Vector v = new Vector();
                v.add(carro.getModelo());
                v.add(carro.getMarca());
                v.add(carro.getPlaca());
                v.add(carro.getAno());
                v.add(carro.getValorDiariaLocacao());
                
                modelo.addRow(v);
            }
            tblCarro.repaint();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Não foi possível carregar a lista de carros.\n\n" + 
                            e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    /**
     * Creates new form FCadCarros
     */
    public CarroPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarro = new javax.swing.JTable();
        cadCarro = new javax.swing.JButton();
        altCarro = new javax.swing.JButton();
        buscaCarro = new javax.swing.JButton();
        buscaPlaca = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Placa", "Ano", "Diária"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblCarroFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarro);

        cadCarro.setText("Cadastrar");
        cadCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCarroActionPerformed(evt);
            }
        });

        altCarro.setText("Alterar");
        altCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altCarroActionPerformed(evt);
            }
        });

        buscaCarro.setText("Buscar");
        buscaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCarroActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buscaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(31, 31, 31)
                .addComponent(altCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadCarro)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCarro)
                    .addComponent(altCarro)
                    .addComponent(buscaCarro)
                    .addComponent(buscaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCarroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblCarroFocusGained
 
    }//GEN-LAST:event_tblCarroFocusGained

    private void cadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCarroActionPerformed
         JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
         FCadCarro c = new FCadCarro(frame,true);
         c.setLocationRelativeTo(null);
        // c.setVisible(true);
         
         Carro carro = c.execute();
         if(carro != null){
             CarrosDados.lstCarros.add(carro);
             this.carregarTbCarros(CarrosDados.lstCarros);
         }
    }//GEN-LAST:event_cadCarroActionPerformed

    private void altCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altCarroActionPerformed
        try {
            if(CarrosDados.lstCarros.size() > 0){
                String modelo = 
                        tblCarro.getValueAt(tblCarro.getSelectedRow(), 0).toString();
                Carro carro = CarrosDados.obterModelo(
                        modelo,
                        CarrosDados.lstCarros);
               
                if(carro != null){
                        if(JOptionPane.showConfirmDialog(this,
                            "Deseja alterar " + carro.getModelo()+ " ?",
                            "Cadastro",
                            JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                        
                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                        FCadCarro c = new FCadCarro(frame,true);
                        c.setLocationRelativeTo(null);
                        carro = c.execute(carro);
                        this.carregarTbCarros(CarrosDados.lstCarros);
                    }
                }
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, 
                    "Nenhum veículo selecionado.\n\n" + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_altCarroActionPerformed

    private void buscaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCarroActionPerformed
        if(buscaPlaca.getText().trim().equals("")){
            this.carregarTbCarros(CarrosDados.lstCarros);
        }else{
            List<Carro> carTemp = 
                    CarrosDados.obterPlacaParcial(
                            buscaPlaca.getText().trim(),
                            CarrosDados.lstCarros,
                            false);
            if(carTemp.size()>0){
                    this.carregarTbCarros(carTemp); 
            }else{
                JOptionPane.showMessageDialog(null,"Nenhum carro encontrado");
            }
        } 
    }//GEN-LAST:event_buscaCarroActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.carregarTbCarros(lstCarros);
    }//GEN-LAST:event_formWindowOpened

    /**
     *BOTÃO EXCLUIR
        try {
            if (CarrosDados.lstCarros.size() > 0) {
                String modelo = tblCarro.getValueAt(tblCarro.getSelectedRow(), 0).toString();
                Carro c = CarrosDados.obterModelo(modelo, CarrosDados.lstCarros);
                if (c != null) {
                    if (JOptionPane.showConfirmDialog(this, "Deseja Excluir o veículo placa " + c.getPlaca()
                            + "?", "Cadastro", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        CarrosDados.lstCarros.remove(c);
                        this.carregarTbCarros(CarrosDados.lstCarros);
                    }
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível excluir o veículo.\n \n"
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }    
     **/
    
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
            java.util.logging.Logger.getLogger(CarroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CarroPrincipal dialog = new CarroPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altCarro;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton buscaCarro;
    private javax.swing.JTextField buscaPlaca;
    private javax.swing.JButton cadCarro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCarro;
    // End of variables declaration//GEN-END:variables
}
