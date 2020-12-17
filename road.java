import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

public class Road extends JPanel {
    Color white = new Color (244,164,96); // Color white
    int roads=0;
    String name="";
    int laneHeight=300;
    ArrayList<Vehicle> v=new ArrayList<Vehicle>();
    ArrayList<trafficLight> s=new ArrayList<trafficLight>();
    public Road(String n, int roads) {
        setBackground(white);
        setForeground(white);
        setBounds(187, 0, 855, 590);
        setLayout(null);
        setVisible(true);
        this.name=n;
        this.roads=roads;
    }
    public void addVehicle(Vehicle vehicle) {
        v.add(vehicle);
    }
    public void addSignal(trafficLight trafficLight) {
        s.add(trafficLight);

    }

    // Give the color for the road in new city
    public void paint(Graphics g) {

        super.paintComponent(g);

        if(roads<=2) {

            g.setColor(Color.GRAY);
            g.fillRect(0, 100, 870, 50);

            g.setColor(Color.WHITE);
            for(int a=laneHeight;a<laneHeight*4;a=a+laneHeight) {
                for(int b=0;b<getWidth();b+=40) {
                    g.fillRect(b, 120, 30, 5);
                }
            }
        }