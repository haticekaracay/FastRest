import Connection.DatabaseConnection;
import Gözlemci.Stok;
import Gözlemci.görevli;
import entity.icecekler;
import entity.menuler;
import entity.personel;
import entity.pizzalar;
import entity.salatalar;
import entity.stok;
import entity.urun;
import entity.sandvicler;
import entity.tatlilar;
import entity.yanurunler;
import entity.soslar;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author haticeozbakir
 */
public class yöneticiEkrani extends javax.swing.JFrame {
    public void Listele(String table){
  
   
   try{
       String sorgu="select *from "+table+"";
        Connection con=DatabaseConnection.connectDatabase();
        
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery(sorgu);
       jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
   }catch(Exception ex){

}
}
     public void pizzaEkleme (){
          try{
           urun u=new urun();
           pizzalar p=new pizzalar();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           int id1 = Integer.parseInt(id.getText());
           p.setPizzaid(id1);
           p.setPizzaicerik(urunicerik.getText());
          if("Pizzalar".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into pizzalar(pizzaid,pizzaicerik,urunid)values ('"+p.getPizzaid()+"','"+p.getPizzaicerik()+"','"+u.getUrunid()+
                  "')");
           System.out.println("pizza eklendi.");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }
    public void menuEkleme(){
          try{
           urun u=new urun();
           menuler m=new menuler();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           m.setMenuicerik(urunicerik.getText());
           int id1 = Integer.parseInt(id.getText());
           m.setMenuid(id1);
          if("Menuler".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into menuler(menuid,menuicerik,urunid)values ('"+m.getMenuid()+"','"+m.getMenuicerik()+"','"+u.getUrunid()+
                  "')");
           System.out.println("hazir menuler eklendi");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }
     public void salataEkleme(){
          try{
           urun u=new urun();
           salatalar s=new salatalar();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           s.setSalataicerik(urunicerik.getText());
           int id1 = Integer.parseInt(id.getText());
           s.setSalataid(id1);
          if("Salatalar".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into salatalar(salataid,salataicerik,urunid)values ('"+s.getSalataid()+"','"+s.getSalataicerik()+"','"+u.getUrunid()+
                  "')");
           System.out.println("salatalar eklendi.");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }
      public void sandvicEkleme(){
          try{
           urun u=new urun();
           sandvicler snd=new sandvicler();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           int id1 = Integer.parseInt(id.getText());
           snd.setSandvicid(id1);
           snd.setSandvicicerik(urunicerik.getText());
          if("Sandvicler".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into sandvicler(sandvicid,sandvicicerik,urunid)values ('"+snd.getSandvicid()+"','"+snd.getSandvicicerik()+"','"+u.getUrunid()+
                  "')");
           System.out.println("sandvic eklendi.");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }
            
      public void sosEkleme(){
          try{
           urun u=new urun();
           soslar sos=new soslar();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           int id1 = Integer.parseInt(id.getText());
           sos.setSosid(id1);
          if("Soslar".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into soslar(sosid,urunid)values ('"+sos.getSosid()+"','"+u.getUrunid()+
                  "')");
           System.out.println("sos eklendi.");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }
       public void tatliEkleme(){
          try{
           urun u=new urun();
           tatlilar tat=new tatlilar();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           int id1 = Integer.parseInt(id.getText());
           tat.setTatliid(id1);
          if("Tatlilar".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into tatlilar(tatliid,urunid)values ('"+tat.getTatliid()+"','"+u.getUrunid()+
                  "')");
           System.out.println("tatli eklendi.");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }
       public void yanurunEkleme(){
          try{
           urun u=new urun();
           yanurunler yan=new yanurunler();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           int id1 = Integer.parseInt(id.getText());
           yan.setYanid(id1);
          if("yanUrunler".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into yanurunler(yanid,urunid)values ('"+yan.getYanid()+"','"+u.getUrunid()+
                  "')");
           System.out.println("yan urun eklendi");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }
       public void icecekEkleme(){
          try{
           urun u=new urun();
           icecekler i=new icecekler();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           int id1 = Integer.parseInt(id.getText());
           i.setIcecekid(id1);
          if("icecekler".equals(jComboBox1.getSelectedItem().toString())){
              st.executeUpdate("insert into urun(urunid,urunad,urunfiyat,stokid)values ('"+u.getUrunid()+"','"+u.getUrunad()+"','"+
                   u.getUrunfiyat()+"','"+u.getStokid()+"')");
               st.executeUpdate("insert into icecekler(icecekid,urunid)values ('"+i.getIcecekid()+"','"+u.getUrunid()+
                  "')");
           System.out.println("icecek eklendi");

           }
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }

   
    /**
     * Creates new form yöneticiEkrani
     */
    public yöneticiEkrani() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        
         
        
    }
     public Yönetici parent1;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        perid = new javax.swing.JTextField();
        perad = new javax.swing.JTextField();
        persoyad = new javax.swing.JTextField();
        peradres = new javax.swing.JTextField();
        pertelefon = new javax.swing.JTextField();
        gorevyer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stokadi = new javax.swing.JTextField();
        stokid = new javax.swing.JTextField();
        birim = new javax.swing.JTextField();
        birimfiyat = new javax.swing.JTextField();
        miktar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        urunid = new javax.swing.JTextField();
        urunad = new javax.swing.JTextField();
        urunfiyat = new javax.swing.JTextField();
        stokid1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        urunicerik = new javax.swing.JTextPane();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("STOK İŞLEMLERİ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("RAPOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("PERSONEL İŞLEMLERİ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("ÜRÜN EKLE/SİL/GÜNCELLE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Personel Ekle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Personel Sil");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Per.Bilgilerini Güncelle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("PERSONEL");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setText("Personel No:");

        jLabel2.setText("Ad:");

        jLabel3.setText("Soyad:");

        jLabel4.setText("Adres:");

        jLabel5.setText("Telefon:");

        jLabel6.setText("Görev:");

        perid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peridActionPerformed(evt);
            }
        });

        persoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persoyadActionPerformed(evt);
            }
        });

        gorevyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorevyerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(perid, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(perad)
                    .addComponent(persoyad)
                    .addComponent(peradres)
                    .addComponent(pertelefon)
                    .addComponent(gorevyer)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(persoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peradres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gorevyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pertelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        jButton9.setText("Stoğa Ürün Ekle");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Stoktan Ürün Sil");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Bilgileri Güncelle");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Stok Bilgisi");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel7.setText("Stok No:");

        jLabel8.setText("S.Adı");

        jLabel9.setText("Birim(kg,adet):");

        jLabel10.setText("Birim Fiyat:");

        jLabel11.setText("Miktar:");

        stokadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokadiActionPerformed(evt);
            }
        });

        stokid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokidActionPerformed(evt);
            }
        });

        miktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miktarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stokid, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(stokadi)
                    .addComponent(birim)
                    .addComponent(birimfiyat)
                    .addComponent(miktar))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(stokid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stokadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(birim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(birimfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(miktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setText("Not:Eklenecek ürünün (pizza-menü-sandvic ise)içeriğini yazınız.");

        urunad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunadActionPerformed(evt);
            }
        });

        urunfiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunfiyatActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(urunicerik);

        jButton18.setText("Ekle");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Güncelle");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Sil");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Listele");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menuler", "Pizzalar", "icecekler", "Salatalar", "Soslar", "yanUrunler", "Tatlilar", "Urun" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel13.setText("ÜRÜN NO:");

        jLabel14.setText("AD:");

        jLabel15.setText("FİYATI:");

        jLabel16.setText("ID:");

        jLabel17.setText("STOK NUMARASI:");

        jLabel18.setText("ÜRÜN İÇERİĞİ:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(urunfiyat, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(urunid)
                    .addComponent(urunad)
                    .addComponent(id))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stokid1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18)
                    .addComponent(jButton21))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(urunid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stokid1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(urunad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(urunfiyat, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton19)
                                    .addComponent(jButton21)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18)
                            .addComponent(jButton20)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jButton23.setText("ÇIKIŞ");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton23)
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jPanel1.setVisible(false);//stok işlemi
      jPanel3.setVisible(false);
      jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         rapor gün=new rapor();//rapora geçiş
         gün.setVisible(true);
         gün.parent3=this;
         dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jPanel1.setVisible(false); //ürün işlemi
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //personel ekleme
         try{
           personel p=new personel();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int per = Integer.parseInt(perid.getText());
           p.setPerid(per);
           p.setPerad(perad.getText());
           p.setPersoyad(persoyad.getText());
           p.setPeradres(peradres.getText());
           p.setPertelefon(pertelefon.getText());
           p.setGorevyer(gorevyer.getText());
           
           st.executeUpdate("insert into personel(perid,perad,persoyad,peradres,pertelefon,gorevyer)values ('"+p.getPerid()+"','"+p.getPerad()+"','"+
                   p.getPersoyad()+"','"+p.getPeradres()+"','"+p.getPertelefon()+"','"+p.getGorevyer()+"')");
           System.out.println("personel eklendi.");
           
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // personel silme
         try{
             personel p=new personel();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
            int per = Integer.parseInt(perid.getText());
            p.setPerid(per);
           
           
           st.executeUpdate("delete from personel where perid='"+p.getPerid()+"'");
           System.out.println("personel silindi.");
           
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       //personel bilgileri güncelleme
        try{
             personel p=new personel();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int per = Integer.parseInt(perid.getText());
           p.setPerid(per);
           p.setPerad(perad.getText());
           p.setPersoyad(persoyad.getText());
           p.setPeradres(peradres.getText());
           p.setPertelefon(pertelefon.getText());
           p.setGorevyer(gorevyer.getText());
           
           st.executeUpdate("update personel set perad='"+p.getPerad()+"',persoyad='"+ p.getPersoyad()+"',peradres='"+p.getPeradres()+
                   "',pertelefon='"+p.getPertelefon()+"',gorevyer='"+p.getGorevyer()+"'where perid='"+p.getPerid()+"'");
           System.out.println("personel bilgisi güncellendi.");
           
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void peridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peridActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jPanel2.setVisible(false); //personel işlemi
       jPanel3.setVisible(false);
       jPanel1.setVisible(true);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void persoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persoyadActionPerformed

    private void gorevyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorevyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gorevyerActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String table="Personel"; //personel listele
        Listele(table);       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       //stok ürün ekleme
        try{
             stok s=new stok();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int stk = Integer.parseInt(stokid.getText());
           s.setStokid(stk);
           s.setStokadi(stokadi.getText());
           s.setBirim(birim.getText());
           s.setBirimfiyat(birimfiyat.getText());
           int mik = Integer.parseInt(miktar.getText());
           s.setMiktar(mik);
           st.executeUpdate("insert into stok(stokid,stokadi,birim,birimfiyat,miktar)values ('"+s.getStokid()+"','"+s.getStokadi()+"','"+
                   s.getBirim()+"','"+s.getBirimfiyat()+"','"+s.getMiktar()+"')");
           System.out.println("stoğa ekleme yapıldı");
          
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Listele("Stok");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void stokidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokidActionPerformed

    private void stokadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokadiActionPerformed

    private void miktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miktarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miktarActionPerformed

    private void urunadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urunadActionPerformed

    private void urunfiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunfiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urunfiyatActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       //stok ürün sil
        try{
             stok s=new stok();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int stk = Integer.parseInt(stokid.getText());
           s.setStokid(stk);
           
           
           st.executeUpdate("delete from stok where stokid='"+s.getStokid()+"'");
           System.out.println("stoktan ürün silindi.");
           
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //stok bilgileri güncelle
        try{
            
             stok s=new stok();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int stk = Integer.parseInt(stokid.getText());
           s.setStokid(stk);
           s.setStokadi(stokadi.getText());
           s.setBirim(birim.getText());
           s.setBirimfiyat(birimfiyat.getText());
           int mik = Integer.parseInt(miktar.getText());
           s.setStokid(mik);
           
           st.executeUpdate("update stok set stokadi='"+s.getStokadi()+"',birim='"+ s.getBirim()+"',birimfiyat='"+s.getBirimfiyat()+
                   "',miktar='"+s.getMiktar()+"'where stokid='"+s.getStokid()+"'");
           System.out.println("stok içeriği güncellendi.");
     
           
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        //ÜRÜN SİL
        try{
           urun u=new urun();
           pizzalar p=new pizzalar();
           icecekler i=new icecekler();
           menuler m=new menuler();
           salatalar slt=new salatalar();
           sandvicler snd=new sandvicler();
           soslar sos=new soslar();
           yanurunler yn=new yanurunler();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           
           
           st.executeUpdate("delete from urun where urunid='"+u.getUrunid()+"'");
           //st.executeUpdate("delete from pizza where urunid='"+u.getUrunid()+"'");
           System.out.println("silme işlemleri gerçekleştirildi.");
           
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
      pizzaEkleme();
      menuEkleme();
      salataEkleme();
      sandvicEkleme();
      sosEkleme();
      tatliEkleme();
      yanurunEkleme();
      icecekEkleme();
        
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
 
           
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
          //ürün güncelle
          try{
           urun u=new urun();
           pizzalar p=new pizzalar();
           icecekler i=new icecekler();
           menuler m=new menuler();
           salatalar slt=new salatalar();
           sandvicler snd=new sandvicler();
           soslar sos=new soslar();
           yanurunler yn=new yanurunler();
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           int ur = Integer.parseInt(urunid.getText());
           u.setUrunid(ur);
           u.setUrunad(urunad.getText());
           u.setUrunfiyat(urunfiyat.getText());
           int stk = Integer.parseInt(stokid1.getText());
           u.setStokid(stk);
           p.setPizzaicerik(urunicerik.getText());
           String tablo=jComboBox1.getSelectedItem().toString();
          st.executeUpdate("update urun set urunad='"+u.getUrunad()+"',urunfiyat='"+ u.getUrunfiyat()+"'where urunid='"+u.getUrunid()+"'");
          

           System.out.println("Güncellendi.");

       
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // ÜRÜN LİSTELE
        String tAdi=jComboBox1.getSelectedItem().toString();
        Listele(tAdi);
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton23ActionPerformed

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
            java.util.logging.Logger.getLogger(yöneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yöneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yöneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yöneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new yöneticiEkrani().setVisible(true);
              
            }
        });
    }
   public void tabloDoldur(){
     try{
           Connection con=DatabaseConnection.connectDatabase();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from personel");
          String tablo=jComboBox1.getSelectedItem().toString();
          
           
           
           
       }catch(SQLException ex){
         System.out.println(ex.getMessage());
       }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birim;
    private javax.swing.JTextField birimfiyat;
    private javax.swing.JTextField gorevyer;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField miktar;
    private javax.swing.JTextField perad;
    private javax.swing.JTextField peradres;
    private javax.swing.JTextField perid;
    private javax.swing.JTextField persoyad;
    private javax.swing.JTextField pertelefon;
    private javax.swing.JTextField stokadi;
    private javax.swing.JTextField stokid;
    private javax.swing.JTextField stokid1;
    private javax.swing.JTextField urunad;
    private javax.swing.JTextField urunfiyat;
    private javax.swing.JTextPane urunicerik;
    private javax.swing.JTextField urunid;
    // End of variables declaration//GEN-END:variables
}
