public class laba5_task3 {
    public static void main(String[] args) {
        for (int a=2; a<=5000; a=(2*a-1)){
            System.out.println(a);
        }
        System.out.println("task3");
        int number=10;
        for (int a=1; a<=number;a++){
            if (number%a==0){ //перевіряє чи число ділиться націло на 10
                System.out.println(a+"");

            }
        }
    }
}