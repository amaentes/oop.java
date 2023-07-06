package project;

class Bird implements Soundable, Flyable {
    @Override
    public int getSpeed() {
        return 30;
    }
}
