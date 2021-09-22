package banco;
public class Cuenta {
    private String nombre;
    private float saldo;
    private int pin;
    
    public Cuenta(String nombre, float saldo, int pin){
        setNombre(nombre);
        setSaldo(saldo);
        setPin(pin);
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public void setPin(int pin){
        this.pin=pin;
    }    
    public String getNombre(){
        return nombre;
    }
    public float getSaldo(){
        return saldo;
    }
    public int getPin(){
        return pin;
    }    
    public void retirar(float retirado)
    {
        if(saldo>=retirado)
            saldo-=retirado;
        else
            System.out.println("Saldo insuficiente, accion imposible");
    }
    public void depositar(float depositado)
    {
        saldo+=depositado;
    }
}
 