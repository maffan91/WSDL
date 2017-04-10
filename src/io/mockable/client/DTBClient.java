package io.mockable.client;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import io.mockable.demo7978947.service._1.PortType;
import io.mockable.demo7978947.service._1.Service;
import io.mockable.demo7978947.service._1.ServiceLocator;

public class DTBClient {

	public static void main(String[] args){
		
		
		ServiceLocator locator = new ServiceLocator();
		try {
			PortType services = locator.getPort();
			services.postTransaction(new java.lang.Object(){
				
			});
			System.out.println(services.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Unable to access the web service");
			e.printStackTrace();
		}
				
	}
}
