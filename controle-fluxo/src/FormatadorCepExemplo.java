public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23417565");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep deve conter 8 digitos");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        //simula um cep formatado
        return "23.764-054";
    }
}
