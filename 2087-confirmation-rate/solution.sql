# Write your MySQL query statement below
WITH rate AS (
    SELECT
        user_id,
        ROUND(
            SUM(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END)
            / COUNT(*), 2
        ) AS confirmation_rate
    FROM Confirmations
    GROUP BY user_id
)

SELECT
    su.user_id,
    COALESCE(r.confirmation_rate, 0) AS confirmation_rate
FROM Signups su
LEFT JOIN rate r
    ON su.user_id = r.user_id;
