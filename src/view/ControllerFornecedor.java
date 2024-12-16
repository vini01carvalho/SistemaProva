/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

//import BEAN.Ohb_usuarios;
import bean.Usuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class ControllerFornecedor extends AbstractTableModel{

    List lista;
    
    public void setLista(List lista){
        this.lista = lista;
    }
    
    public Usuarios getBean(int row){
        return (Usuarios) lista.get(row);
        
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      //deletar get value at e get collumn name  
        Usuarios usuarios = (Usuarios) lista.get(rowIndex);
        
        if(columnIndex == 0){
            return usuarios.getIdusuarios();  
        }
        if(columnIndex == 1){
            return usuarios.getNome();
        }
        if(columnIndex == 2){
            return usuarios.getApelido();
        }
        if(columnIndex == 3){
            return usuarios.getCpf();
        }
        if(columnIndex == 4){
            return usuarios.getDataNascimento();
        }
        if(columnIndex == 5){
            return usuarios.getSenha();
        }
        if(columnIndex == 6){
            return usuarios.getNivel();
        }
        if(columnIndex == 7){
            return usuarios.getAtivo();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex == 0){
            return "Código";
        }
        if(columnIndex == 1){
            return "Nome";
        }
        if(columnIndex == 2){
            return "Apelido";
        }
        if(columnIndex == 3){
            return "CPF";
        }
        if(columnIndex == 4){
            return "Nascimento";
        }
        if(columnIndex == 5){
            return "Senha";
        }
        if(columnIndex == 6){
            return "Nível";
        }
        if(columnIndex == 7){
            return "Ativo";
        }
        return "";
    }
}
