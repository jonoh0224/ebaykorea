insert into member(id, name, email, passwd, reg_date)
values( null, 'kim', 'urstory@gmail.com', '1234', now());

insert into member(id, name, email, passwd, reg_date)
values( null, 'kang', 'carami@gmail.com', '1234', now());

insert into member_role(id, name, member_id)
values( null, 'USER', 1);

insert into member_role(id, name, member_id)
values( null, 'ADMIN', 1);

insert into member_role(id, name, member_id)
values( null, 'USER', 2);