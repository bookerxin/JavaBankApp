
package Bank;
import Bank.CredentialCheck;
import Bank.Accounts;

public class Main {

    public static void main(String[] args) {

        CredentialCheck credentialCheck = new CredentialCheck();
        Accounts accounts = new Accounts();

        credentialCheck.okay();
        accounts.CreateAccount();

        System.out.println(accounts.userAccounts);

        credentialCheck.userLogin();

    }

}