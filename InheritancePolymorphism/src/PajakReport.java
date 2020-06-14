package InheritancePolymorphism.src;

public class PajakReport {
    private PajakCalculatorImpl calculator;

    public PajakReport(PajakCalculatorImpl calculator) {
        this.calculator = calculator;
    }

    public void show(){
        double pajak = calculator.hitungPajak();
        System.out.println(pajak);
    }
}