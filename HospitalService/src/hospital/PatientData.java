/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author eyoel
 */
public class PatientData implements Serializable{
    
    private static final long serialVersionUID = 1190476516911661470L;
    private int patientId;
    private String patientName;
    private int patientAge;
    private String patientGender;
    private String patientAddress;

    /**
     * @return the patientId
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return the patientAge
     */
    public int getPatientAge() {
        return patientAge;
    }

    /**
     * @param patientAge the patientDob to set
     */
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    /**
     * @return the patientGender
     */
    public String getPatientGender() {
        return patientGender;
    }

    /**
     * @param patientGender the patientGender to set
     */
    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    /**
     * @return the patientAddress
     */
    public String getPatientAddress() {
        return patientAddress;
    }

    /**
     * @param patientAddress the patientAddress to set
     */
    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }
    
    
}
