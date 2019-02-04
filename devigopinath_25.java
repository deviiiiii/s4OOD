public class devigopinath_25{ 
      
    public static void main(String args[]) 
    { 
        int num = 6; 
      
        printdiamond(num); 
    } 
      
    static void printdiamond(int num) 
    { 
        int i, j, space, n = 0; 
      
        for (i = 1; i <= num; i++) { 
  
            for (j = 1; j <= num - i; j++) 
            { 
                System.out.print(" "); 
            } 
    
            while (n != (2 * i - 1)) { 
                if (n == 0 || n == 2 * i - 2) 
                    System.out.print("111"); 
                else
                    System.out.print(" "); 
                n++; 
            } 
            n = 0; 
      
            System.out.println(); 
        } 
        num--; 
       

        for (i = num; i >= 1; i--) { 
      
            
            for (j = 0; j <= num - i; j++) 
            { 
                System.out.print(" "); 
            } 
      
           
            n = 0; 
            while (n != (2 * i - 1)) { 
                if (n == 0 || n == 2 * i - 2) 
                    System.out.print("111"); 
                else
                    System.out.print(" "); 
                n++; 
            } 
            System.out.println(); 

        } 
    } 
} 
