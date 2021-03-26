package oop;

public class Reduce {
    private int[][] array;

    public void to(int[][] array) {
        this.array = array;
    }

    public void print() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0)
                    System.out.println(array[i][j]);
            }
        }
    }


    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
