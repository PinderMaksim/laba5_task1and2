public class Main {
    public static void main(String[] args) {
        int i =500;
        for (; i<=650; i=i+10){
            System.out.println(i);
        }

        int a = 500;
        System.out.println("while");
        while (a<=650){
            System.out.println(a+"");
            a+=10;
        }
        int b = 500;
        System.out.println("do while");
        do {
            b+=10;
            System.out.println(b + "");
        }while (b<=650);
    }
  }
