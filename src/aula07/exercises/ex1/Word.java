package aula07.exercises.ex1;

import java.util.Comparator;

public class Word implements Comparator {
    private String content;

    public Word(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 == null || o2 != null){
            throw new RuntimeException();
        }

        String content1 = ((Word) o1).getContent();
        String content2 = ((Word) o2).getContent();
        return content1.compareTo(content2);
    }
}
