mvn clean package:

![obraz](https://github.com/user-attachments/assets/5c903481-1da1-4ee7-82e1-8992b32c89a2)

![obraz](https://github.com/user-attachments/assets/4d01a660-f12d-4828-acf6-b3c4ea24ddc6)

PS C:\Users\Tomek\IdeaProjects\Lab03-JavaV2> mvn clean package
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< org.example:Lab03-JavaV2 >----------------------
[INFO] Building Lab03-JavaV2 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The artifact org.hibernate:hibernate-core:jar:6.2.8.Final has been relocated to org.hibernate.orm:hibernate-core:jar:6.2.8.Final
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ Lab03-JavaV2 ---
[INFO] Deleting C:\Users\Tomek\IdeaProjects\Lab03-JavaV2\target
[INFO] 
[INFO] --- jacoco:0.8.12:prepare-agent (default) @ Lab03-JavaV2 ---
[INFO] argLine set to -javaagent:C:\\Users\\Tomek\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.12\\org.jacoco.agent-0.8.12-runtime.jar=destfile=C:\\Users\\Tomek\\IdeaProjects\\Lab03-JavaV2\\target\\jacoco.exec
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ Lab03-JavaV2 ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ Lab03-JavaV2 ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 7 source files with javac [debug target 23] to target\classes
[INFO] /C:/Users/Tomek/IdeaProjects/Lab03-JavaV2/src/main/java/org/example/ShapeDAO.java: C:\Users\Tomek\IdeaProjects\Lab03-JavaV2\src\main\java\org\example\ShapeDAO.java uses or overrides a deprecated API.
[INFO] /C:/Users/Tomek/IdeaProjects/Lab03-JavaV2/src/main/java/org/example/ShapeDAO.java: Recompile with -Xlint:deprecation for details.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ Lab03-JavaV2 ---
[INFO] skip non existing resourceDirectory C:\Users\Tomek\IdeaProjects\Lab03-JavaV2\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ Lab03-JavaV2 ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 5 source files with javac [debug target 23] to target\test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ Lab03-JavaV2 ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.ColorTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.085 s -- in org.example.ColorTest
[INFO] Running org.example.RectangleTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.015 s -- in org.example.RectangleTest
[INFO] Running org.example.ShapeDAOTest
gru 05, 2024 10:01:35 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 6.2.8.Final
gru 05, 2024 10:01:35 PM org.hibernate.cfg.Environment <clinit>
INFO: HHH000406: Using bytecode reflection optimizer
gru 05, 2024 10:01:35 PM org.hibernate.boot.jaxb.internal.stax.LocalXmlResourceResolver resolveEntity
WARN: HHH90000012: Recognized obsolete hibernate namespace http://hibernate.sourceforge.net/hibernate-configuration. Use namespace http://www.hibernate.org/dtd/hibernate-configuration instead.  Support for obsolete DTD/XSD namespaces may be removed at any time.
gru 05, 2024 10:01:36 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
gru 05, 2024 10:01:36 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: Loaded JDBC driver class: org.postgresql.Driver
gru 05, 2024 10:01:36 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001012: Connecting with JDBC URL [jdbc:postgresql://localhost:5432/Lab04]
gru 05, 2024 10:01:36 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=lab_user, password=****}
gru 05, 2024 10:01:36 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
gru 05, 2024 10:01:36 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH10001115: Connection pool size: 20 (min=1)
gru 05, 2024 10:01:37 PM org.hibernate.bytecode.internal.BytecodeProviderInitiator buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : bytebuddy
gru 05, 2024 10:01:39 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: drop table if exists Rectangle cascade
gru 05, 2024 10:01:39 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1f612968] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: drop table if exists Triangle cascade
Hibernate: create table Rectangle (alpha integer not null, blue integer not null, green integer not null, red integer not null, side_a float(53) not null, side_b float(53) not null, id bigserial not null, class_name varchar(255) not null, primary key (id))
gru 05, 2024 10:01:39 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@3d056418] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: create table Triangle (a float(53) not null, alpha integer not null, b float(53) not null, blue integer not null, c float(53) not null, green integer not null, red integer not null, id bigserial not null, class_name varchar(255) not null, primary key (id))
Hibernate: insert into Rectangle (side_a,side_b,class_name,red,green,blue,alpha) values (?,?,?,?,?,?,?)
Hibernate: insert into Rectangle (side_a,side_b,class_name,red,green,blue,alpha) values (?,?,?,?,?,?,?)
Hibernate: select r1_0.id,r1_0.side_a,r1_0.side_b,r1_0.class_name,r1_0.red,r1_0.green,r1_0.blue,r1_0.alpha from Rectangle r1_0 where r1_0.id=?
Hibernate: insert into Rectangle (side_a,side_b,class_name,red,green,blue,alpha) values (?,?,?,?,?,?,?)
Hibernate: select r1_0.id,r1_0.side_a,r1_0.side_b,r1_0.class_name,r1_0.red,r1_0.green,r1_0.blue,r1_0.alpha from Rectangle r1_0 where r1_0.id=?
Hibernate: delete from Rectangle where id=?
Hibernate: select r1_0.id,r1_0.side_a,r1_0.side_b,r1_0.class_name,r1_0.red,r1_0.green,r1_0.blue,r1_0.alpha from Rectangle r1_0 where r1_0.id=?
gru 05, 2024 10:01:39 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:postgresql://localhost:5432/Lab04]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.115 s -- in org.example.ShapeDAOTest
[INFO] Running org.example.ShapeDescriberTest
Class Name: Triangle
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Area: 6.0
Perimeter: 12.0
[main] INFO org.example.ShapeDescriber - Opis figury:
[main] INFO org.example.ShapeDescriber - Typ figury: Triangle
[main] INFO org.example.ShapeDescriber - Kolor figury: Red: 255, Green: 0, Blue: 0, Alpha: 255
[main] INFO org.example.ShapeDescriber - Pole figury: 6.0
[main] INFO org.example.ShapeDescriber - Obwód figury: 12.0
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.045 s -- in org.example.ShapeDescriberTest
[INFO] Running org.example.TriangleTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s -- in org.example.TriangleTest
[INFO] 
[INFO] Results:
[INFO]
[INFO]
[INFO]
[INFO] --- jar:3.4.1:jar (default-jar) @ Lab03-JavaV2 ---
[INFO] Building jar: C:\Users\Tomek\IdeaProjects\Lab03-JavaV2\target\Lab03-JavaV2-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.087 s
[INFO] Finished at: 2024-12-05T22:01:40+01:00
[INFO] ------------------------------------------------------------------------

