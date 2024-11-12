/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author meram
 */
import beanLoja.RoupasVO;
import conexaoBanco.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoupasDAO {
 //funções para crud da parte de roupa
    public void create(RoupasVO d) throws Exception {
        Connection con = FabricaDeConexoes.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("INSERT INTO roupa (codigo_da_peça, cor, peça, preço, categoria, código_do_fabricante ) VALUES (?,?,?,?,?,?)");
            stat.setInt(1, d.getCodigo_da_peca());
            stat.setString(2, d.getCor());
            stat.setInt(3, d.getQtd_peca());
            stat.setDouble(4, d.getPreco());
            stat.setString(5, d.getCategoria());
            stat.setInt(6, d.getCodigo_fabricante());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            FabricaDeConexoes.closeConnection(con, rs, stat);
        }
    }

    public void alterar(RoupasVO d) throws Exception {
        Connection con = FabricaDeConexoes.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = con.prepareStatement("UPDATE roupa SET cor=? , peça=? , preço=? , categoria=? , código_do_fabricante=? WHERE codigo_da_peça=? ");

            stat.setString(1, d.getCor());
            stat.setInt(2, d.getQtd_peca());
            stat.setDouble(3, d.getPreco());
            stat.setString(4, d.getCategoria());
            stat.setInt(5, d.getCodigo_fabricante());
            stat.setInt(6, d.getCodigo_da_peca());
            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO" + e);
        } finally {
            FabricaDeConexoes.closeConnection(con, rs, stat);
        }
    }

    public ArrayList<RoupasVO> listar() {

        ArrayList<RoupasVO> roupas = new ArrayList<>();
        Connection con = null;
        try {
            con = FabricaDeConexoes.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RoupasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("select * from roupa");
            rs = stat.executeQuery();

            while (rs.next()) {
                RoupasVO roupa = new RoupasVO();

                roupa.setCodigo_da_peca(rs.getInt("codigo_da_peça"));
                roupa.setCor(rs.getString("cor"));
                roupa.setQtd_peca(rs.getInt("peça"));
                roupa.setPreco(rs.getDouble("preço"));
                roupa.setCategoria(rs.getString("categoria"));
                roupa.setCodigo_fabricante(rs.getInt("código_do_fabricante"));

                roupas.add(roupa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar" + e);
        } finally {
            FabricaDeConexoes.closeConnection(con, rs, stat);
        }
        return roupas;
    }

    public ArrayList<RoupasVO> pesquisar(String tipo) {

        ArrayList<RoupasVO> roupas = new ArrayList<>();
        Connection con = null;
        try {
            con = FabricaDeConexoes.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(RoupasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("SELECT * FROM roupa WHERE categoria LIKE ?");
            stat.setString(1, "%" + tipo + "%");
            rs = stat.executeQuery();

            while (rs.next()) {
                RoupasVO roupa = new RoupasVO();

                roupa.setCodigo_da_peca(rs.getInt("codigo_da_peça"));
                roupa.setCor(rs.getString("cor"));
                roupa.setQtd_peca(rs.getInt("peça"));
                roupa.setPreco(rs.getDouble("preço"));
                roupa.setCategoria(rs.getString("categoria"));
                roupa.setCodigo_fabricante(rs.getInt("código_do_fabricante"));

                roupas.add(roupa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar" + e);
        } finally {
            FabricaDeConexoes.closeConnection(con, rs, stat);
        }
        return roupas;
    }

}
