public class Main {
    public static void main(String[] args) {

        String[][] ar = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},{"1", "2", "3", "4"},{"1", "2", "3", "4"}};
        String[][] ar2 = new String[][]{{"1", "2", "3"}, {"1", "2", "3", "4"},{"1", "2", "3", "4"},{"1", "2", "3", "4"}};
        String[][] ar3 = new String[][]{{"1", "2", "l", "4"}, {"1", "2", "3", "4"},{"1", "2", "3", "4"},{"1", "2", "3", "4"}};


        try {
            System.out.println(calculate(ar));
        }catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e);
        }

        try {
            System.out.println(calculate(ar2));
        }catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e);
        }

        try {
            System.out.println(calculate(ar3));
        }catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e);
        }


    }


    public static void checkArraySize(String[][] matrixA) {

        int a = matrixA.length;
        if (a == 4) {
            for (int i = 0; i < matrixA.length; i++) {
                int curLen = matrixA[i].length;
                if (curLen != 4) {
                    throw new MyArraySizeException("Размер матрицы, полученной из строки, не равен 4x4");
                }
            }
        } else {
            throw new MyArraySizeException("Размер матрицы, полученной из строки, не равен 4x4");
        }

    }

    static double calculate(String[][] s) {
       checkArraySize(s);
        int sum = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {

                try {
                    sum += Integer.parseInt(s[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В "+ i + ", " + j + " ячейке полученной матрицы не число");
                }

            }
        }

        return sum;

    }
}
