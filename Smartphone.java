public class Smartphone extends Device{
    private double screenSize;
    private String color;
    private int memory;

    public Smartphone(String type, double price, int weight, double screenSize, String color, int memory) {
        super(type, price, weight);
        this.screenSize = screenSize;
        this.color = color;
        this.memory = memory;
    }
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getInfo(){
        return ("Type:" + type + ", price:" + price + "$, weight:" + weight + "gr, screen sise:" + screenSize + "\", color:" + color + ", memory:" + memory + "GB");
    }
}
