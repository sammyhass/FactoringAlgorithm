import java.util.Random;

class EfficientFactoring {
    public static void main (String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(500000) + 1;
        double use;
        int[] factors = new int[(int) num/2];
        if (num % 2 == 1) {
            use = num/2 - 0.5;
            
        } else {
            use = num/2;
        }
        int count = 0;
        int useInt = (int) use;
        for (int i = 1; i <= useInt; i++) {
            if (num % i == 0) {
                factors[count] = i;
                count +=1;
            }
        }
        factors[count] = num;
        for (int num1: factors) {
            if (num1 != 0) {
                System.out.println(num1);
            }
        }
    }
}