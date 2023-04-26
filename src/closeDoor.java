public class closeDoor implements Command{

    private Home theHome;
    public closeDoor(Home home){this.theHome=home;}

    @Override
    public void execute() {theHome.closeDoor();}
}

