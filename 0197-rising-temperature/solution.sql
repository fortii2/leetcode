select p.id
from Weather p
join Weather q
on datediff(p.recordDate, q.recordDate) = 1
where p.temperature > q.temperature
