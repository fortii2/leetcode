# Write your MySQL query statement below
select p.machine_id,
    ROUND(AVG(q.timestamp - p.timestamp), 3) AS processing_time
from Activity p
join Activity q
on p.machine_id = q.machine_id
    and p.process_id = q.process_id
    and p.activity_type = 'start'
    and q.activity_type = 'end'
group by machine_id
