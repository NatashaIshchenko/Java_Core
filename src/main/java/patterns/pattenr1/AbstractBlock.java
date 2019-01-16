package patterns.pattenr1;

public abstract class AbstractBlock {

    public AbstractBlock() {
        System.out.println("Constuctor AbstractBlock");
    }

    public static AbstractBlock getInstance(int block_id) {
        AbstractBlock game = null;
        if (block_id==1)
            game = new Block1();
        else if (block_id ==2)
            game = new Block2();
        return game;
    }

    public String getBlockType() {
        if (this instanceof Block1)
            return "it's Block1";
        else if (this instanceof Block2)
            return "it's Block2";
        throw new IllegalArgumentException("Unknown block type");
    }

    public abstract void abstractFunc2();
}