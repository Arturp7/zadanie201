import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/weightmeter")
public class WeightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kilograms = request.getParameter("kilograms");
        String grams = request.getParameter("grams");
        String miligrams = request.getParameter("miligrams");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        WeightCalculation calc1 = new WeightCalculation();

        calc1.weightCalculation(kilograms);

        if (!kilograms.isEmpty()&&!grams.isEmpty()) {
            writer.println("Wypełnij tylko jedno pole");
        }
        else if (!kilograms.isEmpty()){
            double meterResult = calc1.weightCalculation(kilograms);
            writer.println("<h1>Podana wartość w przeliczeniu na: </h1> " + "<br>"
                    + "<h2>kilogramy:</h2> " + meterResult
                    + "<h2>gramy:</h2> " + meterResult * 1000
                    + "<h2>miligramy</h2> " + meterResult * 10000);
        }
        else if (!grams.isEmpty()) {
            double meterResult = calc1.weightCalculation(grams);
            writer.println("<h1>Podana wartość w przeliczeniu na: </h1> " + "<br>"
                    + "<h2>kilogramy:</h2> " + meterResult / 1000
                    + "<h2>gramy:</h2> " + meterResult
                    + "<h2>miligramy</h2> " + meterResult * 1000);
        }
        else if (!miligrams.isEmpty()) {
            double meterResult = calc1.weightCalculation(miligrams);
            writer.println("<h1>Podana wartość w przeliczeniu na: </h1> " + "<br>"
                    + "<h2>kilogramy</h2> " + meterResult / 10000
                    + "<h2>gramy:</h2> " + meterResult / 100
                    + "<h2>miligramy</h2> " + meterResult);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
