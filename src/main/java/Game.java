
public class Game {
    public Game(Dice dice, int point, int rollCount, int roll) {
        this.dice = dice;
        this.point = point;
        this.rollCount = rollCount;
        this.roll = roll;
    }

    Dice dice = new Dice();
        int point = dice.getTotal();
        int rollCount = 0;
        int roll;




        public void Game() {
            System.out.println(point);
            while (rollCount == 0) {
                switch (dice.getTotal()) {
                    case 7:
                    case 11:
                        System.out.println("You Win");
                        System.out.println("Do you want to roll again?");
                        rollCount++;
                        break;
                    case 2:
                    case 3:
                    case 12:
                        System.out.println("You Lose");
                        System.out.println("Do you want to roll again?");
                        rollCount++;
                        break;
                    default:
                        System.out.println("Roll Again ?");
                        rollCount++;

                }
                if (1 <= rollCount) {
                    do {
                        dice.roll();
                        roll = dice.getTotal();
                        if (roll == 7) {
                            System.out.println("You lose!");
                        }
                        System.out.println(roll);

                    } while (point != roll);

                }


            }
        }

}
