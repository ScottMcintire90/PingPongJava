import java.io.Console;
import java.util.ArrayList;


public class PingPong {
  public static void main(String[] args) {}

  public ArrayList<Object> pingPong(Integer userNumber) {
    ArrayList<Object> pingPongArray = new ArrayList<Object>();
    for (Integer index = 1; index <= userNumber; index++) {
      if (index % 15 == 0) {
        pingPongArray.add("PINGPONG");
      }
      else if (index % 5 == 0) {
        pingPongArray.add("pong");
      }
      else if (index % 3 == 0) {
        pingPongArray.add("ping");
      }
      else {
        pingPongArray.add(index);
      }
    }
    return pingPongArray;
  }
}
