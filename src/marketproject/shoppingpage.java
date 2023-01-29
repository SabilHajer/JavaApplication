/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marketproject;

/**
 *
 * @author Othmane Taoussi and Yassine Ourdaoui
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class shoppingpage extends JFrame{

    /**
     *
     */
    private JPanel mainPanel;

    /**
     *
     */
    private JLabel[] imageLabels;

    /**
     *
     */
    private JButton[] buyButtons;

    /**
     *
     */
    private JButton viewCartButton;

    /**
     *
     */
    private ArrayList<Integer> cart = new ArrayList<>();

    /**
     *
     */
    private Connection con;

    /**
     *
     */
    private JScrollPane scrollPane;

    /**
     *
     */
    public shoppingpage() {
        super("Photo Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
       
        mainPanel.setLayout(new GridLayout(0, 3, 2, 2));

              scrollPane = new JScrollPane(mainPanel);
                
    add(scrollPane, BorderLayout.CENTER);
        
        viewCartButton = new JButton("View Cart");
        viewCartButton.addActionListener(new  ViewCartListener() );
        add(viewCartButton, BorderLayout.NORTH);

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprojectbase", "root", "");
            String query = "select idProd,nameProd,QntyProd,priceProd,catProd,idPic from procducttable";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            int count = 0;
            while (rs.next()) {
                int id = rs.getInt("idProd");
                String name = rs.getString("nameProd");
                int price = rs.getInt("priceProd");
                int quantity = rs.getInt("QntyProd");
                String category = rs.getString("catProd");
                Blob imageBlob = rs.getBlob("idPic");
                byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
                BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));

                JLabel label = new JLabel(new ImageIcon(image));
                JLabel nameField = new JLabel();
                JLabel nameValueField = new JLabel();
                JLabel priceField = new JLabel();
                JLabel priceValueField = new JLabel();
                JLabel catField = new JLabel();
                JLabel catValueField = new JLabel();
                JLabel idProdField = new JLabel();
                JLabel idProdValueField = new JLabel();
            
                label.setPreferredSize(new Dimension(50, 50)); 
                
                idProdField.setText(" | idProd: " );
                idProdField.setPreferredSize(new Dimension(2, 2));
                idProdValueField.setText(Integer.toString(id));
                idProdValueField.setPreferredSize(new Dimension(2, 2));
                
                
                nameField.setText(" | Name: " );
                nameField.setPreferredSize(new Dimension(2, 2));
                nameValueField.setText( name );
                nameValueField.setPreferredSize(new Dimension(2, 2));
                
                catField.setText(" | Category: " );
                catField.setPreferredSize(new Dimension(2, 2));
                catValueField.setText( category );
                catValueField.setPreferredSize(new Dimension(2, 2));
                
                priceField.setText("   | Price: ");
                priceField.setPreferredSize(new Dimension(2, 2));
                priceValueField.setText( Integer.toString(price));
                priceValueField.setPreferredSize(new Dimension(2, 2));
                
                mainPanel.add(label);
                mainPanel.add(nameField);
                mainPanel.add( priceField);
                mainPanel.add(  catField);
                  mainPanel.add(  idProdValueField);

                JButton buyButton = new JButton("Buy");
                   buyButton.addActionListener(new ActionListener() {
                      

                       
                     public void actionPerformed(ActionEvent e) {
                            
                             cart.add(id);
                            String nameProd = nameValueField.getText();
                            String cattProd = catValueField.getText();
                            String  priceProd = priceValueField.getText();
                            String  idProduct = idProdValueField.getText();
                            int intidProduct = Integer.parseInt(idProduct);
                            int intPrice = Integer.parseInt(priceProd);
                            String qntyProd = JOptionPane.showInputDialog("Enter the quantity:");
                            int intqntyProd = Integer.parseInt(qntyProd );
                            String idOrder = JOptionPane.showInputDialog("Enter your CIN ");
                            int intidOrder = Integer.parseInt(idOrder  );
                           storeInDatabase(intidProduct,nameProd,intqntyProd ,intPrice,cattProd,intidOrder);
            }
        });
                buyButton.setPreferredSize(new Dimension(50, 50));
                mainPanel.add(buyButton);
                count++;
            }

            if (count == 0) {
                JOptionPane.showMessageDialog(this, "No photos found in the database.");
            }

            setSize(900,600);
            setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     *
     * @param idProd
     * @param name
     * @param qnty
     * @param price
     * @param cat
     * @param idOrder1
     */
    private void storeInDatabase(int idProd, String name, int qnty, int price, String cat, int idOrder1) {
    // Connect to the database
    Connection conn = null;
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprojectbase", "root", "");

        // Check if the order already exists in the orders table
        String checkSql = "SELECT * FROM orders WHERE idOrder = ?";
        PreparedStatement checkPst = conn.prepareStatement(checkSql);
        checkPst.setInt(1, idOrder1);
        ResultSet checkRs = checkPst.executeQuery();
        if (!checkRs.next()) {
            // Insert data into the first table
            String sql1 = "INSERT INTO orders (idOrder) VALUES (?) ;";
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, idOrder1);
            pst.executeUpdate();
        }

        // Insert data into the second table using the idOrder as a foreign key
        String sql = "INSERT INTO products (idProduct,nameP,quantity,price,category,idOrder) VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, idProd);
        stmt.setString(2, name);
        stmt.setInt(3, qnty);
        stmt.setInt(4, price);
        stmt.setString(5, cat);
        stmt.setInt(6, idOrder1);
   

        JOptionPane.showMessageDialog(this, "Product added ");
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    /**
     *
     */
    private class ViewCartListener implements ActionListener {

        /**
         *
         * @param e
         */
        public void actionPerformed(ActionEvent e)
         {
		if (cart.isEmpty()) {
		JOptionPane.showMessageDialog(shoppingpage.this, "Your cart is empty.");
		} else {
		String message = "Your cart contains: \n";
		for (Integer id : cart) {
		message += id + "\n";
		}
		JOptionPane.showMessageDialog(shoppingpage.this, message);
		}
		}
		}
		
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		shoppingpage display = new shoppingpage();
		display.setVisible(true);
		}
		}
    

