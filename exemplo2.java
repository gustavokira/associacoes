import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
   Botao b = new Botao();
    
    Lampada l1 = new Lampada("lxqwe1");
    Lampada l2 = new Lampada("lfff2");
    Lampada l3 = new Lampada("lxsdf3");
    
    b.addLampada(l1);
    l1.setBotao(b);
    
    b.addLampada(l2);
    l2.setBotao(b);
    
    b.addLampada(l3);
    l3.setBotao(b);
    
    if( l1.estaAcesa() ){
      System.out.println(l1.getId()+" esta acesa!");
    }else{
      System.out.println(l1.getId()+" esta apagada!");
    }
    
    if( l2.estaAcesa() ){
      System.out.println(l2.getId()+" esta acesa!");
    }else{
      System.out.println(l2.getId()+" esta apagada!");
    }
    
        if( l3.estaAcesa() ){
      System.out.println(l3.getId()+" esta acesa!");
    }else{
      System.out.println(l3.getId()+" esta apagada!");
    }
  }
}

class Botao{
  private boolean apertado;
  private ArrayList<Lampada> lampadas;
  
  public Botao(){
    this.apertado = false;
    this.lampadas = new ArrayList<Lampada>();
  }
  
  public void addLampada(Lampada l){
    this.lampadas.add(l);
  }
  public ArrayList<Lampada> getLampadas(){
    return this.lampadas;
  }
  
  public void apertar(){
    if(this.apertado == false){
      this.apertado = true;
      for(int i = 0;i<this.lampadas.size();i++){
        Lampada l = this.lampadas.get(i);
        l.acender();
      }
      
    }else{
      this.apertado = false;
      for(int i = 0;i<this.lampadas.size();i++){
        Lampada l = this.lampadas.get(i);
        l.apagar();
      }
    }
  }
  
  public boolean estaApertado(){
    return this.apertado;
  }
}

class Lampada{
  private boolean acesa;
  private Botao botao;
  private String id;
  
  public Lampada(String id){
    this.acesa = false;
    this.id = id;
  }
  
  public String getId(){
    return this.id;
  }
  
  public void setBotao(Botao b){
      this.botao = b;
  }
  
  public Botao getBotao(){
    return this.botao;
  }
  
  public void acender(){
    this.acesa = true;
  }
  
  public void apagar(){
    this.acesa = false;
  }
  
  public boolean estaAcesa(){
    return this.acesa;
  }
}