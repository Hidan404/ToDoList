import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> items = new ArrayList<>();

    public TodoList(List<String> items) {
        this.items = items;
    }

    public void adicionarItem(String e){
        items.add(e);
    }

    public void removerItem(int i){
        if(i > 0 && i < items.size()){
            String removido = items.remove(i);
            System.out.println("Item removido " + removido);
        }
    }

    public void listarItemns(){
        for (String string : items) {
            System.out.println(string);
        }
    }
}
