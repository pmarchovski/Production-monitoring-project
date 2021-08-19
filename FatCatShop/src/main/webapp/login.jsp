<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>

<body>

	<div Class="header_line">
	</div>
<main>
<div id="registration">

<form method="post" action="login">

<label>User name</label>  
<input 
       name="email"
       class="input"
       type="text" 
       placeholder="user name or e-mail">
       
<label>Password</label>      
<input 
       name="user_password"
       class="input"
       type="password" 
       placeholder="Password">
       

<input type="submit" value="Login" class="button">
</form>

<p>
${massage}
<a href="registration.jsp">Регистрация</a>
</div>
</main>

</body>
<jsp:include page="foot.jsp"/>