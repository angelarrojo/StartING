Ejercicio 1: Seleccionar todas las filas
ejercicio muestra cómo seleccionar todas las filas de la tabla.

select * from categorias

Ejercicio 2: Seleccionar filas con un tipo específico
Este ejercicio enseña cómo filtrar las filas según el valor de una columna.

SELECT * FROM CATEGORIAS WHERE TIPO = 'Débito';

Ejercicio 3: Seleccionar solo ciertas columnas
Este ejercicio muestra cómo seleccionar solo algunas columnas de la tabla.

SELECT NOMBRE, DESCRIPCION FROM CATEGORIAS;


Ejercicio 4: Contar el número de filas
Este ejercicio enseña cómo contar el número total de filas en la tabla.

SELECT COUNT(*) FROM CATEGORIAS;


Ejercicio 5: Ordenar las filas por una columna
Este ejercicio muestra cómo ordenar las filas según el valor de una columna.

SELECT * FROM CATEGORIAS ORDER BY NOMBRE;


Ejercicio 6: Agrupar filas y contar por tipo
Este ejercicio enseña cómo agrupar las filas por el valor de una columna y contar el número de filas en cada grupo.

SELECT TIPO, COUNT(*) FROM CATEGORIAS GROUP BY TIPO;


Ejercicio 7: Actualizar una fila
Este ejercicio muestra cómo actualizar el valor de una columna en una fila específica.

UPDATE CATEGORIAS SET DESCRIPCION = 'Cuenta Naranja Plus' WHERE ID = 1;


Ejercicio 8: Eliminar una fila
Este ejercicio enseña cómo eliminar una fila de la tabla.

DELETE FROM CATEGORIAS WHERE ID = 4;



// tabla cuentas

Ejercicio 1: Seleccionar filas con un saldo específico

Este ejercicio enseña cómo filtrar las filas según el valor de una columna.

SELECT * FROM CUENTAS WHERE SALDO > 100;


Ejercicio 2: Unir dos tablas

Este ejercicio muestra cómo realizar una unión entre dos tablas para combinar información.

SELECT CUENTAS.NOMBRE, CUENTAS.SALDO, CATEGORIAS.TIPO
FROM CUENTAS
JOIN CATEGORIAS ON CUENTAS.CATEGORIA_ID = CATEGORIAS.ID;


Ejercicio 3: Seleccionar filas con fechas posteriores a una fecha dada

Este ejercicio enseña cómo filtrar filas con fechas posteriores a una fecha específica.

SELECT * FROM CUENTAS WHERE FECHA_APERTURA > '2020-01-01';


Ejercicio 4: Ordenar las filas por fecha

Este ejercicio enseña cómo ordenar las filas según la fecha de apertura en orden ascendente.

SELECT * FROM CUENTAS ORDER BY FECHA_APERTURA;



Ejercicio 5: Seleccionar filas con fechas dentro de un rango

Este ejercicio enseña cómo seleccionar filas con fechas dentro de un rango específico.

SELECT * FROM CUENTAS WHERE FECHA_APERTURA BETWEEN '2015-01-01' AND '2020-12-31';


Ejercicio 6: Extraer el mes de apertura
Este ejercicio enseña cómo extraer el mes de la fecha de apertura.

SELECT NOMBRE, MONTH(FECHA_APERTURA) AS MES_APERTURA FROM CUENTAS;

Ejercicio 7. Calcular dias/meses/años desde el dia de apertura 


SELECT NOMBRE, DATEDIFF('YEAR', FECHA_APERTURA, CURRENT_DATE) AS ANTIGUEDAD_DIAS FROM CUENTAS;

