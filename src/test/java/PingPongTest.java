import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
    public void isPingPong_forNumberDivisibleByFifteen_true() {
      PingPong pingPong = new PingPong();
      assertEquals(true, pingPong.isPingPong(15));
    }
  @Test
    public void isPingPong_forNumberDivisibleByFive_true() {
      PingPong pingPong = new PingPong();
      assertEquals(true, pingPong.isPingPong(5));
    }
  @Test
    public void isPingPong_forNumberDivisibleByThree_true() {
      PingPong pingPong = new PingPong();
      assertEquals(true, pingPong.isPingPong(3));
    }
}
