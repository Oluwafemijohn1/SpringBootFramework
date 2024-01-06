package demo;

public class Doctor implements Staff {

    private String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }
//    private Nurse nurse;

    public void assist(){
        System.out.println("Doctor assigning with qualification of " + this.qualification);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
}
