SELECT a.student_name, b.department_name FROM student a
LEFT JOIN department b ON a.department_id = b.department_id
WHERE a.city IN ('Coimbatore')
ORDER BY a.student_name;
