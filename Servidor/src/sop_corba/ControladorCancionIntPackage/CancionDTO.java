package sop_corba.ControladorCancionIntPackage;


/**
* sop_corba/ControladorCancionIntPackage/CancionDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* viernes 22 de julio de 2022 04:20:44 PM COT
*/

public final class CancionDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public String artista = null;
  public String titulo = null;
  public int tamKB = (int)0;

  public CancionDTO ()
  {
  } // ctor

  public CancionDTO (int _id, String _artista, String _titulo, int _tamKB)
  {
    id = _id;
    artista = _artista;
    titulo = _titulo;
    tamKB = _tamKB;
  } // ctor

} // class CancionDTO