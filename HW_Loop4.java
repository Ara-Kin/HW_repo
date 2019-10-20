public class HW_Loop4 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {

            i++;

            while (i % 3 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

/*public class v2 {   // version 2
    public static void main(String[] args) {
        for (int i = 0; i <=100; i++ ){
            if (i % 3 ==0) {
                System.out.println(i);
            }
        }

    }
}*/