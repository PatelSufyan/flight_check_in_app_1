<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>	
	<h2>Reservation Details</h2>
	
	Passenger First Name: ${reservation.getPassenger().firstName } <br>
	Passenger Last Name: ${reservation.getPassenger().lastName } <br>
	Passenger Middle Name: ${reservation.getPassenger().middleName } <br>
	Passenger Email: ${reservation.getPassenger().email } <br>
	Passenger Phone: ${reservation.getPassenger().phone } <br>
	
	Operating Airlines: ${reservation.getFlight().operatingAirlines } <br>
	Departure City: ${reservation.getFlight().departureCity } <br>
	Arrival City: ${reservation.getFlight().arrivalCity } <br>
	Date of Departure: ${reservation.getFlight().dateOfDeparture } <br>
	
	<h2>Update Luggage Count and Boarding Status </h2>
	
	<form action="proceedToCheckIn" method="post">
		Reservation Id <input type="text" name="id" value="${reservation.id }" readonly/>
		Number of Bags <input type="text" name="numberOfBags"/>
		<input type="submit" value="confirm"/> 
	</form>
	
</body>
</html>