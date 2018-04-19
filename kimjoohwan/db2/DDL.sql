


create table phoneInfo_basic(
    idx int not null,
    fr_name varchar(20) not null,
    fr_phonenumber varchar(20) not null,
    fr_email varchar(20),
    fr_address varchar(20),
    fr_regdate datetime default current_timestamp,
    CONSTRAINT phoneInfo_basic_idx_PK primary key(idx)
);
create table phoneInfo_univ(
    idx int(6) not null,
    fr_u_major varchar(20) DEFAULT 'N' not null,
    fr_u_year int DEFAULT 1  not null,
    fr_ref int not null,
    CONSTRAINT phoneInfo_univ_idx_PK PRIMARY KEY(idx),
    CONSTRAINT phoneInfo_univ_fr_ref_FK FOREIGN KEY(fr_ref) REFERENCES phoneInfo_basic(idx)
);
create table phoneInfo_com(
    idx int not null,
    fr_c_company varchar(20) default 'N' not null,
    fr_ref int not null,
    CONSTRAINT phoneInfo_com_idx_PK primary key(idx),
    CONSTRAINT phoneInfo_com_fr_ref_FK FOREIGN KEY(fr_ref) REFERENCES phoneInfo_basic(idx)
);


