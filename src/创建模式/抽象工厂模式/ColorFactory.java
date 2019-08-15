package 创建模式.抽象工厂模式;

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorName) {
        if ("Blue".equals(colorName)) {
            return new Blue();
        } else if ("Green".equals(colorName)) {
            return new Green();
        } else if ("Red".equals(colorName)) {
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeName) {
        return null;
    }
}
