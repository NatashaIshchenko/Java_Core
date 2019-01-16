package patterns.pattenr1;

public class Block1 extends AbstractBlock {

    public Block1() {
        System.out.println("Constuctor Block1");
    }

    @Override
    public void abstractFunc2() {
        System.out.println("abstractFunc2() Block1");
    }

    public void internalFunc2() {
        System.out.println("internalFunc2() Block1");
    }

}
