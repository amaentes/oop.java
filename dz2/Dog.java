package dz2;

class Dog implements Soundable, Runnable {
    @Override
    public int getSpeed() {
        return 20;
    }
}