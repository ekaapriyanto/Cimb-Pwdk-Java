package InheritancePolymorphism.src;

public class App {
    public static void main(String[] args) throws Exception {
        //Input input = new Input();
        // Input input2 = new Input();

        //TextBox textBox = new TextBox();
        // TextBox setText("Hello World");

        // System.out.println(textBox);
        // System.out.println(input.equals(input2));


        // Point point1 = new Point(1, 2);
        // Point point2 = new Point(1, 2);

        // System.out.println(point1.hashCode());
        // System.out.println(point2.hashCode());

        // Input[] inputs = { new TextBox(), new CheckBox()};

        // for (int i = 0; i < inputs.length; i++) {
        //     inputs[i].render();
        // }

        PajakCalculatorImpl calculator = new PajakCalculatorImpl(100_000);
        PajakReport report = new PajakReport(calculator);

        report.show();

    }

    /* public static void show(Input input){
        if (input instanceof TextBox){
            TextBox textBox = (TextBox) input;
            textBox.setText(("text sudah diganti"));
        }
        System.out.println(input);
    } */
}
