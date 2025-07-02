# Write your MySQL query statement below
SELECT employer.name as Employee 
FROM employee manager 
INNER JOIN employee employer 
ON manager.id = employer.managerID
WHERE manager.salary < employer.salary