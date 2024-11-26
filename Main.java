import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    //creates scanners
    Scanner reader = new Scanner(System.in);
    Scanner pricereader = new Scanner(System.in);

    //creates objects
    Backend backEnd = new Backend();
    Converter converter = new Converter();

    backEnd.clear();
    //prints welcome message
    System.out.println(
        "\u001B[35m\tWelcome to Exchange for Change currency converter. \u001B[1m\u001B[37m\nThe current exchange rate between USD and Euro is: 1 USD = 0.90 Euro\n");

    while (true) {
      //main menu
      System.out.println("\u001B[34m\tMain menu" +
          "\n1.Euro to USD" +
          "\n2.USD to Euro" +
          "\nEnter \"q\" in this menu to exit program");

      //input for main menu
      System.out.print("\u001B[93m\nPlease enter an option:\n");
      String mminput = reader.next();

      backEnd.clear();

      //ends program if the input is q
      if (mminput.contains("q") || mminput.contains("Q")) {
        backEnd.quit();
      } // end if
      else {
        //if its not q then the rest of the program will run
        //changes input from string to integer
        int optionint = backEnd.parseint(mminput);
        //switch for the input
        switch (optionint) {
          case 1:
            etouloop: 
            while (true) {
              
              backEnd.clear();

//prompts the user to enter the amount they want to convert
              System.out.println("\u001B[36m\tEuro to USD\n\n" +
                  "Please enter amount you want to convert:");
              double currency = pricereader.nextDouble();
              converter.input(currency);

              System.out.println("\n\tEuro: " + "€ "  + currency + "\n" +
                  "\tUSD: " + "$ " + converter.eurotousd());
             //asks user if they want to convert euro to usd again
              System.out.println("\u001B[33m\nConvert Euro to USD again? (y/n)");
              //turns input into character to be used in switch
              char goback = reader.next().charAt(0);

              //checks input
              switch (goback) {
                case 'y':
                case 'Y':
                  backEnd.clear();
                  continue;
                case 'n':
                case 'N':
                  backEnd.clear();
                  break etouloop;

                default:
                  //the default method resets the question if the user input is anything other than what is provided 
                  backEnd.clear();
                  continue;
              }// end switch

            } // end while loop
            break;
          case 2:

            utoeloop: while (true) {
              backEnd.clear();
              System.out.println("\u001B[36m\tUSD to Euro\n\n" +
                  "Please enter amount you want to convert:");
              double currency = pricereader.nextDouble();
              converter.input(currency);

              System.out.println("\n\tUSD: " + "$ "  + currency + "\n" +
                  "\tEuro: " + "€ " + converter.usdtoeuro());
              System.out.println("\u001B[33m\nConvert USD to Euro again? (y/n)");
              char goback = reader.next().charAt(0);

              switch (goback) {
                case 'y':
                case 'Y':
                  backEnd.clear();
                  continue;
                case 'n':
                case 'N':
                  backEnd.clear();
                  break utoeloop;

                default:
                  //the default method resets the question if the user input is anything other than what is provided 
                  backEnd.clear();
                  continue;
              }// end switch

            } // end while loop
            break;

          default:
            //if the input is not one that is listed the question will be asked again
            backEnd.clear();
            
            continue;
        }// end switch
      } // end switch
    } // end while loop
  }// end main method
}// end main class