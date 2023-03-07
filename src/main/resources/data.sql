INSERT INTO roles VALUES (default, "ROLE_USER")
INSERT INTO roles VALUES (default, "ROLE_ADMIN")INSERT INTO events (title, date_hour, number_participants, description) VALUES ('Fiesta de inauguración', '2022-05-01 20:00:00', 100, 'Ven a celebrar la inauguración de nuestro nuevo local con música en vivo y bebidas gratis.');
-- ('Concierto de rock', '2022-06-15 19:30:00', 50, 'No te pierdas el concierto de rock más esperado del año con bandas locales y nacionales en vivo.'),
-- ('Torneo de fútbol', '2022-07-10 09:00:00', 20, 'Regístrate en nuestro torneo de fútbol y compite contra otros equipos por el gran premio.');

INSERT INTO images (url) VALUES 
('https://picsum.photos/200/300'),
-- ('https://picsum.photos/250/350'),
-- ('https://picsum.photos/300/400');


INSERT INTO users (username, password, roles)
VALUES
('johndoe', 'password1', 'ROLE_USER'),
('janedoe', 'password2', 'ROLE_ADMIN'),
('bobsmith', 'password3', 'ROLE_USER');
