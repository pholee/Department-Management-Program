public class ResearchExpedition {
    // 1 Core Member Roles
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    // 2 Constructor
    ResearchExpedition(ExpeditionMember expeditionLeader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {
        this.expeditionLeader = expeditionLeader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    // 3 Getter Methods
    public String getExpeditionLeaderName() {
        return expeditionLeader.getMemberName();
    }

    public String getArchivistName() {
        return archivist.getMemberName();
    }

    public String getFieldResearcherName() {
        return fieldResearcher.getMemberName();
    }
}
