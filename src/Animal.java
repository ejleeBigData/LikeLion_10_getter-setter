interface Animal {
    void makeSound();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}