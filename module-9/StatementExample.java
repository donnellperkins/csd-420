    // Using a Try Statement to ensure the connection is made
    // before executing any statements.
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

       // Creating the statement
       Statement stmt = conn.createStatement();
       // Using the statement to get the results
       ResultSet rs = stmt.executeQuery(QUERY);) {

       // Extract data from result set
       while (rs.next()) {
          // Retrieve by column name
          System.out.print("ID: " + rs.getInt("id"));
          System.out.print(", Age: " + rs.getInt("age"));
          System.out.print(", First: " + rs.getString("first"));
          System.out.println(", Last: " + rs.getString("last"));
       }
    } catch (SQLException e) {
       e.printStackTrace();
    }
