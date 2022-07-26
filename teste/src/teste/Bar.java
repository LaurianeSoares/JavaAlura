package teste;

public class Bar {

private int instancias;

Bar(){

instancias++;

}

public int getInstancias() {

return instancias;

}

public static void main(String[] args) {

Bar bob = new Bar();

Bar rex = new Bar();

System.out.println("Imprime:" + rex.instancias + bob.instancias);

}

}