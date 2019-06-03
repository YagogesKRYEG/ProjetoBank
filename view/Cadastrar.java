package com.ProjetoBank.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 88, 78, 14);
		contentPane.add(lblCep);
		
		JLabel lblTipoDeLogradouro = new JLabel("Tipo de Logradouro:");
		lblTipoDeLogradouro.setBounds(10, 113, 126, 14);
		contentPane.add(lblTipoDeLogradouro);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(10, 138, 98, 14);
		contentPane.add(lblLogradouro);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 163, 98, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 188, 98, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(12, 213, 96, 14);
		contentPane.add(lblEstado);
		
		JButton btnCad = new JButton("Cadastrar");
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastrar();
			}
			
		});
		btnCad.setBounds(10, 279, 98, 55);
		contentPane.add(btnCad);
		
		JButton btnPes = new JButton("Pesquisar");
		btnPes.setBounds(130, 279, 98, 55);
		contentPane.add(btnPes);
		
		textField = new JTextField();
		textField.setBounds(163, 85, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 110, 152, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 135, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(163, 163, 152, 14);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(161, 185, 154, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 213, 154, 14);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnDel = new JButton("Deletar");
		btnDel.setBounds(238, 279, 89, 55);
		contentPane.add(btnDel);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 63, 78, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 36, 78, 14);
		contentPane.add(lblNome);
		
		textField_6 = new JTextField();
		textField_6.setBounds(161, 60, 154, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(161, 33, 154, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(361, 279, 89, 55);
		contentPane.add(btnAtualizar);
	}

	protected void Cadastrar() {
		// TODO Auto-generated method stub
		
	}
	

}
