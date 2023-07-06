package project;

class Cat implements Soundable, Runnable {
    @Override
    public int getSpeed() {
        return 15;
    }
}
