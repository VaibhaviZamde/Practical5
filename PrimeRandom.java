class PrimeRandom
{
	public static void main(String args[])
	{
		PrimeRandom s = new PrimeRandom();
		
		//int arr[] = {10 , 5, 4, 6,3},
		int primecount = 0;
		int nonprimecount = 0;
		
		int[] randomNumbers = new int[1000000];

		for (int i = 0; i <randomNumbers.length; i++) 
		{
		    long nanoTime = System.nanoTime();
		    randomNumbers[i] = generateRandomNumber(nanoTime);
		}

		//for (int i = 0; i < randomNumbers.length; i++) 
		//{
		  //  System.out.println(randomNumbers[i]);
		//}
		
		for(int num : randomNumbers)
		{
			if(s.identifierPrimeNonprime1(num))
				primecount++;	
			else
				nonprimecount++;	
		}
		System.out.println(primecount);
		System.out.println(nonprimecount);
		
		
		primecount = 0;
		nonprimecount = 0;
		
		
		for(int num : randomNumbers)
		{
			if(s.identifierPrimeNonprime2(num))
				primecount++;	
			else
				nonprimecount++;	
		}
		System.out.println(primecount);
		System.out.println(nonprimecount);
	}
	
	public boolean identifierPrimeNonprime1(int num) 
	{
		if (num < 2) 
		{
			return false;
		}

		for (int i = 2; i * i <= num; i++) 
		{
			    if (num % i == 0) 
			    {
				return false;
			    }
		}
		return true;
    	}
    	
    	public boolean identifierPrimeNonprime2(int num) 
	{
		if (num < 2) 
		{
			return false;
		}

		for (int i = 2; i * i <= num; i++) 
		{
			    if (num % i == 0) 
			    {
				return true;
			    }
		}
		return false;
    	}
    	
    	 public static int generateRandomNumber(long nano) 
    	 {
        	int randomNumber = (int) (nano % 10000000);
        	return randomNumber;
    } 
}
