package implementsABB;

public class Teste {
    
    public static void main(String[] args) {
        
        ABB tree= new ABB();
        
        tree.insere(2);
        tree.insere(8);
        tree.insere(5);
        tree.insere(9);
        tree.insere(3);
        tree.insere(7);
        
//        tree.insereRecursiva(1);
//        tree.insereRecursiva(3);
//        tree.insereRecursiva(8);
//        tree.insereRecursiva(6);
//        tree.insereRecursiva(5);
//        tree.insereRecursiva(7);
//        tree.insereRecursiva(10);
//        tree.insereRecursiva(12);
//        tree.insereRecursiva(13);
//        tree.insereRecursiva(14);
        
        System.out.println("Numero de nos da arvore");
        System.out.println(tree.contarNos());
        
        
        System.out.println("Altura da arvore:");
        System.out.println(tree.alturaRecursiva());
        
        
        System.out.println("NÓS FOLHAS DA ARVORE");
        tree.folhas();
        System.out.println("");
        
        
        tree.preOrdem();
        System.out.println("");
        tree.inOrdem();
        System.out.println("");
        tree.posOrdem();
        System.out.println("");
        System.out.println("");
        
        tree.remove(7);
        tree.remove(5);
        tree.inOrdem();
        System.out.println("");

        
        /*System.out.println(tree.buscaInter(14));
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
        
        System.out.println("NÓS FOLHAS DA ARVORE");
        tree.folhas();
        System.out.println("");
        
       //tree.paiNo(5);
        
        /*System.out.println("MAIOR NÓ NA ARVORE");
        tree.maiorNo();
        System.out.println("MENOR NÓ NA ARVORE");
        tree.menorNo();*/

    }
}
