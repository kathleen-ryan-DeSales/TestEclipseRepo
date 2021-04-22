package subscription;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**Code based on Anthony Hessler's submission*/

public class Driver
{

	public static void main(String[] args) 
	{
		Child c = new Child();
		
		c.interfaceMethod();
		c.silly();
		
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime then = now.plusDays(14);
		
		if (now.isAfter(then))
			System.out.println(now + " is later.");
		else
			System.out.println(now + " is earlier.");
	}

}
