
package CarDealerMgt;


public class Car_Accessory {
    private double iStereo = 103.49;
    private double Modified = 500.78;
    private double Customized = 2000.49;
    private double Leather = 1003.90;
    private double GPS = 180.29;

    public double getiStereo() {
        return iStereo;
    }

    public void setiStereo(double iStereo) {
        this.iStereo = iStereo;
    }

    public double getModified() {
        return Modified;
    }

    public void setModified(double Modified) {
        this.Modified = Modified;
    }

    public double getCustomized() {
        return Customized;
    }

    public void setCustomized(double Customized) {
        this.Customized = Customized;
    }

    public double getLeather() {
        return Leather;
    }

    public void setLeather(double Leather) {
        this.Leather = Leather;
    }

    public double getGPS() {
        return GPS;
    }

    public void setGPS(double GPS) {
        this.GPS = GPS;
    }
    public double accessoryCost;
    public double getAmount(){
        accessoryCost = iStereo + Modified + Customized + Leather + GPS;
        return accessoryCost;
    }
}
