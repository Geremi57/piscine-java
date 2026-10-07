public class DoOp {
    public static String operate(String[] args) {
      for (String doop: args){

            if (doop == "0") {
                return "Error";
            }
      }

      if (args.length == 0) {
        return "it depend on the input.";
      }

      int first = Integer.parseInt(args[0]);
      
        String sign = args[1];
        
        int second = Integer.parseInt(args[2]);

        int value = 0;
    
            if (sign == "+") {
                value = first + second;
            }else if (sign == "-") {
                value = first - second;
            }else if (sign == "*") {
                value = first * second;
            }else if (sign == "/") {
                value = first / second;
            }else if (sign == "%") {
                value = first % second;
            }


            String res = String.valueOf(value);
            // System.out.println(value);
        // }
        return res;
    }
}