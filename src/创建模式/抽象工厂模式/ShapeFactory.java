package 创建模式.抽象工厂模式;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String colorName) {
        return null;
    }

    @Override
    Shape getShape(String shapeName) {
        if ("Rectangle".equals(shapeName)) {
            return new Rectangle();
        } else if ("Square".equals(shapeName)) {
            return new Square();
        } else if ("Circle".equals(shapeName)) {
            return new Circle();
        }
        return null;
    }

}
