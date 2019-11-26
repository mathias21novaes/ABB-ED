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
        
        
        System.out.println("------- DADOS DA ARVORE -------");
        
        System.out.print("NUMERO DE NOS: ");
        System.out.println(tree.contarNos());
        
        System.out.print("\nALTURA: ");
        System.out.println(tree.alturaRecursiva());
        
        System.out.print("\nNÓS FOLHAS: ");
        tree.folhas();
        
        System.out.println("\n\nPAI DE UM NÓ: ");
        tree.paiNo(5);
        
        System.out.print("\nANTECESSOR DE UM NÓ: ");
        System.out.print(tree.anteriorNo(7));
        
        System.out.print("\n\nSUCESSOR DE UM NÓ: ");
        System.out.print(tree.sucessorNo(7));
        
        
        System.out.println("\n\n------- PERCURSOS -------");
        System.out.println("PRÉ ORDEM");
        tree.preOrdem();
        System.out.println("");
        System.out.println("IN ORDEM");
        tree.inOrdem();
        System.out.println("");
        System.out.println("PÓS ORDEM");
        tree.posOrdem();
        
    }
}
