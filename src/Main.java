public class Main {


    public static void PrintM(int[] m) {

        for (int i = 0; i < m.length; i++) {
            if (i > 2 && i < 8) {
                if (m[i] % 2 != 0) {
                    m[i] = m[i] + 1;
                }
                System.out.println(m[i]);
            }
        }


        }


        public static void main (String[]args){
            PrintM(new int[]{1, 2, 3, 4, 5, 6, 7, 8});


        }


    }