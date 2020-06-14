package InheritancePolymorphism.src;

public class TextBox extends Input{
    private String text = "";

    public void textBox() {
        // System.out.println("ini class TextBox");
    }

    public String  getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    public void render() {
        System.out.println("Header TextBox");
    }

    @Override
    public String toString(){
        return this.text;
    }
}