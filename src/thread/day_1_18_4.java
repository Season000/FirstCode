package thread;
//public static void sleep(long millis)

public class day_1_18_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
