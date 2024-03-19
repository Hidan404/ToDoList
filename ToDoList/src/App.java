import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TodoList lista = new TodoList();
        Scanner entrada = new Scanner(System.in);


        System.out.println("Jogo Iniciado Escolha uma das opções ");
        System.out.println("1 - Adicione uma tarefa");
        System.out.println("2 - liste as tarefas disponiveis");
        System.out.println("3 - remova uma tarefa");

        boolean condicao =  false;
        while (condicao != true) {

            System.out.println("Escolha uma das ocoes 1\n 2\n 3\n");
            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Tarefa adicionada ");
                    entrada.nextLine();
                    String tarefa = entrada.nextLine();

                    lista.adicionarItem(tarefa);
                    break;
                case 2:
                    System.out.println("Lista de tarefas ");

                    lista.listarItemns();
                    break;
                case 3:
                    System.out.println("remover tarefa");
                    int indice = entrada.nextInt();

                    lista.removerItem(indice);
                    break;

                default:
                    break;
            }
            entrada.nextLine();
            System.out.println("Deseja sair? ");
            String respostaUsuario = entrada.nextLine();

            if(respostaUsuario.equalsIgnoreCase("sim")){
                condicao = true;
            }
        
        }

        entrada.close();
    }
}
