# Write your MySQL query statement below
with following_days as (
    select *,
        lag(temperature) over (order by recordDate ASC) as previous_tem,
        lag(recordDate) over (order by recordDate ASC) as previous_date
    from Weather
)

select  id
from following_days
where temperature > previous_tem
    and datediff(recordDate, previous_date) = 1
