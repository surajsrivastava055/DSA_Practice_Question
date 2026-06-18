package BitwiseOperator;

class DecimalToBinary {
    public static void main(String[] args) {
        int num = 16, sum = 0, count = 0;
        while (num != 0) {
            int mod = num % 2;
            num = num / 2;
            if (mod == 0) {
                count++;
            } else {
                sum = sum * 10 + mod;
            }
        }
        System.out.println(sum + (int) Math.pow(10, count));
    }
}