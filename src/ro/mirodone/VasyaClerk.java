package ro.mirodone;

public class VasyaClerk {

    String Tickets(int[] peopleInLine) {

        int bill_25 = 0;
        int bill_50 = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                bill_25 += 1;
            }
            if (peopleInLine[i] == 50) {
                bill_25 -= 1;
                bill_50 += 1;
            }
            if (peopleInLine[i] == 100) {
                if (bill_50 == 0 && bill_25 >= 3) {
                    bill_25 -= 3;
                } else {
                    bill_25 -= 1;
                    bill_50 -= 1;
                }
            }
            if (bill_25 < 0 || bill_50 < 0) {
                return "NO";
            }
        }
        return "YES";

    }

}
