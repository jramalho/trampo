/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jol
 */
public class ControlData {
    public SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public Date ConvertData(String data) throws ParseException{
        return formato.parse(data);
        
}
    public String ConvertDataToLong(String Data){
        String a;
        String ndata[]=Data.split("/");
        a = ndata[2]+"-"+ndata[1]+"-"+ndata[0];
        return a;
    }
}
