
package principal;

public class Restar {

    int num1, num2;
    

    public void fijarNum1(int n){
    num1=n;
    }
    public void fijarNum2(int n){
    num2=n;
    }
   
    public int restar(){
    int rest=num1-num2;
    return rest;
    }
}