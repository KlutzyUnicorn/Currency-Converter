public class Converter {
  double input;

  //This method initializes the variable amount, which will be used later on to collect user input.
  public void input(double amount) {
    input = amount;
  }// end converter method

  //this is a method. when called it does something. in this case, it takes the user input and multiplies it by 1.09, which is the exchange rate for Euro to USD.
  public double eurotousd() {
    double eurotousdtemp = input * 1.09;
    double eurotousd = (double) Math.round(eurotousdtemp * 100) / 100;
    return eurotousd;
  }// end euro to usd converter method

  //this is a method. when called it does something. in this case, it takes the user input and multiplies it by 0.92, which is the exchange rate for USD to Euro.
  public double usdtoeuro() {
    double usdtoeurotemp = input * 0.92;
    double usdtoeuro = (double) Math.round(usdtoeurotemp * 100) / 100;
    return usdtoeuro;
  }// end usd to euro converter method

}// end Converter class
