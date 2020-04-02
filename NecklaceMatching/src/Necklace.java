public class Necklace {

    void checkNecklace(String necklace1, String necklace2) {
        int count = 0;
        if (necklace1.length() == necklace2.length()) {
            for (int i = 0; i <= necklace1.length(); i++) {
                try {
                    char first = necklace1.charAt(0);
                    necklace1 = necklace1.substring(1);
                    necklace1 += first;
                    if (necklace1.equals(necklace2)) {
                        count++;
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("At least one necklace is missing.");
                }
            }
            if (count > 0) {
                System.out.println("Necklaces are the same.");
            } else {
                System.out.println("Necklaces are not the same");
            }
        }
        else {
            System.out.println("At least one necklace is different.");
        }
    }

        public static void main (String[]args){
            Necklace necklace = new Necklace();
            necklace.checkNecklace("aabaaaaabaab", "aabaabaabaaa");
        }
    }
