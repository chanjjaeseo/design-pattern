package 创建模式.单例模式;

public class HungrySingleton {

    private HungrySingleton() {}

    private final static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
