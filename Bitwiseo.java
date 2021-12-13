class Bitwiseo
{
  public static void main(String[] args) {
    int r=(7&3);int x=1;
    boolean y=(true && false);
    System.out.format("%d",r);
    System.out.println();
    System.out.format("%b",y);
    System.out.println();
    System.out.println((x>1)&(x++<10));
    System.out.println("x="+x);
    x=1;
    System.out.println((1>x)&&(1>x++));
    System.out.println("x="+x);
    x=1;
    System.out.println((1==x)|(10>x++));
    System.out.println("x="+x);
    x=1;
    System.out.println((1==x)||(10>x++));
    System.out.println("x="+x);
  }
}
