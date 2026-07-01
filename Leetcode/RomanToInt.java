public class Demo {
    
static int getvalue(char ch){
    switch (ch) {
        case 'I': return 1;
         case 'V': return 5;
         case 'X': return 10;
         case 'L': return 50;
         case 'C': return 100;
         case 'D': return 500;
         case 'M': return 1000;
         default: return 0;
    
       
    }
}
    public static void main(String[] args) {            
          String s = "MCMIV";
        int result=0;
        
        
        if(s.length()==1){
            result+=getvalue(s.charAt(s.length()-1));
        }
        for(int i=0;i<s.length()-1;i++){
           
            int current= getvalue(s.charAt(i));
            int next = getvalue(s.charAt(i+1));

            if(current<next){
                result+=next-current;
                i++;
            }
            else{
                result+=getvalue(s.charAt(i));
            }
           
            

        }

        if(getvalue(s.charAt(s.length()-2))>= getvalue(s.charAt(s.length()-1))){
            result+=getvalue(s.charAt(s.length()-1));
        }
        System.out.println(result);
        
    }
}

