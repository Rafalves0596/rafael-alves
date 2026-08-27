public class InfoUsuario {
    public static void main(String[] args) {
        Usuario info = new Usuario();

        info.nome = "Rafael";
        info.sexo = 'M';
        info.estadoCivil = "Solteiro";
        info.nascimento = "29/07/2005";
        System.out.println(info.nome+" "+info.nascimento);

        info.nome = "Isabelli";
        info.sexo = 'F';
        info.estadoCivil = "Solteira";
        info.nascimento = "15/09/2007";
        System.out.println(info.nome+" "+info.nascimento);

        info.nome = "Danielli";
        info.sexo = 'F';
        info.estadoCivil = "Casada";
        info.nascimento = "25/01/1989";
        System.out.println(info.nome+" "+info.nascimento);

        info.nome = "Hércules";
        info.sexo = 'M';
        info.estadoCivil = "Solteiro";
        info.nascimento = "10/02/2008";
        System.out.println(info.nome+" "+info.nascimento);

        info.nome = "Caio";
        info.sexo = 'M';
        info.estadoCivil = "Solteiro";
        info.nascimento = "21/11/2007";
        System.out.println(info.nome+" "+info.nascimento);
    }
}
