package implementsABB;

public class ABB {
    
    private No raiz;
    
    //CRIA UMA ABB VAZIA
    public ABB() {
        this.raiz = null;
    }
    
    
    
    //INSERÇÃO INTERATIVA
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
    
    
    
    //INSERÇÃO RECURSIVA
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

    
    //PERCURSO PRE-ORDEM
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
    
  
    
    //PERCURSO IN-ORDEM
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
    
    
    
    //PERCURSO POS-ORDEM
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
    
    
    
     
    //BUSCA RECURSIVA
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
    
     
  
    //BUSCA INTERATIVA
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
        while(p.getDir() != null){
            p = p.getDir();
        }
        return p;
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
    
    
    
    //REMOÇÃO ABB RECURSIVA
    public void remove(int elemento){
        remove(raiz, elemento);
    }
    //conferrir o remover
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
  
    //ALTURA INTERATIVA
    /*public int altura(){
        return altura(raiz);
    }

    public int altura(No p){
        int contEsq = 0;
        int contDir = 0;
        
        while(p != null){
            if(p.getEsq() != null){
                p = p.getEsq();
                contEsq++;
            }
            if(p.getDir() != null){
                p = p.getDir();
                contDir++;
            }
        }
        if(p == null || (p.getEsq() == null && p.getDir() == null)) {
            return 0;
        }
        if(contEsq > contDir){
            return contEsq;
        } else{
            return contDir;
        }
    }*/
    
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

}
