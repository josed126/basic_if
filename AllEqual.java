// Example of if statement use : 3-sort
// Reads three integers from the command line, then prints them out in numerical order.

public class AllEqual
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);

	if (a == b && a == c && b == c) {
		 System.out.println("equal");}
	else {
		 System.out.println("not equal");
}

}  
    
}
