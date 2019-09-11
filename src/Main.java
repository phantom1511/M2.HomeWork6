public class Main {

    public static void main(String[] args) {
        Box<Number> box = new Box<>(1.50, 7);
        Box<Number> box1 = new Box<>(3.3F, 7.7F);

        System.out.println("Addition: " + box.number1 + " + " + box.number2 + " + " + box1.number1 + " + " + box1.number2 + " = " + addition(box, box1));
        System.out.println("Multiplication: " + box.number1 + " * " + box.number2 + " * " + box1.number1 + " * " + box1.number2 + " = " + multiplication(box,box1));

    }

    public static Number addition(Box<? extends Number> box1, Box<? extends Number> box2) {
        return box1.number1.doubleValue() + box1.number2.intValue() + box2.number1.floatValue() + box2.number2.floatValue();
    }

    public static Number multiplication(Box<? extends Number> box1, Box<? extends Number> box2){
        return box1.number1.doubleValue() * box1.number2.intValue() * box2.number1.floatValue() * box2.number2.floatValue();
    }
}
