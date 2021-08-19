<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />


<body>

<div id="input_production_info">

<form method="post" action="printers">


<input type="date"
       name="date"
       class="input_less"
       placeholder="дата">

<input type="text"
       name="order"
       class="input_less"
       placeholder="поръчка">
       

<select name="operators" Class="input"> 

    <c:forEach items="${operator_list}" var="operators">
    
        <option value="">${operators}</option>
        
    </c:forEach>
    
</select>

<select Class="input" name="operation">
  <option value="operation 1">operation 1</option>
  <option value="operation 1">operation 1</option>
  <option value="operation 1">operation 1</option>
  <option value="operation 1">operation 1</option>
</select>
       
<input type="number"
       name="time"
       class="input_less"
       placeholder="време">
       
<input type="number"
       name="quantity"
       class="input_less"
       placeholder="Количество">
 
<p>      
<input type="submit"
       value="Въведи"
       Class="button">

</form>

</div>

</body>
</html>