package pt.isel

class MyGroovy {
    static String foo() {
        return "From Groovy"
    }
    static String callJava() {
        return MyJava.bar();
    }
}
