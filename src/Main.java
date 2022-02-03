public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        // Входные данные
        int currentBalance = 100; // Текущий баланс
        int amountCredited = 1100; // Зачисленная сумма
        int bonusCost = 100; // Количество рублей за 1 бонусный рубль
        int minimumBonusAmount = 1000; // Сумма, свыше которой начисляются бонусы

        // Рассчет
        int bonus = amountCredited > minimumBonusAmount ? amountCredited / bonusCost : 0;
        int balance = currentBalance + amountCredited + bonus;
        System.out.println("Баланс вашего счета составляет " + balance +" рублей");
    }
}
