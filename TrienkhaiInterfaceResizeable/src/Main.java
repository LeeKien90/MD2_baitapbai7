import resizeable.Circle;
import resizeable.Rectangle;
import resizeable.Shape;
import resizeable.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] Hinh = new Shape[3];
        Hinh[0] = new Square(10);
        Hinh[1] = new Circle(20);
        Hinh[2] =  new Rectangle(30,40);

        for (int i = 0; i < Hinh.length; i++) {
            System.out.println("--------------------------------------------");
            System.out.println(" Kích thước trước khi tăng : \n");
            System.out.println(Hinh[i]);
            Hinh[i].resize(Math.random()*100);
            System.out.println("Hinh sau khi tăng");
            System.out.println(Hinh[i]);


        }


    }
}