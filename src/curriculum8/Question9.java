package curriculum8;

public class Question9 {
    public static void main(String[] args){
        System.out.println("public class Employee {\n" +
                "    private String name;\n" +
                "    private double salary;\n" +
                "\n" +
                "    public String getName() {\n" +
                "        return name;\n" +
                "    }\n" +
                "\n" +
                "    public void setName(String name) {\n" +
                "        this.name = name;\n" +
                "    }\n" +
                "\n" +
                "    public double getSalary() {\n" +
                "        return salary;\n" +
                "    }\n" +
                "\n" +
                "    public void setSalary(double salary) {\n" +
                "        if (salary < 0) {\n" +
                "            throw new IllegalArgumentException(\"給与は0未満に設定できません。\");\n" +
                "        }\n" +
                "        this.salary = salary;\n" +
                "    }\n" +
                "}\n");
    }
}
