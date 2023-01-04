package firstpackage;
import java.sql.*;

import static java.lang.Class.forName;

public class jdbctest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String query = "insert into employees(name, salary) values (?,?)";

        String query1 = "update employees set name = ?, salary = ? where id = ?";
        String uname = "root";
        String pass = "Abhijit@11";

        try {

            Connection conn = DriverManager.getConnection(url, uname, pass);
//            System.out.println("connected");
            PreparedStatement st = conn.prepareStatement(query);
            PreparedStatement st1 = conn.prepareStatement(query1);

//            st.setInt(1, 17);
            st.setString(1,"Keeriti");
            st.setInt(2, 50000);

            st1.setString(1, "Aadil");
            st1.setInt(2, 10000);
            st1.setInt(3, 7);
            int count = st.executeUpdate();
            int count2 = st1.executeUpdate();

            System.out.println(count2 + "rows affected" );

            System.out.println(count + " rows affected");




//           while(rs.next())
//           {
//               System.out.println(rs.getInt(1)+":" + rs.getString(2) + ":" + rs.getInt(3));
//           }
st.close();
           conn.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
