import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // создаем объект, который будет использоваться
        Home home=new Home();
        // создаем объекты для всех умений объекта Light:
        Command switchOn=new onLight(home);
        Command switchOff=new offLight(home);
        Command switchOpen=new openDoor(home);
        Command switchClose=new closeDoor(home);

        // Создаемтся invoker, с которым мы будем непосредственно контактировать:
        Switch s=new Switch(switchOpen,switchClose,switchOn,switchOff);
        Scanner scanner = new Scanner(System.in);
        // вот проверка этого, используем методы:
        boolean run = true;
        while (run) {
            System.out.println("1. open door");
            System.out.println("2. close door");
            System.out.println("3. on light");
            System.out.println("4. off light");
            System.out.println("5. end work");
            String answer = scanner.nextLine();
            switch (answer){
                case ("1") :{
                    System.out.println("--------------------------------------------");
                    s.open();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case ("2"):{
                    System.out.println("--------------------------------------------");
            s.close();
                    System.out.println("--------------------------------------------");
            break;}
                case ("3"):{
                    System.out.println("--------------------------------------------");
            s.on();
                    System.out.println("--------------------------------------------");
            break;
                }
                case ("4"):{
                    s.off();
                    break;
                }
                case ("5"):{
                    run = false;
                    break;
                }
        }
        }
    }
}