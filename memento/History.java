package memento;
import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> stateHistory = new ArrayList<>();

    public void push(EditorState state){
        stateHistory.add(state);
    }

    public EditorState pop(){
        var lastIndex = stateHistory.size() - 1;
        var lastState = stateHistory.get(lastIndex);
        stateHistory.remove(lastState);

        return lastState;
    }
}
