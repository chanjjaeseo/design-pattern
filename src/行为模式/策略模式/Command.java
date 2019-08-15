package 行为模式.策略模式;

public class Command {

    public static void main(String[] args) {
        Context context =  new Context(new StrategyOne());
        context.doStrategy();
    }

}
