Create Table T_SHE_SpecialDiscountAgioEntry ( FHeadId VARCHAR(44),FAgioID VARCHAR(44),FAmount NUMERIC(28,10),FPro NUMERIC(28,10),FSeq INT,FOperate VARCHAR(100),FID VARCHAR(44) DEFAULT '' NOT NULL ,CONSTRAINT PK_SpecialDAGIOE PRIMARY KEY (FID));

Alter Table CT_SHE_SpecialDiscount Add FAgioDesc NVARCHAR(200);

Alter Table T_SHE_SpecialDiscountEntry Add FAgioPrice NUMERIC(28,10);

Alter Table T_SHE_SpecialDiscountEntry Add FAgioAmount NUMERIC(28,10);
