insert into user values(1,'$2a$12$5xaFSOxZxrI1yTRC9dDWieBhilSQBCmI5cQq/sWMlU5SH.OChcMZ2','srishti');
insert into user values(2,'$2a$12$5xaFSOxZxrI1yTRC9dDWieBhilSQBCmI5cQq/sWMlU5SH.OChcMZ2','admin');

insert into role(role_id,role_name) values ('2','ADMIN');
insert into role(role_id,role_name) values ('1','STUDENT');


insert into user_roles(user_id,role_id) values(1,1);
insert into user_roles(user_id,role_id) values(2,2);