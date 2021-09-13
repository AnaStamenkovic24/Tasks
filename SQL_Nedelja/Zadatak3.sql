SELECT countries.country_name, SUM(salary) 
FROM countries
INNER JOIN locations 
ON locations.country_id = countries.country_id
INNER JOIN departments
ON departments.location_id = locations.location_id
INNER JOIN employees
ON employees.department_id = departments.department_id
GROUP BY countries.country_name
ORDER BY SUM(employees.salary) DESC
