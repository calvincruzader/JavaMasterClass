class SumDigits { 

  public static void main(String[] args) { 
    int[] testCases = new int[]{152,-154,7, 95738336};
    for(int testCase : testCases)  {
      System.out.println("Sum of digits of " + testCase + " is: " + sumDigits(testCase));
    }
  }

  public static int sumDigits(int n) { 
    if(n < 10) return -1;

    int output = 0;

    while(n > 0) { 
      output += n % 10; 
      n /= 10;
    }

    return output;
  }
}