import java.util.Scanner;
//клас запуска Сl поддержує ввод пользувателя
public class IntR {
public static void main(String[] args) {
Scanner reader = new Scanner(Sustem.in);
     try{
	 Cl cl = new Cl();
	 String exit = "no";
	 while(!exit.equals("yes")){
	 System.out.println("ENTER first args :");
	 String first = reader.next();
	 System.out.println("ENTER second args :");
	 String second = reader.next();
	 ci.add(Integer.valueof(first), Integer.valueof(second));
	 System.out.println("RESULT : "+cl.getResult());
	 cl.cleanResult();
	 System.out.println("exit : yes/no");
	 exit = reader.next();
	 	 }
     } finally {
	    reader.close();
	 }
  } 
}