SELECT title,length FROM film
WHERE length >
(
SELECT AVG(length) FROM film
);


SELECT COUNT(Rental_rate) FROM film
WHERE rental_rate =
(
	SELECT MAX(rental_rate) FROM film
);


SELECT title, rental_rate, replacement_cost
FROM film
WHERE rental_rate = 
(
	SELECT MIN(rental_rate) FROM film
)AND(
	replacement_cost = 
(
	SELECT MIN(replacement_cost) FROM film
));


SELECT customer.first_name, customer.last_name, customer.customer_id,
COUNT(payment_id) FROM payment 
INNER JOIN customer 
ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id 
ORDER BY COUNT (payment_id);
