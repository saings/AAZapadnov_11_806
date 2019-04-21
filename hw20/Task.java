public class Task{
    public boolean ans(String task){
        MyStack<String> myStack = new MyStack<>();
        for(int i = 0; i < task.length(); i++){
            String a = Character.toString(task.charAt(i));
            if(! ("{}[]()").contains(Character.toString(task.charAt(i)))) continue;
            if(! ("{[(").contains(Character.toString(task.charAt(i)))){
                if(myStack.isEmpty()) return false;
                if(! ((Character.toString(task.charAt(i)).equals("}") && ((String) myStack.pop()).equals("{")) ||
                        (Character.toString(task.charAt(i)).equals(")") && ((String) myStack.pop()).equals("(")) ||
                        (Character.toString(task.charAt(i)).equals("]") && ((String) myStack.pop()).equals("["))
                )){
                    return false;
                }
            } else{
                myStack.push(Character.toString(task.charAt(i)));
            }
        }
        return myStack.isEmpty();
    }
}
