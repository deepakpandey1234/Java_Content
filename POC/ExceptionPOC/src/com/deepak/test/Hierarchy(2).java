package com.deepak.test;

import java.io.IOException;

public class Hierarchy {
	static void method1() throws IOException{
		System.out.println("method1");
	}
public static void main(String[] args) throws IOException{
	try {
		method1();
		} finally {
		
		}
}
}
/*A try - finally block is used usually in a method that declares to throw any 
Checked Exceptions that can occur. in your example, if you changed the declaration of main to be:
public static void main(String args[]) throws IOException
The code will compile just fine.

Typically, you use try - finally when you want to ensure some cleanup is done,
even if an Exception is thrown but, do not wish to handle the Exception thrown in any way.
A fair example would be SQL code
public User login(String userName, String password) throws SQLException{  
    Connection conn = DriverManager.getConnection(....);  
    try{  
       ...  
       //execute SQL, get results etc.  
       return user;  
    }  
    finally{  
        try{  
           conn.close();  
        }  
        catch(SQLException sqle){  
            //nothing to worry about on sqlexception on connection.close  
            //just ignore it  
        }  
     }  
 }*/