package implementsABB;

public class Teste {
    
    public static void main(String[] args) {
        
        ABB tree= new ABB();
        
        tree.insere(2);
        tree.insere(8);
        tree.insere(5);
        tree.insere(9);
        tree.insereRecursiva(3);
        tree.insere(7);
        
        tree.preOrdem();
        System.out.println("");
        tree.inOrdem();
        System.out.println("");
        tree.posOrdem();
        System.out.println("");
        System.out.println("");
        
        /*tree.remove(7);
        tree.remove(5);
        tree.inOrdem();
        System.out.println("");

        
        System.out.println(tree.buscaInter(14));
        System.out.println("");
        System.out.println(tree.buscaRecursiva(10));
        System.out.println("");
        
        System.out.println("menor elemento");
        System.out.println(tree.menorNo());
        System.out.println("");
        System.out.println("");
        System.out.println("maior elemento");
        System.out.println(tree.maiorNo());*/
        
        System.out.println("Numero de nos da arvore");
        System.out.println(tree.contarNos());
        
        System.out.println("Altura da arvore:");
        System.out.println(tree.alturaRecursiva());
        
        //System.out.println("Altura da arvore:");
        //System.out.println(tree.altura());
        
        
        System.out.println("");
        tree.folhas();
        //2 8 5 9 3 7
        
        //1 3 8 6 5 7 10 12 13 14
        System.out.println(tree.paiNo(5));

        tree.paiNo(7);
    }
}
