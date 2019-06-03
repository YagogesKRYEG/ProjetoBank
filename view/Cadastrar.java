package com.ProjetoBank.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 11, 23, 14);
		contentPane.add(lblCep);
		
		JLabel lblTipoDeLogradouro = new JLabel("Tipo de Logradouro:");
		lblTipoDeLogradouro.setBounds(10, 39, 98, 14);
		contentPane.add(lblTipoDeLogradouro);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(10, 64, 59, 14);
		contentPane.add(lblLogradouro);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 89, 33, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 114, 38, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 147, 48, 14);
		contentPane.add(lblEstado);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(10, 195, 98, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setBounds(162, 195, 98, 55);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(43, 11, 103, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 36, 142, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(79, 61, 144, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(53, 89, 126, 14);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(58, 111, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(50, 144, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(308, 195, 89, 55);
		contentPane.add(btnDeletar);
	}
	

}
