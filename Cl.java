public class Cl { 
  // результат вичесленія
  private int result;
  
  // суміруєм аргументи
  public void add(int ... params){
  for(Integer param : params){
      this.result += param;
    }
  }
  
  // получаєм результат
  public int getResult(){
     return this.result;
	 }
	
  // очистить результат вичеслення	
  public void cleanResult(){
      this.result = 0;
  }	 
  
  
}