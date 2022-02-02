package domain;
/**
 * Клас, який описує художника(Артиста)
 * @author Владислава Васильєва 
 */
public class Artist extends Employee {
    /**
     * Клас який описує інформацію про Артиста  
     * @param skiils навички співробітника
     * @param name ім'я
     * @param jobTitle посада співробітника
     * @param level розряд або категорія 
     * @param dept відділ, де він працює 
     */

    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    public String[] getSkillsLSist() {
        return skiils;
    }
}
