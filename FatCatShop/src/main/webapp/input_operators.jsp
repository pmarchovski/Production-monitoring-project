<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"/>


<body>

<div id="input_production_info">

<form method="post" action="add_operator">


<input type="text"
       name="operator_name"
       class="input"
       placeholder="Трите имена">

<input type="text"
       name="team_leader"
       class="input"
       placeholder="Тийм лидер">
 

<select name="gender"
        class="input_less">
<option value="male">Male</option>
<option value="famale">Famale</option>
</select> 
    
       
<input type="text"
       name="skills"
       class="input_less"
       placeholder="Умения">  

<select name="isActive"
        class="input_less">
<option value="yes">Yes</option>
<option value="no">No</option>
</select>
 
<select name="isMotherhood"
        class="input_less">
<option value="no">No</option>        
<option value="yes">Yes</option>
</select>

<input type="text"
       name="phone"
       class="input_less"
       placeholder="Телефон">

<p>      
<input type="submit"
       value="Въведи"
       Class="button">

</form>

</div>

<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Arial; padding : 10px;
	background: #f1f1f1;
	padding: 10px;
}

a:link{
	color: #444444;
}

a:visited{
	color: #444444;
}

a:hover{
	color: #ffffff;
}




/* demo page styles */


/* main menu styles */
.menu {
    background-color:#333;
    text-align:left;
    width:100%;
    padding: 10px 16px;
   
}
.menu > span {
    display:inline-block;
    margin:0 auto;
}
#nav {
    display:inline;
    text-align:left;
    position:relative;
    list-style-type:none;
}
#nav > li {
    float:left;
    padding:0;
    position:relative;
}
#nav > li > a {
    border:1px solid transparent;
    color:#c0c0c0;
    display:block;
    font-size:90%;
    padding:3px 10px;
    position:relative;
    text-decoration:none;
}
#nav > li > a:hover {
    background-color:#e4ecf4;
    border-color:#999
}
#nav > li.selected  > a {
    background-color:#FFFFFF;
    border-color:#999999 #999999 #FFFFFF;
    z-index:2;
}
#nav li div {
    position:relative;
}
#nav li div div {
    background-color:#FFFFFF;
    border:1px solid #999999;
    padding:12px 0;
    display:none;
    font-size:0.75em;
    margin:0;
    position:absolute;
    top:-1px;
    z-index:1;
    width:190px;
}
#nav li div div.wrp2 {
    width:380px;
}
#nav .sep {
    left:190px;
    border-left:1px solid #E3E3E3;
    bottom:0;
    height:auto;
    margin:15px 0;
    position:absolute;
    top:0;
    width:1px;
}
#nav li div ul {
    padding-left:10px;
    padding-right:10px;
    position:relative;
    width:170px;
    float:left;
    list-style-type:none;
}
#nav li div ul li {
    margin:0;
    padding:0;
}
#nav li div ul li h3 {
    border-bottom:1px solid #E3E3E3;
    color:#4F4F4F;
    font-weight:bold;
    margin:0 5px 4px;
    font-size:0.95em;
    padding-bottom:3px;
    padding-top:3px;
}
#nav li ul ul {
    padding:0 0 8px;
}
#nav li ul ul li {
    margin:0;
    padding:0;
}
#nav li ul ul li a {
    color:#0060A6;
    display:block;
    margin-bottom:1px;
    padding:3px 5px;
    text-decoration:none;
    font-size:0.9em;
}
#nav li ul ul li a:hover{
    background-color:#0060a6;
    color:#fff;
}


/* demo page styles */



#labels {
	font-size: 15px;
	font-color: #414141;
}

#registration {
	width: 750px;
	padding: 25px;
	border: solid #dedede 1px;
	margin: auto;
	background: #f1f1f1;
	border-radius: 8px;
}

#input_production_info {
	width: 50%;
	padding: 25px;
	border: solid #dedede 1px;
	margin: left;
	background: #f1f1f1;
	border-radius: 8px;
}

/* Header/Blog Title */
.header {
	display: flex;
}

.header_left {
	padding: 10px;
	text-align: center;
	background: white;
	flex: 7;
}

.header_left h1 {
	font-size: 20px;
}

.header_right {
	text-align: center;
	background: #b0b0b0;
	font-size: 13px;
	flex: 1;
	float: center;
	padding: 5px 0px;
}

/* Style the bottom navigation bar */
.header_line {
	padding: 10px;
	background: #f1f1f1;
}

.nav_bottom_line {
	padding: 10px;
	background: #ff0000;
}


.topnav_input {
	float: right;

}

.inputs {
	text-align: left;
}

.input {
	width: 90%;
	margin-bottom: 25px;
	height: 40px;
	padding: 2px 20px;
	border: 2px solid #ccc;
	border-radius: 4px;
	background-color: #f8f8f8;
	font-size: 16px;
	resize: none;
}

.input_less {
	width: 60%;
	margin-bottom: 25px;
	height: 40px;
	padding: 2px 20px;
	border: 2px solid #ccc;
	border-radius: 4px;
	background-color: #f8f8f8;
	font-size: 16px;
	resize: none;
}

.button {
	width: 200px;
	
}


</style>

</body>
</html>