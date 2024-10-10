package org.example;

public class Generic {

    public <T extends Telephone> void useTelephone(T telephone) {
        telephone.call();
        System.out.println("Cannot call to Smartphone.takePhoto because it is not guaranted T would be of type smartphone and have this method");
    }

    public <T extends Smartphone> void useSmartphone(T smartphone) {
        smartphone.call();
        smartphone.takePhoto();
    }
}
