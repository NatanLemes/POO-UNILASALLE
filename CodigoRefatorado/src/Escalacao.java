import java.util.ArrayList;

public class Escalacao {
public static ArrayList<String> escalacao;
    
public static ArrayList<String> setEscalacao(){
    return Jogador.getListaJogador();
}
public static void imprimirEscalacao(){
        System.out.println("A escala��o do " + Time.getNome() + " � " + setEscalacao());
    }
}