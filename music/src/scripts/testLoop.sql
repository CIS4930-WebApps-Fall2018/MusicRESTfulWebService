DROP PROCEDURE IF EXISTS insertTracks;

DELIMITER //
CREATE PROCEDURE insertTracks
(IN numTracks INT)

BEGIN
 DECLARE x  INT;
 DECLARE titleInput  VARCHAR(255);
 
 SET x = 1;
 
 WHILE x  <= numTracks DO
	 SET  titleInput = CONCAT('A2-Track ',x);
	 INSERT INTO tracks (title,album) VALUES (titleInput, 2);
	 SET  x = x + 1; 

 END WHILE;
 SELECT * FROM tracks;
 
END //
DELIMITER ;
CALL insertTracks(5);