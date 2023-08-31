// Program to print a text 5 times
/*
 * Java for loop is used to run a block of code for a certain number of times. 
 * The syntax of for loop is:
Here,
1)The initialExpression initializes and/or declares variables and executes only once.
2)The condition is evaluated. If the condition is true, the body of the
 for loop is executed.
3)The updateExpression updates the value of initialExpression.
4)The condition is evaluated again. The process continues 
until the condition is false.*/
class ForLoops {
  public static void main(String[] args) {
	  //for (initialExpression; testExpression; updateExpression) {
		    // body of the loop
		// }
    int n = 5;
    // for loop  
    
    for (int i = 1; i <= n; ++i) {
      System.out.println("Java is fun");
    }
  }
}