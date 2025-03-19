public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1341244616");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcecao e) {
            System.out.println("O cep não correspponde as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExcecao{
        if(cep.length() != 8)
        throw new CepInvalidoExcecao();
    
    
        return cep;
    }
}
