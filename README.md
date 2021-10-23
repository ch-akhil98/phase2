# FlyAway (An Airline Reservation Application)
There is an admin page in which the user logins into the booking portal. The Username is admin and password is admin initially set to login into the 
Registration Page in which the user can fill the details and also can update the password. The Passenger details will be displayed in the next page
where he has to fill the travel details (from and to) destination. By clicking the search button the user will be redirected to the list of avaliable
flights and he has to select the flightId to book the flight. the list of flights contains info about the id , arrival , departure , date of travel 
which it fetches from the database. after booking the flight details will be displayed in the display page and payment gateway to pay the fare.
At the confirmation page it shows that booking has confirmed.This is dynamic web project which has a Servlet which acts like a controller layer and jsp 
pages as a view layer and also a dao(data access object) layer for database operations. Here MySql Workbench is used to store the login username,
password and storing airlines details
Github repository link :- https://github.com/ch-akhil98/phase2.git
So to perform operations we have to connect to the MySql database as all details are stored in it.
Technologies Used --> Core java , Servlets , JDBC , Html , Jsp , MySql workbench
