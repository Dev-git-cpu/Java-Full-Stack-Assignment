import java.sql.*;

class StudentCRUD {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/LibraryDB",
                "root", "password"
        );

        Statement st = con.createStatement();

        // Insert
        st.executeUpdate(
                "INSERT INTO Students VALUES (1, 'Dev')"
        );

        // Read
        ResultSet rs = st.executeQuery("SELECT * FROM Students");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " "
                    + rs.getString("name"));
        }

        // Update
        st.executeUpdate(
                "UPDATE Students SET name='Ram' WHERE id=1"
        );

        // Delete
        st.executeUpdate("DELETE FROM Students WHERE id=1");

        con.close();
    }
}