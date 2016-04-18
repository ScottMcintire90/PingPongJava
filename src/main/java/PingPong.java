public class PingPong {
  public static void main(String[] args) {}


public Boolean isPingPong(Integer pingPong) {
  if (pingPong % 15 == 0) {
    return true;
  } else if (pingPong % 5 == 0) {
    return true;
  } else if (pingPong % 3 == 0){
    return true;
  } else {
    return false;
  }
 }
}
