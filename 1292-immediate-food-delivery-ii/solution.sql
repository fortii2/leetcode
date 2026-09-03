# Write your MySQL query statement below
# each customer's first order date.

with first_order_date as (
    select *,
        row_number() over (
            partition by customer_id 
            order by order_date ASC
        ) as rn
    from Delivery
)

select 
    round(sum(order_date = customer_pref_delivery_date) / count(*) * 100.0, 2) as immediate_percentage
from first_order_date
where rn = 1
