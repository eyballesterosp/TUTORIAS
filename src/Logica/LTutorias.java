/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Tutorias;
import Datos.Administrador;
import Datos.Calificaciones;
import Datos.Tutor;
import Datos.Estudiante;
import Datos.Horarioest;
import Datos.Horariotutor;
import Datos.Materias;
import Datos.MateriasEs;
import Datos.Persona;
import Datos.Solicitudes;
import com.csvreader.CsvReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class LTutorias {
        ArrayList<Tutor> as=new ArrayList<Tutor>();//Lista tutores
        ArrayList<Administrador> ad=new ArrayList<Administrador>(); //Lista Administadores
        ArrayList<Tutorias> tutorias=new ArrayList<Tutorias>(); //Lista cnvocatorias
        ArrayList<Estudiante> est=new ArrayList<Estudiante>(); //Lista cnvocatorias
        ArrayList<Persona> per=new ArrayList<Persona>(); //Lista cnvocatorias
        ArrayList<Horarioest> hest=new ArrayList<Horarioest>(); //Lista cnvocatorias
        ArrayList<Horariotutor> htutor=new ArrayList<Horariotutor>(); //Lista cnvocatorias
         ArrayList<Calificaciones> ca=new ArrayList<Calificaciones>();
         ArrayList<Materias> ma=new ArrayList<Materias>();
         ArrayList<MateriasEs> mae=new ArrayList<MateriasEs>();
         ArrayList<Solicitudes> soli=new ArrayList<Solicitudes>();
   private PrintWriter outputPer;
  private PrintWriter outputTutorias; 
  private PrintWriter outputestu; 
private PrintWriter outputTutor; 
private PrintWriter outputAdm;
private PrintWriter outputhest;
private PrintWriter outputhtutor;
private PrintWriter outputca;
private PrintWriter outputma;
private PrintWriter outputmae;
private PrintWriter outputSoli;

public void tutor(String nomtut, String dirtut, String fechaci, String lugarci, String corrtut, String ubitut,String proftut,long cartera,long numt,long codexam, long puntaje, long edadtut, long cctut, long teltut, String usuario, String tipo, String nombreusuario, String contraseña){
    as.add(new Tutor(nomtut, dirtut, fechaci, lugarci, corrtut, ubitut, proftut, cartera, numt, codexam, puntaje, edadtut, cctut, teltut, usuario, tipo, nombreusuario, contraseña));
 
    for (int i = 0; i < as.size(); i++) {
           System.out.println(as.get(i).getNomtut().toString());
       }
}

public void crearcvstutor() throws IOException {
      
        String sFichero = "Tutores.csv";
        File fichero = new File(sFichero);
        FileWriter  fw = new FileWriter("Tutores.csv");
        if(fichero.exists()){

        outputTutor = new PrintWriter(fw);
       // ',' divides the word into columns
        outputTutor.println("CEDULA,NOMBRES COMPLETOS,DIRECCION,TELEFONO,EDAD,CORREO,UBICACION,CARRERA,NUMERO TUTORIAS,"
                + "FECHA EXAMEN,CODEXAMEN,LUGAR EXAMEN,PUNTAJE,CARTERA,USUARIO,TIPO,NOMBRE USUARIO,CONTRASEÑA");// first row first column
        
            for ( int t = 0; t < as.size(); t++) {
                        outputTutor.println(as.get(t).getCctut()+ "," +as.get(t).getNomtut()+ "," 
         + as.get(t).getDirtut() + "," +  as.get(t).getTeltut()+ "," +  as.get(t).getEdadtut()+ "," 
          + as.get(t).getCorrtut()+ "," +  as.get(t).getUbitut()+ "," + as.get(t).getProftut()+ "," 
          + as.get(t).getNumt()+ "," + as.get(t).getFechaci()+ "," + as.get(t).getCodexam()+ ","
          + as.get(t).getLugarci()+ "," + as.get(t).getPuntaje()+ "," + as.get(t).getCartera()+ "," + as.get(t).getPersona()+ "," 
         +as.get(t).getTipo() + "," + as.get(t).getNombrepersona()+ "," 
          + as.get(t).getContraseña()+ ",");

            }
        //Flush the output to the file
        outputTutor.flush();
       
        //Close the Print Writer
        outputTutor.close();
       
        //Close the File Writer
        fw.close(); }

  }
  
  
  
  public void cargararchivotut() {
               
        try {
   
        CsvReader tutores = new CsvReader("Tutores.csv");
        tutores.readHeaders();
         //CEDULA,NOMBRES COMPLETOS,DIRECCION,TELEFONO,EDAD,CORREO,UBICACION,CARRERA,NUMERO TUTORIAS,
        //FECHA EXAMEN,CODEXAMEN,LUGAR EXAMEN,PUNTAJE,CARTERA,USUARIO,TIPO,NOMBRE USUARIO,CONTRASEÃ‘A
        while (tutores.readRecord())
        {
            String nomtut=tutores.get(1);String dirtut=tutores.get(2); String fechaci=tutores.get(9); 
            String lugarci=tutores.get(11); String numt=tutores.get(8); String cartera=tutores.get(13); 
            String corrtut=tutores.get(5); String ubitut=tutores.get(6);
            String codexam=tutores.get(10); String puntaje=tutores.get(12); 
            String cctut=tutores.get(0); 
            String teltut=tutores.get(3); String edadtut=tutores.get(4); String usuario=tutores.get(14);
            String tipo=tutores.get(15); String nombreusuario=tutores.get(16); String contraseña=tutores.get(17);
            String proftut=tutores.get(7);
             
             long cctuti= Long.parseLong(cctut);
             long teltuti= Long.parseLong(teltut);
             long edadtuti= Long.parseLong(edadtut);
             long puntajee= Long.parseLong(puntaje);
             long carteraa= Long.parseLong(cartera);
             long numtt= Long.parseLong(numt);
             long codexame= Long.parseLong(codexam);
             
             
           
    as.add(new Tutor(nomtut, dirtut, fechaci, lugarci, corrtut, ubitut, proftut, carteraa, numtt, codexame, puntajee, edadtuti, cctuti, teltuti, usuario, tipo, nombreusuario, contraseña));
  
        }
         
        tutores.close();
         
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }

 public void persona(String usuario,String tipo,String nombreusuario,String contraseña){
       per.add(new Persona(usuario,tipo,nombreusuario,contraseña));
      
          
   }
 
 
  public void crearcvsusu() throws IOException {
      
        String u = "Personas.csv";
        File f = new File(u);
        FileWriter  usua = new FileWriter("Personas.csv");
        if(f.exists()){

        outputPer = new PrintWriter(usua);
       // ',' divides the word into columns
        outputPer.println("USUARIO,TIPO,NOMBRE USUARIO,CONTRASEÑA");// first row first column
        
            for (int t = 0; t < per.size(); t++) {
                        outputPer.println(per.get(t).getPersona()+ "," +per.get(t).getTipo() + "," + per.get(t).getNombrepersona()+ "," + per.get(t).getContraseña());

            }
        //Flush the output to the file
        outputPer.flush();
       
        //Close the Print Writer
        outputPer.close();
       
        //Close the File Writer
        usua.close(); }

  }
    public void cargararchivousu() {
               
        try {
   
        CsvReader usuarios = new CsvReader("Personas.csv");
        usuarios.readHeaders();
         
        while (usuarios.readRecord())
        {
             String usuario=usuarios.get(0); String tipo=usuarios.get(1); String nombreusuario=usuarios.get(2); String contraseña=usuarios.get(3);
          
per.add(new Persona(usuario, tipo, nombreusuario, contraseña));
        }
         
        usuarios.close();
         
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }
    
    public void estudiante(String nomest, String direst, String correst, String ubiest, long ccest, long telest, long edadest, String persona, String tipo, String nombrepersona, String contraseña,long cartera){
    est.add(new Estudiante(nomest, direst,correst,ubiest,ccest,telest, edadest, persona, tipo, nombrepersona, contraseña,cartera));
 
    
}
    public void crearcvsest() throws IOException {
      
        String sFichero = "Estudiantes.csv";
        File fichero = new File(sFichero);
        FileWriter  fw1 = new FileWriter("Estudiantes.csv");
        if(fichero.exists()){

        outputestu = new PrintWriter(fw1);
       // ',' divides the word into columns
        outputestu.println("CEDULA,NOMBRES COMPLETOS,DIRECCION,TELEFONO,EDAD,CORREO,UBICACION,USUARIO,TIPO,NOMBRE USUARIO,CONTRASEÑA,CARTERA");// first row first column
        
            for ( int t = 0; t < est.size(); t++) {
                        outputestu.println(est.get(t).getCcest()+ "," +est.get(t).getNomest()+ "," 
         + est.get(t).getDirest() + "," +  est.get(t).getTelest()+ "," +  est.get(t).getEdadest()+ "," 
          + est.get(t).getCorrest()+ "," +  est.get(t).getUbiest()+ "," + est.get(t).getPersona()+ "," 
         +est.get(t).getTipo() + "," + est.get(t).getNombrepersona()+ "," 
          + est.get(t).getContraseña()+"," + est.get(t).getCartera());

            }
        //Flush the output to the file
        outputestu.flush();
       
        //Close the Print Writer
        outputestu.close();
       
        //Close the File Writer
        fw1.close(); }

  }
  
 
  public void cargararchivoest() {
               
        try {
   
        CsvReader estudiantes = new CsvReader("Estudiantes.csv");
        estudiantes.readHeaders();
         
        while (estudiantes.readRecord())
        {
            String nomest=estudiantes.get(1);String direst=estudiantes.get(2); 
            String correst=estudiantes.get(5); String ubiest=estudiantes.get(6);
           
            String ccest=estudiantes.get(0); 
            String telest=estudiantes.get(3); String edadest=estudiantes.get(4); String usuario=estudiantes.get(7);
            String tipo=estudiantes.get(8); String nombreusuario=estudiantes.get(9); String contraseña=estudiantes.get(10);
            String cartera=estudiantes.get(11);
       
             
             long ccesti= Long.parseLong(ccest);
             long telesti= Long.parseLong(telest);
             long edadesti= Long.parseLong(edadest);
             long carteraa= Long.parseLong(cartera);
             
 //   CEDULA,NOMBRES COMPLETOS,DIRECCION,TELEFONO,EDAD,CORREO,UBICACION,USUARIO,TIPO,NOMBRE USUARIO,CONTRASEÑA    
    est.add(new Estudiante(nomest, direst,correst,ubiest,ccesti,telesti, edadesti, usuario, tipo, nombreusuario, contraseña,carteraa));
  
        }
         
        estudiantes.close();
         
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }
  
   public void crearadm(String nombadm, String diradm, String corradm, long ccadm, long teladm, long codadm, String persona, String tipo, String nombrepersona, String contraseña){
        ad.add(new Administrador(nombadm,diradm,corradm, ccadm,teladm,  codadm, persona, tipo, nombrepersona, contraseña));
          
   }
  public void crearcvsadm() throws IOException {
      
        String s3 = "Administradores.csv";
        File f3 = new File(s3);
        FileWriter  e2 = new FileWriter("Administradores.csv");
        if(f3.exists()){

        outputAdm = new PrintWriter(e2);
       // ',' divides the word into columns
        
 //nombadm,diradm,corradm,ccadm,teladm,codadm,persona, tipo, nombrepersona, contraseña
        outputAdm.println("NOMBRE,DIRECCION,CORREO,CEDULA,TELEFONO,CODIGO,USUARIO, TIPO,NOMBRE USUARIO, CONTRASEÑA");
        for ( int t = 0; t < ad.size(); t++) {
      outputAdm.println(ad.get(t).getNombadm()+ "," + ad.get(t).getDiradm() + "," +  ad.get(t).getCorradm() + "," + ad.get(t).getCcadm()+ "," 
              +  ad.get(t).getTeladm()+ "," +  ad.get(t).getCodadm()+ "," 
              +  ad.get(t).getPersona() + ","  +  ad.get(t).getTipo() + ","  + ad.get(t).getNombrepersona() + ","  
              + ad.get(t).getContraseña());

            }
        //Flush the output to the file
        outputAdm.flush();
       
        //Close the Print Writer
        outputAdm.close();
       
        //Close the File Writer
        e2.close(); }

  }
  
  
  
  public void cargararchivoadm() {
               
        try {
   
        CsvReader admin = new CsvReader("Administradores.csv");
       admin.readHeaders();
         
        while (admin.readRecord())
        {
            
//NOMBRE,DIRECCION,CORREO,CEDULA,TELEFONO,CODIGO,USUARIO, TIPO,NOMBRE USUARIO, CONTRASEÑA
String nombadm=admin.get(0); String diradm=admin.get(1); String corradm=admin.get(2);
String ccadm=admin.get(3); String teladm=admin.get(4); String codadm=admin.get(5); 
String usuario=admin.get(6); String tipo=admin.get(7); String nombreusuario=admin.get(8); String contraseña=admin.get(9);

long lcodadm = Long.parseLong(codadm);
             long lteladm=Long.parseLong(teladm);
             long lccadm=Long.parseLong(ccadm);
             ad.add(new Administrador(nombadm,diradm,corradm,lccadm,lteladm,lcodadm,usuario, tipo, nombreusuario, contraseña));
                     }
         
        admin.close();
         
        
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }

public void crearhtutor(String hora,String lunes, String martes, String miercoles, String jueves, String viernes, long cctutor){
        htutor.add(new Horariotutor(hora,lunes, martes, miercoles,jueves,viernes,cctutor));
           
   }

 public void crearcvshtutor() throws IOException {
      
        String s4 = "Horario Tutor.csv";
        File f4 = new File(s4);
        FileWriter  e4 = new FileWriter("Horario Tutor.csv");
        if(f4.exists()){

        outputhtutor = new PrintWriter(e4);
       // ',' divides the word into columns
        
 //nombadm,diradm,corradm,ccadm,teladm,codadm,persona, tipo, nombrepersona, contraseña
        outputhtutor.println("CEDULA,HORA,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES");
        for ( int t = 0; t < htutor.size(); t++) {
      outputhtutor.println(htutor.get(t).getCctutor()+ "," +htutor.get(t).getHora()+ "," + htutor.get(t).getLunes() + "," +  htutor.get(t).getMartes() + "," + htutor.get(t).getMiercoles()+ "," + htutor.get(t).getJueves()+ "," 
              +  htutor.get(t).getViernes());

            }
        //Flush the output to the file
        outputhtutor.flush();
       
        //Close the Print Writer
        outputhtutor.close();
       
        //Close the File Writer
        e4.close(); }

  }
  
  
  
  public void cargararchivohtutor() {
               
        try {
   
        CsvReader hortu = new CsvReader("Horario Tutor.csv");
       hortu.readHeaders();
         
        while (hortu.readRecord())
        {
            
//CEDULA,HORA,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES
String cctutor=hortu.get(0); String hora=hortu.get(1);String lunes=hortu.get(2); String martes=hortu.get(3);
String miercoles=hortu.get(4); String jueves=hortu.get(5); String viernes=hortu.get(6); 

            
             long lcctutor=Long.parseLong(cctutor);
             htutor.add(new Horariotutor(hora,lunes, martes, miercoles,jueves,viernes,lcctutor));
                     }
         
        hortu.close();
         
        
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }
  
  
  public void crearhest(String hora,String lunes, String martes, String miercoles, String jueves, String viernes, long cctutor){
        hest.add(new Horarioest(hora,lunes, martes, miercoles,jueves,viernes,cctutor));
           
   }

 public void crearcvshest() throws IOException {
      
        String s5 = "Horario Estudiante.csv";
        File f5 = new File(s5);
        FileWriter  e5 = new FileWriter("Horario Estudiante.csv");
        if(f5.exists()){

        outputhest = new PrintWriter(e5);
       // ',' divides the word into columns
        
 //nombadm,diradm,corradm,ccadm,teladm,codadm,persona, tipo, nombrepersona, contraseña
        outputhest.println("CEDULA,HORA,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES");
        for ( int t = 0; t < hest.size(); t++) {
      outputhest.println(hest.get(t).getCcestu()+ "," +hest.get(t).getHora()+ "," + hest.get(t).getLunes() + "," +  hest.get(t).getMartes() + "," + hest.get(t).getMiercoles()+ "," 
              +  hest.get(t).getViernes());

            }
        //Flush the output to the file
        outputhest.flush();
       
        //Close the Print Writer
        outputhest.close();
       
        //Close the File Writer
        e5.close(); }

  }
  
  
  
  public void cargararchivohest() {
               
        try {
   
        CsvReader horest = new CsvReader("Horario Estudiante.csv");
       horest.readHeaders();
         
        while (horest.readRecord())
        {
            
//CEDULA,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES
String ccest=horest.get(0); String hora=horest.get(1); String lunes=horest.get(2); String martes=horest.get(3);
String miercoles=horest.get(4); String jueves=horest.get(5); String viernes=horest.get(6); 

            
             long lccest=Long.parseLong(ccest);
             hest.add(new Horarioest(hora, lunes, martes, miercoles,jueves,viernes,lccest));
                     }
         
        horest.close();
         
        
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }
  
  
    public ArrayList<Tutor> getAs() {
        return as;
    }

    public ArrayList<Administrador> getAd() {
        return ad;
    }

    public ArrayList<Tutorias> getTutorias() {
        return tutorias;
    }

    public ArrayList<Estudiante> getEst() {
        return est;
    }

    public ArrayList<Persona> getPer() {
        return per;
    }

    public ArrayList<Horarioest> getHest() {
        return hest;
    }

    public ArrayList<Horariotutor> getHtutor() {
        return htutor;
    }
    
    public void crearca(long cctut, long puntaje, long codexam, String fechaci, String lugarci, String nombreaspirante){
        ca.add(new Calificaciones(cctut,puntaje, codexam,  fechaci, lugarci, nombreaspirante));
           
   }
    public void crearcvsca() throws IOException {
      
        String s5 = "Calificaciones.csv";
        File f5 = new File(s5);
        FileWriter  e5 = new FileWriter("Calificaciones.csv");
        if(f5.exists()){

        outputca = new PrintWriter(e5);
       // ',' divides the word into columns
        
 //cctut,puntaje, codexam,  fechaci, lugarci, nombreaspirante
        outputca.println("CEDULA,NOMBRE,CODIGO EXAMEN,FECHA,PUNTAJE,LUGAR");
        for ( int t = 0; t < ca.size(); t++) {
      outputca.println(ca.get(t).getCctut()+ "," +ca.get(t).getNombreaspirante()+ "," + ca.get(t).getCodexam() + "," 
              +  ca.get(t).getFechaci() + "," + ca.get(t).getPuntaje()+ "," 
              +  ca.get(t).getLugarci());

            }
        //Flush the output to the file
        outputca.flush();
       
        //Close the Print Writer
        outputca.close();
       
        //Close the File Writer
        e5.close(); }

  }
  
  
  
  public void cargararchivoca() {
               
        try {
   
        CsvReader cal = new CsvReader("Calificaciones.csv");
       cal.readHeaders();
         
        while (cal.readRecord())
        {
            
//CEDULA,NOMBRE,CODIGO EXAMEN,FECHA,PUNTAJE,LUGAR
String cctut=cal.get(0); String nombreaspirante=cal.get(1); String codigo=cal.get(2); String fechaci=cal.get(3);
String puntaje=cal.get(4); String lugarci=cal.get(5);

            
             long lcctut=Long.parseLong(cctut);
             long codexam=Long.parseLong(codigo);
             long lpuntaje=Long.parseLong(puntaje);
             ca.add(new Calificaciones(lcctut,lpuntaje, codexam,  fechaci, lugarci, nombreaspirante));
                     }
         
        cal.close();
         
        
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }

    public ArrayList<Calificaciones> getCa() {
        return ca;
        
    }

    public void setCa(ArrayList<Calificaciones> ca) {
        this.ca = ca;
    }

    public void crearma(long cc,String materia){
        ma.add(new Materias(cc,materia));
           for (int i = 0; i <ma.size(); i++) {
           System.out.println(ma.get(i).getMateria().toString());
       }
   }
    public void crearcvsma() throws IOException {
      
        String s5 = "Materias.csv";
        File f5 = new File(s5);
        FileWriter  e5 = new FileWriter("Materias.csv");
        if(f5.exists()){

        outputma = new PrintWriter(e5);
       // ',' divides the word into columns
        
 //cctut,puntaje, codexam,  fechaci, lugarci, nombreaspirante
        outputma.println("CEDULA,MATERIAS");
        for ( int t = 0; t < ma.size(); t++) {
      outputma.println(ma.get(t).getCc()+ "," +ma.get(t).getMateria());

            }
        //Flush the output to the file
        outputma.flush();
       
        //Close the Print Writer
        outputma.close();
       
        //Close the File Writer
        e5.close(); }

  }
  
  
  
  public void cargararchivoma() {
               
        try {
   
        CsvReader mat = new CsvReader("Materias.csv");
       mat.readHeaders();
         
        while (mat.readRecord())
        {
            
//CEDULA,NOMBRE,CODIGO EXAMEN,FECHA,PUNTAJE,LUGAR
String cctut=mat.get(0); String materia=mat.get(1);
long lcctut=Long.parseLong(cctut);
             ma.add(new Materias(lcctut,materia));
                     }
         
        mat.close();
         
        
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }
  public void crearmae(long cc,String materia){
        mae.add(new MateriasEs(cc,materia));
           
  }
  public void crearcvsmae() throws IOException {
      
        String s5 = "Materias Estudiantes.csv";
        File f5 = new File(s5);
        FileWriter  e5 = new FileWriter("Materias Estudiantes.csv");
        if(f5.exists()){

        outputmae = new PrintWriter(e5);
       // ',' divides the word into columns
        
 //cctut,puntaje, codexam,  fechaci, lugarci, nombreaspirante
        outputmae.println("CEDULA,MATERIAS");
        for ( int t = 0; t < mae.size(); t++) {
      outputmae.println(mae.get(t).getCc()+ "," +mae.get(t).getMateria());

            }
        //Flush the output to the file
        outputmae.flush();
       
        //Close the Print Writer
        outputmae.close();
       
        //Close the File Writer
        e5.close(); }

  }
  
  
  
  public void cargararchivomae() {
               
        try {
   
        CsvReader mat = new CsvReader("Materias Estudiantes.csv");
       mat.readHeaders();
         
        while (mat.readRecord())
        {
            
//CEDULA,NOMBRE,CODIGO EXAMEN,FECHA,PUNTAJE,LUGAR
String cctut=mat.get(0); String materia=mat.get(1);
long lcctut=Long.parseLong(cctut);
             mae.add(new MateriasEs(lcctut,materia));
                     }
         
        mat.close();
         
       
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }

    public ArrayList<Materias> getMa() {
        return ma;
    }

    public void setMa(ArrayList<Materias> ma) {
        this.ma = ma;
    }

    public ArrayList<MateriasEs> getMae() {
        return mae;
    }

    public void setMae(ArrayList<MateriasEs> mae) {
        this.mae = mae;
    }
   public void creartu(String nomtutor, String nomreestu, String lugartu, String fechatut, String horatut, String tematut, String estado, long tel, long costo,String calt,String come){
        tutorias.add(new Tutorias( nomtutor,  nomreestu, lugartu, fechatut, horatut, tematut, estado, tel, costo,calt,come));
           
   }
    public void crearcvstu() throws IOException {
      
        String s5 = "Tutorias.csv";
        File f5 = new File(s5);
        FileWriter  e5 = new FileWriter("Tutorias.csv");
        if(f5.exists()){

        outputTutorias = new PrintWriter(e5);
       // ',' divides the word into columns
        
 //nomtutor,  nomreestu, lugartu, fechatut, horatut, tematut, estado, tel, costo
        outputTutorias.println("NOMBRE TUTOR,NOMBRE ESTUDIANTE, LUGAR, FECHA,HORA,TEMA,ESTADO,TELEFONO ESTUDIANTE,COSTO,CALIFICACION A TUTOR,COMENTARIO A ESTUDIANTE");
        for ( int t = 0; t < tutorias.size(); t++) {
      outputTutorias.println(tutorias.get(t).getNomtutor()+ "," +tutorias.get(t).getNomreestu()+ "," + tutorias.get(t).getLugartu() + "," 
              +  tutorias.get(t).getFechatut() + "," + tutorias.get(t).getHoratut()+ "," +  tutorias.get(t).getTematut()+ 
              "," +  tutorias.get(t).getEstado()+ "," +  tutorias.get(t).getTel()+ "," +  tutorias.get(t).getCosto()+"," +  tutorias.get(t).getCalt()+
              "," +  tutorias.get(t).getCome());

            }
        //Flush the output to the file
        outputTutorias.flush();
       
        //Close the Print Writer
        outputTutorias.close();
       
        //Close the File Writer
        e5.close(); }

  }
  
  
  
  public void cargararchivotu() {
               
        try {
   
        CsvReader tutori = new CsvReader("Tutorias.csv");
       tutori.readHeaders();
         
        while (tutori.readRecord())
        {
            
//NOMBRE TUTOR,NOMBRE ESTUDIANTE, LUGAR, FECHA,HORA,TEMA,ESTADO,TELEFONO ESTUDIANTE,COSTO
String nom=tutori.get(0); String nombrees=tutori.get(1); String lugar=tutori.get(2); String fecha=tutori.get(3);
String hora=tutori.get(4); String tema=tutori.get(5); String estado=tutori.get(6);String tel=tutori.get(7);
String costo=tutori.get(8); String calt =tutori.get(9); String come =tutori.get(10);

            
             long ltel=Long.parseLong(tel);
             long lcosto=Long.parseLong(costo);
             
             tutorias.add(new Tutorias(nom,  nombrees, lugar, fecha, hora, tema, estado,ltel,lcosto,calt,come));
                     }
         
        tutori.close();
         
        
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }
  
  public void crearsoli(String nombreDe,String NombrePara,long codigoSolicitud, String solicitud, String respuesta){
       soli.add(new Solicitudes(nombreDe, NombrePara, codigoSolicitud, solicitud, respuesta));
          
   }

   public void crearcvssol() throws IOException {
      
        String s4 = "Solicitudes.csv";
        File f4 = new File(s4);
        FileWriter  e4 = new FileWriter("Solicitudes.csv");
        if(f4.exists()){

        outputSoli = new PrintWriter(e4);
       // ',' divides the word into columns
        outputSoli.println("NOMBRE DE,NOMBRE PARA,CODIGO SOLICITUD,SOLICITUD,RESPUESTA");
        for ( int t = 0; t < soli.size(); t++) {
      outputSoli.println(soli.get(t).getNombreDe()+ "," + soli.get(t).getNombrePara()+ "," +  soli.get(t).getCodigoSolicitud() + "," + soli.get(t).getSolicitud() + "," + soli.get(t).getRespuesta());

            }
        //Flush the output to the file
        outputSoli.flush();
       
        //Close the Print Writer
        outputSoli.close();
       
        //Close the File Writer
        e4.close(); }

  }
   
   public void cargararchivosol() {
               
        try {
   
        CsvReader sol = new CsvReader("Solicitudes.csv");
       sol.readHeaders();
         
        while (sol.readRecord())
        {
            
        
String nombreEst=sol.get(0);String nombrePara=sol.get(1);String codigoSolicitud=sol.get(2); String solicitud=sol.get(3); String respuesta=sol.get(4);
           
             long codsol= Long.parseLong(codigoSolicitud);
             
soli.add(new Solicitudes(nombreEst, nombrePara,codsol, solicitud, respuesta));                     }
         
        sol.close();
         
       
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
           }

    public ArrayList<Solicitudes> getSoli() {
        return soli;
    }

    public void setSoli(ArrayList<Solicitudes> soli) {
        this.soli = soli;
    }

}
