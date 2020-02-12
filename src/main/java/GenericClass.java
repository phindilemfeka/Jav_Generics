public class GenericClass<T> {
    private T Object;

    public void setObject(T Object){
        this.Object=Object;
    }

    public T getObject() {
        return Object;
    }

    public static void main(String[] args) {
        GenericClass<Integer>numbers=new GenericClass<>();
        numbers.setObject(2);
        System.out.println(numbers.getObject());

        GenericClass<String>words=new GenericClass<>();
        words.setObject("phindile");
        System.out.println(words.getObject());

    }
}

