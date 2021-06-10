public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("WB2335", "Hero Glamour Plus", "2 wheeler", 80000);
        System.out.println(v.issueLoan());
        System.out.println(v.takeInsurance());
    }
}
