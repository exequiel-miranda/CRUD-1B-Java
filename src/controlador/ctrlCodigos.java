package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Codigos;
import vista.frmCodigos;

//3- Heredar de la clase MouseListener
public class ctrlCodigos implements MouseListener{
        //1-Mandar a llamar a las otras capas
    private Codigos modelo;
    private frmCodigos vista;
    
 
       //2- crear el constructor 
    public ctrlCodigos(Codigos modelo, frmCodigos vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
        
        modelo.Mostrar(vista.jtbCodigos);
        vista.btnElimnar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnAgregar){
            modelo.setNombre_estudiante(vista.txtNombre.getText());
            modelo.setCarnet_estudiante(Integer.parseInt(vista.txtCarnet.getText()));
            modelo.setTipo_Codigo(vista.txtTipoCodigo.getText());
            
            modelo.Guardar();   
            modelo.Mostrar(vista.jtbCodigos);
        }
        
        if(e.getSource() == vista.btnElimnar){
            modelo.Eliminar(vista.jtbCodigos);
            modelo.Mostrar(vista.jtbCodigos);
        }
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
}
