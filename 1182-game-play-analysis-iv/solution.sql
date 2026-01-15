# Write your MySQL query statement below
select
    ROUND(count(sec.player_id) / count(first.player_id), 2)
    as fraction
from (
    select player_id, min(event_date) as event_date
        from Activity
        group by player_id
        ) as first
left join Activity as sec
on first.player_id = sec.player_id
and datediff(sec.event_date, first.event_date) = 1
