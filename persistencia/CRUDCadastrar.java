package com.ProjetoBank.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ProjetoBank.dominio.Cliente;

public class CRUDCadastrar {
	private Connection con = null;
	private ResultSet rs=null;
	private PreparedStatement pst =null;
	
	public String Cadastrar (Cliente cliente) {
		String msg;
		try {
		Class.forName("com..myaql.cj.jdbc.Driver").newInstance();
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastrodb?serverTimezone=UTC","root","");
		String Consulta = "Insert INTO tb_clientes(id,nome,telefone,cep,tipoLogradouro,logradouro,bairro,cidade,estado)values(?,?,?,?,?,?,?,?,?)";
		 pst = con.prepareStatement(Consulta);
		 pst.setInt(1, cliente.getId());
		 pst.setString(2, cliente.getNome());
		 pst.setString(3, cliente.getTelefone());
		 pst.setString(4, cliente.getCep());
		 pst.setString(5, cliente.getTipoLogradouro());
		 pst.setString(6, cliente.getLogradouro());
		 pst.setString(7, cliente.getBairro());
		 pst.setString(8, cliente.getCidade());
		 pst.setString(9, cliente.getEstado());
		 int r = pst.executeUpdate();
		 if(r > 0)
			 msg = "Cadastro Realizado com sucesso!!!";
		 else
			 msg="N�o foi possivel cadastrar!!!";
	}
		catch(SQLException ex) {
			msg ="Erro ao tentar cadastrar"+ex.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado:"+e.getMessage();
		}
		finally {
			try {con.close();}catch(Exception e) {e.printStackTrace();}
		}
		return msg;
	}
}
