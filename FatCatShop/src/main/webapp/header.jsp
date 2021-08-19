<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fat Cat Web App</title>
<link rel="stylesheet" href="style/style.css">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
</head>



<header>
	<div Class="header">
		<div Class="header_left">
			<h1>Система за мониторинг на производството в АПС Трейдинг</h1>

		</div>

		<div Class="header_right">${user} ${massage}</div>

	</div>

<div class="example">
    <div class="menu">
        <span>
            <ul id="nav">
                <li><a href="#">Производство принтери</a>
                    <div class="subs">
                        <div>
                            <ul>
                                <li><h3>Фишове</h3>
                                    <ul>
                                        <li><a href="list_name">Производствени фишове</a></li>
                                        <li><a href="#">Фишове от тест</a></li>
                                        <li><a href="#">Добавяне на операции</a></li>
                                        <li><a href="#">Редактиране на операции</a></li>
                                    </ul>
                                </li>
                                <li><h3>Служители</h3>
                                    <ul>
                                        <li><a href="input_operators.jsp">Въвеждане на оператори</a></li>
                                        <li><a href="#">Редактиране на оператори</a></li>
                                        <li><a href="#">Link 8</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li><a href="#">Производство пластмаси</a>
                    <div class="subs">
                        <div class="wrp2">
                            <ul>
                                <li><h3>Производство</h3>
                                    <ul>
                                        <li><a href="#">Link 1</a></li>
                                        <li><a href="#">Link 2</a></li>
                                        <li><a href="#">Link 3</a></li>
                                        <li><a href="#">Link 4</a></li>
                                        <li><a href="#">Link 5</a></li>
                                    </ul>
                                </li>
                                <li><h3>Служители</h3>
                                    <ul>
                                        <li><a href="#">Link 6</a></li>
                                        <li><a href="#">Link 7</a></li>
                                        <li><a href="#">Link 8</a></li>
                                        <li><a href="#">Link 9</a></li>
                                        <li><a href="#">Link 10</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                
                
                <li><a href="#">TPH производство</a>
                    <div class="subs">
                        <div class="wrp2">
                            <ul>
                                <li><h3>Производство</h3>
                                    <ul>
                                        <li><a href="#">Link 1</a></li>
                                        <li><a href="#">Link 2</a></li>
                                        <li><a href="#">Link 3</a></li>
                                        <li><a href="#">Link 4</a></li>
                                        <li><a href="#">Link 5</a></li>
                                    </ul>
                                </li>
                                <li><h3>Служители</h3>
                                    <ul>
                                        <li><a href="#">Link 6</a></li>
                                        <li><a href="#">Link 7</a></li>
                                        <li><a href="#">Link 8</a></li>
                                        <li><a href="#">Link 9</a></li>
                                        <li><a href="#">Link 10</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                
                <li><a href="registration.jsp">Регистрация</a></li>
                <li><a href="index.jsp">Начало</a></li>
            </ul>
            
            
            
        </span>
        
         <div Class="topnav_input">
				<form method="get" action="logout">
					<input type="submit" value="Изход">
				</form>
			</div>

			<div Class="topnav_input">

				<form method="post" action="login">
				
					<input type="text" class="inputs" 
					       placeholder="потребителско име"
						   name="email"> 
				    <input type="password" class="inputs"
						   placeholder="парола" 
						   name="user_password"> 
					<input
						type="submit" value="Вход">

				</form>
			</div>
        
        
        
    </div>
</div>

  <div Class="nav_bottom_line">
 
 </div> 
 
  
 <div Class="header_line">
 
 </div> 
  
	
<script type="text/javascript">
jQuery(window).load(function() {

    $("#nav > li > a").click(function () { // binding onclick
        if ($(this).parent().hasClass('selected')) {
            $("#nav .selected div div").slideUp(100); // hiding popups
            $("#nav .selected").removeClass("selected");
        } else {
            $("#nav .selected div div").slideUp(100); // hiding popups
            $("#nav .selected").removeClass("selected");

            if ($(this).next(".subs").length) {
                $(this).parent().addClass("selected"); // display popup
                $(this).next(".subs").children().slideDown(200);
            }
        }
    }); 

});
</script>	
	

</header>
