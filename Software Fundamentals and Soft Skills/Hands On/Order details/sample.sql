SELECT a.order_id, c.customer_name, b.hotel_name, a.order_amount FROM customers c
JOIN orders a ON c.customer_id = a.customer_id
JOIN hotel_details b ON a.hotel_id = b.hotel_id
ORDER BY a.order_id;
