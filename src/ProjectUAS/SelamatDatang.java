package ProjectUAS;

import static ProjectUAS.LoginPage.Nama;
import static ProjectUAS.LoginPage.Alamat;
import static ProjectUAS.LoginPage.Email;
import static ProjectUAS.LoginPage.NoHp;

import java.util.ArrayList;

public class SelamatDatang extends javax.swing.JFrame {

    ArrayList<String> dataNama = new ArrayList<>();
    ArrayList<String> dataAlamat = new ArrayList<>();
    ArrayList<String> dataEmail = new ArrayList<>();
    ArrayList<String> dataNoHp = new ArrayList<>();

    public SelamatDatang(String User,String Nama, String Alamat, String Email, String NoHp) {
        initComponents();
        SelamatDatang.setText("Selamat Datang " + User);
        TampilNama.setText("Nama : "+ Nama);
        TampilAlamat.setText("Alamat : "+ Alamat);
        TampilEmail.setText("Email : "+ Email);
        TampilNoHp.setText("NoHp : "+ NoHp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelamatDatang = new javax.swing.JLabel();
        Keluar = new javax.swing.JToggleButton();
        TampilNama = new javax.swing.JLabel();
        TampilAlamat = new javax.swing.JLabel();
        TampilEmail = new javax.swing.JLabel();
        TampilNoHp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SelamatDatang.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        SelamatDatang.setText("Selamat Datang");

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        TampilNama.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        TampilAlamat.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        TampilEmail.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        TampilNoHp.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(SelamatDatang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TampilNama, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addComponent(TampilAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TampilEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TampilNoHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(SelamatDatang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TampilNama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TampilAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TampilEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TampilNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(Keluar)
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed

        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_KeluarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Keluar;
    private javax.swing.JLabel SelamatDatang;
    private javax.swing.JLabel TampilAlamat;
    private javax.swing.JLabel TampilEmail;
    private javax.swing.JLabel TampilNama;
    private javax.swing.JLabel TampilNoHp;
    // End of variables declaration//GEN-END:variables
}
