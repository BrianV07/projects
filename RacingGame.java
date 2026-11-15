/* Name: Brian Vo
ID: 304442710
Date: 10/25/26
Description: Wrote a racing game with progressively increasing speeds between two cars with a flag to initiate it with red, amber, and green. Depending on who stops further or reaches
the end which is a distance of 100, that car would win.
*/
import java.util.Random;

public class RacingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int car1 = 0, car2 = 0;
        String flag = "GREEN";
        boolean emergencyStop = false;

        System.out.println("Flag: " + flag);

        while (car1 < 100 && car2 < 100) {
            // This will change the following flags: 1 = GREEN, 2 = AMBER, 3 = RED
            int roll = rand.nextInt(3) + 1;
            flag = (roll == 1) ? "GREEN" : (roll == 2) ? "AMBER" : "RED";
            System.out.println("Flag: " + flag);

            if (flag.equals("RED")) {
                emergencyStop = true;
                break;
            }

            // Each car will advance 1-10 miles this turn
            car1 += rand.nextInt(10) + 1;
            car2 += rand.nextInt(10) + 1;
            System.out.println("Car1: " + car1 + " miles | Car2: " + car2 + " miles");
        }

        if (emergencyStop) {
            System.out.println("EMERGENCY STOP!");
        }

        System.out.println("Final -> Car1: " + car1 + " | Car2: " + car2);

        if (car1 > car2) {
            System.out.println("Winner: Car1");
        } else if (car2 > car1) {
            System.out.println("Winner: Car2");
        } else {
            System.out.println("Winner: Car1 and Car2 (tie)");
        }
    }
}