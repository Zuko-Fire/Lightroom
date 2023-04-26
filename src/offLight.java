public class offLight implements Command{
    private Home theHome;
    public offLight(Home home){this.theHome=home;}

    @Override
    public void execute() {theHome.offLight();}
}

