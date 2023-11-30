// Class with public access modifier
public class Accessmodifiers{
    public int publicVariable = 10;

    public void publicMethod() {
        System.out.println("Public Method");
    }
}

// Class with default (package-private) access modifier
class DefaultClass {
    int defaultVariable = 20;

    void defaultMethod() {
        System.out.println("Default Method");
    }
}

// Class with protected access modifier
class ProtectedClass {
    protected int protectedVariable = 30;

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
}

// Class with private access modifier
class PrivateClass {
    private int privateVariable = 40;

    private void privateMethod() {
        System.out.println("Private Method");
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        // Accessing public members
        PublicClass publicObj = new PublicClass();
        System.out.println("Public Variable: " + publicObj.publicVariable);
        publicObj.publicMethod();

        // Accessing default members
        DefaultClass defaultObj = new DefaultClass();
        System.out.println("Default Variable: " + defaultObj.defaultVariable);
        defaultObj.defaultMethod();

        // Accessing protected members (from a class in the same package)
        ProtectedClass protectedObj = new ProtectedClass();
        System.out.println("Protected Variable: " + protectedObj.protectedVariable);
        protectedObj.protectedMethod();

        // Accessing private members
        PrivateClass privateObj = new PrivateClass();
        // The following lines would result in compilation errors since private members are not accessible outside their class
        // System.out.println("Private Variable: " + privateObj.privateVariable);
        // privateObj.privateMethod();
    }
}