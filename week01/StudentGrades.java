public class StudentGrades {
    public static void main(String[] args) {
        // Student names and points
        String[] names = {"Tenma", "Johan", "Itadori", "Gojo", "Nanami"};
        int[] labPoints = {80, 30, 60, 75, 70};
        int[] bonusPoints = {10, 6, 7, 8, 9};
        
        // Print table
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        System.out.println();
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        for (int i = 0; i < names.length; i++) {
            int total = labPoints[i] + bonusPoints[i];
            System.out.println(names[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + total);
        }
    }
}
