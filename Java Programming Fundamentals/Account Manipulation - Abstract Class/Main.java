public class Main{
    
    public static void main(String args[]){
        Customer cust = new Customer(134, "Chayan", "chazra@coemail.com");
        SavingsAccount sva = new SavingsAccount(1001, cust, 10000, 500);
        
        if(sva.withdraw(7000)) {
            System.out.println(sva.getBalance());
        }
    }
}
