package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        DnaStrand dna = new DnaStrand();
        System.out.println(dna.makeComplement("AAAACCCGGT"));
        System.out.println(dna.makeComplement("ATTGC"));
        System.out.println(dna.makeComplement("GTAT"));


    }
}
