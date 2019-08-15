package 创建模式.工厂模式;

public class Facotory {

    public static Sample create(int code) {
        if (code == 1) {
            return new SampleA();
        } else {
            return new SampleB();
        }
    }

}
