# Write your MySQL query statement below
select stu.student_id, stu.student_name, sub.subject_name, count(e.student_id) as attended_exams
from Students stu
cross join Subjects sub
left join Examinations e
    on e.student_id = stu.student_id
        and e.subject_name = sub.subject_name
group by student_id, student_name, subject_name
order by stu.student_id, sub.subject_name
