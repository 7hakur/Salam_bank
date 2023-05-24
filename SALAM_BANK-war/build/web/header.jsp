<style>
    @import url('https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600&display=swap');
    body{
        background:appworkspace;
        font-family: 'Inter', sans-serif;
        margin: 0;
        padding: 0;
        box-sizing: border-box;
       
        
        
        }
        header{
            margin-top: 8px;
            display:flex;
            align-items: center;
            justify-content: space-around;
            
        
            
            
           
        }
        
        header img{
            width: 250px;
                 
        }
        header img:hover{
        box-shadow: -1px 200px 114px -56px rgba(0,123,183,0.25);
        -webkit-box-shadow: -1px 200px 114px -56px rgba(0,123,183,0.25);
        -moz-box-shadow: -1px 200px 114px -56px rgba(0,123,183,0.25);}
        .navbar a{
            text-decoration: none;
            margin-left: 25px;
            padding: 8px 0 ;
            color: black;
            font-size: 14px;
            font-weight: bold;
            
        }
        .navbar a:hover,.navbar a:active{
            border-bottom:  4px solid #007BB7;
              opacity: .6;
/*            border-bottom: 3px solid brown;*/

        }
/*        ====New-Account-Design=====*/

        .main{
            width: 100%;
            height: 90vh;
            
            display: flex;
            justify-content: center;
            align-items: center;
            
    
        }
        .newaccountform{
            display: flex;
            flex-direction: column;
            padding-left:100px; 
            width:500px;
            height: 600px;
        }
        .newaccountform:hover{
            border-left: 4px solid #007BB7;
            transition: .2s;
            
        }
        .newaccountform div{
            margin-top: 25px;
            
        }
        input{
            font-family: inherit;
            padding: 1em ;
            border-radius: 4px;
            border: 1px silver solid;
        }
        #accounttype{
            border: 1px solid silver;
            border-radius: 4px;
            font-family: inherit;
        }
        input[type=text],#accounttype{
            width: 300px;
            height: 35px;
   
        }
        input[type=submit],input[type=reset]{
            padding: 16px 50px;
            font-weight: bold;
            font-size: 1rem;
            background: transparent;
            border: 2px solid black; 
        }
        input[type=submit]:hover,input[type=reset]:hover{
            background: #007BB7;
            color: white;
            transition: 0.25s;
            border: none;
        }
        .input {
            display: flex;
            align-items: center;
        }
        .input input,#accounttype{
            margin-left: 20px;
        }
        label{
            font-family: inherit;
            font-size: 1rem;
            font-weight: bold;
        }
        .newaccountform:last-of-type{
            
            justify-self:center;
            
        }
        .tbl1{
            
            width: 95%;
            margin:60px  auto 0 auto;
        
            border-collapse: collapse;
            
        }
        td,th{
            padding: 6px;
            border: 1px gray solid;
        }
        tr:nth-of-type(even){
            background: #E2E5DE;
        }
         tr:nth-of-type(odd){
            background: beige;
        }
        .del{
            background: red;
            color: white;
            border-radius: 4px;
            border: none;
            padding: 5px 8px;
            margin-right: 10px;
            text-decoration: none;
            text-align: center;
        }
        .up{
            background: green;
            color: white;
            border-radius: 4px;
            border: none;
            padding: 5px 8px;
            margin-right: 6px;
            text-decoration: none;
        }
        td:last-child{
            display: flex;
            justify-content: center;
            align-items: center;
        }
        tr:hover{
            background: #007BB7;
            color: white;
        }
        .hero{
            margin-top:40px;
            width: 100%;
/*            display: flex;
            align-items: center;*/
             
        }
        .family{
            position: absolute;
            left: 820px;
            top: 114px;
            z-index: -1;
            
        }
        .hero-title{
            font-size: 40px;
            font-weight: bolder;
            width: 300px;
            margin-left: 200px;
            margin-top: 150px;
            
        }
        .hero-title span{
            color: #007BB7;
        }
        .hero-title a{
            display: block;
            margin-top: 30px;
            font-size: 20px;
            background:#007BB7;
            color: white;
            text-decoration: none;
            width: 150px;
            padding: 20px ;
            border-bottom-left-radius: 25px;
            border-top-right-radius:25px;
            text-align: center;
            
        }
        .square{
            width:710px;
/*            height: 682px;*/
            background: #FFEAF5;
            position: absolute;
            right: 0;
            top: -2;
            bottom: 0;
            z-index: -2;

        }
            
            
 
</style>
<body>
    <header>
        <img src="./images/logo.png" alt="logo"/>
        <nav class="navbar">
        <a href="index.jsp">Home</a>
        <a href="newaccount.jsp">Open account</a>
        <a href="deposit.jsp">Cash deposit</a>
        <a href="withdraw.jsp">Cash withdraw</a>
        <a href="checkbalance.jsp">Balance</a>
        <a href="statement.jsp">Account statement</a>
        <a href="accountoaccount.jsp">Account to account</a>
        
        </nav>
        
    </header>
    
</body>