package 创建模式.建造者模式;

public class Command {

    public static void main(String[] args) {
        SampleBuilder sampleBuilder = new SampleBuilder();
        Sample sample = sampleBuilder
                            .buildPartA("partA")
                            .buildPartB("partB")
                            .buildPartC("partC").getResult();
        System.out.println(sample.getPartA() + " " + sample.getPartB() + " " + sample.getPartC());
    }

}
