/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;

import java.util.Scanner;
import java.sql.SQLException;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {// throws SQLException yaziriq biz tutmuruq jvm tutsun
        foo2();// SQLException yazmisiqsa methoda throws SQLException yaziriq 
//        Car c = new Car();
//        if(c.name == null){
//            try{
//            throw new CarNameNullException("asfafasf");
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        }
//        foo();
//        System.out.println("salam");
    }

    public static void foo() {
        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter first number");
//            int a = sc.nextInt();
//            System.out.println("Enter second number");
//            int b = sc.nextInt();
//            System.out.println("result =" + (a / b));//
            int[] arr = {};
            System.out.println(arr[0]);

        } catch (Exception ex) {
            ex.printStackTrace();
            StackTraceElement[] st = ex.getStackTrace();

            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
            for (int i = 0; i < st.length; i++) {
                StackTraceElement stE = st[i];

                System.err.println("        at " + stE.getClassName() + "." + stE.getMethodName() + "(" + stE.getFileName() + ":" + stE.getLineNumber() + ")");
            }

//            System.out.println(ex.getClass().getName());
            // xeta bas verse bu blocklar arasi calisacaq
//            System.out.println("xeta bas verdi");
        }
    }

    public static void foo2() throws SQLException {// throws SQLException yaziriq biz tutmuruq jvm tutsun
        throw new SQLException();// SQLException yazmisiqsa methoda throws SQLException yaziriq 
    }
}
