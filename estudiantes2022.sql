USE estudiantes2022;
-- Comenzamos con el CRUD 
-- Listar los estudiantes (read)
SELECT * FROM estudiantes2022;
select idestudiantes2022, apellido from estudiantes2022; 
-- Insertar esudiante (create)
INSERT INTO estudiantes2022(nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "11223344", "jperez@mail.com");
-- Modificar (Update)
UPDATE estudiantes2022 SET nombre="Juan Carlos", apellido = "Garcia" WHERE idestudiantes2022= 1;
-- Eliminar (delete)
DELETE FROM estudiantes2022 WHERE idestudiantes2022=2;
-- Para modificar el idestudiantes2022 y comience en 1
ALTER TABLE estudiantes2022 AUTO_INCREMENT = 1;