/*the Invoker class*/

public class Switch {

    private Command onLight;
    private Command offLight;
    private Command openDoor;
    private Command closeDoor;



    public Switch(Command open, Command close, Command on,Command off){
        this.openDoor = open;
        this.closeDoor = close;
        this.onLight = on;
        this.offLight = off;
    }


    public void on(){onLight.execute();}
   public void off(){offLight.execute();}
    public void open(){openDoor.execute();}
    public void close(){closeDoor.execute();}

}