public class DistinctValues
{
      public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
  if (a == b && a == c && c == b) {
        System.out.println("1");
    } else if (a != b && a != c && c != b) {
        System.out.println("3"); 
    } else  {
        System.out.println("2");
  	}
  }  
}
