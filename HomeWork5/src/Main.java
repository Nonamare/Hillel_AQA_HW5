import ua.hillel.homework5.Calculator;
import ua.hillel.homework5.UserManipulator;

/*
1. Створити клас User, у якого будуть:

- поля userName, age, email, password, isActive(boolean), amountSpentMoney.
    password та age повинні мати модифікатор доступу private.
    Зробити геттери і сеттери з валідацією для private полів(валідація довільна).

- методи: makePurchase, який приймає параметр purchasePrice(вартість покупки) типу double,
    і виводить на яку суму була здійснена покупка та додає цю вартість до глобальної змінної amountSpentMoney.

printTotalAmountOfSpentMoney, який виводить загальну суму витрачених грошей.

-конструктори: дефолтний; конструктор який приймає userName та контруктор який приймає userName та password.



Створити додатковий клас для перевірки функціональності класса User,
де треба створити декілька екземплярів класса User з різними значеннями,
повикликати методи, в кінці програми вивести суму витрачених грошей, кожного юзера та інформацію про нього



2.Створити класс Calculator, який буде мати статичні методи для базових арифметичних обчислень.
В классі Main, викликати методи классу Calculator, для перевірки
 */
public class Main {
    public static void main(String[] args) {
        // Task 1
        UserManipulator.runManipulations();

        // Task 2
        Calculator.addition(2, 3);
        Calculator.subtraction(2, 3);
        Calculator.multiplication(2, 3);
        Calculator.division(2, 3);
    }
}