DELETE FROM taco_order_tacos;

DELETE FROM taco_ingredients;

DELETE FROM taco;

DELETE FROM taco_order;

DELETE FROM ingredient;

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('FLTO',
             'Flour Tortilla',
             'WRAP');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('COTO',
             'Corn Tortilla',
             'WRAP');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('GRBF',
             'Ground Beef',
             'PROTEIN');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('CARN',
             'Carnitas',
             'PROTEIN');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('TMTO',
             'Diced Tomatoes',
             'VEGGIES');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('LETC',
             'Lettuce',
             'VEGGIES');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('CHED',
             'Cheddar',
             'CHEESE');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('JACK',
             'Monterrey Jack',
             'CHEESE');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('SLSA',
             'Salsa',
             'SAUCE');

INSERT INTO ingredient
            (id,
             NAME,
             type)
VALUES      ('SRCR',
             'Sour Cream',
             'SAUCE');