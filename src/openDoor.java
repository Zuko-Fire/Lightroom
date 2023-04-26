public class openDoor implements Command {

    private Home theHome;
    public openDoor(Home home){this.theHome=home;}

    @Override
    public void execute() {theHome.openDoor();}
}

