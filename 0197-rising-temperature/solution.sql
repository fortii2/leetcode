# Write your MySQL query statement below
with weather_with_previous_year as (
    select id, 
        recordDate,
        temperature,
        lag(recordDate) over (order by recordDate) as pre_recordDate,
        lag(temperature) over (order by recordDate) as pre_temperature
    from Weather
)

select id
from weather_with_previous_year
where temperature > pre_temperature
    and datediff(recordDate, pre_recordDate) = 1
