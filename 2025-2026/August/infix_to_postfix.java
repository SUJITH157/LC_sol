class Solution {

    
    public static int prec(char c) {
        if (c == '^')  
            return 3;
        else if (c == '/' || c == '*')  
            return 2;
        else if (c == '+' || c == '-') 
            return 1;
        else
            return -1;
    }

    
    public static void infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();  
        StringBuilder result = new StringBuilder();  

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            
            else if (c == '(') {
                st.push('(');
            }

            
            else if (c == ')') {
                while (st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();  
            }

           
            else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    result.append(st.pop());
                }
                st.push(c);  
            }
        }

        
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        System.out.println("Postfix expression: " + result.toString()); 
    }
}