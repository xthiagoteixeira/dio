package org.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciando conexao");

    }

    public static void fecharConexao(){
        LOGGER.info("Fechando conexao");

    }

}
