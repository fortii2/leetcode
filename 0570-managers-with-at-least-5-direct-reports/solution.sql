# Write your MySQL query statement below
select emp.name
from Employee emp
left join Employee man
on emp.id = man.managerId
group by emp.id
having count(*) >= 5
