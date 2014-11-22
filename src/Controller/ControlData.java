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
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public Date ConvertData(String data) throws ParseException{
        return formato.parse(data);
        
}
}
