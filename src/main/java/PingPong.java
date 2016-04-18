import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

public Object pingPong(Integer testPingPong) {
  ArrayList<Object> pingPongArray = new ArrayList<Object>();
  for (Integer index = 1; index <= testPingPong; index++) {

      if (index % 3 == 0) {
        pingPongArray.add("ping");
      }
      else {
        pingPongArray.add(index);
      }
  }
  return pingPongArray;
  }
}
