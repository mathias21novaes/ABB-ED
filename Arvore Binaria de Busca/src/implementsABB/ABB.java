package implementsABB;

public class ABB {
    
    private No raiz;
    
    //Inicializa uma Arvore Binaria de Busca vazia
    public ABB() {
        this.raiz = null;
    }
    
     
    //Insere um elemento na Arvore Binaria de Busca de forma interativa
    public void insere(int elemento){
        No p = raiz;
        No pai = null;
        No novo = new No(elemento, null, null);
        
        while (p!=null){
            pai=p;
            if(elemento < p.getElemento())
                p = p.getEsq();
            else
                p = p.getDir();
        }
        //ABB VAZIA
        if(pai == null)
            raiz = novo;
        else{
            if(elemento < pai.getElemento())
                pai.setEsq(novo);
            else
                pai.setDir(novo);
        }
    }
    
    
    //Insere um elemento na Arvore Binaria de Busca de forma recursiva
    public void insereRecursiva(int elemento){
        if (raiz == null) {
            raiz = new No(elemento,null,null);
        } else {
            No novo = new No(elemento,null,null);
            insereRecursiva(raiz,novo);
        }
    }
    public void insereRecursiva(No p, No novo){
        if(novo.getElemento()<p.getElemento())
            if (p.getEsq()==null)
                p.setEsq(novo);
            else
                insereRecursiva(p.getEsq(),novo);
        else     
            if (p.getDir()==null)
                p.setDir(novo);
            else
                insereRecursiva(p.getDir(),novo); 
    }

    
    //Remove um elemento da Arvore Binaria de Busca de forma recursiva
    public void remove(int elemento){
        remove(raiz, elemento);
    }
    public No remove(No p, int elemento){
        if(p == null)
        {
            return null; //NO FOLHA
        }
        if(elemento < p.getElemento())
        {
            p.setEsq(remove(p.getEsq(), elemento));
        } else if(elemento > p.getElemento())
        {
            p.setDir(remove(p.getDir(), elemento));
        }
        else
        {
            if(p.getEsq()!=null){
                No aux = maiorNo(p.getEsq());
                p.setElemento(aux.getElemento());
                p.setEsq(remove(p.getEsq(), aux.getElemento()));
            } else if(p.getDir()!=null){
                No aux = menorNo(p.getDir());
                p.setElemento(aux.getElemento());
                p.setDir(remove(p.getDir(), aux.getElemento()));
            }
            else
                return null; //NO FOLHA
        }
        return p;
    }
    
    
    //Percore a Arvore Binaria de Bsuca em Pré Ordem (Raiz - Esquerda - Direita)
    public void preOrdem(){
        preOrdem(raiz);
    }
    private void preOrdem(No p) {
        if(p!=null){
            System.out.print(p.getElemento()+", ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }
    
  
    //Percorre a Arvore Binaria de Busca em In Ordem (Esquerda - Raiz - Direita)
    public void inOrdem(){
        inOrdem(raiz);
    }
    private void inOrdem(No p) {
        if(p!=null){
            inOrdem(p.getEsq());
            System.out.print(p.getElemento()+", ");
            inOrdem(p.getDir());
        }
    }
    
    
    //Percrre a Arvore Binaria de Busca em Pós Ordem (Esquerda - Direita - Raiz)
    public void posOrdem(){
        posOrdem(raiz);
    }
    private void posOrdem(No p) {
        if(p!=null){
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento()+", ");
        }
    }
    

    //Busca um elemento na Arvore Binaria de Busca de forma Recursiva
    public No buscaRecursiva(int elemento){
        return buscaRecursiva(raiz, elemento);
    }    
    public No buscaRecursiva(No p, int elemento){
        if(p == null|| elemento== p.getElemento()){
            return p;
        }
        if(elemento < p.getElemento())
            return buscaRecursiva(p.getEsq(), elemento);
        else
            return buscaRecursiva(p.getDir(), elemento);
    }
    
    
    //Busca um elemento na Arvore Binaria de Busca de forma Interativa
    public No buscaInter(int elemento){
        No p = raiz;
        while(p!=null){
            if(elemento == p.getElemento())
                return p;
            if(elemento < p.getElemento())
                p = p.getEsq();
            else
                p = p.getDir();
        }
        return p;
    }
    
    
    //MAIOR NO INTERATIVO
    public No maiorNo(){
        return maiorNo(raiz);
    }
    public No maiorNo(No p){
        if(p.getDir() == null){
            return p;
        }
        return maiorNo(p.getDir());
    }
    
    
    //MENOR NO RECURSIVO
    public No menorNo(){
        return menorNo(raiz);
    }
    
    public No menorNo(No p){
        if(p.getEsq() == null){
            return p;
        }
        return menorNo(p.getEsq());
    }
    
    

    
    //ALTURA DA ABB RECURSIVA
    public int alturaRecursiva() {
        return alturaRecursiva(raiz);
    }

    public int alturaRecursiva(No p) {
        if (p == null || (p.getEsq() == null && p.getDir() == null)) {
          return 0;
        } else {
            if(alturaRecursiva(p.getEsq()) > alturaRecursiva(p.getDir())){
                return 1 + alturaRecursiva(p.getEsq());
            }else{
                return 1 + alturaRecursiva(p.getDir());
            }
        }
    }
    
    
    
    //CONTA NUMEROS DE NÓS DA ABB
    public int contarNos(){
        return contarNos(raiz);
    }
    
    public int contarNos(No p){
        if(p == null){
            return 0;
        }
        else{
            return 1 + contarNos(p.getEsq()) + contarNos(p.getDir());
        }
    }
    
    
    
    //FOLHAS DA ÁRVORES
    public void folhas(){
        folhas(raiz);
    }
    
    public void folhas(No p){
        if(p!=null){
            if((p.getEsq() == null)&&(p.getDir() == null)){
                System.out.print(p.getElemento()+", ");
            }
            else{
                folhas(p.getEsq());
                folhas(p.getDir());
            }  
        }
    }

    
    
    //PAI DE UM NÓ
    public void paiNo(int elemento){
        No aux = raiz;
        int pai = 0;
       
       while(aux != null){
           if(elemento < aux.getElemento()){
               pai= aux.getElemento();
               aux = aux.getEsq();
            }else if(elemento > aux.getElemento()){
               pai = aux.getElemento();
               aux = aux.getDir();
            }else{
               System.out.println("ELEMENTO: "+elemento);
               System.out.println("PAI DO ELEMENTO: "+pai);
               break;
            }
        }
    }
    
    
    
    //NO ANTERIOR - fazer mudanças
    public int anterior(int elemento){
       No auxRaiz = this.raiz;
       int anterior=0;
       
       while(auxRaiz!=null){
           if(elemento>auxRaiz.getElemento()){
               anterior= auxRaiz.getElemento();
               auxRaiz = auxRaiz.getDir();
               
           }else if(elemento<auxRaiz.getElemento()){
               
               auxRaiz = auxRaiz.getEsq();
           }else{
               auxRaiz = auxRaiz.getDir();
           }
       }
        return anterior;
    }
    //NO SUCESSOR - fazer mudanças
    public int sucessor(int elemento){
       No auxRaiz = this.raiz;
       int sucessor=0;
       
       while(auxRaiz!=null){
           if(elemento>auxRaiz.getElemento()){
               auxRaiz = auxRaiz.getDir();
           }else if(elemento<auxRaiz.getElemento()){
               sucessor= auxRaiz.getElemento();
               auxRaiz = auxRaiz.getEsq();
           }else{
               auxRaiz = auxRaiz.getDir();
           }
           
       }
        return sucessor;
    }
}
