package 创建模式.抽象工厂模式;

public class FactoryProducer {

    public static AbstractFactory createFactory(String choice) {
        if ("CreateShapeFactory".equals(choice)) {
            return new ShapeFactory();
        } else if ("CreateColorFactory".equals(choice)) {
            return new ColorFactory();
        }
        return null;
    }

}
