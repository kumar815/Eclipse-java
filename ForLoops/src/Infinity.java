// Infinite for Loop

class Infinite {
    private static int sum;

	public static void main(String[] args) {
      
        setSum(2);

        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
    }

	public static int getSum() {
		return sum;
	}

	public static void setSum(int sum) {
		Infinite.sum = sum;
	}
}