public class Main {


    public static void printNumbers(int[] number) {

        for (int i = 0; i < number.length; i++) {
            if (i > 2 && i < 8) {
                if (number[i] % 2 != 0) {
                    number[i] = number[i] + 1;
                }
                System.out.println(number[i]);
            }
        }


        }


        public static void main (String[]args){
            printNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8});


        }


    }