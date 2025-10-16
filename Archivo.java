public class Archivo{

    public static void main(String[] args) {

        Archivo2 arch;
        arch = new Archivo2(25122,"Hola es te es un msg");

        System.err.println(arch.getid() + arch.getmsg());
    }
}