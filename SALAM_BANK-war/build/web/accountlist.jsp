<%@include file="header.jsp" %>
<%@include file="db_connection.jsp" %>
<table class="tbl1">
    <tr>
        <th>No#</th>
        <th>Customer</th>
        <th>Contact</th>
        <th>Passport</th>
        <th>Account No</th>
        <th>Account Type</th>
        <th>Balance</th>
        <th>Date</th>
        <th>Action</th>
    </tr>
    <%
        int count = 1;
        st = con.prepareStatement("SELECT * FROM open_account");
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            %>
            <tr>
                <td><%=count++ %></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
                <td><%=rs.getString(7)%></td>
                <td><%=rs.getString(8)%></td>
                <td><a href="account_delete.jsp?id=<%=rs.getString(1)%>"class="del"
                       onclick="return confirm('Are you sure to delete this Account')" >Delete</a>
                <a href="account_update.jsp?id=<%=rs.getString(1)%>"class="up">Update</a></td>
                
            </tr>
        <%}
        
    %>
</table>