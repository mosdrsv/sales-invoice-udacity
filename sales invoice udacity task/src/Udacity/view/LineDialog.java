/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udacity.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ahmed
 */
public class LineDialog extends JDialog {
    private JTextField itemName;
    private JTextField Priceofunit;
    private JTextField Quant;
    private JLabel itemNameLabel;
    private JLabel UnitPriceLabel;
    private JLabel QuantityLabel;
    private JButton ok;
    private JButton cancel;

    public LineDialog(InvoiceFrame frame) {
        itemNameLabel= new JLabel("Item Name:");
        itemName = new JTextField(30);
        UnitPriceLabel = new JLabel("Unit Price:");
        Priceofunit = new JTextField(30);
        QuantityLabel = new JLabel("Quantity:");
        Quant = new JTextField(30);
        ok= new JButton("OK");
        cancel = new JButton("Cancel");
        ok.setActionCommand("createLine");
        cancel.setActionCommand("cancelLine");
        ok.addActionListener(frame.getController());
        cancel.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 4));
        add(itemNameLabel);
        add(itemName);
        add(UnitPriceLabel);
        add(Priceofunit);
        add(QuantityLabel);
        add(Quant);
        add(ok);
        add(cancel);
        
        pack();
    }

    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getUnitPrice() {
        return Priceofunit;
    }

    public JTextField getQuantity() {
        return Quant;
    }
    
}
