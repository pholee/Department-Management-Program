# Archaeology Research Expeditions
A department has introduced research expeditions for students to engage with the field. Expeditions must have at least 4-6 students, with three students taking on key roles: Expedition Leader, Archivist, and Field Researcher.
This program manages expeditions, tracks members and ensures that minimum participation requirements are met.

### ExpeditionMember class
Keeps track of how many members are in an expedition along with student name and id.

### ResearchExpedition class
Represents each expedition and its members. Assigns key roles to select members of an expedition.

### Main program
Randomly selects 4-6 students from a pool and assigns them to an expedition members array. It then creates two expeditions:
<ul>
 <li>In the first expedition, the first three students in the array take on key roles.</li>
 <li>In the second expedition, the last three students in the array take on key roles.</li>
</ul>

Prints the names of students who have filled key role positions for each expedition and verifies that the number of students participating in an expedition matches the length of the expedition members array.
