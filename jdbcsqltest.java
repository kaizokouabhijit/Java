package inputoutputpackage;

/*
create database if not exists db;
create table if not exists student
(
id int not null auto_increment,
name varchar(50) not null,
marks int,
primary key(id));

create table if not exists parent
(
pid int not null auto_increment,
pname varchar(50),
gender varchar(10),
stid int,
foreign key(stid) references student(id)
);
insert into student (name, marks) values(("Abhijit", 70),("Rahul", 80),("Tharun", 90));
insert into parent (parentname, gender, stid) values(("Ajit",'M',1),("Mr. Gehlot", 'M', 2),("Tharun's dad", 'M', 3));

 */

import java.sql.*;
import java.util.ArrayList;

public class jdbcsqltest {
    private int id;
    static ArrayList<jdbcsqltest> arr = new ArrayList<>();
    private String parentname, name;
    public jdbcsqltest(int id, String name, String parentname){
        this.id = id;
        this.name = name;
        this.parentname = parentname;

    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db;";
        String name = "root";
        String pass = "pass";
        String query = "select s.id, s.name, p.parentname, from student s, parent p where p.stid = s.id";

            try {
                Connection con = DriverManager.getConnection(url, name, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                while(rs.next())
                {
                    arr.add(new jdbcsqltest(rs.getInt("id"), rs.getString("name"),rs.getString("pname") ));
                }



            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            finally {
                display();
            }



    }

    public static void display()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(arr);
        }
    }
    public String toString() {
        return ("id:"+this.id+
                " name: "+ this.name +
                "parent name "+ this.parentname
                );
    }
}

