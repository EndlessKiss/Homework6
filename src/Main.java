public class Main {
    public static void main(String[] args) {
        // int salary = 65535;
        // int total = 0;
        // for (int i = 0; i< 12; i ++ ) {
        //total = total + total/100;
        //total = total + salary;
        //System.out.println(total);
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 2; i < 18; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
for (int i=1904; i<=2096; i=i+4) {
    System.out.println(i+ " Год является високосным");
}
for (int i=7; i<=98; i=i+7){
    System.out.println(i);
}
for (int i=1; i<=512; i=i*2) {
    System.out.println(i);
}
int deposit = 29000;
int total =0;
for (int i=1; i<13; i++) {
    total=total+total/100;
    total = total +deposit;
    System.out.println("Месяц " + i + " сумма накоплений равна " + total+ " рублей.");
}



    }
}