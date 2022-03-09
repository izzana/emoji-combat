package aula07;
public class Aula07 {

    public static void main(String[] args) {
        Lutador L [] = new Lutador [5]; 
        L[0] = new Lutador("Prety boy", "França", 31, 1.75, 68.9f, 11, 3, 1);
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.89f, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9f, 14, 2, 3);
        L[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6f, 13, 0, 2);
        //L[4] = new Lutador();
        //L[5] = new Lutador();
        
       /* L[0].apresentar();
        L[2].status();
        L[3].getCategoria(); 
        L[1].ganharLuta();
        L[0].empatarLuta();
        L[3].apresentar();
        */
       
        Luta UEC01 = new Luta();//é da classe luta
        UEC01.marcarLuta(L[0], L[1]);
        UEC01.lutar();
        L[0].status();
        L[1].status();
    }
    
}
