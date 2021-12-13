class Sample
{
int x = 12 , y = 13, z = 17 ;
Sample( int x, int y, int z )
{
if ( x == 120 )
System.out.print ( fun ( ) ) ;
else
System.out.print ( fun1 ( ) ) ;
}
int fun ( )
{
return x * z * y / x ;
}
int fun1 ( )
{
return z * y * x / x ;
}
}
public class Sample1
{
public static void main (String [ ] args )
{
Sample sam = new Sample ( 120, 130, 170 ) ;
}
}
