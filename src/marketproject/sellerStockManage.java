

package marketproject;


import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sabil Hajer 
 */
public class sellerStockManage extends javax.swing.JFrame {

    /**
     *
     */
    Connection con = null ; 
 
    /**
     *
     */
    PreparedStatement pst = null ; 

    /**
     *
     */
    ResultSet Rs = null ;
 
    /**
     *
     */
    Statement st = null ; 

    /**
     *
     */
    private int prodId ;
   
    /**
     *
     */
    public sellerStockManage() {
        initComponents();
        DisplayItems() ;
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prodPrice = new javax.swing.JTextField();
        prodQnty = new javax.swing.JTextField();
        Prodname = new javax.swing.JTextField();
        ItPictureLbl = new javax.swing.JLabel();
        ProdCategorie = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        editButon = new javax.swing.JButton();
        browseButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel12.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Home");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price ");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ProdName ");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity ");

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Photo");

        jLabel9.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Categories ");

        prodPrice.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        prodQnty.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        Prodname.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        ItPictureLbl.setText("piic");

        ProdCategorie.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        ProdCategorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "bakery", "Canned", "Diary", "Cleaners" }));
        ProdCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdCategorieActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(153, 0, 153));
        addButton.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButon.setBackground(new java.awt.Color(153, 0, 153));
        editButon.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        editButon.setForeground(new java.awt.Color(255, 255, 255));
        editButon.setText("Edit");
        editButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButonMouseClicked(evt);
            }
        });
        editButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButonActionPerformed(evt);
            }
        });

        browseButton.setBackground(new java.awt.Color(153, 0, 153));
        browseButton.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        browseButton.setForeground(new java.awt.Color(255, 255, 255));
        browseButton.setText("Browse ");
        browseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseButtonMouseClicked(evt);
            }
        });
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(153, 0, 153));
        deleteButton.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete ");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idProd", "nameProd", "quantityProd", "priceProd", "categorieProd", "idPic "
            }
        ));
        prodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodTable);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectImages/shop_1.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("  GrocyShop");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jButton3.setBackground(new java.awt.Color(229, 182, 60));
        jButton3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Order management ");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(229, 182, 60));
        jButton4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Log out");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Stock Management ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1010, 1010, 1010)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Prodname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(prodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(prodQnty, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(19, 19, 19))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProdCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(editButon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ItPictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(307, 307, 307)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(546, 546, 546))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Prodname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(prodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(prodQnty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProdCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(editButon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ItPictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1076, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void prodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTableMouseClicked
        // displaying info in the desktop wehenever we selecte a product  code here:

        DefaultTableModel model = (DefaultTableModel)prodTable.getModel();
        int myIndex = prodTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myIndex,0).toString());
        Prodname.setText(model.getValueAt(myIndex,1).toString())  ;
        prodQnty.setText(model.getValueAt(myIndex,2).toString());
        prodPrice.setText(model.getValueAt(myIndex,3).toString());
        ProdCategorie.setSelectedItem(model.getValueAt(myIndex,4).toString());
        GetItemPhoto();
    }//GEN-LAST:event_prodTableMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // delete button  code here:
        if(key == 0 ){

            JOptionPane.showMessageDialog(this , "Select The Item");
        }else{

            try{

                con =  DriverManager.getConnection( "jdbc:mysql://localhost:3306/javaprojectbase", "root", "");
                String Query = "Delete from procducttable where idProd = "+key ;
                Statement Del = con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this , "Item deleted");
                DisplayItems();
                clear() ;
            }catch(Exception e){

            }

        }

    }//GEN-LAST:event_deleteButtonMouseClicked

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // T ODO add your handling codhne here:
    }//GEN-LAST:event_browseButtonActionPerformed

    private void browseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseButtonMouseClicked
        JFileChooser file = new JFileChooser() ;
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","ipg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(file);
        if(result == JFileChooser.APPROVE_OPTION){

            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ItPictureLbl.setIcon(ResizePhoto(path,null));
            imagePath = path ;

        }else if ( result == JFileChooser.CANCEL_OPTION){

            JOptionPane.showMessageDialog(this , "No File selected ");

        }

    }//GEN-LAST:event_browseButtonMouseClicked

    private void editButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButonActionPerformed

    private void editButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButonMouseClicked
        // Edit button code here:

        try{

            InputStream img = new FileInputStream(imagePath);
            String UpdateQuery = "Update procducttable set  nameProd=?,QntyProd=?,priceProd=?,catProd=?,idPic=? Where idProd=? " ;
            con =  DriverManager.getConnection( "jdbc:mysql://localhost:3306/javaprojectbase", "root", "");
            PreparedStatement Ps= con.prepareStatement(UpdateQuery);
            Ps.setString(1,Prodname.getText() );
            Ps.setInt(2 , Integer.valueOf(prodQnty.getText()));
            Ps.setInt(3 , Integer.valueOf(prodPrice.getText()));
            Ps.setString(4,ProdCategorie.getSelectedItem().toString());
            Ps.setBlob(5 , img);
            Ps.setInt(6 , key);
            if(Ps.executeUpdate() == 1){

                DisplayItems() ;
                JOptionPane.showMessageDialog(this , "Item Updated") ;

            }else{

                JOptionPane.showMessageDialog(this , "Missing information ") ;

            }

        }catch(Exception e){

            JOptionPane.showMessageDialog(this,e) ;

        }

    }//GEN-LAST:event_editButonMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // add product button  code here:

    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // add  product bottun your handling code here:

        if(Prodname.getText().isEmpty() || prodQnty.getText().isEmpty() || prodPrice.getText().isEmpty()|| ProdCategorie.getSelectedIndex() == -1 ){

            JOptionPane.showMessageDialog(this , "Missing Information");

        } else{

            try{

                con =  DriverManager.getConnection( "jdbc:mysql://localhost:3306/javaprojectbase", "root", "");
                PreparedStatement save = con.prepareStatement("insert into procducttable Values(?,?,?,?,?,?) ");
                save.setInt(1, prodId );
                save.setString(2,Prodname.getText());
                save.setInt(3 , Integer.valueOf(prodQnty.getText()));
                save.setInt(4, Integer.valueOf(prodPrice.getText()));
                save.setString(5, ProdCategorie.getSelectedItem().toString());
                InputStream img = new FileInputStream(imagePath);
                save.setBlob(6 , img);
                int roe = save.executeUpdate();
                JOptionPane.showMessageDialog(this,"Product added ");
                con.close();

                DisplayItems();
                clear();
            }catch(Exception e){

                JOptionPane.showMessageDialog(this,e);

            }

        }

    }//GEN-LAST:event_addButtonMouseClicked

    private void ProdCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdCategorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdCategorieActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
         orderframe order = new     orderframe();
           order.setVisible(true);
             setVisible(false);
                                     
        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
            ShoppingI SHOP = new ShoppingI();
             SHOP.setVisible(true);
             setVisible(false);
                                   
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     *
     * @param ImagePath
     * @param pic
     * @return
     */
    public ImageIcon ResizePhoto( String ImagePath , byte[] pic){
    ImageIcon MyImage = null ; 
    if(ImagePath != null ){
        
        MyImage = new ImageIcon(ImagePath);
        
  
    }else {
        
        MyImage = new ImageIcon(pic);
    
    
    }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(ItPictureLbl.getWidth(),ItPictureLbl.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image ;
    } 
    
    /**
     *
     */
    String imagePath ;
    
    /**
     *
     */
    private void DisplayItems(){
        
        try{
            
            con =  DriverManager.getConnection( "jdbc:mysql://localhost:3306/javaprojectbase", "root", "");
            st= con.createStatement();
            Rs = st.executeQuery("select * from procducttable");
            prodTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
        }catch(Exception e){
        
        }
    
    }
    
    /**
     *
     */
    private void clear() {
        
        Prodname.setText("");
        prodQnty.setText("");
        prodPrice.setText("");
        ItPictureLbl.setIcon(null);
    
    }
   
    /**
     *
     */
    private void GetItemPhoto(){
        
        String Query = " select idPic from procducttable where idProd =  "+key ;
        Statement  st ;
        ResultSet Rs ; 
        try{
            
            con =  DriverManager.getConnection( "jdbc:mysql://localhost:3306/javaprojectbase", "root", "");
            st = con.createStatement() ; 
            Rs = st.executeQuery(Query);
            if(Rs.next()){
               
                ItPictureLbl.setIcon(ResizePhoto(null , Rs.getBytes("idPic")));
            
            }
        
        }catch(Exception e){
        
        }
    
    }

    /**
     *
     */
    int key =0 ;
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
            java.util.logging.Logger.getLogger(sellerStockManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellerStockManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellerStockManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellerStockManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellerStockManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ItPictureLbl;
    private javax.swing.JComboBox<String> ProdCategorie;
    private javax.swing.JTextField Prodname;
    private javax.swing.JButton addButton;
    private javax.swing.JButton browseButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButon;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField prodPrice;
    private javax.swing.JTextField prodQnty;
    private javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}