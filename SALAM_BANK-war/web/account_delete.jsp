<%@include file="db_connection.jsp" %>
<% 
    String id = request.getParameter("id");
    st=con.prepareStatement("DELETE FROM open_account where id='"+id+"'");
    int i = st.executeUpdate();
    if(i>0){
 %>
        <script>
            alert("Account deleted !")
            window.location = "accountlist.jsp"
            </script>
            <%
                }
%>