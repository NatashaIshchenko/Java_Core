package patterns.pattenr1;

public class MainClass {

    public static void main(String[] args){
        AbstractBlock test_block = AbstractBlock.getInstance(1); // 1. Constuctor AbstractBlock 2. Constuctor Block1
        String block_type = test_block.getBlockType();
        System.out.println("Block type = " + block_type);
    }
}
