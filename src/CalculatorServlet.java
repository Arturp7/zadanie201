import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calcmeter")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String meter = request.getParameter("meters");
        String centimeters = request.getParameter("centimeters");
        String milimeters = request.getParameter("milimeters");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        MeterCalculation calc1 = new MeterCalculation();

        if (!meter.isEmpty()&&!centimeters.isEmpty()) {
           writer.println("Wypełnij tylko jedno pole");
        }
        else if (!meter.isEmpty()){
            double meterResult = calc1.meterCalculation(meter);
            writer.println("<h1>Podana wartość w przeliczeniu na: </h1> " + "<br>"
                    + "<h2>metry:</h2> " + meterResult
                    + "<h2>centymetry:</h2> " + meterResult * 100
                    + "<h2>milimetry </h2 > " + meterResult * 1000);
        }
        else if (!centimeters.isEmpty()) {
            double meterResult = calc1.meterCalculation(centimeters);
            writer.println("<h1>Podana wartość w przeliczeniu na: </h1> " + "<br>"
                    + "<h2>metry:</h2> " + meterResult / 100
                    + "<h2>centymetry:</h2> " + meterResult
                    + "<h2>milimetery</h2> " + meterResult * 100);
        }
        else if (!milimeters.isEmpty()) {
            double meterResult = calc1.meterCalculation(milimeters);
            writer.println("<h1>Podana wartość w przeliczeniu na: </h1> " + "<br>"
                    + "<h2>metry:</h2> " + meterResult / 1000
                    + "<h2>centymetry:</h2> " + meterResult / 10
                    + "<h2>milimetery</h2> " + meterResult);
        }



        String kilograms = request.getParameter("kilograms");
        String grams = request.getParameter("grams");
        String miligrams = request.getParameter("miligrams");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
