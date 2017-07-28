class Main {
  public static void main(String[] args) {
   Botao b = new Botao();
    
    Lampada l = new Lampada("lxqwe1");
    
    b.setLampada(l);
    l.setBotao(b);
    
    if( l.estaAcesa() ){
      System.out.println(l.getId()+" esta acesa!");
    }else{
      System.out.println(l.getId()+" esta apagada!");
    }
  }
}

class Botao{
  private boolean apertado;
  private Lampada lampada;
  
  public Botao(){
    this.apertado = false;
  }
  
  public void setLampada(Lampada l){
    this.lampada = l;
  }
  public Lampada getLampada(){
    return this.lampada;
  }
  
  public void apertar(){
    if(this.apertado == false){
      this.apertado = true;
      
      if(this.lampada != null){
        this.lampada.acender();
      }
      
    }else{
      this.apertado = false;
      if(this.lampada != null){
        this.lampada.apagar();
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