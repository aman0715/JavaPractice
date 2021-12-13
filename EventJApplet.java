import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
public class EventJApplet extends JApplet implements ActionListener
{
  JButton b;
  JTextField tf;
  public void init()
  {
    tf=new JTextField();
    tf.setBounds(30,40,150,20);
    b=new JButton("Click");
    b.setBounds(80,150,70,40);
    add(b);
    add(tf);
    b.addActionListener(this);
    setLayout(null);
  }
  public void actionPerformed(ActionEvent e)
  {
    tf.setText("Welcome EIE");
  }
}


/*Constructor                                             Description
JDialog()                                               It is used to create a modeless dialog without a title and without a specified Frame owner
JDialog(Frame owner)                                    It is used to create a modeless dialog without a title and without a specified Frame owner and an empty title
JDialog(Frame owner,String title,boolean method)        It is used to create a dialog with specified title,owner Frame and modality*/
