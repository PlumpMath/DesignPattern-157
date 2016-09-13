package com.jkxy.strategy.builder;

/**
 * Created by kerrui on 16/9/13.
 */
public class PersonBuilder {

    /**
     * —Builder模式
     */
    private String name;
    private int age;
    private Float height;
    private boolean married;

    public PersonBuilder(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.married = builder.married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    static class Builder {
        private String name;
        private int age;
        private Float height;
        private boolean married;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder height(Float height) {
            this.height = height;
            return this;
        }

        public Builder married(boolean married) {
            this.married = married;
            return this;
        }

        public PersonBuilder build() {
            return new PersonBuilder(this);
        }
    }
}
