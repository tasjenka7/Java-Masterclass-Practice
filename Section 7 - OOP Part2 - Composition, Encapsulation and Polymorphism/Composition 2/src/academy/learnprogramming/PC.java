package academy.learnprogramming;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphic
        monitor.drawPixelAt(1200, 50, "yellow");
    }
/*
    We can delete all of this and access directly
    If this is not deleted:
    getTheCase().pressPowerButton();

    private Case getTheCase() {
        return theCase;
    }
    
    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/
}
