# Write your MySQL query statement below
select query_name,
ROUND(avg(rating/`position`), 2) as quality,
ROUND(sum(CASE WHEN rating < 3 then 1 else 0 END) / count(*) * 100, 2) as poor_query_percentage
from Queries
group by query_name
