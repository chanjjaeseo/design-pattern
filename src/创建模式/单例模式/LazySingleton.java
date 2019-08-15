package 创建模式.单例模式;

public class LazySingleton {

    private volatile static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    return new LazySingleton();
                }
            }
        }
        return instance;
    }

}
