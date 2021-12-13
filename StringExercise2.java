import javax.swing.JOptionPane;
class StringExercise2
{
  public static void main(String[] args)
  {
    String s;
    s=JOptionPane.showInputDialog(null,"Enter first and last name");
    int a=s.indexOf(" ");
    int b=s.length();
    String s1=s.substring(0,a);
    String s2=s.substring(a,b);
    JOptionPane.showMessageDialog(null, "Dear"+" "+s1+
    ",\nI am so glad we are on first name basis"+
    "\nI want to invite the entire"+" "+s2+
    "\nfamily for party today."+
    "\nPlease confirm at 9888776655.");
  }
}
