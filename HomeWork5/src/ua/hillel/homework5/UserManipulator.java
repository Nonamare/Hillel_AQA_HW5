package ua.hillel.homework5;

public class UserManipulator {

    private static void printUserInfo(User user) {
        System.out.println("User " + user.userName + " info:");
        if (user.email.isEmpty()) {
            System.out.println("- E-mail: not set");
        } else {
            System.out.println("- E-mail: " + user.email);
        }
        try {
            System.out.println("- Age: " + user.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("- Age: Undefined");
        }
        try {
            System.out.println("- Password: " + user.getPassword());
        } catch (IllegalArgumentException e) {
            System.out.println("- Password: Undefined");
        }
        System.out.println("- Active: " + user.isActive);
        System.out.println("- All purchases: " + user.amountSpentMoney + " BTC");
        System.out.println("\n");
    }

    public static void runManipulations() {
        User user1 = new User("Oleksii", "qwerty");
        User user2 = new User("Yelizaveta");
        User user3 = new User();

        /*
            Prepare user2:
            - age = explicitly set (20)
            - email - doesn't set;
            - userName - explicitly set (Oleksii)
            - isActive = default (true);
            - e-mail - explicitly set
            - password - explicitly set
        */
        user1.email = "user1@gmail.com";
        user1.setAge(20);

        /*
            Prepare user2:
            - age = explicitly set (86);
            - email - not set;
            - userName - explicitly set (Yelizaveta)
            - isActive = default (true);
            - e-mail - not set (empty)
            - password - default
        */
        user2.setAge(86);
        user2.setPassword("zxcvbn123");
        try {
            user2.setPassword("short");
        } catch (IllegalArgumentException e) {
            System.out.println(user2.userName + ": " + e.getMessage());
        }

        /*
            Prepare user3:
            - age = not set
            - email - not set;
            - userName - default (GUID)
            - isActive = explicitly set (false);
            - e-mail - not set (empty)
            - password - default
        */
        user3.isActive = false;

        // Everything is ready
        user1.makePurchase(5);
        user1.makePurchase(3.5);
        user1.printTotalAmountOfSpentMoney();
        user1.addDiscount(20);
        user1.printTotalAmountOfSpentMoney();

        user2.makePurchase(0);
        user2.makePurchase(5);
        user2.makePurchase(-10);
        user2.printTotalAmountOfSpentMoney();
        user2.addDiscount(-1);
        user2.addDiscount(120);
        user2.printTotalAmountOfSpentMoney();


        user3.makePurchase(100);
        user3.printTotalAmountOfSpentMoney();


        // Print all users info
        System.out.println("\nNow all user's info:\n");
        printUserInfo(user1);
        printUserInfo(user2);
        printUserInfo(user3);
    }
}
