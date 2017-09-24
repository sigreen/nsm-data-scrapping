drop table if exists aig.NSM_MESSAGE_STORE;
drop table if exists aig.CIP_MESSAGE_STORE;

CREATE TABLE NSM_MESSAGE_STORE
   (MESSAGE_ID INT(4) AUTO_INCREMENT PRIMARY KEY,	
    BATCH_ID VARCHAR(100) NOT NULL, 
	FILE_ID VARCHAR(100) NOT NULL, 
	MESSAGE LONGTEXT,
	PROCESSED BOOLEAN
   );

CREATE TABLE CIP_MESSAGE_STORE
   (MESSAGE_ID INT(4) AUTO_INCREMENT PRIMARY KEY,	
    BATCH_ID VARCHAR(100) NOT NULL, 
	FILE_ID VARCHAR(100) NOT NULL, 
	MESSAGE LONGTEXT,
	PROCESSED BOOLEAN
   );
