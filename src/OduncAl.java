/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 
 * @author Oguzhan
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class OduncAl extends javax.swing.JFrame {
    Connection connection;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    /**
     * Creates new form Arama
     */
    public OduncAl() {
        super("Ödünç Al");
        initComponents();
        connection=DatabaseManager.getConnection();
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
        jLabel4 = new javax.swing.JLabel();
        txtKitapYazar = new javax.swing.JTextField();
        txtAraKitapNo = new javax.swing.JTextField();
        txtKitapSayfa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKitapYayinevi = new javax.swing.JTextField();
        btnAramaKitap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKitapAdi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCinsiyet = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAramaOgrenci = new javax.swing.JButton();
        txtOgrTc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAdSoyad = new javax.swing.JTextField();
        btnGeri = new javax.swing.JButton();
        btnOduncAl = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtOduncTrih = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)), "Kitap Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 153, 51))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Yayınevi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Yazarı");

        btnAramaKitap.setText("Ara");
        btnAramaKitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAramaKitapActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Kitap Adı");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Sayfa Sayısı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Kitap Numarası");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAraKitapNo)
                    .addComponent(txtKitapAdi)
                    .addComponent(txtKitapYazar)
                    .addComponent(txtKitapYayinevi)
                    .addComponent(txtKitapSayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAramaKitap)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAraKitapNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAramaKitap)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKitapYazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKitapYayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKitapSayfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)), "Öğrenci Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel6.setText("Ad Soyad");

        jLabel7.setText("ID");

        jLabel9.setText("Cinsiyet");

        jLabel8.setText("Tc Kimlik No");

        btnAramaOgrenci.setText("Ara");
        btnAramaOgrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAramaOgrenciActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefon No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelNo)
                    .addComponent(txtCinsiyet, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtOgrTc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAramaOgrenci)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOgrTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAramaOgrenci)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnGeri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGeri.setIcon(new javax.swing.ImageIcon("C:\\swingDemo\\KütüphaneOtomasyonu\\images\\back.png")); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        btnOduncAl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOduncAl.setIcon(new javax.swing.ImageIcon("C:\\swingDemo\\KütüphaneOtomasyonu\\images\\bookshelf.png")); // NOI18N
        btnOduncAl.setText("Ödünç Al");
        btnOduncAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOduncAlActionPerformed(evt);
            }
        });

        txtOduncTrih.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));
        txtOduncTrih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOduncTrihActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Ödünç Alma Tarihi(GG.AA.YYYY)");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOduncTrih, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtOduncTrih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOduncAl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOduncAl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(809, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        setVisible(false);
        AnaSayfa anaSayfa =new AnaSayfa();
        anaSayfa.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnAramaKitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAramaKitapActionPerformed
        String sql="select *from library.librarybooks where kitapNo=?";
        try{
        preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,txtAraKitapNo.getText());
        resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            String ekle1=resultSet.getString("kitapAdi");
            txtKitapAdi.setText(ekle1);
            String ekle2=resultSet.getString("yazar");
            txtKitapYazar.setText(ekle2);
            String ekle3=resultSet.getString("yayinevi");
            txtKitapYayinevi.setText(ekle3);
            String ekle4=resultSet.getString("sayfaSayisi");
            txtKitapSayfa.setText(ekle4);
           resultSet.close();
           preparedStatement.close();
        }
        else{
        JOptionPane.showMessageDialog(null, "Kitap Adı Bulunamadı");
        }
        }
        catch(Exception exception){
            JOptionPane.showMessageDialog(null, exception);
        }
        finally{
            try{
            resultSet.close();
            preparedStatement.close();
            }
            catch(Exception exception){
            JOptionPane.showMessageDialog(null,exception);
            }
                
        }
    }//GEN-LAST:event_btnAramaKitapActionPerformed

    private void btnAramaOgrenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAramaOgrenciActionPerformed
        String sql="select *from library.öğrencibilgileri where ogrTc=? ";
        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,txtOgrTc.getText());
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
            String ekle1=resultSet.getString("ogrAdSoyad");
            txtAdSoyad.setText(ekle1);
            String ekle2=resultSet.getString("ogrenciId");
            txtId.setText(ekle2);
            String ekle3=resultSet.getString("cinsiyet");
            txtCinsiyet.setText(ekle3);
            String ekle4=resultSet.getString("ogrTelNo");
            txtTelNo.setText(ekle4);
            resultSet.close();
            preparedStatement.close();          
            }
            else{
            JOptionPane.showMessageDialog(null,"Öğrenci Bulunamadı");
            }
        } catch (Exception exception) {
           JOptionPane.showMessageDialog(null,exception);
        }
        finally{
            try{
            resultSet.close();
            preparedStatement.close();
            }
            catch(Exception exception){
            JOptionPane.showMessageDialog(null,exception);
            }
                
        }
    }//GEN-LAST:event_btnAramaOgrenciActionPerformed

    private void btnOduncAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOduncAlActionPerformed
        String sql="insert into library.öduncal(kitapNo,kitapAdi,yazar,yayinevi,sayfaSayisi,ogrTc,ogrAdSoyad,ogrenciId,cinsiyet,ogrTelNo,oduncTarih) values(?,?,?,?,?,?,?,?,?,?,?) ";
        try{
           preparedStatement= connection.prepareStatement(sql);
           preparedStatement.setString(1,txtAraKitapNo.getText());
           preparedStatement.setString(2,txtKitapAdi.getText());
           preparedStatement.setString(3, txtKitapYazar.getText());
           preparedStatement.setString(4, txtKitapYayinevi.getText());
           preparedStatement.setString(5, txtKitapSayfa.getText());
           preparedStatement.setString(6, txtOgrTc.getText());
           preparedStatement.setString(7, txtAdSoyad.getText());
           preparedStatement.setString(8, txtId.getText());
           preparedStatement.setString(9, txtCinsiyet.getText());
           preparedStatement.setString(10,txtTelNo.getText());
           preparedStatement.setString(11,txtOduncTrih.getText());
           preparedStatement.execute();
           JOptionPane.showMessageDialog(null, "Ödünç Alındı");
         
        }
        catch(Exception exception){
        JOptionPane.showMessageDialog(null,"Seçili Kitap Başka Bir Öğrencidedir");    
        }
    }//GEN-LAST:event_btnOduncAlActionPerformed

    private void txtOduncTrihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOduncTrihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOduncTrihActionPerformed

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
            java.util.logging.Logger.getLogger(OduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OduncAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OduncAl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAramaKitap;
    private javax.swing.JButton btnAramaOgrenci;
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnOduncAl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtAraKitapNo;
    private javax.swing.JTextField txtCinsiyet;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKitapAdi;
    private javax.swing.JTextField txtKitapSayfa;
    private javax.swing.JTextField txtKitapYayinevi;
    private javax.swing.JTextField txtKitapYazar;
    private javax.swing.JTextField txtOduncTrih;
    private javax.swing.JTextField txtOgrTc;
    private javax.swing.JTextField txtTelNo;
    // End of variables declaration//GEN-END:variables
}
