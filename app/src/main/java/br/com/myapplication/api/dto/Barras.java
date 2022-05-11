package br.com.myapplication.api.dto;

public class Barras {

    private CopasDoMundoVencidas copasDoMundoVencidas;
    private CopasDoMundoDisputadas copasDoMundoDisputadas;

    public CopasDoMundoVencidas getCopasDoMundoVencidas() {
        return copasDoMundoVencidas;
    }

    public void setCopasDoMundoVencidas(CopasDoMundoVencidas copasDoMundoVencidas) {
        this.copasDoMundoVencidas = copasDoMundoVencidas;
    }

    public CopasDoMundoDisputadas getCopasDoMundoDisputadas() {
        return copasDoMundoDisputadas;
    }

    public void setCopasDoMundoDisputadas(CopasDoMundoDisputadas copasDoMundoDisputadas) {
        this.copasDoMundoDisputadas = copasDoMundoDisputadas;
    }

}
