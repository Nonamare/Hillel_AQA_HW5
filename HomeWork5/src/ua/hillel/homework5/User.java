package ua.hillel.homework5;

public class User {
    // поля userName, age, email, password, isActive(boolean), amountSpentMoney. password та age
    // повинні мати модифікатор доступу private.
    // Зробити геттери і сеттери з валідацією для private полів(валідація довільна).
    private static final String defaultPassword = "123456";
    private int age;
    private String password;

    public String userName;
    public String email;
    public boolean isActive;
    public double amountSpentMoney;

    private void setInitialValues(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.age = 0;
        this.email = "";
        this.amountSpentMoney = 0;
        this.isActive = true;
    }

    // Age Setter
    public void setAge(int age) throws IllegalArgumentException {
        if ((age < 18) || (age > 100)) {
            throw new IllegalArgumentException("Age must be between 18 and 100");
        }
        this.age = age;
    }

    // Age Getter
    public int getAge() throws IllegalArgumentException {
        if (age == 0) {
            throw new IllegalArgumentException("Please specify user's age before retrieving it");
        }
        return age;
    }

    // Password Setter
    public void setPassword(String password) throws IllegalArgumentException {
        // Password must be longer than 6 chars
        if (password.trim().length() < 6) {
            throw new IllegalArgumentException("Password must have at least 6 characters");
        }

        this.password = password;
    }

    // Password Getter
    public String getPassword() throws IllegalArgumentException {
        if (password.length() == 0) {
            throw new IllegalArgumentException("Please specify user's password before retrieving it");
        }
        return password;
    }

    // Calculates discount for the total sum

    /**
     * @param discount - 0-100%
     */
    public void addDiscount(int discount) {
        if ((discount < 0) || (discount > 100))
            System.out.println(userName + "! We don't believe we can give discount less than 0% and more than 100% - " + discount);
        amountSpentMoney = amountSpentMoney * ((double) (100 - discount) / 100);
    }

    public void makePurchase(double amount) {
        if (!isActive) {
            System.out.println(userName + ": we believe that inactive users do not try to make a purchase. Most probably they even do not breath. Probably...");
            return;
        }

        if (amount <= 0) {
            System.out.println(userName + " - nice try! But no. Amount: " + amount);
            return;
        }

        System.out.println("Another beautiful purchase of user " + userName + " for " + amount + " BTC");
        this.amountSpentMoney += amount;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Total amount of purchases for user " + userName + " is " + amountSpentMoney + " BTC");
    }

    /*
        Constructors section
     */
    public User() {
        String username = java.util.UUID.randomUUID().toString();
        setInitialValues(username, defaultPassword);
    }

    public User(String username) {
        setInitialValues(username, defaultPassword);
    }

    public User(String username, String password) {
        setInitialValues(username, password);
    }
    // ======= End of Constructors section ========
}
