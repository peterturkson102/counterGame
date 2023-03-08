class Result {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
    // Write your code here
String result = "Richard";

if(n ==1){
    return result;
}


while(n !=1){
    
      if(result == "Louise"){
        result = "Richard";
    }else{
        result= "Louise";
    }
    
    if((n & (n - 1)) == 0){
        n= n/2;
    }else{
        String binaryStr = Long.toBinaryString(n);
                                
                int binaryStrLength = binaryStr.length();                
                long closestPowerOf2 = (long) Math.pow(2, binaryStrLength - 1);
                
                n = n - closestPowerOf2;    
    }
    
    
    
}

return result;
    }

}
