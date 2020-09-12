/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_spk_saw;

import javax.swing.*;
//import net.proteanit.sql.DbUtils;
import java.awt.event.*;


/**
 *
 * @author Ferdy
 */
public class Tampilan_Utama extends javax.swing.JFrame {
    private Form_Login formlogin = new Form_Login();
    private Form_Edit_InfoAdmin forminfoadmin = new Form_Edit_InfoAdmin();
    private Form_Edit_Password formpassword = new Form_Edit_Password();
    private Form_Data_Siswa formdatasiswa = new Form_Data_Siswa();
    private Form_Nilai_Siswa formnilaisiswa = new Form_Nilai_Siswa();
    private Form_Nilai_PD formnilaipd = new Form_Nilai_PD();
    private Form_Nilai_Sikap formnilaisikap = new Form_Nilai_Sikap();
    private Form_Nilai_Ekskul formnilaiekskul = new Form_Nilai_Ekskul();
    private Form_Kriteria formkriteria = new Form_Kriteria();
    private Form_Proses_Kriteria formproseskriteria = new Form_Proses_Kriteria();
    private Form_Petunjuk formpetunjuk = new Form_Petunjuk();
    private WindowAdapter windowAdapter = null;
    int kd_admin;
    
    private void initFrame(){
        this.windowAdapter = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                super.windowClosing(e);
                if (logoutBtn.isVisible()){
                    JOptionPane.showMessageDialog(null, "Klik tombol Logout terlebih dahulu!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(0);
                }
            }
            public void windowClosed (WindowEvent e){
                super.windowClosed(e);
            }
        };
        this.setDefaultCloseOperation(0);
        this.addWindowListener(this.windowAdapter);
    }

    /**
     * Creates new form Tampilan_Utama
     */
    public Tampilan_Utama() {
        initComponents();
        initFrame();
        this.setLocationRelativeTo(null);
        editadmin.setEnabled(false);
        login.setEnabled(true);
        datasiswa.setEnabled(false);
        datakriteria.setEnabled(false);
        laporansiswa.setEnabled(false);
        datanilaisiswa.setEnabled(false);
        adLbl.setVisible(false);
        adminLbl.setVisible(false);
        adminLbl.setText("");
        logoutBtn.setVisible(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        adminLbl = new javax.swing.JLabel();
        adLbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opsi = new javax.swing.JMenu();
        login = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        editadmin = new javax.swing.JMenu();
        infoadmin = new javax.swing.JMenuItem();
        gantipass = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenuItem();
        masterdata = new javax.swing.JMenu();
        datasiswa = new javax.swing.JMenuItem();
        datanilaisiswa = new javax.swing.JMenuItem();
        datanilaipd = new javax.swing.JMenuItem();
        datanilaisikap = new javax.swing.JMenuItem();
        datanilaiekskul = new javax.swing.JMenuItem();
        datakriteria = new javax.swing.JMenuItem();
        laporan = new javax.swing.JMenu();
        laporansiswa = new javax.swing.JMenuItem();
        bantuan = new javax.swing.JMenu();
        petunjuk = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi SPK Pemilihan Ranking Siswa");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/computer.png")).getImage());
        setMinimumSize(new java.awt.Dimension(554, 466));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 153), 10));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 422));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 721));
        jLabel1.setName(""); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 130, 180, 190);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("\"Menjadikan Insan yang Bertaqwa dan Berilmu\"");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 60, 322, 21);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("MTsN 2 KOTA TANGERANG ");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 90, 407, 36);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Jl. KH. Hasyim Ashari No. 25 Pinang, Kota Tangerang");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 320, 370, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Banten - Indonesia 15145");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 350, 170, 20);

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn);
        logoutBtn.setBounds(430, 20, 100, 25);

        adminLbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(adminLbl);
        adminLbl.setBounds(40, 20, 300, 23);

        adLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        adLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User2.png"))); // NOI18N
        jPanel1.add(adLbl);
        adLbl.setBounds(20, 20, 20, 20);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);

        opsi.setText("Admin");

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login2.png"))); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        opsi.add(login);
        opsi.add(jSeparator1);

        editadmin.setText("Edit Profil");

        infoadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User2.png"))); // NOI18N
        infoadmin.setText("Info Admin");
        infoadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoadminActionPerformed(evt);
            }
        });
        editadmin.add(infoadmin);

        gantipass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Key.png"))); // NOI18N
        gantipass.setText("Password");
        gantipass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gantipassActionPerformed(evt);
            }
        });
        editadmin.add(gantipass);

        opsi.add(editadmin);

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        opsi.add(keluar);

        jMenuBar1.add(opsi);

        masterdata.setText("Master Data");

        datasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Data.png"))); // NOI18N
        datasiswa.setText("Data Siswa");
        datasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasiswaActionPerformed(evt);
            }
        });
        masterdata.add(datasiswa);

        datanilaisiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Data.png"))); // NOI18N
        datanilaisiswa.setText("Data Nilai Siswa");
        datanilaisiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datanilaisiswaActionPerformed(evt);
            }
        });
        masterdata.add(datanilaisiswa);

        datanilaipd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Data.png"))); // NOI18N
        datanilaipd.setText("Data Nilai PD");
        datanilaipd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datanilaipdActionPerformed(evt);
            }
        });
        masterdata.add(datanilaipd);

        datanilaisikap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Data.png"))); // NOI18N
        datanilaisikap.setText("Data Nilai Sikap");
        datanilaisikap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datanilaisikapActionPerformed(evt);
            }
        });
        masterdata.add(datanilaisikap);

        datanilaiekskul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Data.png"))); // NOI18N
        datanilaiekskul.setText("Data Nilai Ekskul");
        datanilaiekskul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datanilaiekskulActionPerformed(evt);
            }
        });
        masterdata.add(datanilaiekskul);

        datakriteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Data.png"))); // NOI18N
        datakriteria.setText("Data Kriteria");
        datakriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakriteriaActionPerformed(evt);
            }
        });
        masterdata.add(datakriteria);

        jMenuBar1.add(masterdata);

        laporan.setText("Laporan");

        laporansiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Report.png"))); // NOI18N
        laporansiswa.setText("Laporan Ranking Siswa");
        laporansiswa.setToolTipText("");
        laporansiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporansiswaActionPerformed(evt);
            }
        });
        laporan.add(laporansiswa);

        jMenuBar1.add(laporan);

        bantuan.setText("Bantuan");

        petunjuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Help.png"))); // NOI18N
        petunjuk.setText("Petunjuk");
        petunjuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjukActionPerformed(evt);
            }
        });
        bantuan.add(petunjuk);

        jMenuBar1.add(bantuan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        formlogin.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        editadmin.setEnabled(false);
        login.setEnabled(true);
        datasiswa.setEnabled(false);
        datanilaipd.setEnabled(false);
        datanilaisikap.setEnabled(false);
        datanilaiekskul.setEnabled(false);
        datakriteria.setEnabled(false);
        laporansiswa.setEnabled(false);
        datanilaisiswa.setEnabled(false);
        adLbl.setVisible(false);
        adminLbl.setVisible(false);
        adminLbl.setText("");
        logoutBtn.setVisible(false);
        forminfoadmin.dispose();
        formpassword.dispose();
        formdatasiswa.dispose();
        formnilaisiswa.dispose();
        formnilaipd.dispose();
        formnilaisikap.dispose();
        formnilaiekskul.dispose();
        formkriteria.dispose();
        formproseskriteria.dispose();
        formpetunjuk.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        if (logoutBtn.isVisible()){
            JOptionPane.showMessageDialog(null, "Klik tombol Logout terlebih dahulu!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_keluarActionPerformed

    private void infoadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoadminActionPerformed
        // TODO add your handling code here:
        String nik, namaad, username, email, status;
        try {
            java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM tb_admin where kd_admin='"+kd_admin+"'");
            if(sql.next()){
               kd_admin = sql.getInt("kd_admin");
               nik = sql.getString("nip");
               namaad = sql.getString("nama");
               username = sql.getString("username");
               email = sql.getString("email");
               status = sql.getString("status");
               forminfoadmin.kd_admin = kd_admin;
               forminfoadmin.nikTxt.setText(nik);
               forminfoadmin.userTxt.setText(username);
               forminfoadmin.emailTxt.setText(email);
               forminfoadmin.statusTxt.setText(status);
               forminfoadmin.namaTxt.setText(namaad);
               forminfoadmin.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Tidak dapat menampilkan data admin!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke database. Pastikan Xampp sudah aktif!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_infoadminActionPerformed

    private void gantipassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gantipassActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection conn = (java.sql.Connection)Koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM tb_admin where kd_admin='"+kd_admin+"'");
            if(sql.next()){
               kd_admin = sql.getInt("kd_admin");
               formpassword.kd_admin = kd_admin;
               formpassword.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Tidak dapat menampilkan data admin!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak dapat terhubung ke database. Pastikan Xampp sudah aktif!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_gantipassActionPerformed

    private void datasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasiswaActionPerformed
        // TODO add your handling code here:
        formdatasiswa.setVisible(true);
    }//GEN-LAST:event_datasiswaActionPerformed

    private void datanilaisiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datanilaisiswaActionPerformed
        // TODO add your handling code here:
        formnilaisiswa.setVisible(true);
    }//GEN-LAST:event_datanilaisiswaActionPerformed

    private void datakriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakriteriaActionPerformed
        // TODO add your handling code here:
        formkriteria.setVisible(true);
    }//GEN-LAST:event_datakriteriaActionPerformed

    private void laporansiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporansiswaActionPerformed
        // TODO add your handling code here:
        formproseskriteria.setVisible(true);
    }//GEN-LAST:event_laporansiswaActionPerformed

    private void petunjukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjukActionPerformed
        // TODO add your handling code here:
        formpetunjuk.setVisible(true);
    }//GEN-LAST:event_petunjukActionPerformed

    private void datanilaiekskulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datanilaiekskulActionPerformed
        // TODO add your handling code here:
        formnilaiekskul.setVisible(true);
    }//GEN-LAST:event_datanilaiekskulActionPerformed

    private void datanilaipdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datanilaipdActionPerformed
        // TODO add your handling code here:
        formnilaipd.setVisible(true);
    }//GEN-LAST:event_datanilaipdActionPerformed

    private void datanilaisikapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datanilaisikapActionPerformed
        // TODO add your handling code here:
        formnilaisikap.setVisible(true);
    }//GEN-LAST:event_datanilaisikapActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel adLbl;
    public javax.swing.JLabel adminLbl;
    private javax.swing.JMenu bantuan;
    public javax.swing.JMenuItem datakriteria;
    private javax.swing.JMenuItem datanilaiekskul;
    private javax.swing.JMenuItem datanilaipd;
    private javax.swing.JMenuItem datanilaisikap;
    public javax.swing.JMenuItem datanilaisiswa;
    public javax.swing.JMenuItem datasiswa;
    public javax.swing.JMenu editadmin;
    private javax.swing.JMenuItem gantipass;
    private javax.swing.JMenuItem infoadmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem keluar;
    private javax.swing.JMenu laporan;
    public javax.swing.JMenuItem laporansiswa;
    public javax.swing.JMenuItem login;
    public javax.swing.JButton logoutBtn;
    private javax.swing.JMenu masterdata;
    public javax.swing.JMenu opsi;
    private javax.swing.JMenuItem petunjuk;
    // End of variables declaration//GEN-END:variables
}
