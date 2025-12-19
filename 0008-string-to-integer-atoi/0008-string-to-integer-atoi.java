class Solution {
    public int myAtoi(String s) {

        int i = 0; //start tracing from index 0
        int sign = 1;  //by defalut plus sign
        int n = s.length();
        int result = 0;
        

        //ignore white spaces

        while(i<n && s.charAt(i) == ' '){
            i++;
        }

        //check sign

        if(i<n &&(s.charAt(i)=='+'|| s.charAt(i)=='-')){
            sign = (s.charAt(i)=='-'?-1: 1);
            i++;

        }
        //conver to digit

        while(i<n && Character.isDigit(s.charAt(i))){
           int  digit = s.charAt(i)  - '0';

            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 &&  digit>7)){
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}