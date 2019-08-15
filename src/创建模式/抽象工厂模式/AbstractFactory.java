package 创建模式.抽象工厂模式;

public abstract class AbstractFactory {

    abstract Color getColor(String colorName);

    abstract Shape getShape(String shapeName);

}
