/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_spk_saw;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ferdy
 */
public class Form_Ubah_Bobot extends javax.swing.JFrame {

    double k1d = 0;
    double k2d = 0;
    double k3d = 0;
    double k4d = 0;
    double k5d = 0;
    public void getDataBobot() {
    try {
           java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
           java.sql.Statement stm = conn.createStatement();
           java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM tb_bobotkriteria");
           if (sql.next()) {
               double n1 = sql.getDouble("bobot1");
               double n2 = sql.getDouble("bobot2");
               double n3 = sql.getDouble("bobot3");
               double n4 = sql.getDouble("bobot4");
               double n5 = sql.getDouble("bobot5");

               String n1s = Double.toString(n1);
               String n2s = Double.toString(n2);
               String n3s = Double.toString(n3);
               String n4s = Double.toString(n4);
               String n5s = Double.toString(n5);
               nblama1Txt.setText(n1s);
               nblama2Txt.setText(n2s);
               nblama3Txt.setText(n3s);
               nblama4Txt.setText(n4s);
               nblama5Txt.setText(n5s);

           }           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke database. Pastikan Xampp sudah aktif!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
       }
    }

    /**
     * Creates new form Form_Ubah_Bobot
     */
    public Form_Ubah_Bobot() {
        initComponents();
        getDataBobot();
        nblama1Txt.setEditable(false);
        nblama2Txt.setEditable(false);
        nblama3Txt.setEditable(false);
        nblama4Txt.setEditable(false);
        nblama4Txt.setEditable(false);
        nblama5Txt.setEditable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nblama1Txt = new javax.swing.JTextField();
        nblama2Txt = new javax.swing.JTextField();
        nblama3Txt = new javax.swing.JTextField();
        nblama4Txt = new javax.swing.JTextField();
        nblama5Txt = new javax.swing.JTextField();
        simpanBtn = new javax.swing.JButton();
        batalBtn = new javax.swing.JButton();
        nbbaru1Txt = new javax.swing.JTextField();
        nbbaru2Txt = new javax.swing.JTextField();
        nbbaru3Txt = new javax.swing.JTextField();
        nbbaru4Txt = new javax.swing.JTextField();
        nbbaru5Txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Edit Bobot ");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/computer.png")).getImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubah Bobot"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nilai Pd");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nilai Sikap");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nilai Ekskul");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Absensi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Akademik");

        nblama1Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama2Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama3Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama4Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nblama5Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        simpanBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        simpanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        batalBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        batalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel.png"))); // NOI18N
        batalBtn.setText("Batal");
        batalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBtnActionPerformed(evt);
            }
        });

        nbbaru1Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nbbaru2Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nbbaru3Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nbbaru4Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nbbaru5Txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("-Kriteria-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("-Lama-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("-Baru-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simpanBtn)
                        .addGap(79, 79, 79)
                        .addComponent(batalBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addComponent(nblama5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(nblama1Txt)
                                    .addComponent(nblama2Txt)
                                    .addComponent(nblama3Txt)))
                            .addComponent(nblama4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(nbbaru5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbbaru1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbbaru2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbbaru3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbbaru4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nblama1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nblama2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nblama3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nblama4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nblama5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbbaru5Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanBtn)
                    .addComponent(batalBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        // TODO add your handling code here:
        if(nbbaru1Txt.getText().equals("") || nbbaru2Txt.getText().equals("") || nbbaru3Txt.getText().equals("") || 
                    nbbaru4Txt.getText().equals("") || nbbaru5Txt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Silakan isi dulu nilai bobot barunya","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
        }else{   
            try {
                k1d = Double.parseDouble(nbbaru1Txt.getText());
                k2d = Double.parseDouble(nbbaru2Txt.getText());
                k3d = Double.parseDouble(nbbaru3Txt.getText());
                k4d = Double.parseDouble(nbbaru4Txt.getText());
                k5d = Double.parseDouble(nbbaru5Txt.getText());
            
                if(k1d+k2d+k3d+k4d+k5d > 1){
                    JOptionPane.showMessageDialog(null, "Jumlah bobot melibihi 1 atau 100%","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                }else if(k1d+k2d+k3d+k4d+k5d < 1){
                    JOptionPane.showMessageDialog(null, "Jumlah bobot kurang dari 1 atau 100%","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                }else if(k1d+k2d+k3d+k4d+k5d == 1){
                    java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
                    String sqlz = "TRUNCATE TABLE tb_bobotkriteria";
                    java.sql.PreparedStatement pstz = conn.prepareStatement(sqlz);
                    pstz.execute();
                    String sql = "INSERT INTO tb_bobotkriteria VALUES('"+k1d+"','"+k2d+"','"+k3d+"','"+k4d+"','"+k5d+"')";
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Nilai bobot kriteria berhasil disimpan!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                } 
            } catch (SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "Nilai bobot kriteria gagal disimpan!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void batalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_batalBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Ubah_Bobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Ubah_Bobot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nbbaru1Txt;
    private javax.swing.JTextField nbbaru2Txt;
    private javax.swing.JTextField nbbaru3Txt;
    private javax.swing.JTextField nbbaru4Txt;
    private javax.swing.JTextField nbbaru5Txt;
    private javax.swing.JTextField nblama1Txt;
    private javax.swing.JTextField nblama2Txt;
    private javax.swing.JTextField nblama3Txt;
    private javax.swing.JTextField nblama4Txt;
    private javax.swing.JTextField nblama5Txt;
    private javax.swing.JButton simpanBtn;
    // End of variables declaration//GEN-END:variables
}
