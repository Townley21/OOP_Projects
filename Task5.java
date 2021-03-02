public class Task5 {

    public static void main(String[] args) {

        int day = 3;
        int month = 3;
        int year = 1999;

        int k = day;

        int m = month - 2;
        if (m < 1) {
            m += 12;
            year--;
        }

        int c = year / 100;
        int y = year % 100;

        int w = (k + (int)(2.6 * m - 0.2) - 2*c + y + y/4 + c/4) % 7;

        if(w < 0) {
            w += 7;
        }

        System.out.println(w);
    }
}
