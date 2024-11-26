public class Backend {
  int output;

  public void clear() {
    // clears the console
    System.out.print("\033[H\033[2J");
  }// end clear method

  public int parseint(String input) {
    // changes user input into an integer
    try {
      output = Integer.parseInt(input);
    } // end try
    catch (NumberFormatException ex) {
      Thread.currentThread().interrupt();
    } // end catch
    return output;
  }// end parseint method

  public void quit() {
    // ends the program and prints out message
    System.out.println("Thank you for using Exhange for Change :)");
    System.exit(0);
  }// end quit method
}// end backend class