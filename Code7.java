public class GenericSwap {
   
    public static <T> void swap(T[] array) {
        if (array == null || array.length < 2) {
            return; 
        }
        
    
        T temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        
        swap(intArray);         
        System.out.println("\nAfter swap: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }


        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("\n\nBefore swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        
        swap(strArray); 
        System.out.println("\nAfter swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}