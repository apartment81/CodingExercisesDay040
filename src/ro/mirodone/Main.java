package ro.mirodone;

public class Main {

    public static void main(String[] args) {

/*        DnaStrand dna = new DnaStrand();
        System.out.println(dna.makeComplement("AAAACCCGGT"));
        System.out.println(dna.makeComplement("ATTGC"));
        System.out.println(dna.makeComplement("GTAT"));*/


        VasyaClerk vc = new VasyaClerk();
        System.out.println(vc.Tickets(new int[]{25, 25, 50}));
        System.out.println(vc.Tickets(new int[]{25, 100}));
        System.out.println(vc.Tickets(new int[]{25, 25, 50, 50, 100}));


    }
}
