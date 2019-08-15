package 创建模式.建造者模式;

public class SampleBuilder extends AbstractSampleBuilder {

    @Override
    public SampleBuilder buildPartA(String partA) {
        sample.setPartA(partA);
        return this;
    }

    @Override
    public SampleBuilder buildPartB(String partB) {
        sample.setPartB(partB);
        return this;
    }

    @Override
    public SampleBuilder buildPartC(String partC) {
        sample.setPartC(partC);
        return this;
    }

}
