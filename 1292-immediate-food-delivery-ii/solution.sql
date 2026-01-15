# Write your MySQL query statement below
select ROUND(sum(if(customer_pref_delivery_date=order_date, 1, 0)) / count(*) * 100, 2) as immediate_percentage
from (
    select *,
    row_number() over(partition by customer_id order by order_date asc) as rn
    from Delivery) t
where rn = 1
