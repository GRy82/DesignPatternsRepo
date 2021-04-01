import memento.*;

public class Main{
    public static void main(String[] args){
        testMemento();
    }

    public static void testMemento(){
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        
        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}