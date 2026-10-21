package aula07.practices;

import java.util.Objects;

public class TechnicalSkills implements Comparable{
    String skill;

    public TechnicalSkills(String skill) {
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o){
        TechnicalSkills obj = (TechnicalSkills) o;
//        return Objects.equals(this.skill, obj.skill);
        return this.skill.equals(obj.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(skill);
    }

    @Override
    public int compareTo(Object o) {
        TechnicalSkills obj = (TechnicalSkills) o;
        return skill.compareTo(obj.skill);
    }

    @Override
    public String toString() {
        return "TechnicalSkills{" +
                "skill='" + skill + '\'' +
                '}';
    }
}
