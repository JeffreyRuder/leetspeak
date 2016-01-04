public class Leetspeak {
  public static void main(String[] args) {

  }

  public String leetspeak (String inputString) {
    String outputString = new String();
    outputString = inputString.replace('e', '3');
    outputString = outputString.replace('o', '0');
    outputString = outputString.replace('I', '1');
    outputString = outputString.replace('s', 'z');
    return outputString;


  }



}
