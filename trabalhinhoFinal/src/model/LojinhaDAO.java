/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import beanLoja.ClienteVO;
import conexaoBanco.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import viewLoja.TelaLojinha;
import viewLoja.TelaLojinha2;
import java.sql.ResultSet;

public class LojinhaDAO {
   
    public void create(ClienteVO d) throws Exception {
        Connection con = FabricaDeConexoes.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("INSERT INTO cliente (codigo_de_cadastro, nome, telefone, endereço) VALUES (?,?,?,?)");
            stat.setInt(1, d.getcodigo_de_cadastro());
            stat.setString(2, d.getnome());
            stat.setInt(3, d.gettelefone());
            stat.setObject(4, d.getend());
            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            FabricaDeConexoes.closeConnection(con, rs, stat);
        }
    }

    public void create(LojinhaDAO a) {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void create(TelaLojinha d) {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void create(TelaLojinha2 d) {
        //To change body of generated methods, choose Tools | Templates.
    }

}
