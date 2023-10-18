    // Using a Try Statement to ensure the connection is made
    // before executing any statements.
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

       // Creating the statement
       Statement stmt = conn.createStatement();

       // Add SQL commands to the batch
       stmt.addBatch("create table T (C1 integer, C2 varchar(15))");
       stmt.addBatch("insert into T values (100, 'Smith')");
       stmt.addBatch("insert into T values (200, 'Jones')");

       // Execute the batch
       int count[] = stmt.executeBatch();


    } catch (SQLException e) {
       e.printStackTrace();
    }
