select
    p.`name`
from
    Employee p
    left join Employee q on p.id = q.managerId
group by
    p.id,
    p.name
having
    count(*) >= 5
