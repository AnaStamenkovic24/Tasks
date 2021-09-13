SELECT email, phone_number
FROM employees
WHERE employees.department_id
IN ( SELECT departments.department_id
  FROM departments 
  WHERE departments.location_id
  IN ( SELECT locations.location_id
    FROM locations
    WHERE locations.country_id
    IN ( SELECT countries.country_id
      FROM countries
        WHERE countries.region_id
      IN
      ( SELECT regions.region_id
        FROM regions
        WHERE region_name = 'Europe'
        ))))
        
GROUP BY phone_number, email
HAVING phone_number IS NOT NULL;
