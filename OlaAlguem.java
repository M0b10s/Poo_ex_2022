public class OlaAlguem {

    /**
     *
     * @param nome -> String
     * @return String
     */

    public static String gera_sau(String nome){
        return "Olá " + nome + "!";
    }

    /**
     *
     * @param args -> String
     */
    public static void main(String[] args){

        String saudacao = gera_sau("Mundo");
        System.out.println(saudacao);

    }

}
