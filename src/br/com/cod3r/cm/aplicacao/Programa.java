package br.com.cod3r.cm.aplicacao;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Programa {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);

    }
}
