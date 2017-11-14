 - echo $PATH
/user/local/bin:/user/bin:/ussr/sbin:/sbins
export PATH=/Users/Amol/MyWork/apache-maven-3.5.0/bin:${PATH}

export PATH=${PATH}:/usr/local/mysql-5.7.20-macos10.12-x86_64/bin


2017-11-12T19:36:18.929161Z 1 [Note] A temporary password is generated for root@localhost: !VtsjN*Cp7cC

If you lose this password, please consult the section How to Reset the Root Password in the MySQL reference manual.

 mysql -u root -p

mysql>ALTER USER 'root'@'localhost' IDENTIFIED BY 'mysql_Amol';

mysql> create DATABASE First_DB
    -> ;
Query OK, 1 row affected (0.00 sec)

mysql> show DATABASES
    -> ;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| First_DB           |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

Creating a table inside a database.  First, pick the database in which you want to create the table with a USE statement:
mysql> use First_DB
Database changed
mysql> CREATE TABLE cats
    -> (
    ->   id              INT unsigned NOT NULL AUTO_INCREMENT, # Unique ID for the record
    ->   name            VARCHAR(150) NOT NULL,                # Name of the cat
    ->   owner           VARCHAR(150) NOT NULL,                # Owner of the cat
    ->   birth           DATE NOT NULL,                        # Birthday of the cat
    ->   PRIMARY KEY     (id)                                  # Make the id the primary key
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> show TABLES;
+--------------------+
| Tables_in_first_db |
+--------------------+
| cats               |
+--------------------+
1 row in set (0.01 sec)

mysql> describe cats
    -> ;
+-------+------------------+------+-----+---------+----------------+
| Field | Type             | Null | Key | Default | Extra          |
+-------+------------------+------+-----+---------+----------------+
| id    | int(10) unsigned | NO   | PRI | NULL    | auto_increment |
| name  | varchar(150)     | NO   |     | NULL    |                |
| owner | varchar(150)     | NO   |     | NULL    |                |
| birth | date             | NO   |     | NULL    |                |
+-------+------------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

insert into Cats (Id, Name, Owner, birth) values(1, "David", "John",null);
