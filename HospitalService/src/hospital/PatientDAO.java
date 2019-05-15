package hospital;

import hospital.PatientData;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author eyoel
 */
public interface PatientDAO extends Remote{
    
    public boolean SavePatientInformation(PatientData pd) throws RemoteException;
    
    public VoucherList GetVoucher(int clientId) throws RemoteException;
    
    public void UpdateVoucherToSeen (int voucherId) throws RemoteException;
}
