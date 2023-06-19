-- -----------------------------------------------------
-- Creación de schema prevencionDB y usuario con permisos
-- -----------------------------------------------------
CREATE DATABASE prevencionDB CHARACTER SET utf8mb4;
CREATE USER prevencion@localhost IDENTIFIED BY 'projectprevencion';
GRANT ALL PRIVILEGES ON prevencionDB.* TO prevencion@localhost;
FLUSH PRIVILEGES;
USE prevencionDB;

-- -----------------------------------------------------
-- Eliminación y creación de tablas
-- -----------------------------------------------------
drop table usuario_cliente;
drop table usuario_administrativo;
drop table usuario_profesional;
drop table usuario;
drop table capacitacion;
drop table contacto;

-- -----------------------------------------------------
-- Table `prevencionDB`.`contacto`
-- -----------------------------------------------------
CREATE TABLE contacto(
	`id` 				 		INT NOT NULL AUTO_INCREMENT,
	`nombrecompleto`	 		VARCHAR(100) NOT NULL,
	`email` 			 		VARCHAR(100) NOT NULL,
	`asunto` 			 		VARCHAR(100) NOT NULL,
	`mensaje` 			 		VARCHAR(250) NOT NULL,
	PRIMARY KEY (`id`)
);
-- -----------------------------------------------------
-- Table `prevencionDB`.`capacitacion`
-- -----------------------------------------------------
CREATE TABLE capacitacion(
	`id` 				 		INT NOT NULL AUTO_INCREMENT,
    `rutcliente`		 		VARCHAR(20) NOT NULL,
    `dia`				 		VARCHAR(20) NOT NULL,
    `hora` 				 		VARCHAR(10) NOT NULL,
    `lugar`				 		VARCHAR(50) NOT NULL,
    `duracion`			 		VARCHAR(20) NOT NULL,
    `cantidadasistentes` 		INT NOT NULL,
    PRIMARY KEY(`id`)
);

-- -----------------------------------------------------
-- Table `prevencionDB`.`usuario`
-- -----------------------------------------------------
CREATE TABLE usuario(
	`id_usuario`				INT NOT NULL AUTO_INCREMENT,
    `nombre_usuario`			VARCHAR(20) NOT NULL,
    `password`					VARCHAR(20) NOT NULL,
    `run` 				 		VARCHAR(20) NOT NULL,
    `fecha_nacimiento`	 		VARCHAR(50) NOT NULL,
    `nombre`			 		VARCHAR(20) NOT NULL,
    `apellido`			 		VARCHAR(20) NOT NULL,   
    `tipo_usuario`	 	 		VARCHAR(20) NOT NULL,
    PRIMARY KEY(`id_usuario`)
);

-- -----------------------------------------------------
-- Table `prevencionDB`.`usuario_profesional`
-- -----------------------------------------------------
CREATE TABLE usuario_profesional(
	`id` 				 		INT AUTO_INCREMENT,    
    `id_usuario`				INT,
    `titulo`	 	 	 		VARCHAR(50),
    `fecha_ingreso`	 			VARCHAR(20),   
    PRIMARY KEY(`id`),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);

-- -----------------------------------------------------
-- Table `prevencionDB`.`usuario_administrativo`
-- -----------------------------------------------------
CREATE TABLE usuario_administrativo(
	`id` 				 		INT NOT NULL AUTO_INCREMENT,
    `id_usuario`	 	 		INT,
	`area`	 	 		 		VARCHAR(30),
    `experiencia_previa` 		VARCHAR(250),
    PRIMARY KEY(`id`),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);

-- -----------------------------------------------------
-- Table `prevencionDB`.`usuario_cliente`
-- -----------------------------------------------------
CREATE TABLE usuario_cliente(
	`id`			 			INT NOT NULL AUTO_INCREMENT,
    `id_usuario`	 	 		INT,
	`telefono`	 	 	 		INT,
    `afp`				 		VARCHAR(20),
	`sistema_salud`		 		VARCHAR(10),
    `direccion`					VARCHAR(70),
	`comuna` 		 			VARCHAR(70),
    `edad`	 	 			 	INT,
    PRIMARY KEY(`id`),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);

-- -----------------------------------------------------
-- Inserción de datos en las tablas para prueba
-- -----------------------------------------------------
INSERT INTO contacto (nombrecompleto, email, asunto, mensaje) VALUES
("Luis Armando Paredes Guillen", "laguillen@correo.com","Mensaje Prueba 1","Creacion de mensaje de prueba 1 desde la base de datos."),
("Juana Alarcon Manco", "jalarcon12@example.com","Mensaje Prueba 2","Creacion de mensaje de prueba 2 desde la base de datos."),
("Gilberto Santarosa", "Gsanta@correo.com","Mensaje Prueba 3","Creacion de mensaje de prueba 3 desde la base de datos.");

