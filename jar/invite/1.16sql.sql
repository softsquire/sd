Create Table T_INV_InviteSupplierEntry ( FParentID VARCHAR(44),FSupplierID VARCHAR(44),FLinkPerson VARCHAR(160),FLinkPhone VARCHAR(80),FSupplierState INT,FResult VARCHAR(100),FReason VARCHAR(255),FIsAccept INT,FRemark VARCHAR(2000),FRecommended VARCHAR(255),FManager VARCHAR(160),FCoState VARCHAR(255),FScore1 NUMERIC(28,10),FScore2 NUMERIC(28,10),FSeq INT,FID VARCHAR(44) DEFAULT '' NOT NULL ,CONSTRAINT PK_InviteSupplierE PRIMARY KEY (FID));

