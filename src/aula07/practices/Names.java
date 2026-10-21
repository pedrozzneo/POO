package aula07.practices;

public class Names implements Comparable{
    String name;

    public Names(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if(o == null || o.getClass() != getClass()) throw new RuntimeException();
        Names name = (Names) o;

        return this.name.compareTo(name.name);

//        if(this.name.toCharArray()[0] == name.name.toCharArray()[0]){
//            return 0;
//        }
//
//       if(this.name.toCharArray()[0] > name.name.toCharArray()[0]){
//           return 1;
//       }
//       return -1;
    }
}
