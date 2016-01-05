public class Leetspeak {
  public static void main(String[] args) {

  }

  public String leetspeak (String inputString) {
    String outputString = new String();

    inputString = inputString.replace('I', '1');
    inputString = inputString.replace('e', '3');
    inputString = inputString.replace('E', '3');
    inputString = inputString.replace('o', '0');
    inputString = inputString.replace('O', '0');

    String[] stringArray = inputString.split(" ");

    for (int i = 0; i < stringArray.length; i++) {
      if (stringArray[i].startsWith("s") || stringArray[i].startsWith("S")) {
        String leaveFirstLetterOff = stringArray[i].substring(1);
        leaveFirstLetterOff = leaveFirstLetterOff.replace('s', 'z');
        leaveFirstLetterOff = leaveFirstLetterOff.replace('S', 'z');
        stringArray[i] = stringArray[i].substring(0, 1) + leaveFirstLetterOff;
      } else {
        stringArray[i] = stringArray[i].replace('s', 'z');
        stringArray[i] = stringArray[i].replace('S', 'z');
      }
    }

    outputString = String.join(" ", stringArray);

    return outputString;


  }



}
