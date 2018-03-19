package main;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.util.ConnectionFactory;

public class main_tester {
    public static void main(String[] args){
    	Connection conn = ConnectionFactory.getInstance().getConnection();
    	System.out.println("Succesfull Connection");
    	try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
