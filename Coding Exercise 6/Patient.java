public class Patient extends User {
    
    private long patientId;
    private boolean insured;
    
    public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
    // use is instead of get
    //beacuse for bool we use is
	public boolean isInsured() {
		return insured;
	}
	public void getInsured(boolean insured) {
		this.insured = insured;
	}
	
}