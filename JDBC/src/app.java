import java.sql.*;

public class app {
    public static void main(String[] args) {
        /*
        1. import package
        2. load and register driver (optional)
        3. create connection
        4. create statement
        5. execute statement
        6. close connection
         */
        String url="jdbc:mysql://localhost:3306/world";
        String username="root";
        String password="Temp@1234";
        Connection conn=null;
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(url,username,password);
            System.out.println("Connected to local MySQL database...");

//            String query="select region from country where name='India';";
//            String query="select Name,SurfaceArea,Population from country where Continent='Oceania' limit 5;";
//            String query="insert into city(Name,CountryCode,District,Population) values('NCR2','IND','Delhi',19910);";
//            String query="update city set Name='NCR2-Updated' where ID=4081;";
//            String query="delete from city where ID=4080;";

//            Statement sm=conn.createStatement();
//            ResultSet res=sm.executeQuery(query);
//            boolean status=sm.execute(query);


//            System.out.println(res.next());
//            System.out.println(res.getString("region"));

//            while(res.next()){
//                System.out.print(res.getString(1)+" - ");
//                System.out.print(res.getDouble(2)+" - ");
//                System.out.println(res.getInt(3));
//            }

//            System.out.println(status);

            String name="NCR3";
            String countryCode="IND";
            String district="Delhi";
            int population=199287;

            String query="insert into city(Name,CountryCode,District,Population) values(?,?,?,?);";

            PreparedStatement sm=conn.prepareStatement(query);
            sm.setString(1,name);
            sm.setString(2,countryCode);
            sm.setString(3,district);
            sm.setInt(4,population);
            sm.execute();

            conn.close();
            System.out.println("DB connection closed...");
        }catch (Exception ex){
            System.out.println("Error Found : "+ ex.getMessage());
        }
    }
}
