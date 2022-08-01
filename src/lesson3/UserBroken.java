package lesson3;

import java.util.Objects;

public class UserBroken {
    private int age;
    private String name;

    public UserBroken(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBroken that = (UserBroken) o;
        that.name = this.name;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
