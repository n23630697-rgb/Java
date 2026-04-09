package curriculum9;

public class Question8 {
    public static void main(String[] args){
        System.out.println("class Employee {\n" +
                "    String name;\n" +
                "    int id;\n" +
                "}\n" +
                "\n" +
                "class Manager extends Employee {\n" +
                "    int teamSize;\n" +
                "\n" +
                "    void manageTeam() {\n" +
                "        System.out.println(\"Managing a team of \" + teamSize + \" people.\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        Manager manager = new Manager();\n" +
                "        manager.name = \"田中\";\n" +
                "        manager.teamSize = 10;\n" +
                "        manager.manageTeam();\n" +
                "    }\n" +
                "}\n");
    }
}

