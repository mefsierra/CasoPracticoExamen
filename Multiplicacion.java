
package principal;

public class Multiplicacion {

    int num1, num2;
    

    public void fijarNum1(int n){
    num1=n;
    }
    public void fijarNum2(int n){
    num2=n;
    }
   
    public int multiplicar(){
    int mult=num1*num2;
    return mult;
    }
}
