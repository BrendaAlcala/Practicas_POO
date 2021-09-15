package prac3;

import java.util.Random;

public class Mexicano {
    String nombre, CURP, RFC;
    String RyC, apellidoMat, apellidoPat, genero, estado, anio, mes, dia;
    
    public Mexicano(String nombre,String apellidoPat,String apellidoMat,String dia,String mes,String anio,String genero,String estado)
    {
        setNombre(nombre);
        setApellidoPat(apellidoPat);
        setApellidoMat(apellidoMat);
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        setGenero(genero);
        setEstado(estado);
        generaCURP(ComunCURPyRFC());
        generaRFC(ComunCURPyRFC());
        ComunCURPyRFC();
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellidoPat(String apellidoPat){
        this.apellidoPat=apellidoPat;
    }
    public void setApellidoMat(String apellidoMat){
        this.apellidoMat=apellidoMat;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void setAnio(String anio){
        this.anio=anio;
    }
    public void setMes(String mes){
        this.mes=mes;
    }
    public void setDia(String dia){
        this.dia=dia;
    }
    public void setCurp(String CURP){
        this.CURP=CURP;
    }
    public void setRfc(String RFC){
        this.RFC=RFC;
    }
   
   
    public String getNombre(){
        return nombre;
    }
    public String getApellidoPat(){
        return apellidoPat;
    }
    public String getApellidoMat(){
        return apellidoMat;
    }
    public String getGenero(){
        return genero;
    }
    public String getEstado(){
        return estado;
    }
    public String getAnio(){
        return anio;
    }
    public String getMes(){
        return mes;
    }
    public String getDia(){
        return dia;
    }
    public String getCurp(){
        return CURP;
    }
    public String getRfc(){
        return RFC;
    }
    
 //-------------------------------------   
    public String generaCURP(String CURPyRFC){
        
        CURP=CURPyRFC;
        int i;
        
        CURP+=String.valueOf(genero.charAt(0));
        
        switch (estado) {
            case "Aguascalientes":
                CURP+="AS";
                break;
            case "Baja California":
                CURP+="BC";
                break;
            case "Baja California Sur":
                CURP+="BS";
                break;
            case "Campeche":
                CURP+="CC";
                break;
            case "Coahuila":
                CURP+="CL";
                break;
            case "Colima":
                CURP+="CM";
                break;
            case "Chiapas":
                CURP+="CS";
                break;
            case "Chihuahua":
                CURP+="CH";
                break;
            case "Distrito Federal":
                CURP+="DF";
                break; 
            case "Durango":
                CURP+="DG";
                break;
            case "Guanajuato":
                CURP+="GT";
                break;
            case "Guerrero":
                CURP+="GR";
                break;
            case "Hidalgo":
                CURP+="HG";
                break;
            case "Jalisco":
                CURP+="JC";
                break;
            case "Mexico":
                CURP+="MC";
                break;    
            case "Michoacan":
                CURP+="MN";
                break;
            case "Morelos":
                CURP+="MS";
                break;
            case "Nayarit":
                CURP+="NT";
                break;    
            case "Nuevo Leon":
                CURP+="NL";
                break;
            case "Oaxaca":
                CURP+="OC";
                break;
            case "Puebla":
                CURP+="PL";
                break;    
            case "Queretaro":
                CURP+="QT";
                break;
            case "Quintana Roo":
                CURP+="QR";
                break;
            case "San Luis Potosi":
                CURP+="SP";
                break;    
            case "Sinaloa":
                CURP+="SL";
                break;
            case "Sonora":
                CURP+="SR";
                break;
            case "Tabasco":
                CURP+="TL";
                break;    
            case "Tamaulipas":
                CURP+="TS";
                break;
            case "Tlaxcala":
                CURP+="TL";
                break;
            case "Veracruz":
                CURP+="VZ";
                break;    
            case "Yucatan":
                CURP+="YN";
                break;
            case "Zacatecas":
                CURP+="ZS";
                break;
            case "Nacido en el extranjero":
                CURP+="NE";
                break;    
            default:
                break;
        }
        for(i=1;i<apellidoPat.length();i++)
            if(apellidoPat.charAt(i)!='A' || apellidoPat.charAt(i)!='E' || apellidoPat.charAt(i)!='I' || apellidoPat.charAt(0)!='O' || apellidoPat.charAt(0)!='U')
            {
                CURP+=String.valueOf(apellidoPat.charAt(i));
                break;
            }
        
        for(i=1;i<apellidoMat.length();i++)
            if(apellidoMat.charAt(i)!='A' || apellidoMat.charAt(i)!='E' || apellidoMat.charAt(i)!='I' || apellidoMat.charAt(0)!='O' || apellidoMat.charAt(0)!='U')
            {
                CURP+=String.valueOf(apellidoMat.charAt(i));
                break;
            }
        for(i=1;i<nombre.length();i++)
            if(nombre.charAt(i)!='A' || nombre.charAt(i)!='E' || nombre.charAt(i)!='I' || nombre.charAt(0)!='O' || nombre.charAt(0)!='U')
            {
                CURP+=String.valueOf(nombre.charAt(i));
                break;
            }
        Random r = new Random();
        String alphabet = "0123456789ABCDEFGHIJKLMMNOPQRSTUVWXYZ";
        for (i=0;i<2;i++) 
            CURP+=(alphabet.charAt(r.nextInt(alphabet.length())));
        
        return CURP;
    }
 //------------------------------------   
    public String generaRFC(String CURPyRFC){
        
        RFC=CURPyRFC;
        int i;
        
        Random r = new Random();
        String alphabet = "0123456789ABCDEFGHIJKLMMNOPQRSTUVWXYZ";
        for(i=0;i<3;i++) 
            RFC+=(alphabet.charAt(r.nextInt(alphabet.length())));
        
        return RFC;
    }
 //-----------------------------------   
    public String ComunCURPyRFC(){
    
        int i;
        
        
        //Primer caracter
        if(apellidoPat.charAt(0)=='Ñ')
            RyC= "X";
        else
            RyC= String.valueOf(apellidoPat.charAt(0));
        //Segundo caracter
        for(i=1;i<apellidoPat.length();i++)
            if(apellidoPat.charAt(i)=='A' || apellidoPat.charAt(i)=='E' || apellidoPat.charAt(i)=='I' || apellidoPat.charAt(0)=='O' || apellidoPat.charAt(0)=='U')
            {
                RyC+=String.valueOf(apellidoPat.charAt(i));
                break;
            }
        //Tercer caracter
        if(apellidoMat.charAt(0)=='Ñ')
            RyC+= "X";
        else
            RyC+= String.valueOf(apellidoMat.charAt(0));
        //Cuarto caracter
        if(nombre.charAt(0)=='Ñ')
            RyC+= "X";
        else
            RyC+=String.valueOf(nombre.charAt(0));
        //Sustituir primera vocal si es una palabra altisonante o curiosa
        if(RyC.equals("COLA") || RyC.equals("VACA"))
            for(i=0;i<RyC.length();i++)
            {
               if(RyC.charAt(i)=='A' || RyC.charAt(i)=='E' || RyC.charAt(i)=='I' || RyC.charAt(0)=='O' || RyC.charAt(0)=='U')
               {
                  RyC=RyC.replace(RyC.charAt(i),'X');
                  break;
               }

            }
        //Quinto caracter
        RyC+=String.valueOf(anio.charAt(2));
        //Sexto caracter
        RyC+=String.valueOf(anio.charAt(3));
        //Septimo carcater
        RyC+=String.valueOf(mes.charAt(0));
        //Octavo caracter
        RyC+=String.valueOf(mes.charAt(1));
        //Noveno carcater
        RyC+=String.valueOf(dia.charAt(0));
        //Decimo caracter
        RyC+=String.valueOf(dia.charAt(1));
        
        return RyC;

    }
}
