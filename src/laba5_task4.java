public class laba5_task4 {
    public static void main(String[] args) {
        int number =10;
        int factolial=1;
        for (int i=1; i<= number;i++){
            factolial *=i;
        }
        System.out.println("Factorial number"+number+"for: "+factolial);
        while (factolial <= number){
            factolial *=factolial;
            factolial ++;
        }
        System.out.println("Factorial number"+number+"while: "+factolial);
    }
}