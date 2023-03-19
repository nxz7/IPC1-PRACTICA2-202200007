
package circulo;


public class Datos {

    
    private int inventarioT;
    private int inventarioP;
    private int empaquetadoT;
    private int empaquetadoP;
    private int produccionT;
    private int produccionP;
    private int salidaP;
    private int salidaT;

    
    
    private int costoInv;
    private int costoEmp;
    private int costoProd;
    private int costoSalida;
    private int costoTotal;
    
    public Datos(){
        inventarioT = 0;
        inventarioP = 0;
        empaquetadoT =0;
        empaquetadoP =0;
        produccionT = 0;
        produccionP=0;
        salidaP=0;
        salidaT=0;
        
        costoInv=0;
        costoEmp=0;
        costoProd=0;
        costoSalida=0;
        costoTotal=0;
        
        

    }
    
    
    public int getCostoInv() {
        return costoInv;
    }

    public void setCostoInv(int costoInv) {
        this.costoInv = costoInv;
    }

    public int getCostoEmp() {
        return costoEmp;
    }

    public void setCostoEmp(int costoEmp) {
        this.costoEmp = costoEmp;
    }

    public int getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(int costoProd) {
        this.costoProd = costoProd;
    }

    public int getCostoSalida() {
        return costoSalida;
    }

    public void setCostoSalida(int costoSalida) {
        this.costoSalida = costoSalida;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public int getInventarioT() {
        return inventarioT;
    }

    public void setInventarioT(int inventarioT) {
        this.inventarioT = inventarioT;
    }

    public int getInventarioP() {
        return inventarioP;
    }

    public void setInventarioP(int inventarioP) {
        this.inventarioP = inventarioP;
    }

    public int getEmpaquetadoT() {
        return empaquetadoT;
    }

    public void setEmpaquetadoT(int empaquetadoT) {
        this.empaquetadoT = empaquetadoT;
    }

    public int getEmpaquetadoP() {
        return empaquetadoP;
    }

    public void setEmpaquetadoP(int empaquetadoP) {
        this.empaquetadoP = empaquetadoP;
    }

    public int getProduccionT() {
        return produccionT;
    }

    public void setProduccionT(int produccionT) {
        this.produccionT = produccionT;
    }

    public int getProduccionP() {
        return produccionP;
    }

    public void setProduccionP(int produccionP) {
        this.produccionP = produccionP;
    }

    public int getSalidaP() {
        return salidaP;
    }

    public void setSalidaP(int salidaP) {
        this.salidaP = salidaP;
    }

    public int getSalidaT() {
        return salidaT;
    }

    public void setSalidaT(int salidaT) {
        this.salidaT = salidaT;
    }
    
}
