1.检索计算机系全体学生的名单
select * from student where dept = '计算机';
2）检索考试成绩有不及格的学生学号.
select distinct sc.sno from sc where score<60; 
3）检索选修了1号课程的学生的学号及其成绩,查询结果按分数的降序排序.
select t1.sno t2.score from student t1,sc t2,course t3 where t3.con=1 and order by t2.score desc;
4）检索学生姓名机器所选修课程的课程号和成绩.
select
 t1.sname t2.con,t3.score
from
student t1,course t2,sc t3
where
t3.sno = t1.sno
or
t3.con = t2.con;

5）检索所有比“李华”年龄大的学生姓名、年龄和性别.
select t1.sname ,t1.sage,t1.gender from student
where age > (select sage from student where sname ="李华");