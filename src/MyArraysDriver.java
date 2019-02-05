public class MyArraysDriver {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0]=2;
        numbers[1]=67;
        numbers[2]=4;

        System.out.println(MyArrays.insert(numbers,3,1,9));
        System.out.println(MyArrays.insert(numbers,4,10,9));
        System.out.println(MyArrays.remove(numbers,5,1));
    }
}
