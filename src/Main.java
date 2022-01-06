public class Main {
    public static void main(String[] args) {

      int currentAccount = 100;
      int SummRefill = 1100;
      int bonus = SummRefill/100;
      if (SummRefill < 1000) {
        System.out.println((currentAccount+SummRefill) + " рублей");
    } else
    { System.out.println((currentAccount+bonus+SummRefill) + " рублей");
      }
    }
}
