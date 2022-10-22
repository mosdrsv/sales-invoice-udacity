
package Udacity.controller;

import Udacity.modle.LineTabel;
import Udacity.modle.HeadInvoice;
import Udacity.modle.Item;
import Udacity.view.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ahmed
 */
public class TableAction implements ListSelectionListener{
    private InvoiceFrame frame;

    public TableAction(InvoiceFrame frame) {
        this.frame = frame;
    }
    
/*when select an invoice from the header tabel this method finds out which invoice has been selected
    from the header tabel and gets its item lines and update the second table the item table
    */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int invoiceIndex = frame.getTableInvoiceHeader().getSelectedRow();
        if(invoiceIndex!= -1){
             HeadInvoice selectedRow = frame.getInvoices().get(invoiceIndex);
             ArrayList<Item> items = selectedRow.getItems();
             frame.getLabelCustomerName().setText(selectedRow.getName());
             frame.getLabelInvoiceNum().setText(""+selectedRow.getNum());
             frame.getLabelInvoiceDate().setText(selectedRow.getDate());
             frame.getLabelTostalCost().setText(""+selectedRow.getTotalInvoice());
             LineTabel line = new LineTabel(items);
             frame.getTableInvoiceLines().setModel(line);
             line.fireTableDataChanged();
             
        }
    }
    
}
