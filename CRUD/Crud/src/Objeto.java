public class Objeto {
    
    private int id; //atributo id para utiliza��o de chave prim�ria no banco de dados
    private String atributo1; //primeiro atributo do tipo String (caracteres)
    private int atributo2; //segundo atributo do tipo int (inteiro)
    private double atributo3; //terceiro atributo do tipo double (decimal)

    public Objeto() { //construtor quando n�o h� par�metros em sua instancia��o, aqui os atributos ser�o inicializados sem valores significativos
        this.setAtributo1(""); //incia com atributo1 vazio
        this.setAtributo2(0); //inicia com atributo2 zerado
        this.setAtributo3(0.0); //inicia com atributo3 zerado
    }

    public Objeto(String parametroAtributo1, int parametroAtributo2, double parametroAtributo3) { //construtor quando o usu�rio insere par�metros em sua instancia��o
        this.setAtributo1(parametroAtributo1); //atribui o valor que o usu�rio iseriu no primeiro par�metro
        this.setAtributo2(parametroAtributo2); //atribui o valor que o usu�rio iseriu no segundo par�metro
        this.setAtributo3(parametroAtributo3); //atribui o valor que o usu�rio iseriu no terceiro par�metro
    } 

    
    
    //Getters e Setters dos atributos 
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the atributo1
     */
    public String getAtributo1() {
        return atributo1;
    }

    /**
     * @param atributo1 the atributo1 to set
     */
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    /**
     * @return the atributo2
     */
    public int getAtributo2() {
        return atributo2;
    }

    /**
     * @param atributo2 the atributo2 to set
     */
    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    /**
     * @return the atributo3
     */
    public double getAtributo3() {
        return atributo3;
    }

    /**
     * @param atributo3 the atributo3 to set
     */
    public void setAtributo3(double atributo3) {
        this.atributo3 = atributo3;
    }

    //emiss�o de valores no terminal quando chamado o Objeto
    @Override
    public String toString() {
        return "Atributo1: " + this.atributo1 + 
            "\nAtributo2: " + this.atributo2 +
            "\nAtributo3: " + this.atributo3;
    }
    
    
}
