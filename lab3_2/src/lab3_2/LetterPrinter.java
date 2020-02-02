package lab3_2;

public class LetterPrinter {
    public static void main(String[] args) {
        Letter newLetter = new Letter("Clarissa", "Jade");
        newLetter.addLine("We must find Simon quickly.");
        newLetter.addLine("He might be in danger.");
        System.out.println(newLetter.getText());
    }
}