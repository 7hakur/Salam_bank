<%@page import="java.sql.*"%>
<%
    Connection con=null;
    PreparedStatement st=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bit_bank";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
            
        }
    catch (Exception error) {
       out.print("Unable to connect to the database due some errors "+error);
        }
    

%>