package 创建模式.建造者模式;

public abstract class AbstractSampleBuilder {

    Sample sample = new Sample();

    abstract AbstractSampleBuilder buildPartA(String partA);

    abstract AbstractSampleBuilder buildPartB(String partB);

    abstract AbstractSampleBuilder buildPartC(String partC);

    public Sample getResult() {
        return sample;
    }
}
