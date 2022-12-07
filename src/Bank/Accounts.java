
package Bank;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Accounts {

    Map<Integer, Integer> userAccounts = new HashMap<Integer, Integer>();

    public void CreateAccount() {
        Random randomInt = new Random();
        int accountNumber = 1000000 + randomInt.nextInt(99999999);
        int accountPinNumber = 1000 + randomInt.nextInt(9999);
        userAccounts.put(accountNumber, accountPinNumber);
        System.out.println(String.format("New account created!\n" +
                "Account Number: %s\n" +
                "Pin Number: %s", accountNumber, accountPinNumber));
    }

}