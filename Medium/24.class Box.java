public class Box {
    double width;
    double height;
    double depth;
    public Box() {
        width = 1.0;
        height = 1.0;
        depth = 1.0;
    }
    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        double vol = myBox.volume();
        System.out.println("Volume of the box is: " + vol);
    }
}
