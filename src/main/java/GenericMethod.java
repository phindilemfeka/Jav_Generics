public class GenericMethod {
    public static <E> void printArrayContent(E[]array){

        for (E element:array){
            System.out.print(element+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4,5};
        String[] words={"My","Name","Is","Phindile"};

        printArrayContent(numbers);
        printArrayContent(words);
    }
}
