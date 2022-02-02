package domain;
/**
 * Клас, який описує редактора
 * @author Владислава Васильєва
 */
public class Editor extends Artist {
    /**
     * Клас який описує інформацію про редактора 
     * @param electronicEditing Чи вміє працювати з папером 
     * @param skiils Навички
     * @param name Прізвище та ім'я
     * @param jobTitle Посада 
     * @param level розряд чи категорія 
     * @param dept відділ, де працює редактор 
     */

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     * true якщо редактор надає перевагу роботі з папером 
     */
    private boolean electronicEditing;

    public boolean getPreferences() {
        return electronicEditing;
    }

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
