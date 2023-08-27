import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MAHFUZ TASNIM
 */
public final class Homepage extends javax.swing.JFrame {

    String sDB = "jdbc:mysql://localhost/signup";

    public Homepage() {
        initComponents();
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        box = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        Date = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        View1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        View2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CALANDER.png"))); // NOI18N
        jLabel1.setText("Class Shedule");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("GO TO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        box.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select day", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxMouseClicked(evt);
            }
        });
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Month", "January - 31 days", "February - 28 days in a common year and 29 days in leap years", "March - 31 days", "April - 30 days", "May - 31 days", "June - 30 days", "July - 31 days", "August - 31 days", "September - 30 days", "October - 31 days", "November - 30 days", "December - 31 days" }));
        Month.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MonthItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Select Day");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Select Month");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Date, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Month, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(245, 245, 245))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BAUST COURSE MANAGEMENT SYSTEM");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("HOME PAGE");

        jPanel8.setBackground(new java.awt.Color(255, 255, 153));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online.png"))); // NOI18N
        jLabel3.setText("Online Contest");

        View1.setBackground(new java.awt.Color(255, 255, 255));
        View1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        View1.setText("GO TO");
        View1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(View1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(View1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 153));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/functions.png"))); // NOI18N
        jLabel5.setText("Functions");

        View2.setBackground(new java.awt.Color(255, 255, 255));
        View2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        View2.setText("GO TO");
        View2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(View2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(View2)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Online Class");

        jLabel13.setIcon(new javax.swing.ImageIcon("F:\\Study\\4th semester (L-2,T-2)\\Projects\\BAUST course anagement syste\\icon\\home.png")); // NOI18N

        jButton1.setText("START ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("F:\\Study\\4th semester (L-2,T-2)\\Projects\\Baust\\project\\mix\\JBls2bU3Mhc.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(263, 263, 263))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(407, 407, 407)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelMin)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelClose)
                                .addGap(31, 31, 31))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelClose)
                                .addComponent(jLabelMin))))
                    .addComponent(jLabel2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View1ActionPerformed
        // TODO add your handling code here:
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.coderbyte.com/"));
        } catch (IOException err) {

        } catch (URISyntaxException err) {

        }
    }//GEN-LAST:event_View1ActionPerformed

    private void View2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View2ActionPerformed
        // TODO add your handling code here:
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.baust.edu.bd/pages/content_details/cultural-clubs-2"));
        } catch (IOException err) {

        } catch (URISyntaxException err) {

        }
    }//GEN-LAST:event_View2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new more().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_boxMouseClicked

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (box.getSelectedIndex() == 0 && Month.getSelectedIndex() == 0 && Date.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(Homepage.this, "Select A MONTH , DATE & DAY");
            return;
        }
        if (box.getSelectedIndex() == 0 && Month.getSelectedIndex() == 0 && Date.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(Homepage.this, "Select A MONTH & DAY");
            return;
        }
        if (box.getSelectedIndex() == 0 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(Homepage.this, "Select A DATE & DAY");
            return;
        }
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 0 && Date.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(Homepage.this, "Select A MONTH & DATE");
            return;
        }
        if (box.getSelectedIndex() == 0 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(Homepage.this, "Select A DAY");
            return;
        }
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 0 && Date.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(Homepage.this, "Select A MONTH");
            return;
        }
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(Homepage.this, "Select A DATE");
            return;
        }

        //END OF 0-0-0   
        ///////////////////////////////////      START OF MONTH -1      ///////////////////////////////////
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 2) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 3) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 4) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 5) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 6) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 7) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 8) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 9) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 10) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 11) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 12) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 13) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 14) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 15) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 16) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 17) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 18) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 19) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 20) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 21) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 22) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 23) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 24) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 25) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 26) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 27) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 28) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 29) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 30) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 1 && Date.getSelectedIndex() == 31) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //END OF Day
        /////////////////////////////           End of MONTH 1           ///////////////////////////////////
        ///////////////////////////////////      START OF MONTH -1      ///////////////////////////////////
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 2) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 3) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 4) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 5) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 6) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 7) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 8) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 9) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 10) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 11) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 12) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 13) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 14) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 15) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 16) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 17) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 18) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 19) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 20) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 21) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 22) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 23) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 24) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 25) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 26) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 27) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 28) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 2 && Date.getSelectedIndex() == 29) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }

        //END OF Day
        /////////////////////////////           End of MONTH 2          ///////////////////////////////////
        ///////////////////////////////////      START OF MONTH -1      ///////////////////////////////////
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 2) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 3) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 4) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 5) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 6) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 7) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 8) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 9) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 10) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 11) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 12) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 13) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 14) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 15) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 16) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 17) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 18) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 19) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 20) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 21) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //END OF Day
        //start of day
        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 22) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 23) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 24) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //start of day -5(Wednesday)
        if (box.getSelectedIndex() == 5 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 25) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2205(SA)[02.30-05.00]"
                    + " \n\tROOM NO- 5005"
                    + "\n......................................"
            );
            return;
        }

        //start of day -6(Thursday)
        if (box.getSelectedIndex() == 6 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 26) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 5 CLASS AND 0 LAB  (08.00am - 1.20 pm)"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[08.00-08.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[09.00-09.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[10.00-10.50]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
            );
            return;
        }

        //start of day 7
        if (box.getSelectedIndex() == 7 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 27) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        // start of day 1
        if (box.getSelectedIndex() == 1 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 28) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY IS HOLIDAY ... STAY HOME STAY-SAFE");

            return;
        }

        //start of day -2(Sunday)
        if (box.getSelectedIndex() == 2 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 29) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 3 CLASS AND 0 LAB  (08.00am - 10.50 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2207(MOH)[08.00-08.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2203(MMH)[09.00-09.50]"
                    + "\n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2201(NHC)[10.00-10.50]"
                    + "\n\tROOM NO- 5005"
            );

            return;
        }
        // start of day -3(monday)
        if (box.getSelectedIndex() == 3 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 30) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 1 LAB  (11.30am - 1.30 pm)"
                    + "\n----------------------------------------------------------"
                    + "\n\tCSE 2201(NHC)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2205(SA)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2206(FTZ)[02.30-05.00]"
                    + "\n\tROOM NO- 4005"
                    + "\n......................................"
                    + "\n\tCSE 2201(NHC)[02.30-05.00]"
                    + "\n\tROOM NO- 5007"
            );
            return;
        }

        //start of day -4(Tuesday)
        if (box.getSelectedIndex() == 4 && Month.getSelectedIndex() == 3 && Date.getSelectedIndex() == 31) {
            JOptionPane.showMessageDialog(Homepage.this, "TODAY YOU HAVE 2 CLASS AND 2 LAB  (11.30am - 1.30 pm)"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2202(NHC+NIN)[08.00-10.50]"
                    + " \n\tROOM NO- 5008"
                    + "\n......................................"
                    + "\n\tCSE 2204(MMH+MZH)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n"
                    + "\n.....................CLASS................................."
                    + "\n----------------------------------------------------------"
                    + "\n\t MATH 2247(AH)[11.30-12.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n\tCSE 2207(MOH)[12.30-01.20]"
                    + " \n\tROOM NO- 5005"
                    + "\n------------------------------------------"
                    + "\n................LAB.................."
                    + "\n[GA+GB]"
                    + "\n--------------------------------------"
                    + "\n\tCSE 2208(MOH+MSA)[02.30-05.00]"
                    + " \n\tROOM NO- 4008"
                    + "\n......................................"
            );
            return;
        }

        //END OF Day
        /////////////////////////////           End of MONTH 3           ///////////////////////////////////

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void MonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MonthItemStateChanged
        // TODO add your handling code here:

        ArrayList<String> array = new ArrayList<>();
        Iterator<String> iter;
        if (Month.getSelectedItem().equals("January - 31 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");
            array.add("31");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("February - 28 days in a common year and 29 days in leap years")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("March - 31 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");
            array.add("31");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("April - 30 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("May - 31 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");
            array.add("31");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("June - 30 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("July - 31 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");
            array.add("31");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("August - 31 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");
            array.add("31");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("September - 30 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("October - 31 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");
            array.add("31");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("November - 30 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        } else if (Month.getSelectedItem().equals("December - 31 days")) {
            Date.removeAllItems();

            array.add("Select a DATE");
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("4");
            array.add("5");
            array.add("6");
            array.add("7");
            array.add("8");
            array.add("9");
            array.add("10");
            array.add("11");
            array.add("12");
            array.add("13");
            array.add("14");
            array.add("15");
            array.add("16");
            array.add("17");
            array.add("18");
            array.add("19");
            array.add("20");
            array.add("21");
            array.add("22");
            array.add("23");
            array.add("24");
            array.add("25");
            array.add("26");
            array.add("27");
            array.add("28");
            array.add("29");
            array.add("30 ");
            array.add("31");

            iter = array.iterator();
            while (iter.hasNext()) {
                Date.addItem(iter.next());

            }
        }


    }//GEN-LAST:event_MonthItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      new Online().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Homepage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Date;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JButton View1;
    private javax.swing.JButton View2;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
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
    // End of variables declaration//GEN-END:variables

    static class ActionListenerImpl extends ActionListener {

        public ActionListenerImpl() {
        }

    }
}
