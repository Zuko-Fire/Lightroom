public class onLight implements Command{
    private Home theHome;
    public onLight(Home home){this.theHome=home;}

    @Override
    public void execute() {theHome.onLight();}
}
