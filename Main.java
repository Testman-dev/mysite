class Main {
  public static void main(String[] args) {
    // •Ï”numbers‚ÉA—^‚¦‚ç‚ê‚½”š‚Ì”z—ñ‚ğ‘ã“ü‚µ‚Ä‚­‚¾‚³‚¢
    
    int[] numbers={1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // for•¶‚ğ—p‚¢‚ÄA”z—ñnumbers‚Ì‹ô”‚Ì˜a‚ÆŠï”‚Ì˜a‚ğ‹‚ß‚Ä‚­‚¾‚³‚¢
    for (int number : numbers) {
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
    }

    System.out.println("Šï”‚Ì˜a‚Í" + oddSum + "‚Å‚·");
    System.out.println("‹ô”‚Ì˜a‚Í" + evenSum + "‚Å‚·");
  }
}