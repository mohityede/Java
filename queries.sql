CREATE TABLE QUESTIONS(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    question TEXT,
    category TEXT,
    optionA TEXT,
    optionB TEXT,
    optionC TEXT,
    optionD TEXT,
    correctOption VARCHAR(1),
    difficulty TEXT
)

INSERT INTO QUESTIONS(question,category,optionA,optionB,optionC,optionD,correctOption,difficulty) 
VALUES('where you can run java code?','Java','Windows','Linux','mac','all of the above','d','easy');
INSERT INTO QUESTIONS(question,category,optionA,optionB,optionC,optionD,correctOption,difficulty) 
VALUES('Which HTML tag is used to define table?','HTML','<table>','<tables>','<th>','<tr>','a','easy');
INSERT INTO QUESTIONS(question,category,optionA,optionB,optionC,optionD,correctOption,difficulty) 
VALUES('Which tag defines paragraph?','HTML','<p>','<pre>','<panal>','none','a','easy');
INSERT INTO QUESTIONS(question,category,optionA,optionB,optionC,optionD,correctOption,difficulty) 
VALUES('Suppose list1 is [3, 4, 5, 20, 5, 25, 1, 3], what is list1 after list1.pop(1)?','Python','[3, 4, 5, 20, 5, 25, 1, 3]','[1, 3, 3, 4, 5, 5, 20, 25]','[3, 5, 20, 5, 25, 1, 3]','[1, 3, 4, 5, 20, 5, 25]','c','medium');
INSERT INTO QUESTIONS(question,category,optionA,optionB,optionC,optionD,correctOption,difficulty) 
VALUES('Which of the following is not javascript data types?','Javascript','Null type','Undefined type','Number type','all of the above','d','easy');

