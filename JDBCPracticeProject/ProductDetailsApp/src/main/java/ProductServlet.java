import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/ecommerce";
            String user = "root";
            String password = "Password1234";
            Connection connection = DriverManager.getConnection(url, user, password);

            // Query the database
            String sql = "SELECT * FROM product WHERE product_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productId);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Display result to the user
            PrintWriter out = response.getWriter();
            if (resultSet.next()) {
                String productName = resultSet.getString("product_name");
                double price = resultSet.getDouble("price");
                out.println("Product ID: " + productId + "<br>");
                out.println("Product Name: " + productName + "<br>");
                out.println("Price: $" + price);
            } else {
                out.println("Product not found");
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}