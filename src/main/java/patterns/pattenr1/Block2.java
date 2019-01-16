package patterns.pattenr1;

public class Block2 extends AbstractBlock{

    public Block2() {
        System.out.println("Constuctor Block2");
    }

    @Override
    public void abstractFunc2() {
        System.out.println("abstractFunc2() Block2");
    }

    public void internalFunc2() {
        System.out.println("internalFunc2() Block2");
    }
}
