// Math.random() * (max - min + 1) + min

public class Main {
    public static void main(String[] args) {
        // 1 Initialize Arrays
        String[] allNames = {"John Smith", "Jane Doe", "Strawberry Shortcake", "Peter Rabbit", "Christopher Robin", "Dennis Menace"};
        int[] allStudentIDs = {567096, 567190, 567340, 5671234, 458903, 456738};

        // 2 Set up Member Pool
        ExpeditionMember[] members = new ExpeditionMember[(int) (Math.random() * (3)+4)]; // Creates array (members) of objects (ExpeditionMember) with size random in range 4-6
        int[] randomStudents = new int[members.length]; // Keeps track of which students are already members

        for (int i = 0; i < (members.length); i++) { // Loops through empty array appending random students to array indexes
            int random = (int) (Math.random() * allNames.length); // Generates a random index between 0 and array length
            boolean found = false; // If student is already a member

            for (int x = 0; x < i; x++) { // Loops through randomStudents checking for random value
                if (random == randomStudents[x]) {
                    found = true;
                    break;
                }
            }

            if (found) { // If student found in members list
                i--; // De-increment i and try again with another random value
            } else {
                randomStudents[i] = random; // Appends random value to list of students
                members[i] = new ExpeditionMember(allNames[random], allStudentIDs[random]); // Appends random student to members array
            }
        }

        // 3 Create Expeditions
        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0], members[1], members[2]); // Instance of ResearchExpedition that gives the first three members roles
        ResearchExpedition nileExpedition = new ResearchExpedition(members[members.length - 1], members[members.length - 2], members[members.length - 3]); // Instance of ResearchExpedition that gives the last three members roles

        // 4 Output and Verification
        System.out.println("\nPyramid Expedition");
        System.out.println("Leader: " + pyramidExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + pyramidExpedition.getArchivistName());
        System.out.println("Field Researcher: " + pyramidExpedition.getFieldResearcherName());

        System.out.println("\nNile Expedition");
        System.out.println("Leader: " + nileExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + nileExpedition.getArchivistName());
        System.out.println("Field Researcher: " + nileExpedition.getFieldResearcherName());

        if (ExpeditionMember.member_counter == members.length) { // Verify if member_counter in ExpeditionMember matches the length of the members array
            System.out.println("\nSUCCESS\nMember counter matches the length of the members array.");
        } else {
            System.out.println("\nERROR\nMember counter does not match the length of members array.");
        }
    }
}