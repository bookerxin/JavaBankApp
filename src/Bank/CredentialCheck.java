
package Bank;

import Bank.Accounts;

import javax.print.StreamPrintService;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.Stream;

public class CredentialCheck {

    boolean verified = false;

    public void okay() {
        System.out.println("Okay, alrighty then.");
    }

    public void userLogin() {
        Scanner readInput = new Scanner(System.in);
        Accounts bankAccounts = new Accounts();
        Map<Integer, Integer> userAccountDetails = new HashMap<>();
        Iterator<Map.Entry<Integer, Integer> > accountsIterator = bankAccounts.userAccounts.entrySet().iterator();

        // Check input account number exists, and is within parameters.
        // Check if its exists in Accounts.

        while (!verified) {
            System.out.print("Account number: ");
            int enteredAccountNumber = readInput.nextInt();

            System.out.print("Account Pin number: ");
            int enteredAccountPin = readInput.nextInt();

            userAccountDetails.put(enteredAccountNumber, enteredAccountPin);

            while (accountsIterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = accountsIterator.next();

                // Check is userAccountDetails entry is equal.
            }

//            Stream.of(userAccountDetails).forEach(System.out::println);
        }
    }
}