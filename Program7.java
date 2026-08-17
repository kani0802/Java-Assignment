public class Program7
{
	public static void main(String args[])
	{
		int number = 1;
        	int sum = 0;
        	while (number <= 50) 
		{
            		if (number % 2 == 0)
			 {
                		sum = sum + number;
           		 }
            		number++;
        	}

        	System.out.println("Sum of even numbers: " + sum);
    	}
}
