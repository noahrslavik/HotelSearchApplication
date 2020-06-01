<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Hotel Result</title>
</head>
<body>
<container>
<h2>Hotels in ${city}</h2>			
</container>	
<container>
  <c:forEach items = "${hotels}" var = "hotel">
  <div class="media position-relative">

  <img class="mr-2" style="height: 144px; width: 144px" src= "${hotel.imageLink}" alt="image">
  

  <div class="media-body">
    <h5 class="mt-0">${hotel.name}</h5>
    <p>~$${hotel.pricePerNight} per night</p>
    <a href="${hotel.hotelLink}" class="btn btn-info">Book a room</a>
	<a href="/map?map=${hotel.mapLink}" class="btn btn-info" >View on Map</a>
  </div>
</div>
<br>  
  </c:forEach>
</table>



</container>
<a href="/" class="btn btn-info" >Go Back</a>
</body>
</html>