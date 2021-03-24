/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;


/**
 *
 * @author juare
 */
public class JuanCarlosJuarezBarneond {
    @Mock
    private AsignarHorario horario;
    private Carrera carrera;
    private RegistroAcademico carnet;
  
  @BeforeEach
  public void setUp(){
       MockitoAnnotations.initMocks(this);   
      
  }
   @Test
    public void  probarCodigoHorario() throws Exception{
 
       when( horario.generarHorario(carrera, carnet)).thenReturn(null);
       assertEquals(null,horario.generarHorario(carrera, carnet));
    }   
    
    //prueba unitaria 2
    @Mock
    private AsignarHorario horario2;
    private Carrera carrera2;
    private RegistroAcademico carnet2;
  
    @BeforeEach
    public void setUp2(){
         MockitoAnnotations.initMocks(this);   

    }
    @Test
    public void  probar() throws Exception{
 
       when( horario.VerDescripcion()).thenReturn("");
       assertEquals("",horario.VerDescripcion());
    } 
    
    
}
   
