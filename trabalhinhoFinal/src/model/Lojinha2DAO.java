/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import beanLoja.FornecedorVO;
import conexaoBanco.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Lojinha2DAO {

    public void create(FornecedorVO d) throws Exception {
        Connection con = FabricaDeConexoes.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("INSERT INTO empresa (CNPJ, IE) VALUES (?,?)");
            stat.setInt(1, d.getCNPJ());
            stat.setInt(2, d.getIE());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            FabricaDeConexoes.closeConnection(con, rs, stat);
        }
    }

}
