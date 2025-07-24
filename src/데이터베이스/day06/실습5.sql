DROP DATABASE IF EXISTS exam5;
CREATE DATABASE exam5;
USE exam5;
-- 1. 카테고리 테이블
CREATE TABLE pcategory(
    카테고리번호_pk INT UNSIGNED AUTO_INCREMENT,
    카테고리명 VARCHAR(10) NOT NULL,
    PRIMARY KEY(카테고리번호_pk)
);
-- 2. 제품 테이블
CREATE TABLE product(
    제품번호_pk INT UNSIGNED AUTO_INCREMENT,
    제품명 VARCHAR(100) NOT NULL,
    제품가격 INT UNSIGNED NOT NULL,
    카테고리번호_fk INT UNSIGNED,
    PRIMARY KEY(제품번호_pk),
    FOREIGN KEY(카테고리번호_fk) REFERENCES pcategory(카테고리번호_pk)
);
-- 3. 재고 테이블
CREATE TABLE stock(
    재고번호_pk INT UNSIGNED AUTO_INCREMENT,
    재고수량 INT,
    재고등록날짜 DATETIME DEFAULT NOW(),
    제품번호_fk INT UNSIGNED,
    PRIMARY KEY(재고번호_pk),
    FOREIGN KEY(제품번호_fk) REFERENCES product(제품번호_pk)
);

-- 샘플 데이터 삽입
INSERT INTO pcategory(카테고리명) VALUES('노트북'), ('스마트폰'), ('의류'), ('도서');
INSERT INTO product(제품명, 제품가격, 카테고리번호_fk) VALUES
('그램 15인치', 1500000, 1), ('맥북 프로 16인치', 3000000, 1),
('갤럭시 S23', 1200000, 2), ('아이폰 14 Pro', 1550000, 2),
('반팔 티셔츠', 30000, 3), ('청바지', 80000, 3),
('혼공 SQL', 22000, 4);
INSERT INTO stock(재고수량, 제품번호_fk) VALUES (10, 1), (5, 2), (20, 3), (15, 4), (100, 5), (50, 6),(5, 1), (2, 3);

-- [문제 1] 모든 제품의 제품명과 해당 제품의 카테고리명을 함께 조회하세요. (조회결과: 7개 레코드)
select cate.카테고리명 , pduct.제품명 from pcategory cate join product pduct on cate.카테고리번호_pk = pduct.카테고리번호_fk;
-- [문제 2] '노트북' 카테고리에 속하는 모든 제품의 제품명과 제품가격을 조회하세요. (조회결과: 2개 레코드)
select pduct.제품명,pduct.제품가격 from pcategory cate join product pduct on cate.카테고리번호_pk = pduct.카테고리번호_fk where cate.카테고리명 = '노트북';
-- [문제 3] 모든 제품의 제품명과 등록된 재고수량을 함께 조회하세요. (조회결과: 8개 레코드)
select pduct.제품명 , stock.재고수량 from product pduct join stock on pduct.제품번호_pk = stock.제품번호_fk;
-- [문제 4] '그램 15인치' 제품의 모든 재고등록날짜와 재고수량을 조회하세요. (조회결과: 2개 레코드)
select s.재고등록날짜 , s.재고수량 from product p join stock s on p.제품번호_pk = s.제품번호_fk where p.제품명 = '그램 15인치';
-- [문제 5] 모든 제품의 제품명, 카테고리명, 재고수량을 한 번에 조회하세요. (3개 테이블 조인) (조회결과: 8개 레코드)
-- 3개이상의 테이블 조인 : 테이블A join 테이블B on 테이블A_pk = 테이블B_fk
select p.카테고리명 , pc.제품명 , s.재고수량 from pcategory p  join product pc on p.카테고리번호_pk = pc.카테고리번호_fk join stock s on pc.제품번호_pk = s.제품번호_fk;
-- [문제 6] 모든 카테고리의 카테고리명과 해당 카테고리에 속한 제품명을 조회하세요. 만약 카테고리에 속한 제품이 없더라도 카테고리명은 모두 표시되도록 하세요. (조회결과: 7개 레코드)
select p.카테고리명,pc.제품명 from pcategory p left join product pc on p.카테고리번호_pk = pc.카테고리번호_fk;
-- [문제 7] 재고가 한 번도 등록되지 않은 제품의 제품명을 조회하세요. (조회결과: 1개 레코드)
select pc.제품명 from product pc left join stock s on pc.제품번호_pk = s.제품번호_fk where s.재고등록날짜 is null;
-- [문제 8] 각 카테고리별로 총 재고 수량의 합계를 카테고리명과 함께 조회하세요. (조회결과: 3개 레코드)
select p.카테고리명 , sum(s.재고수량) from pcategory p left join product pc on p.카테고리번호_pk = pc.카테고리번호_fk join stock s on pc.제품번호_pk = s.제품번호_fk group by p.카테고리명;
-- [문제 9] 각 제품별로 총 재고 수량을 조회하고, 총 재고 수량이 많은 순서대로 정렬하여 제품명과 총재고수량을 표시하세요. (조회결과: 6개 레코드)
select pc.제품명 , sum(s.재고수량) from  product pc join stock s on pc.제품번호_pk = s.제품번호_fk group by pc.제품명 order by sum(s.재고수량) desc;