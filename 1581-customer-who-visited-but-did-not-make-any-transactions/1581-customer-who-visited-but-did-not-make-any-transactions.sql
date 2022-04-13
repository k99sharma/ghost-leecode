SELECT customer_id, count(customer_id) as count_no_trans
FROM visits V
LEFT JOIN transactions T
ON V.visit_id = T.visit_id
WHERE amount IS NULL
GROUP BY customer_id;