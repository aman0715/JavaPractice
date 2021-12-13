import javax.swing.JOptionPane;
class StringExercise
{
  public static void main(String[] args)
  {
    String s;
    String s1="Hello";
    s=JOptionPane.showInputDialog(null, "Enter Hello and 2 words");
    int a=s.indexOf(s1);
    if(a>=0)
    JOptionPane.showMessageDialog(null,"Hello found at "+a);
    else
    JOptionPane.showMessageDialog(null,"Hello not found");
  }
}
