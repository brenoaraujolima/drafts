SELECT
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM PERSON p
LEFT JOIN Address a
ON p.personId = a.personId
