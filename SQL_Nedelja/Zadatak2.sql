SELECT *
FROM dependents
WHERE dependents.employee_id 
IN (SELECT employees.employee_id
    FROM employees
    WHERE employees.salary
    IN (SELECT MAX(salary)
        FROM employees)
    )
