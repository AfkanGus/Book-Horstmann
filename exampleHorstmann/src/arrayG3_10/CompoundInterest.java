package arrayG3_10;

import java.util.Arrays;


public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 3.4;
        final int nrates = 1;
        final int nyears = 1;
        /*Устанавить процентные ставки*/
        double[] interestRate = new double[nrates];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        /*Остаток на счету ежегодно */
        double[][] balances = new double[nyears][nrates];
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 500000;


        /*Расчет процентов на следующий год*/
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                /*получить остаток на счету за прошлый год*/
                double oldBalance = balances[i - 1][j];
                /* расчитат проценты*/
                double interest = oldBalance * interestRate[j];
                /*расчитать остаток на считу в текущем году*/
                balances[i][j] = oldBalance + interest;
            }
        }
// ввывести один ряд процентных ставок
        for (int j = 0; j < interestRate.length; j++)
            System.out.println(100 * interestRate[j]);
        System.out.println();
//вывести таблицн остатков на счету
        for (double[] row : balances) {
            for (double b :
                    row)
                System.out.println(b);
            System.out.println();

        }
    }
}

