package ro.mirodone;


public class DnaStrand {


    String makeComplement( String dna) {

        StringBuilder builder = new StringBuilder();


        for(int i=0;i<dna.length();i++){

            if(dna.charAt(i) == 'T'){
                builder.append('A');
            }
            if(dna.charAt(i) == 'A'){
                builder.append('T');
            }
            if(dna.charAt(i) == 'C'){
                builder.append('G');
            }
            if(dna.charAt(i) == 'G'){
                builder.append('C');
            }
        }

        //code for:  reverse complement of a DNA string
        //StringBuilder reverse = builder.reverse();
        //return reverse.toString();

        return  builder.toString();

    }

}
