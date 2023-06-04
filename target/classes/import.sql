INSERT INTO regiones (id, nombre) VALUES (1,'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2,'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3,'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4,'Europa');
INSERT INTO regiones (id, nombre) VALUES (5,'Asia');
INSERT INTO regiones (id, nombre) VALUES (6,'Africa');
INSERT INTO regiones (id, nombre) VALUES (7,'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8,'Antártida');


INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(1,'Magdali', 'Leon', 'magdaleon@gmail.com', '2022-10-01');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(8,'Juan', 'Garcia', 'juangarcia@gmail.com', '2022-10-02');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(2,'Pedro', 'Jaimes', 'pedrojaimes@gmail.com', '2022-10-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(2,'Pablo', 'Luna', 'pabloluna@gmail.com', '2022-10-04');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(3,'Carlos', 'Bastos', 'carlosbastos@gmail.com', '2022-10-05');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(3,'Sergio', 'Toloza', 'sergiotolo@gmail.com', '2022-10-06');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(4,'Simon', 'Gonzales', 'simongonza@gmail.com', '2022-10-07');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(5,'Laura', 'Mantilla', 'lauramanti@gmail.com', '2022-10-08');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(6,'Lucia', 'Maldonado', 'luciamaldo@gmail.com', '2022-10-09');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) VALUES(7,'Natalia', 'Arias', 'natiarias@gmail.com', '2022-10-10');

INSERT INTO productos (nombre,precio,create_at) VALUES ('Panasonic Pantalla LCD',259900,NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Producto 2',124580,NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Producto 3',50000,NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Producto 4',100000,NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Producto 5',250000,NOW());


INSERT INTO invoices (descripcion,observacion,cliente_id,create_at) VALUES ('Factura equipos de oficina', null,1,NOW());
INSERT INTO facturas_items (cantidad,factura_id,producto_id) VALUES (1,1,1);
INSERT INTO facturas_items (cantidad,factura_id,producto_id) VALUES (2,1,4);
INSERT INTO facturas_items (cantidad,factura_id,producto_id) VALUES (1,1,5);
INSERT INTO facturas_items (cantidad,factura_id,producto_id) VALUES (1,1,3);


INSERT INTO invoices (descripcion,observacion,cliente_id,create_at) VALUES ('Factura Bicicleta', 'Algna nota importante',1,NOW());
INSERT INTO facturas_items (cantidad,factura_id,producto_id) VALUES (3,2,2);
