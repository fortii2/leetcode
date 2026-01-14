# Write your MySQL query statement below
select contest_id, ROUND(count(user_id) / (select count(*) from Users) * 100, 2) as percentage
from Register
group by contest_id
order by percentage desc, contest_id asc



-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | u.user_id     | int     |
-- | u.user_name   | varchar |
-- | r.contest_id  | int     |
-- | r.user_id     | int     |
-- +-------------+---------+
