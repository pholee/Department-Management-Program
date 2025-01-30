public class ExpeditionMember {
    // 1 Data Fields
    private String memberName;
    private int memberID;

    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String newMemberName) {
        this.memberName = newMemberName;
    }

    public int getMemberID() {
        return memberID;
    }
    public void setMemberID(int newMemberID) {
        this.memberID = newMemberID;
    }

    // 2 Static Field
    public static int member_counter = 0;

    // 3 Constructor
    ExpeditionMember(String name, int ID) {
        this.memberName = name;
        this.memberID = ID;
        member_counter++;
    }

    // Overrides toString() method to return cleaner result (i.e. not class name + ID
    public String toString() {
        return memberName;
    }
}
