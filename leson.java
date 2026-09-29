public class leson {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 1;
        int b = 5;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 6;
        if(value > 1){
            System.out.println("Красный");
        } else if (0 < value && value < 101) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 1;
        int b = 5;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void printSign(int number){
        if(number >= 0 ){
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }
    public static boolean isNegative(int number){
        return number < 0;
    }
    public static void printStringTimes(String str, int times){
        for (int i = 0; i < times; i++){
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        // вывод для проверки
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // вывод
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void multiplyLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        // вывод
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void fillDiagonals() {
        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;                 // главная диагональ
            matrix[i][size - 1 - i] = 1;      // побочная диагональ
        }

        // вывод
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(isSumInRange(1, 10));

        printSign(0);

        System.out.println(isNegative(1));

        printStringTimes("Hello", 3);

        System.out.println(isLeapYear(2024));

        invertArray();

        fillArray();

        multiplyLessThanSix();

        fillDiagonals();

        int[] arr = createArray(5, 7);
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
}
