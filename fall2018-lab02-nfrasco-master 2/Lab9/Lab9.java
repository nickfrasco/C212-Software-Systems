import java.awt.event.*;
import javax.swing.*;

class Lab9 extends JFrame implements ActionListener, KeyListener {
  public void keyPressed (KeyEvent e) { }
  public void keyReleased(KeyEvent e) { }
  public void keyTyped   (KeyEvent e) {
    System.out.println(" kieo;wry34rt ");
    TotalTextField.setText("");
  }
  JTextField IPCTextField, CPSTextField, TotalTextField;
  JLabel CartonsPerShipment, totalLabel, ItemsPerCarton;
  
  public void actionPerformed(ActionEvent e) {
    //System.out.println( e );
    //totalLabel.setText( "" + Double.parseDouble( IPCTextField.getText() ));
    TotalTextField.setText("" + Double.parseDouble( IPCTextField.getText() ) * Double.parseDouble( CPSTextField.getText() ) );
    totalLabel.setText("Total: ");
  }
  //JTextField IPCTextField, CPSTextField, TotalTextField;
  //JLabel CartonsPerShipment, totalLabel, ItemsPerCarton;
  Lab9() {
    JButton action;
    JPanel panel = new JPanel();
    panel.setLayout( null );
    
    CartonsPerShipment = new JLabel("Cartons Per Shipment: ");
    ItemsPerCarton = new JLabel("Items Per Carton: ");
    CartonsPerShipment.setBounds(30, 30, 150, 20);
    ItemsPerCarton.setBounds(30,50,140,40);
    panel.add(CartonsPerShipment);
    panel.add(ItemsPerCarton);
    
    IPCTextField = new JTextField();
    //  numberTextField.setPreferredSize( new Dimension(60,20));
    IPCTextField.setBounds(165, 61, 50, 20);
    IPCTextField.addKeyListener( this );
    panel.add(IPCTextField);
    
    CPSTextField = new JTextField();
    CPSTextField.setBounds(165,32,50,20);
    CPSTextField.addKeyListener( this );
    panel.add(CPSTextField);
    
    TotalTextField = new JTextField();
    TotalTextField.setBounds(265,32,60,20);    //
    panel.add(TotalTextField);
    
    action = new JButton( "Calculate" );
    action.setBounds(225, 61, 100, 20);
    panel.add( action );
    action.addActionListener( this );
    action.addActionListener ( this );
    
    totalLabel = new JLabel( "Total: " );
    totalLabel.setBounds(225, 30, 160, 20);                    
    panel.add(totalLabel);
    
    this.add(panel);
    this.setSize(400, 200);
    this.setVisible(true);
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
  public static void main(String[] args) {
    Lab9 frame = new Lab9();
  }
}