INSERT INTO capacitacion (rutcliente, dia, hora, lugar, duracion, cantidadasistentes) VALUES
("11.111.111-1", "Lunes", "12:00", "Hospital ASCH", "1 hora", 120),
("22.222.222-2", "Sabado", "15:00", "Hospital El Quilco", "3 horas", 55),
("33.333.333-3", "Jueves", "5:00", "Hospital Central", "2 horas", 30);

-- Usuario 1 vinculado a tipo de usuario "Cliente"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("StarLink97", "generico123", "33.333.333-3", "01/01/2001", "Angel José", "Ruiz Diaz","Cliente");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_cliente (id_usuario, telefono, afp, sistema_salud, direccion, comuna, edad) VALUES
(@ultimo_id, 99988811, "Modelo", "FONASA","Calle falsa 1", "La Reina",30);
-- Usuario 2 vinculado a tipo de usuario "Cliente"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("Drogo10", "pass987", "13.131.313-3", "02/03/2004", "Ricardo", "Estuardo Quintero","Cliente");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_cliente (id_usuario, telefono, afp, sistema_salud, direccion, comuna, edad) VALUES
(@ultimo_id, 12211898, "Plan Vital", "ISAPRE","Calle falsa 2000", "Florida",25);
-- Usuario 3 vinculado a tipo de usuario "Cliente"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("Limbiskit3", "limb10", "12.121.212-1", "10/09/2008", "Gerardo", "Zamora Hernandez","Cliente");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_cliente (id_usuario, telefono, afp, sistema_salud, direccion, comuna, edad) VALUES
(@ultimo_id, 993912332, "Avanza", "FONASA","Calle verdadera 20", "Miraflores",33);

-- Usuario 4 vinculado a tipo de usuario "Profesional"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("Moloko12", "pass123", "44.444.444-4", "04/04/2004", "Luis Fernando", "Contreras Vidal","Profesional");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_profesional (id_usuario, titulo, fecha_ingreso) VALUES
(@ultimo_id, "Ingeniero Comercial", "10/10/2010");
-- Usuario 5 vinculado a tipo de usuario "Profesional"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("Bilarda2001", "billy12", "31.313.131-1", "05/06/2007", "Alejandra", "Fernandez Bilardo","Profesional");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_profesional (id_usuario, titulo, fecha_ingreso) VALUES
(@ultimo_id, "Ingeniero Informatico", "20/11/2015");
-- Usuario 6 vinculado a tipo de usuario "Profesional"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("AnaLuz2000", "luz2000", "89.898.989-9", "10/09/2001", "Ana Lucia", "Ramirez Giillen","Profesional");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_profesional (id_usuario, titulo, fecha_ingreso) VALUES
(@ultimo_id, "Ingeniero Sistema", "04/05/2017");

-- Usuario 7 vinculado a tipo de usuario "Administrativo"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("Contador007", "cont007", "55.555.555-5", "10/10/1990", "Lucia", "Mendez Mendivil", "Administrativo");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_administrativo (id_usuario, area, experiencia_previa) VALUES
(@ultimo_id, "Contabilidad", "10 años en diversas empresas comerciales.");
-- Usuario 8 vinculado a tipo de usuario "Administrativo"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("francis20", "f20R2020", "14.141.414-4", "28/02/1999", "Francin ", "Videla Ricardi", "Administrativo");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_administrativo (id_usuario, area, experiencia_previa) VALUES
(@ultimo_id, "Recursos Humanos", "Ninguna.");
-- Usuario 9 vinculado a tipo de usuario "Administrativo"
INSERT INTO usuario (nombre_usuario, `password`, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES
("Diseño15", "disk1520", "65.656.565-5", "24/12/1995", "Bernardo", "Ruiz Tolentino", "Administrativo");
SET @ultimo_id = LAST_INSERT_ID();
INSERT INTO usuario_administrativo (id_usuario, area, experiencia_previa) VALUES
(@ultimo_id, "Desarrollo Web", "10 años en diversas empresas comerciales.");
 	 
-- -----------------------------------------------------
-- Select para poder llamar los atributos de las distintas tablas.
-- -----------------------------------------------------
select * from capacitacion;
select * from contacto;
select * from usuario;
select * from usuario_cliente;
select * from usuario_profesional;
select * from usuario_administrativo;
