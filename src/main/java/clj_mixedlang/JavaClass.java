package clj_mixedlang;

import java.util.Objects;

public class JavaClass {
    private final String name;

    public JavaClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaClass javaClass = (JavaClass) o;
        return Objects.equals(getName(), javaClass.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public static long square(long x){
        return x * x;
    }

//    public static long cube(long x){
//        return x * x * x;
//    }
}
