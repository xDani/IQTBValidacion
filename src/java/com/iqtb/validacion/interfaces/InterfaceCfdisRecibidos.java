/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iqtb.validacion.interfaces;

import com.iqtb.validacion.pojo.CfdisRecibidos;
import java.util.List;

/**
 *
 * @author danielromero
 */
public interface InterfaceCfdisRecibidos {
    
    public List<CfdisRecibidos> getCfdisByidEmpresa(int idEmpresa) throws Exception;
    public CfdisRecibidos getCfdiByID(int idCfdi) throws Exception;
    public boolean delete(CfdisRecibidos cfdi) throws Exception;
}
