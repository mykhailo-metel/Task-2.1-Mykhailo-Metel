package Arrays;

/**
 * Created by fluent on 31.01.2017.
 */
public class array_actions {
//            •	sum(int array[]), sum(double[])
//            •	min(int array[]), min(double[])
//            •	max(int array[]), max(double[])
//            •	maxPositive(int array[]), maxPositive(double array[]),
//            •	multiplication  (int array[]), multiplication (double[])
//            •	modulus(int array[]), modulus(double[])
//            •	secondLargest(int array[]), secondLargest(double[])
    public static int[] MyIntArray;
    public static double[] MyDoubleArray;

    public static void ArrayIntInit(){
        MyIntArray = new int[]{
                15,
                6,
                10,
                125,
                358,
                55,
                0,
                3258,
                -125,
                10};
        for (int i = 0; i < MyIntArray.length; i++) {
            System.out.println(MyIntArray[i]);
        }
    }
    public static int sum(int array[]){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("Sum of given array is "+sum);
        return sum;
    }
    public static int min(int array[]){
        int minimum=array[0];
        for (int i = 0; i < array.length; i++) {
            if(minimum >array[i])minimum=array[i];
        }
        System.out.println("Minimum value of array is "+minimum);

        return minimum;
    }
    public static int max(int array[]){
        int maximum=array[0];
        for (int i = 0; i < array.length; i++) {
            if(maximum <array[i])maximum=array[i];
        }
        System.out.println("Maximum value of array is "+maximum);

        return maximum;
    }
    public static int maxPositive(int array[]){
        int max_positive=0;

        for (int i = 0; i < array.length; i++) {
            if(max_positive <array[i] && array[i]>=0)max_positive=array[i];
        }
        System.out.println("Max positive value of array is "+max_positive);

        return max_positive;
    }
    public static int multiplication(int array[]){
        int multip=1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0)multip*=array[i];
        }
        System.out.println("Result of all non zero elements multiplication is "+multip);
        return multip;
    }
    public static int modulus(int array[]){
        int mod=0;
        System.out.println("Method for returning of division remain of first and last element.");
        if(array[0]>=array[array.length-1])mod=array[0]%array[array.length-1];
        else System.out.println("First element is less than last. Cant proceed operation... Sorry");

        System.out.println("Modulus of " + array[0] + " and "+ array[array.length-1]+ " is: " +mod);

        return mod;
    }
    public static int secondLargest(int array[]){
            int firstmax=max(MyIntArray);
            int SecondMax=min(MyIntArray);

        for (int i = 0; i < array.length; i++) {
            if(SecondMax <array[i] && array[i]<firstmax)SecondMax=array[i];
        }
        System.out.println("SecondMax value of array is "+SecondMax);

        return SecondMax;
    }
    
    public static void main(String[] args) {
        ArrayIntInit();                     // Инициализация массива значениями
        int summa=sum(MyIntArray);
        System.out.println("Сумма масива: " + summa);
        
        int minval=min(MyIntArray);
        System.out.println("Минимальное значение массива: " + minval);
        
        int maxval=max(MyIntArray);
        System.out.println("Максимальное значение массива:" + maxval);

        int maxpos=maxPositive(MyIntArray);
        System.out.println("Максимальное положительное значение массива:" +maxpos);

        int multip=multiplication(MyIntArray);
        System.out.println("Результат перемножения всех ненулевых элементов массива: "+multip);

        int modul=modulus(MyIntArray);
        System.out.println("Остаток от деления первого элемента массива на последний: "+ modul);

        int secondmax=secondLargest(MyIntArray);
        System.out.println("Второе по величине число массива: "+secondmax);


    }
}
