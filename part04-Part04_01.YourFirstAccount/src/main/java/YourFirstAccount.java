
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account aliciaAccount = new Account("Alicia", 100.0);
        
        aliciaAccount.deposit(20.0);
        
        System.out.println(aliciaAccount);
        
    }
}
