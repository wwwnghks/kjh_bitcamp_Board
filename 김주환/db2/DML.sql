-- 1. 회사친구의 모든 데이터를 검색하기 위한 질의 (JOIN), 
--   : 이름으로 검색, 전화번호로 검색
select * from phoneInfo_univ 
inner join phoneInfo_basic on phoneInfo_univ.fr_ref=phoneInfo_basic.idx
where fr_name='홍길동';
-- 2. 대학친구의 모든 데이터를 검색하기 위한 질의 (JOIN)
--   : 이름으로 검색, 전화번호로 검색
select *
from phoneInfo_com 
inner join phoneInfo_basic on phoneInfo_com.fr_ref=phoneInfo_basic.idx
where fr_phonenumber='112';
-- 3. 회사친구, 대학친구 데이터를 보기위한 각 VIEW를 생성 합시다.
create or replace view phoneInfo_univ_view
as
select phoneInfo_basic.idx 'basic_idx',phoneInfo_basic.fr_name,phoneInfo_basic.FR_PHONENUMBER,phoneInfo_basic.FR_EMAIL,
phoneInfo_basic.FR_ADDRESS,phoneInfo_basic.FR_REGDATE,phoneInfo_univ.IDX 'univ_idx',phoneInfo_univ.FR_U_MAJOR,phoneInfo_univ.FR_U_YEAR 
from phoneInfo_univ 
inner join phoneInfo_basic on phoneInfo_univ.fr_ref=phoneInfo_basic.idx;

drop view phoneInfo_com_view;

select * from phoneInfo_com_view;

create or replace view phoneInfo_com_view
as
select phoneInfo_basic.idx 'basic_idx',phoneInfo_basic.fr_name,phoneInfo_basic.FR_PHONENUMBER,phoneInfo_basic.FR_EMAIL,
phoneInfo_basic.FR_ADDRESS,phoneInfo_basic.FR_REGDATE,phoneInfo_com.idx 'com_idx',phoneInfo_com.FR_C_COMPANY
from phoneInfo_com 
inner join phoneInfo_basic on phoneInfo_com.fr_ref=phoneInfo_basic.idx;



-- 5 회사친구, 대학친구의 데이터를 입력하기위한 INSERT 문을 작성합시다.
insert into phoneInfo_basic values(phoneInfo_basic_seq.nextval,'SCOTT','112','naver','LA',sysdate);
insert into phoneInfo_com values(phoneInfo_com_seq.nextval,'비트',phoneInfo_basic_seq.currval);


insert into phoneInfo_basic values(phoneInfo_basic_seq.nextval,'SCOTT','112','naver','LA',sysdate);
insert into phoneInfo_univ values(phoneInfo_univ_seq.nextval,'비트과',3,phoneInfo_basic_seq.currval);

-- 6. 회사친구, 대학친구 삭제 를 위한 SQL을 작성합시다.
 --   DDL로 테이블 만들 때 참조되는 키값에 대한 on delete CASCADE를 했습니다


delete from phoneInfo_basic where FR_PHONENUMBER='112';

delete from phoneInfo_basic where FR_NAME='홍길동';
-- 7. 빠른검색을 위한 인덱스 설정을 합시다. ( 이름, 전화번호 )
CREATE INDEX IDX_phoneInfo_basic_FR_NAME
ON phoneInfo_basic(FR_NAME); 

CREATE INDEX IDX_phoneInfo_basic_FR_PHONENUMBER
ON phoneInfo_basic(FR_PHONENUMBER); 