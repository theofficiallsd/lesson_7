import java.util.Scanner;

public class SeminoleBank_B {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int repeat = 1;
    String san = "";
    double bal = 1000, dep, withd;
    char choice = ' ';
    
    System.out.println("******************************************************");
    System.out.println("\t\t\tWelcome to Seminole Bank!");
    System.out.println("******************************************************");
    
      while(repeat == 1)
      {
      System.out.print("\nPlease enter your 5-digit Seminole Account Number:");
      san = input.next();
      if(san.length() != 5)
      repeat = 1;
      else
      repeat = 0;
    }
    
    input.nextLine();
    repeat = 1;
    System.out.print("\nThank you!\n\n\n");
    
      do
      {
    
        System.out.print("Enter D for Deposit, W for Withdrawal, B for Balance and X for exit: ");
    
          choice = input.next().charAt(0);
          input.nextLine();
    
      if(Character.isLetter(choice) == true)
        {
          choice = Character.toUpperCase(choice);
      
          if(choice == 'D' || choice == 'W' || choice == 'B' || choice == 'X')
            {
        
        switch(choice){
    
    case 'D':
      {
        System.out.print("\nEnter the amount of the deposit: ");
        dep = input.nextDouble();
        input.nextLine();
        bal = bal + Math.abs(dep);
        System.out.print("\n");
        break;
      }
    case 'W':
      {
        System.out.print("\nEnter the amount of the withdrawal: ");
        withd = input.nextDouble();
        input.nextLine();
        bal = bal - Math.abs(withd);
        System.out.print("\n");
        break;
      }
    case 'B':
      {
        System.out.print("\nAccount number: " + san + " has a current balance of: ");
          System.out.printf("$%.2f", bal);
          System.out.print("\n\n");
          break;
      }
    case 'X':
    {
      System.out.println("\n\nThank you for being a loyal Seminole Bank customer!");
      repeat = 0;
      break;
    }
    
      }
      
    }
    else
    {
        System.out.print("\nERROR: ");  
    }
    
    }
    else
    {
        System.out.print("\nERROR: ");  
    }
    
    
    
    
    }while(repeat == 1);
    
    
    
  }
}