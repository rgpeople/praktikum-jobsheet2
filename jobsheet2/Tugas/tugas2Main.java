package jobsheet2.Tugas;

import java.util.Scanner;

public class tugas2Main {
    public static void main(String[] args) {
        tugas2 p = new tugas2(10, 10, 20, 20);
        Scanner sc = new Scanner(System.in);
        
        p.printPosition();
        System.out.println("ENTER YOUR COMMAND");
        System.out.println("===================");
        System.out.println("a => Move left");
        System.out.println("d => Move right");
        System.out.println("w => Move up");
        System.out.println("a => Move down");
        System.out.println("x => Exit");
       
        loop :while (true) {
            switch(sc.nextLine()){
                case "a":
                    p.moveLeft();
                    break;
                case "d":
                    p.moveRight();
                    break;
                case "w":
                    p.moveUp();
                    break;
                case "s" :
                    p.moveDown();
                    break;
                case "x":
                System.out.println("Out from the script");
                    break loop;
                default :
                    p.printPosition();
                    break;
                
            }
        }
    }
}
