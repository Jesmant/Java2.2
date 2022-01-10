public class Main {
    public static void main(String[] args) {
        int depositAmount = 1100;
        int bonus = depositAmount > 1000 ? depositAmount / 100 : 0;
        int accountBefore = 100;
        int account = depositAmount + accountBefore + bonus;
        System.out.println("Бонус:" + bonus);
        System.out.println("Баланс:" + account);
    }
}
