/*
 * ==========================================
 * JAVA ACCESS MODIFIERS SUMMARY:
 * ==========================================
 * Modifier    | Same Class | Same Package | Subclass (diff pkg) | World (outside pkg)
 * --------------------------------------------------------------------------------
 * private     |    YES     |      NO      |        NO           |        NO
 * default     |    YES     |     YES      |        NO           |        NO
 * protected   |    YES     |     YES      |       YES           |        NO
 * public      |    YES     |     YES      |       YES           |       YES
 * ==========================================
 */

public class A01_AccessModifier {
  public static void main(String[] args) {
    BankAccount ac = new BankAccount();

    // 1. PUBLIC: Accessible directly from anywhere
    ac.username = "Danishkhan";
    System.out.println("Public username: " + ac.username);

    // 2. DEFAULT: Accessible because A01_AccessModifier is in the same package
    ac.accountType = "Savings";
    System.out.println("Default accountType: " + ac.accountType);

    // 3. PROTECTED: Accessible in the same package (and by subclasses)
    ac.balance = 50000.0;
    System.out.println("Protected balance: " + ac.balance);

    // 4. PRIVATE: Cannot be accessed directly from outside the BankAccount class!
    // ac.password = "khan"; //  COMPILE ERROR: password has private access in BankAccount

    // To access or modify private fields, we use public getter/setter methods (Encapsulation):
    ac.setPassword("khan");
    System.out.println("Private password (via getter): " + ac.getPassword());
  }
}

class BankAccount {
  // 1. PUBLIC: Accessible from any class anywhere
  public String username;

  // 2. DEFAULT (no keyword): Accessible only within the same package
  String accountType;

  // 3. PROTECTED: Accessible within the same package and by subclasses in other packages
  protected double balance;

  // 4. PRIVATE: Accessible ONLY inside this BankAccount class
  private String password;

  // Setter: Allows controlled modification of private field
  public void setPassword(String password) {
    this.password = password; // 'this.password' refers to the class variable
  }

  // Getter: Allows controlled reading of private field
  public String getPassword() {
    return this.password;
  }
}
