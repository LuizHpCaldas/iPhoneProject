package iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url + "...");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        meuIphone.tocarMusica();
        meuIphone.fazerChamada("123-456-7890");
        meuIphone.receberChamada();
        meuIphone.navegar("http://dio.me");
    }
}