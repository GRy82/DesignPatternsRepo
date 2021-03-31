package memento;

import java.util.Stack;

public class Editor {
    private String content;
    private Stack<String> undoStack = new Stack<>();

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
        undoStack.push(content);
    }

    public void undo(){
        undoStack.remove(undoStack.peek());
        this.content = undoStack.peek();
    }

}
