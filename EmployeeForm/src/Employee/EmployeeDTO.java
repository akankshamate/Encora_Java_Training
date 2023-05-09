package Employee;

public class EmployeeDTO {
    private int empId;
    private String empName;
    private String gender;
    private boolean pf;
    private boolean graduity;
    private boolean nps;
    private boolean mediClaim;
    private boolean mealCard;

    private String ofcLocation;

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", pf=" + pf +
                ", graduity=" + graduity +
                ", nps=" + nps +
                ", mediClaim=" + mediClaim +
                ", mealCard=" + mealCard +
                ", ofcLocation='" + ofcLocation + '\'' +
                '}';
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isPf() {
        return pf;
    }

    public void setPf(boolean pf) {
        this.pf = pf;
    }

    public boolean isGraduity() {
        return graduity;
    }

    public void setGraduity(boolean graduity) {
        this.graduity = graduity;
    }

    public boolean isNps() {
        return nps;
    }

    public void setNps(boolean nps) {
        this.nps = nps;
    }

    public boolean isMediClaim() {
        return mediClaim;
    }

    public void setMediClaim(boolean mediClaim) {
        this.mediClaim = mediClaim;
    }

    public boolean isMealCard() {
        return mealCard;
    }

    public void setMealCard(boolean mealCard) {
        this.mealCard = mealCard;
    }

    public String getOfcLocation() {
        return ofcLocation;
    }

    public void setOfcLocation(String ofcLocation) {
        this.ofcLocation = ofcLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
