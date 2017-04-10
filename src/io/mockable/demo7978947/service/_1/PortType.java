/**
 * PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package io.mockable.demo7978947.service._1;

public interface PortType extends java.rmi.Remote {
    public java.lang.Object queryTransaction(java.lang.Object queryTransactionInputPart) throws java.rmi.RemoteException;
    public java.lang.Object postTransaction(java.lang.Object postTransactionInputPart) throws java.rmi.RemoteException;
    public java.lang.Object validateAccount(java.lang.Object validateAccountInputPart) throws java.rmi.RemoteException;
    public java.lang.Object queryBalance(java.lang.Object queryBalanceInputPart) throws java.rmi.RemoteException;
    public java.lang.Object validateAccountOTP(java.lang.Object validateAccountOTPInputPart) throws java.rmi.RemoteException;
}
