
package nyp.com.yusuf;




public class Main {
    
    
    public static void main(String[] args) {
        
        /*StackOfIntegers stackOfIntegers = new StackOfIntegers();
        
        stackOfIntegers.push(10);
        stackOfIntegers.push(590);
        stackOfIntegers.push(20);
        stackOfIntegers.push(30);
        stackOfIntegers.push(40);
        stackOfIntegers.push(50);
        System.out.println(stackOfIntegers.empty());
        System.out.println(stackOfIntegers.getSize());
        System.out.println(stackOfIntegers.peek());
        System.out.println(stackOfIntegers.pop());
        System.out.println(stackOfIntegers.pop());
        System.out.println(stackOfIntegers.pop());
        System.out.println(stackOfIntegers.peek());
        
        System.out.println(String.format("%x", 26));*/
        
        
        StringBuilder stringBuilder = new StringBuilder("Merhaba");
       //
        stringBuilder.append("Ahmet");
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(0, 1);
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(1, "abc");
        System.out.println(stringBuilder.toString());
        stringBuilder.replace(0, 3, "cab");
        System.out.println(stringBuilder.toString());
        stringBuilder.setCharAt(1, 'i');
        System.out.println(stringBuilder.toString());
    }
  

    
    
    
}
