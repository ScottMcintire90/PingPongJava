import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;
import spark.ModelAndView;


public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String inputNumber = request.queryParams("inputtedNumber");
      Integer countUpTo = Integer.parseInt(inputNumber);
      ArrayList<Object> results = new ArrayList<Object>();
      results = PingPong.pingPong(countUpTo);

      model.put("results", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static ArrayList<Object> pingPong(Integer userNumber) {
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
