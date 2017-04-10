package io.mockable.demo7978947.service._1;

public class PortTypeProxy implements io.mockable.demo7978947.service._1.PortType {
  private String _endpoint = null;
  private io.mockable.demo7978947.service._1.PortType portType = null;
  
  public PortTypeProxy() {
    _initPortTypeProxy();
  }
  
  public PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPortTypeProxy();
  }
  
  private void _initPortTypeProxy() {
    try {
      portType = (new io.mockable.demo7978947.service._1.ServiceLocator()).getPort();
      if (portType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)portType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (portType != null)
      ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public io.mockable.demo7978947.service._1.PortType getPortType() {
    if (portType == null)
      _initPortTypeProxy();
    return portType;
  }
  
  public java.lang.Object queryTransaction(java.lang.Object queryTransactionInputPart) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.queryTransaction(queryTransactionInputPart);
  }
  
  public java.lang.Object postTransaction(java.lang.Object postTransactionInputPart) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.postTransaction(postTransactionInputPart);
  }
  
  public java.lang.Object validateAccount(java.lang.Object validateAccountInputPart) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.validateAccount(validateAccountInputPart);
  }
  
  public java.lang.Object queryBalance(java.lang.Object queryBalanceInputPart) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.queryBalance(queryBalanceInputPart);
  }
  
  public java.lang.Object validateAccountOTP(java.lang.Object validateAccountOTPInputPart) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.validateAccountOTP(validateAccountOTPInputPart);
  }
  
  
}