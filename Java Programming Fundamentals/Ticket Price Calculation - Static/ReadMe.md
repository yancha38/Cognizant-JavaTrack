## Ticket Price Calculation - Static

**Ticket Calculation**

Create a class ```Ticket``` with the following private variables<br>
_int ticketid;_<br>
_int price;_<br>
_static int availableTickets;_<br>


Include getters and setters methods in the Ticket class.

AvailableTickets should hold only **positive value**. _Zero_ and _negative_ values are not allowed.(This logic should be checked inside the corresponding setter method)

Write the following method in the Ticket class:

```public int calculateTicketCost(int nooftickets)``` —this method should check the ticket availability, If the tickets are available, reduce the nooftickets from availableTickets and calculate the total amount as nooftickets*price  and return the total amount.  If the tickets are not available, this method should return -1.

Write a main method in the Main class to test the application.

**Sample input and output**

Enter no of bookings:
2<br>
Enter the available tickets:
25<br>
Enter the ticketid:
123<br>
Enter the price:
100<br>
Enter the no of tickets:
5<br>
Available tickets: 25<br>

Total amount:500

Available ticket after booking:20

Enter the ticketid:
124<br>

Enter the price:
100<br>

Enter the no of tickets:
2<br>

Available tickets: 20

Total amount:200

Available ticket after booking:18
