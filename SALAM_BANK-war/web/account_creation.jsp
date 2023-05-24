<%@include  file="header.jsp" %>
<%@include file="db_connection.jsp" %>
<%
    String cname = request.getParameter("cname");
    String contact = request.getParameter("contact");
    String passport = request.getParameter("passport");
    String accountno = request.getParameter("accountno");
    String accounttype = request.getParameter("accounttype");
    String balance = request.getParameter("balance");
    String date = request.getParameter("date");
    String btn = request.getParameter("btn_save");
    
    if(btn!=null){
        st = con.prepareStatement("INSERT INTO open_account values(null,'"+cname+"','"+contact+"','"+passport+"','"+accountno+"','"+accounttype+"','"+balance+"','"+date+"')");
        int  i =st.executeUpdate();
        out.print("<script>");
        out.print("alert('Account has been created succesfully');");
        out.print("window.location='accountlist.jsp'");
        out.print("</script>");


    }
    else{

            }
%>
