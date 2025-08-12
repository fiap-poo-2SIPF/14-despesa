package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

public class Teste {
    public static void main(String[] args) {
        Categoria categoria = new Categoria(4L, "outros");
        CategoriaDAO dao = new CategoriaDAO();
        dao.inserir(categoria);
    }
}
