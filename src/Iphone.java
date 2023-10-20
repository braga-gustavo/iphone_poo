public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void trocarMusica() {
        System.out.println("Trocando de música");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos da interface Navegador
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página" );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba com a página ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual");
    }

    

    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        // Usando as funcionalidades do iPhone
        iPhone.ligar();
        iPhone.iniciarCorreioDeVoz();
        iPhone.atender();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.trocarMusica();

        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.exibirPagina();
    }
}