package sop_corba;


/**
* sop_corba/ControladorCancionIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* viernes 22 de julio de 2022 04:20:43 PM COT
*/

public abstract class ControladorCancionIntPOA extends org.omg.PortableServer.Servant
 implements sop_corba.ControladorCancionIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registrarCancion", new java.lang.Integer (0));
    _methods.put ("listarCanciones", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/ControladorCancionInt/registrarCancion
       {
         sop_corba.ControladorCancionIntPackage.CancionDTO objCancion = sop_corba.ControladorCancionIntPackage.CancionDTOHelper.read (in);
         boolean $result = false;
         $result = this.registrarCancion (objCancion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // sop_corba/ControladorCancionInt/listarCanciones
       {
         sop_corba.ControladorCancionIntPackage.CancionDTO $result[] = null;
         $result = this.listarCanciones ();
         out = $rh.createReply();
         sop_corba.ControladorCancionIntPackage.ListCancionesHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/ControladorCancionInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ControladorCancionInt _this() 
  {
    return ControladorCancionIntHelper.narrow(
    super._this_object());
  }

  public ControladorCancionInt _this(org.omg.CORBA.ORB orb) 
  {
    return ControladorCancionIntHelper.narrow(
    super._this_object(orb));
  }


} // class ControladorCancionIntPOA
