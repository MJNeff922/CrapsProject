/**
 *
 * @author Mikey
 */
public class DieTest {
    public static void main (String[] args) {
        Die die = new Die();
        for (int k = 0; k < 99; k++) {

            die.roll();
            System.out.println(die.getNumDots());
        }
    }
}
