<%@include file="header.jsp" %>
<div class="main">
    <form action="account_creation.jsp" method="post" class="newaccountform">
        <div class="input">
            <label for = "cname">Customer Name</label>
            <input type="text" id="cname" name="cname" placeholder="Enter customer name" required="true" >
        </div>
        <div class="input">
            <label for = "contact">Contact Number</label>
            <input type="text" id="contact" name="contact" placeholder="Enter customer number" required="true" >
        </div>
        <div class="input">
            <label for = "passport">Passport No</label>
            <input type="text" id="passport" name="passport" placeholder="Enter passport No" required="true" >
        </div>
        <div class="input">
            <label for = "accountno">Account Number</label>
            <input type="text" id="accountno" name="accountno" placeholder="Enter account number"required="true" >
        </div>
        <div class="input">
            <label for = "accounttype">Account Type</label>
            <select name="accounttype" id="accounttype" required="true">
                <option value="" >Select account type</option>
                <option>Current account</option>
                <option>Saving account</option>
                <option>Loan account</option>
            </select> 
        </div>
        <div class="input">
            <label for = "balance">Account Balance</label>
            <input type="text" id="balance" name="balance" placeholder="Enter account balance" required="true" >
        </div>
     
        <div class="input">
            <label for="date">Created Date</label>
            <input type="date" id="date" name="date" required="true">
        </div>
        <div class="input">
            <input type="submit" value="Save" name="btn_save">
            <input type="reset" value="Clear">
        </div>
    </form>
</div>