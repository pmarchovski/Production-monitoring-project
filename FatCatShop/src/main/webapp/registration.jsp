<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" />

<body>

	<div id="registration">

		<p>
			<label id="labels">Форма за регистрация на нови потребители</label>
		<p>

		<form method="post" action="registration">

			<input name="full_name" class="input" type="text"
				   placeholder="Трите имена"> 
				
			<input name="user_name"
				class="input" type="text" placeholder="User name"> 
				
			<input
				name="email" class="input" type="text" placeholder="E-mail">

			<input name="password" class="input" type="password"
				placeholder="Парола"> 
				
			<input type="submit"
				value="Registration" class="button">

		</form>

	</div>

</body>
<jsp:include page="foot.jsp" />