package apk.perpustakaan;

import java.awt.CardLayout;
import java.awt.*;
import javax.swing.SwingConstants;
import javax.swing.table.*;

public class Dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());

    /**
     * Creates new form kdankndkajwdnk
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        new RoundedPanel(40);
        styleComboBox();
        CardLayout cl = (CardLayout) jPanel3.getLayout();
        cl.show(jPanel3, "dashboard");
        
        //Dashboard table 
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.setRowHeight(35);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jScrollPane1.setBorder(null);
        jTable1.getTableHeader().setBorder(null);
        jTable1.getTableHeader().setBackground(java.awt.Color.WHITE);
        jTable1.getTableHeader().setBackground(Color.WHITE);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"1", "Laskar Pelangi", "Ahmad Fauzi", "21 Apr 2026", "Dipinjam"});
        model.addRow(new Object[]{"2", "Bumi Manusia", "Siti Aminah", "20 Apr 2026", "Kembali"});
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        
        }
        //Transaksi Table
        tabletransaksi.setBorder(null);
        tabletransaksi.setShowGrid(false);
        tabletransaksi.setIntercellSpacing(new Dimension(0, 0));
        tabletransaksi.setBackground(Color.WHITE);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        tabletransaksi.getTableHeader().setBorder(null);
        tabletransaksi.getTableHeader().setBackground(Color.WHITE);
        tabletransaksi.setRowHeight(35);
        tabletransaksi.setSelectionBackground(new Color(220, 240, 255));
        tabletransaksi.setSelectionForeground(Color.BLACK);
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
        for (int i = 0; i < tabletransaksi.getColumnCount(); i++) {
        tabletransaksi.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    
    
    ((DefaultTableCellRenderer)tabletransaksi.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(SwingConstants.CENTER);


        jDateChooser1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jDateChooser1.setBackground(Color.WHITE);
        jDateChooser1.setBorder(null);
        jDateChooser1.setDateFormatString("dd MMM yyyy");
        
        
    }
        private void styleComboBox() {
        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setForeground(Color.BLACK);
        jComboBox1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jComboBox1.setBorder(null);

        jComboBox2.setBackground(Color.WHITE);
        jComboBox2.setForeground(Color.BLACK);
        jComboBox2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jComboBox2.setBorder(null);
       
        
        DefaultTableModel model = (DefaultTableModel) tabletransaksi.getModel();
    // model.addRow(new Object[]{"1", "TRX-001", "25 Apr 2026", "Ahmad", "Laskar Pelangi", ...});
}

// Method untuk membuka Dialog Tambah Transaksi
private void btnBukaDialogActionPerformed(java.awt.event.ActionEvent evt) {
    tambahtransaksi dialog = new tambahtransaksi(this, true);
    dialog.setVisible(true);
}
     
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        roundedPanel1 = new apk.perpustakaan.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        roundedPanel2 = new apk.perpustakaan.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        roundedPanel3 = new apk.perpustakaan.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        roundedPanel4 = new apk.perpustakaan.RoundedPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        roundedPanel5 = new apk.perpustakaan.RoundedPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        roundedPanel6 = new apk.perpustakaan.RoundedPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        roundedPanel7 = new apk.perpustakaan.RoundedPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        transaksi = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btntransaksi = new apk.perpustakaan.RoundedButton2();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        roundedPanel8 = new apk.perpustakaan.RoundedPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        roundedPanel9 = new apk.perpustakaan.RoundedPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        roundedPanel10 = new apk.perpustakaan.RoundedPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        roundedPanel11 = new apk.perpustakaan.RoundedPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        roundedPanel12 = new apk.perpustakaan.RoundedPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        roundedButton22 = new apk.perpustakaan.RoundedButton2();
        jPanel10 = new javax.swing.JPanel();
        roundedPanel14 = new apk.perpustakaan.RoundedPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabletransaksi = new javax.swing.JTable();
        buku = new javax.swing.JPanel();
        user = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(752, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(140, 421));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\house (1).png")); // NOI18N
        jButton1.setText("Dashboard");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\credit-card.png")); // NOI18N
        jButton2.setText("Transaksi");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jButton3.setBackground(new java.awt.Color(0, 51, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\book-open.png")); // NOI18N
        jButton3.setText("Buku");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, -1));

        jButton4.setBackground(new java.awt.Color(0, 51, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\users-three.png")); // NOI18N
        jButton4.setText("User Manage");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\power.png")); // NOI18N
        jButton5.setText("Logout");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 70, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.CardLayout());

        dashboard.setBackground(new java.awt.Color(246, 246, 246));
        dashboard.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Dashboard");
        jLabel15.setPreferredSize(new java.awt.Dimension(900, 20));
        dashboard.add(jLabel15);

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(250, 140));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Total Buku");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 6, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Buku Terdaftar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 174558.png")); // NOI18N
        roundedPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 60));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("500");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        roundedPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        dashboard.add(roundedPanel1);

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel2.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setText("Total User");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("Anggota Aktif");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 174923.png")); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("200");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundedPanel2Layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(jLabel3))
                        .addGroup(roundedPanel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18))
        );

        dashboard.add(roundedPanel2);

        roundedPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel3.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("Peminjam Aktif");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setText("Orang Sedang Meminjam");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 175154.png")); // NOI18N

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("30");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel3Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45))
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(33, 33, 33)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(25, 25, 25))
        );

        dashboard.add(roundedPanel3);

        roundedPanel4.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel4.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("Buku Dipinjam");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel11.setText("Buku Keluar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 175445.png")); // NOI18N

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("120");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(this::jTextField5ActionPerformed);

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                        .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(88, 88, 88))))
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(24, 24, 24))
        );

        dashboard.add(roundedPanel4);

        roundedPanel5.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel5.setPreferredSize(new java.awt.Dimension(250, 140));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setText("Buku Dikembalikan");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel12.setText("Buku Kembali");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 175543.png")); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("90");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        javax.swing.GroupLayout roundedPanel5Layout = new javax.swing.GroupLayout(roundedPanel5);
        roundedPanel5.setLayout(roundedPanel5Layout);
        roundedPanel5Layout.setHorizontalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addGap(21, 21, 21)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
        );
        roundedPanel5Layout.setVerticalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(22, 22, 22))
        );

        dashboard.add(roundedPanel5);

        roundedPanel6.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel6.setPreferredSize(new java.awt.Dimension(250, 140));
        roundedPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("Keterlambatan");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 6, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel13.setText("Buku Terlambat");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roundedPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 108, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 175628.png")); // NOI18N
        roundedPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("10");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(this::jTextField1ActionPerformed);
        roundedPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 71, 52));

        dashboard.add(roundedPanel6);

        roundedPanel7.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel7.setPreferredSize(new java.awt.Dimension(850, 180));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Aktivitas Terakhir");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Judul Buku", "Peminjam", "Tanggal Pinjam", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout roundedPanel7Layout = new javax.swing.GroupLayout(roundedPanel7);
        roundedPanel7.setLayout(roundedPanel7Layout);
        roundedPanel7Layout.setHorizontalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        roundedPanel7Layout.setVerticalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        dashboard.add(roundedPanel7);

        jPanel3.add(dashboard, "dashboard");

        transaksi.setBackground(new java.awt.Color(250, 249, 249));
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });
        transaksi.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel4.setPreferredSize(new java.awt.Dimension(3163, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Transaksi");
        jLabel2.setAlignmentX(0.5F);
        jPanel4.add(jLabel2, java.awt.BorderLayout.WEST);

        btntransaksi.setBorder(null);
        btntransaksi.setText("+ Tambah Transaksi");
        btntransaksi.setPreferredSize(new java.awt.Dimension(150, 10));
        btntransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntransaksiMouseExited(evt);
            }
        });
        btntransaksi.addActionListener(this::btntransaksiActionPerformed);
        jPanel4.add(btntransaksi, java.awt.BorderLayout.EAST);

        transaksi.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(246, 246, 246));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel6.setLayout(new java.awt.GridLayout(1, 4, 30, 10));

        roundedPanel8.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel8.setPreferredSize(new java.awt.Dimension(641, 100));

        jLabel22.setText("Total Transaksi");

        jLabel23.setText("Semua Transaksi");

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\file-text.png")); // NOI18N

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("200");
        jTextField9.setBorder(null);
        jTextField9.addActionListener(this::jTextField9ActionPerformed);

        javax.swing.GroupLayout roundedPanel8Layout = new javax.swing.GroupLayout(roundedPanel8);
        roundedPanel8.setLayout(roundedPanel8Layout);
        roundedPanel8Layout.setHorizontalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel8Layout.createSequentialGroup()
                .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addGap(58, 58, 58)
                        .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)))
                    .addGroup(roundedPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(741, Short.MAX_VALUE))
        );
        roundedPanel8Layout.setVerticalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(22, 22, 22))
        );

        jPanel6.add(roundedPanel8);

        roundedPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Peminjaman Aktif");

        jLabel25.setText("Sedang Dipinjam");

        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 175154.png")); // NOI18N

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("100");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(this::jTextField10ActionPerformed);

        javax.swing.GroupLayout roundedPanel9Layout = new javax.swing.GroupLayout(roundedPanel9);
        roundedPanel9.setLayout(roundedPanel9Layout);
        roundedPanel9Layout.setHorizontalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel9Layout.createSequentialGroup()
                .addGroup(roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel9Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)))
                    .addGroup(roundedPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(743, Short.MAX_VALUE))
        );
        roundedPanel9Layout.setVerticalGroup(
            roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel9Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel38))
                    .addComponent(jTextField10))
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addGap(18, 18, 18))
        );

        jPanel6.add(roundedPanel9);

        roundedPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setText("Dipinjam Hari Ini");

        jLabel27.setText("Transaksi Hari Ini");

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\Screenshot 2026-04-24 175445.png")); // NOI18N

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("100");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(this::jTextField11ActionPerformed);

        javax.swing.GroupLayout roundedPanel10Layout = new javax.swing.GroupLayout(roundedPanel10);
        roundedPanel10.setLayout(roundedPanel10Layout);
        roundedPanel10Layout.setHorizontalGroup(
            roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel10Layout.createSequentialGroup()
                .addGroup(roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel10Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)))
                    .addGroup(roundedPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(752, Short.MAX_VALUE))
        );
        roundedPanel10Layout.setVerticalGroup(
            roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jTextField11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(21, 21, 21))
        );

        jPanel6.add(roundedPanel10);

        roundedPanel11.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Dikembalikan Hari Ini");
        roundedPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 14, -1, -1));

        jLabel29.setText("Transaksi Hari Ini");
        roundedPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 116, -1, -1));
        roundedPanel11.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, -1, -1));
        roundedPanel11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad Faisal\\Documents\\NetBeansProjects\\perpustakaan_netbeans\\src\\main\\Resources\\Assets\\arrow-counter-clockwise (1).png")); // NOI18N
        roundedPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("50");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(this::jTextField12ActionPerformed);
        roundedPanel11.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel6.add(roundedPanel11);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 10));

        roundedPanel12.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        roundedPanel12.setPreferredSize(new java.awt.Dimension(2657, 100));
        roundedPanel12.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(2577, 25));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Cari Transaksi");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel31.setText("Jenis Transaksi");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel32.setText("Status");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel33.setText("Tanggal");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        roundedPanel12.add(jPanel8, java.awt.BorderLayout.NORTH);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 10));

        jTextField7.setText("Cari");
        jTextField7.setPreferredSize(new java.awt.Dimension(160, 22));
        jTextField7.addActionListener(this::jTextField7ActionPerformed);
        jPanel9.add(jTextField7);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Jenis", "Peminjaman", "Pengembalian" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel9.add(jComboBox1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Status", "Dipinjam", "Dikembalikkan", "Terlambat" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(130, 22));
        jPanel9.add(jComboBox2);

        jDateChooser1.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel9.add(jDateChooser1);

        roundedButton22.setText("Filter");
        roundedButton22.setPreferredSize(new java.awt.Dimension(70, 30));
        roundedButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedButton22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedButton22MouseExited(evt);
            }
        });
        roundedButton22.addActionListener(this::roundedButton22ActionPerformed);
        jPanel9.add(roundedButton22);

        roundedPanel12.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel7.add(roundedPanel12, java.awt.BorderLayout.NORTH);

        jPanel10.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        roundedPanel14.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        roundedPanel14.setPreferredSize(new java.awt.Dimension(886, 343));
        roundedPanel14.setLayout(new java.awt.BorderLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Daftar Transaksi");
        jLabel34.setPreferredSize(new java.awt.Dimension(0, 20));
        roundedPanel14.add(jLabel34, java.awt.BorderLayout.PAGE_START);

        tabletransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID Transaksi", "Peminjam", "Buku", "Tgl Pinjam", "Tgl Kembali", "Denda", "Catatan", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabletransaksi.setOpaque(false);
        jScrollPane2.setViewportView(tabletransaksi);
        if (tabletransaksi.getColumnModel().getColumnCount() > 0) {
            tabletransaksi.getColumnModel().getColumn(0).setMinWidth(30);
            tabletransaksi.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        roundedPanel14.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel7.add(roundedPanel14, java.awt.BorderLayout.WEST);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        transaksi.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.add(transaksi, "transaksi");

        javax.swing.GroupLayout bukuLayout = new javax.swing.GroupLayout(buku);
        buku.setLayout(bukuLayout);
        bukuLayout.setHorizontalGroup(
            bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3700, Short.MAX_VALUE)
        );
        bukuLayout.setVerticalGroup(
            bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        jPanel3.add(buku, "card2");

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3700, Short.MAX_VALUE)
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        jPanel3.add(user, "card2");

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
        
    }//GEN-LAST:event_transaksiMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        CardLayout cl = (CardLayout) jPanel3.getLayout();
        cl.show(jPanel3, "dashboard");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        CardLayout cl = (CardLayout) jPanel3.getLayout();
        cl.show(jPanel3, "transaksi");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btntransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseEntered
      btntransaksi.setBackground(new Color(0, 80, 200));
    }//GEN-LAST:event_btntransaksiMouseEntered

    private void btntransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseExited
        btntransaksi.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_btntransaksiMouseExited

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void btntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransaksiActionPerformed
        tambahtransaksi dialog = new tambahtransaksi(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btntransaksiActionPerformed

    private void roundedButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedButton22ActionPerformed

    private void roundedButton22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedButton22MouseEntered
       roundedButton22.setBackground(new Color(0, 80, 200));
    }//GEN-LAST:event_roundedButton22MouseEntered

    private void roundedButton22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedButton22MouseExited
        roundedButton22.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_roundedButton22MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private apk.perpustakaan.RoundedButton2 btntransaksi;
    private javax.swing.JPanel buku;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private apk.perpustakaan.RoundedButton2 roundedButton22;
    private apk.perpustakaan.RoundedPanel roundedPanel1;
    private apk.perpustakaan.RoundedPanel roundedPanel10;
    private apk.perpustakaan.RoundedPanel roundedPanel11;
    private apk.perpustakaan.RoundedPanel roundedPanel12;
    private apk.perpustakaan.RoundedPanel roundedPanel14;
    private apk.perpustakaan.RoundedPanel roundedPanel2;
    private apk.perpustakaan.RoundedPanel roundedPanel3;
    private apk.perpustakaan.RoundedPanel roundedPanel4;
    private apk.perpustakaan.RoundedPanel roundedPanel5;
    private apk.perpustakaan.RoundedPanel roundedPanel6;
    private apk.perpustakaan.RoundedPanel roundedPanel7;
    private apk.perpustakaan.RoundedPanel roundedPanel8;
    private apk.perpustakaan.RoundedPanel roundedPanel9;
    public javax.swing.JTable tabletransaksi;
    private javax.swing.JPanel transaksi;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
