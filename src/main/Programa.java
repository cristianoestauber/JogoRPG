package main;


import conexao.Conexao;
import telas.TelaPrincipal;

import java.sql.Connection;
import java.sql.SQLException;


public class Programa {

    public static void main(String[] args) {
        try {
            Connection conexao = Conexao.obterConexao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        {

        }

        TelaPrincipal telaPrincipal = new TelaPrincipal();

    }
}
