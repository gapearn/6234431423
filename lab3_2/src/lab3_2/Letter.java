package lab3_2;

public class Letter {
    private String material;
    private final String name;

    public Letter(String from, String to) {
        material = "Dear " + to + ":" + "\n" + "\n";
        name = from;
    }

    public void addLine(String Line) {
        material = material + Line + "\n";
    }

    public String getText() {
        material = material + "\n" + "Sincerely," + "\n" + "\n" + name;
        return material;
    }

}