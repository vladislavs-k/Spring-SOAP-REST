INSERT INTO user_details (id, birth_date, name) 
VALUES (10001, current_date(), 'Vlad');

INSERT INTO user_details (id, birth_date, name) 
VALUES (10002, current_date(), 'Bob');

INSERT INTO user_details (id, birth_date, name) 
VALUES (10003, current_date(), 'Jane');


INSERT INTO post (id, description, user_id)
VALUES (20001, 'I want to learn Spring', 10001);

INSERT INTO post (id, description, user_id)
VALUES (20002, 'I want to learn DevOps', 10001);

INSERT INTO post (id, description, user_id)
VALUES (20003, 'I want to learn C++', 10002);

INSERT INTO post (id, description, user_id)
VALUES (20004, 'I want to learn Cloud', 10002);

-- SELECT user_details.name, post.description FROM post JOIN user_details ON post.user_id = user_details.id;