Wyniki w bazie danych:
![obraz](https://github.com/user-attachments/assets/46db957d-0281-4f81-96fc-175189294a9f)

Testy jednostkowe:

![obraz](https://github.com/user-attachments/assets/175b25c7-cace-4388-b713-847c2d13402e)

![obraz](https://github.com/user-attachments/assets/af48a243-40e5-43cc-81af-f310a3f99a19)


mvn test:
PS C:\Users\Tomek\IdeaProjects\Lab03-JavaV2> mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< org.example:Lab03-JavaV2 >----------------------
[INFO] Building Lab03-JavaV2 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The artifact org.hibernate:hibernate-core:jar:6.2.8.Final has been relocated to org.hibernate.orm:hibernate-core:jar:6.2.8.Final
[INFO] 
[INFO] --- jacoco:0.8.12:prepare-agent (default) @ Lab03-JavaV2 ---
[INFO] argLine set to -javaagent:C:\\Users\\Tomek\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.12\\org.jacoco.agent-0.8.12-runtime.jar=destfile=C:\\Users\\Tomek\\IdeaProjects\\Lab03-JavaV2\\target\\jacoco.exec
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ Lab03-JavaV2 ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ Lab03-JavaV2 ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 7 source files with javac [debug target 23] to target\classes
[INFO] /C:/Users/Tomek/IdeaProjects/Lab03-JavaV2/src/main/java/org/example/ShapeDAO.java: C:\Users\Tomek\IdeaProjects\Lab03-JavaV2\src\main\java\org\example\ShapeDAO.java uses or overrides a deprecated API.
[INFO] /C:/Users/Tomek/IdeaProjects/Lab03-JavaV2/src/main/java/org/example/ShapeDAO.java: Recompile with -Xlint:deprecation for details.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ Lab03-JavaV2 ---
[INFO] skip non existing resourceDirectory C:\Users\Tomek\IdeaProjects\Lab03-JavaV2\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ Lab03-JavaV2 ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 5 source files with javac [debug target 23] to target\test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ Lab03-JavaV2 ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.ColorTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.140 s -- in org.example.ColorTest
[INFO] Running org.example.RectangleTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s -- in org.example.RectangleTest
[INFO] Running org.example.ShapeDAOTest
gru 05, 2024 10:05:50 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 6.2.8.Final
gru 05, 2024 10:05:50 PM org.hibernate.cfg.Environment <clinit>
INFO: HHH000406: Using bytecode reflection optimizer
gru 05, 2024 10:05:50 PM org.hibernate.boot.jaxb.internal.stax.LocalXmlResourceResolver resolveEntity
WARN: HHH90000012: Recognized obsolete hibernate namespace http://hibernate.sourceforge.net/hibernate-configuration. Use namespace http://www.hibernate.org/dtd/hibernate-configuration instead.  Support for obsolete DTD/XSD namespaces may be removed at any time.
gru 05, 2024 10:05:51 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
gru 05, 2024 10:05:51 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: Loaded JDBC driver class: org.postgresql.Driver
gru 05, 2024 10:05:51 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001012: Connecting with JDBC URL [jdbc:postgresql://localhost:5432/Lab04]
gru 05, 2024 10:05:51 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=lab_user, password=****}
gru 05, 2024 10:05:51 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
gru 05, 2024 10:05:51 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH10001115: Connection pool size: 20 (min=1)
gru 05, 2024 10:05:52 PM org.hibernate.bytecode.internal.BytecodeProviderInitiator buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : bytebuddy
gru 05, 2024 10:05:54 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: drop table if exists Rectangle cascade
gru 05, 2024 10:05:54 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1f612968] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: drop table if exists Triangle cascade
Hibernate: create table Rectangle (alpha integer not null, blue integer not null, green integer not null, red integer not null, side_a float(53) not null, side_b float(53) not null, id bigserial not null, class_name varchar(255) not null, primary key (id))
gru 05, 2024 10:05:54 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@3d056418] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: create table Triangle (a float(53) not null, alpha integer not null, b float(53) not null, blue integer not null, c float(53) not null, green integer not null, red integer not null, id bigserial not null, class_name varchar(255) not null, primary key (id))
Hibernate: insert into Rectangle (side_a,side_b,class_name,red,green,blue,alpha) values (?,?,?,?,?,?,?)
Hibernate: insert into Rectangle (side_a,side_b,class_name,red,green,blue,alpha) values (?,?,?,?,?,?,?)
Hibernate: select r1_0.id,r1_0.side_a,r1_0.side_b,r1_0.class_name,r1_0.red,r1_0.green,r1_0.blue,r1_0.alpha from Rectangle r1_0 where r1_0.id=?
Hibernate: insert into Rectangle (side_a,side_b,class_name,red,green,blue,alpha) values (?,?,?,?,?,?,?)
Hibernate: select r1_0.id,r1_0.side_a,r1_0.side_b,r1_0.class_name,r1_0.red,r1_0.green,r1_0.blue,r1_0.alpha from Rectangle r1_0 where r1_0.id=?
Hibernate: delete from Rectangle where id=?
Hibernate: select r1_0.id,r1_0.side_a,r1_0.side_b,r1_0.class_name,r1_0.red,r1_0.green,r1_0.blue,r1_0.alpha from Rectangle r1_0 where r1_0.id=?
gru 05, 2024 10:05:54 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:postgresql://localhost:5432/Lab04]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.696 s -- in org.example.ShapeDAOTest
[INFO] Running org.example.ShapeDescriberTest
Class Name: Triangle
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Area: 6.0
Perimeter: 12.0
[main] INFO org.example.ShapeDescriber - Opis figury:
[main] INFO org.example.ShapeDescriber - Typ figury: Triangle
[main] INFO org.example.ShapeDescriber - Kolor figury: Red: 255, Green: 0, Blue: 0, Alpha: 255
[main] INFO org.example.ShapeDescriber - Pole figury: 6.0
[main] INFO org.example.ShapeDescriber - Obwód figury: 12.0
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 s -- in org.example.ShapeDescriberTest
[INFO] Running org.example.TriangleTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 s -- in org.example.TriangleTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.147 s
[INFO] Finished at: 2024-12-05T22:05:55+01:00
[INFO] ------------------------------------------------------------------------
