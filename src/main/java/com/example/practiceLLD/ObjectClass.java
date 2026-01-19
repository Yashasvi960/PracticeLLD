package com.example.practiceLLD;

public class ObjectClass {
    String objectName;
    int value;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ObjectClass(String objectName, int value) {
        this.objectName = objectName;
        this.value = value;
    }

    public void objectMethod() {
        System.out.println("Name "+ objectName);
        System.out.println("Value "+ value);

    }




    public static void main(String[] args) {
        ObjectClass objectClass = new ObjectClass("newObject", 126);
        objectClass.objectMethod();
    }
}
