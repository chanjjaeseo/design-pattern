package 创建模式.原型模式;


public class Command {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle();
        circle.setName("qcz");
        Circle circle2 = (Circle) circle.clone();
        System.out.println(circle.hashCode());
        System.out.println(circle2.hashCode());
        circle2.draw();
    }

}
