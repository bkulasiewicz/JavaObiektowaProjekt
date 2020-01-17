public class Crocodile extends Animal {
    public Crocodile(Integer posx, Integer posy, World world){
        this.setPosition(new Position(posx, posy));
        this.setWorld(world);
    }
    @Override
    public Organism clone() {
        Crocodile crocodile = new Crocodile();
        return crocodile;

    }

    public Crocodile() {}


    @Override
    public void initParams() {
        this.setPower(7);
        this.setInitiative(7);
        this.setLiveLength(35);
        this.setPowerToReproduce(12);
        this.setFoodChain(4);
        this.setSign("\uD83D\uDC0A");
    }
}
