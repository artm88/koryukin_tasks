public class task_1 {
    /*public  static void main(String[] args){
       int[] array={1,3,5,7,2};
       System.out.println(foundOfMaxInArray(array));
       //int min -> Math.max(array[0],array[1]);

   public static int foundOfMax (int a, int b){
           if (a >= b) {
               return a;
           } else {
               return b;
           }
       }
   public static int foundOfMaxInArray (int... numbers){

           int max;
           for (int i = 1; i < array.length; i++) {
               max = foundOfMax(numbers[i - 1], numbers[i]);
               array[i] = max;
           }
           return max;
       }
   }*/
    public static void main(String[] args) {
        int[] array={5,3,6,1,4};
        System.out.println(findOfMaxNumberFull(array));
        System.out.println(findOfMinNumberFull(array));
        System.out.println(findOfAverageNumberFull(array));
    }
    private static int findOfMaxNumber (int a, int b) { // вычисление максимального из двух чисел
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    private  static int findOfMaxNumberFull (int... numbers) { // вычисление максимального из массива чисел
        int previousInt=numbers[0];
        for ( int i=1;i<numbers.length; i+=1 ){
            previousInt=findOfMaxNumber(previousInt,numbers[i]); // использует метод вычисления максимального из двух чисел
        }
        return previousInt;
    }
    private static int findOfMinNumber (int a, int b) { // вычисление максимального из двух чисел
        if (a<b) {
            return a;
        }
        else {
            return b;
        }
    }
    private  static int findOfMinNumberFull (int... numbers) { // вычисление максимального из массива чисел
        int previousInt=numbers[0];
        for ( int i=1;i<numbers.length; i+=1 ){
            previousInt=findOfMinNumber(previousInt,numbers[i]); // использует метод вычисления максимального из двух чисел
        }
        return previousInt;
    }
    private static int findOfAverage (int a, int b, int c) {
        if (a>b & a<c) {
            return a;
        }
        else if (b>a & b<c) {
            return b;
        }
        else {
            return c;
        }
    }
    private  static int findOfAverageNumberFull (int... numbers) { // вычисление максимального из массива чисел

        int previousInt=numbers[0];
        for ( int i=2;i<numbers.length; i+=2 ){
            previousInt=findOfAverage(previousInt,numbers[i-1],numbers[i]); // использует метод вычисления максимального из двух чисел
        }
        return previousInt;
    }
}
