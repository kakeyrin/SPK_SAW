/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_spk_saw;

/**
 *
 * @author Ferdy
 */
public class Form_Petunjuk extends javax.swing.JFrame {

    /**
     * Creates new form Form_Petunjuk
     */
    public Form_Petunjuk() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        petunjukTxt.setEditable(false);
        petunjukTxt.setText("Pilih dengan me-klik salah satu tombol dibawah.");
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
        petunjukTxt = new javax.swing.JTextArea();
        petunjuk1Btn = new javax.swing.JButton();
        petunjuk2Btn = new javax.swing.JButton();
        petunjuk3Btn = new javax.swing.JButton();
        petunjuk5Btn = new javax.swing.JButton();
        petunjuk4Btn = new javax.swing.JButton();
        petunjuk6Btn = new javax.swing.JButton();
        petunjuk7 = new javax.swing.JButton();
        petunjuk8 = new javax.swing.JButton();
        petunjuk9 = new javax.swing.JButton();
        petunjuk10 = new javax.swing.JButton();
        tentangBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Petunjuk");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/computer.png")).getImage());
        setResizable(false);

        petunjukTxt.setColumns(20);
        petunjukTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        petunjukTxt.setRows(5);
        jScrollPane1.setViewportView(petunjukTxt);

        petunjuk1Btn.setText("Penggunaan Aplikasi");
        petunjuk1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk1BtnActionPerformed(evt);
            }
        });

        petunjuk2Btn.setText("Edit Profil");
        petunjuk2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk2BtnActionPerformed(evt);
            }
        });

        petunjuk3Btn.setText("Data Siswa");
        petunjuk3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk3BtnActionPerformed(evt);
            }
        });

        petunjuk5Btn.setText("Data Kriteria Siswa");
        petunjuk5Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk5BtnActionPerformed(evt);
            }
        });

        petunjuk4Btn.setText("Data Nilai Siswa");
        petunjuk4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk4BtnActionPerformed(evt);
            }
        });

        petunjuk6Btn.setText("Laporan Ranking Siswa");
        petunjuk6Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk6BtnActionPerformed(evt);
            }
        });

        petunjuk7.setText("Data Nilai PD");
        petunjuk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk7ActionPerformed(evt);
            }
        });

        petunjuk8.setText("Data Nilai Sikap");
        petunjuk8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk8ActionPerformed(evt);
            }
        });

        petunjuk9.setText("Data Nilai Ekskul");
        petunjuk9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk9ActionPerformed(evt);
            }
        });

        petunjuk10.setText("Ubah Nilai Bobot");
        petunjuk10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjuk10ActionPerformed(evt);
            }
        });

        tentangBtn.setText("Tentang Aplikasi");
        tentangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentangBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(petunjuk1Btn)
                        .addGap(18, 18, 18)
                        .addComponent(petunjuk2Btn)
                        .addGap(18, 18, 18)
                        .addComponent(petunjuk3Btn)
                        .addGap(18, 18, 18)
                        .addComponent(petunjuk4Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(petunjuk7))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(petunjuk8)
                        .addGap(44, 44, 44)
                        .addComponent(petunjuk9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(petunjuk5Btn)
                        .addGap(18, 18, 18)
                        .addComponent(petunjuk6Btn)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(petunjuk10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tentangBtn)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petunjuk4Btn)
                    .addComponent(petunjuk1Btn)
                    .addComponent(petunjuk2Btn)
                    .addComponent(petunjuk3Btn)
                    .addComponent(petunjuk7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petunjuk5Btn)
                    .addComponent(petunjuk6Btn)
                    .addComponent(petunjuk8)
                    .addComponent(petunjuk9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tentangBtn)
                    .addComponent(petunjuk10))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void petunjuk3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk3BtnActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Data Siswa ~\n"
                + "\nUntuk menyimpan data siswa baru, isi semua kolom data, lalu klik tombol Simpan. NIS harus berupa angka.\n"
                + "\nUntuk mengubah data siswa, pilih salah satu data siswa dengan me-klik salah satu baris pada tabel data siswa,\n"
                + "lalu klik tombol Update jika ada data yang dirubah.\n"
                + "\nUntuk menghapus data siswa, pilih salah satu data siswa dengan me-klik salah satu baris pada tabel data siswa,\n"
                + "lalu klik tombol Hapus.");
    }//GEN-LAST:event_petunjuk3BtnActionPerformed

    private void petunjuk5BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk5BtnActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Data Kriteria Siswa ~\n"
                + "\nUntuk menyimpan data kriteria siswa baru, pertama tampilkan terlebih dahulu data siswa dengan memilih kelas, semester, dan tahun ajaran\n"
                + "sehingga dapat menampilkan data siswa pada Tabel Data Nilai Akademik lalu pilih siswa yang ingin dimasukan data nilai kriterianya.\n"
                + "Setelah itu pilih data nilai kriteria siswa disetiap tab yang tersedia kecuali tab Data Nilai Kriteria lalu silakan isi absensi,\n"
                + " lalu klik tombol Simpan. Ketika data berhasil disimpan, cek/lihat data tersebut pada tabel yang terdapat di tab Data Nilai Kriteria Siswa.\n"
                + "\nUntuk mengubah data nilai kriteria siswa, pilih salah satu data nilai kriteria siswa dengan me-klik salah satu baris pada tabel yang\n"
                + "terdapat di tab Data Nilai Kriteria Siswa, lalu klik tombol Update jika ada data yang dirubah.\n"
                + "\nUntuk menghapus data nilai kriteria siswa, pilih salah satu data nilai kriteria siswa dengan me-klik salah satu baris pada tabel yang\n"
                + "terdapat di tab Data Nilai Kriteria Siswa, lalu klik tombol Hapus.");
    }//GEN-LAST:event_petunjuk5BtnActionPerformed

    private void petunjuk2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk2BtnActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Edit Profil ~\n"
                + "\nUntuk mengubah info admin (anda), pastikan biodata yang anda ubah/input (terutama username) adalah benar.\n"
                + "\nUntuk mengubah password, pastikan password lama yang anda input sudah benar. Input password baru min. 6 karakter \n"
                + "dan konfirmasi kembali password baru yang sudah anda input.\n"
                + "\nLakukan login ulang untuk memperbarui profil admin/password yang sudah dirubah.");
    }//GEN-LAST:event_petunjuk2BtnActionPerformed

    private void petunjuk1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk1BtnActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Penggunaan Aplikasi ~\n"
                + "\nUntuk menggunakan aplikasi ini, silahkan login terlebih dahulu dengan memilih menu Opsi --> Login.\n"
                + "Pastikan username dan password yang anda input benar dan sudah terdaftar/ada dalam database.");
    }//GEN-LAST:event_petunjuk1BtnActionPerformed

    private void petunjuk4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk4BtnActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Data Nilai Siswa ~\n"
                + "\nUntuk menyimpan data nilai siswa , isi kolom NIS dan Nama Siswa dengan me-klik salah satu baris pada tabel yang terdapat\n"
                + "di tab Data Siswa. Setelah itu isi data nilai akademik siswa dan klik tombol proses untuk memperoleh nilai rata-rata, kemudian\n"
                + "pilih kelas, semester dan tahun ajaran, lalu klik tombol Simpan. Ketika data berhasil disimpan, cek/lihat data tersebut pada\n"
                + "tabel yang terdapat di tab Data Nilai Akademik Siswa.\n"
                + "\nUntuk mengubah data nilai akademik siswa, pilih salah satu data nilai akademik siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai Akademik Siswa, lalu klik tombol Update jika ada data yang dirubah.\n"
                + "\nUntuk menghapus data nilai akademik siswa, pilih salah satu data nilai akademik siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai Akademik Siswa, lalu klik tombol Hapus.");
    }//GEN-LAST:event_petunjuk4BtnActionPerformed

    private void petunjuk6BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk6BtnActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Laporan Ranking Siswa ~\n"
                + "\nUntuk memperoleh nilai ranking siswa, pertama tampilkan terlebih dahulu nilai kriteria siswa dengan memilih kelas, semester, dan tahun ajaran.\n"
                + "Jika data tersebut ada/sudah tampil, klik tombol normalisasi, sehingga nilai kritaria pada siswa dinormalisasikan atau disederhanakan kemudian \n"
                + "silakan tekan tombol cari pringkat untuk mendapatkan Ranking tetapi masih blom ada urutan rankingnya masih bedasarkan nilai Ranking terbesar.\n"
                + "\nJika ingin mencetaknya, klik tombol Cetak dan akan tampil form Jasper Report (hasil dari cetak tersebut). Jika ingin disimpan klik tombol save\n"
                + "(icon disket) lalu pilih format/extension filenya. Jika ingin langsung di-print, klik tombol print (icon print).\n"
                + "\nJika anda ingin mengubah nilai bobot/nilai kriteria minimal (dalam mata pelajaran disebut KKM), klik tombol Edit Bobot.\n"
                + "\nAnda juga dapat melihat tabel rincian hitungnya, dengan me-klik tombol rincian hitung. Metode perhitungan yang digunakan untuk menentukan\n"
                + "nilai prestasi siswa adalah metode SAW (Simple Additive Weighting) dengan melakukan 2 tahap perhitungan, yaitu tahap Normalisasi Matriks dan\n"
                + "tahap Perankingan.");
    }//GEN-LAST:event_petunjuk6BtnActionPerformed

    private void tentangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentangBtnActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Aplikasi SPK (Sistem Pendukung Keputusan) Pemilihan Ranking Siswa ~\n"
                + "\nDirancang oleh: Ferdy Muhammad Iqbal\n"
                + "\nAplikasi ini dibuat bertujuan untuk mempermudah user dalam menginput nilai\n"
                + "akademik siswa, nilai kriteria siswa, serta dalam menentukan nilai prestasi siswa berdasarkan\n"
                + "metode hitung yang telah ditentukan dalam aplikasi ini.\n"
                + "\nDinas Pendidikan Kota Tangerang\n"
                + "MTsN 2 Kota Tangerang");
    }//GEN-LAST:event_tentangBtnActionPerformed

    private void petunjuk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk7ActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Data Nilai PD Siswa ~\n"
                +"\nUntuk memperoleh data siswa, pertama tampilkan terlebih dahulu data siswa dengan memilih kelas, semester, dan tahun ajaran pada tab Data Siswa.\n"
                + "Jika data tersebut ada/sudah tampil silakan mengklik salah satu data siswa, setelah itu isi data nilai pd siswa dan klik tombol proses untuk memperoleh nilai rata-rata.\n"
                + "Ketika data berhasil disimpan, cek/lihat data tersebut pada tabel yang terdapat di tab Data Nilai PD.\n"
                + "\nUntuk mengubah data nilai pd siswa, pilih salah satu data nilai pd siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai PD Siswa, lalu klik tombol Update jika ada data yang dirubah.\n"
                + "\nUntuk menghapus data nilai pd siswa, pilih salah satu data nilai pd siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai PD Siswa, lalu klik tombol Hapus."
        );
    }//GEN-LAST:event_petunjuk7ActionPerformed

    private void petunjuk8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk8ActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Data Nilai Sikap Siswa ~\n"
                +"\nUntuk memperoleh data siswa, pertama tampilkan terlebih dahulu data siswa dengan memilih kelas, semester, dan tahun ajaran pada tab Data Siswa.\n"
                + "Jika data tersebut ada/sudah tampil silakan mengklik salah satu data siswa, setelah itu isi data nilai sikap siswa dan klik tombol proses untuk memperoleh nilai rata-rata.\n"
                + "Ketika data berhasil disimpan, cek/lihat data tersebut pada tabel yang terdapat di tab Data Nilai Sikap.\n"
                + "\nUntuk mengubah data nilai sikap siswa, pilih salah satu data nilai sikap siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai Sikap Siswa, lalu klik tombol Update jika ada data yang dirubah.\n"
                + "\nUntuk menghapus data nilai sikap siswa, pilih salah satu data nilai sikap siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai Sikap Siswa, lalu klik tombol Hapus."
        );
    }//GEN-LAST:event_petunjuk8ActionPerformed

    private void petunjuk9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk9ActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Data Nilai ekskul Siswa ~\n"
                +"\nUntuk memperoleh data siswa, pertama tampilkan terlebih dahulu data siswa dengan memilih kelas, semester, dan tahun ajaran pada tab Data Siswa.\n"
                + "Jika data tersebut ada/sudah tampil silakan mengklik salah satu data siswa, setelah itu isi data nilai ekskul siswa dan klik tombol proses untuk memperoleh nilai rata-rata,\n"
                + "Ketika data berhasil disimpan, cek/lihat data tersebut pada tabel yang terdapat di tab Data Nilai Ekskul.\n"
                + "\nUntuk mengubah data nilai ekskul siswa, pilih salah satu data nilai ekskul siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai Ekskul Siswa, lalu klik tombol Update jika ada data yang dirubah.\n"
                + "\nUntuk menghapus data nilai Ekskul siswa, pilih salah satu data nilai ekskul siswa dengan me-klik salah satu baris pada tabel\n"
                + "yang terdapat di tab Data Nilai Ekskul Siswa, lalu klik tombol Hapus."
        );
    }//GEN-LAST:event_petunjuk9ActionPerformed

    private void petunjuk10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjuk10ActionPerformed
        // TODO add your handling code here:
        petunjukTxt.setText("~ Ubah Bobot Kriteria ~\n"
                +"\nSilakan masukan nilai bobot baru yang sudah disetujui oleh semua pihak disekolah\n"
                +"Nilai botot berbentuk desimal yang maksimal jumlah keseluruhan nilai bobot yaitu 1\n"
                +"Atau bisa disebut jg 100%\n"
        );
    }//GEN-LAST:event_petunjuk10ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Petunjuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton petunjuk10;
    private javax.swing.JButton petunjuk1Btn;
    private javax.swing.JButton petunjuk2Btn;
    private javax.swing.JButton petunjuk3Btn;
    private javax.swing.JButton petunjuk4Btn;
    private javax.swing.JButton petunjuk5Btn;
    private javax.swing.JButton petunjuk6Btn;
    private javax.swing.JButton petunjuk7;
    private javax.swing.JButton petunjuk8;
    private javax.swing.JButton petunjuk9;
    private javax.swing.JTextArea petunjukTxt;
    private javax.swing.JButton tentangBtn;
    // End of variables declaration//GEN-END:variables
}
