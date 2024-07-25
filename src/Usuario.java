public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("O número do Canal é: " + smartTv.canal);
        System.out.println("O volume da TV é: " + smartTv.volume);

        System.out.println("----------------------------------");

        smartTv.ligarTv();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligarTv();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        System.out.println("-----------------------------------");

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> O volume da TV é: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> O volume da TV é: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> O volume da TV é: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> O volume da TV é: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> O volume da TV é: " + smartTv.volume);

        System.out.println("------------------------------------");

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> O Canal atual da TV é: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> O Canal atual da TV é: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> O Canal atual da TV é: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> O Canal atual da TV é: " + smartTv.canal);
        
        smartTv.mudarCanal(12);
        System.out.println("Novo Status -> O Canal atual da TV é: " + smartTv.canal);

    }
}
