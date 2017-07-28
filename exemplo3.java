class Main {
  public static void main(String[] args) {
    CasaUmQuarto c1 = new CasaUmQuarto();
    CasaDoisQuartos c2 = new CasaDoisQuartos();
    System.out.println("c1 tem "+c1.getMetrosQuadrados()+" m quadrados");
    System.out.println("c2 tem "+c2.getMetrosQuadrados()+" m quadrados");
  }
}

class CasaDoisQuartos{
  private Quarto quarto1;
  private Quarto quarto2;
  private Banheiro banheiro;
  private Sala sala;
  private Cozinha cozinha;

  public CasaDoisQuartos(){
    this.quarto1 = new Quarto(5,4);
    this.quarto2 = new Quarto(5,5);
    this.banheiro = new Banheiro(2,1);
    this.sala = new Sala(6,6);
    this.cozinha = new Cozinha(3,4);
  }
  
  public double getMetrosQuadrados(){
    return 
      this.quarto1.getMetrosQuadrados()+
      this.quarto2.getMetrosQuadrados()+
      this.banheiro.getMetrosQuadrados()+
      this.sala.getMetrosQuadrados()+
      this.cozinha.getMetrosQuadrados();
  }
}
class CasaUmQuarto{
  private Quarto quarto;
  private Banheiro banheiro;
  private Sala sala;
  private Cozinha cozinha;

  public CasaUmQuarto(){
    this.quarto = new Quarto(5,4);
    this.banheiro = new Banheiro(2,1);
    this.sala = new Sala(6,6);
    this.cozinha = new Cozinha(3,4);
  }
  
  public double getMetrosQuadrados(){
    return
      this.quarto.getMetrosQuadrados()+
      this.banheiro.getMetrosQuadrados()+
      this.sala.getMetrosQuadrados()+
      this.cozinha.getMetrosQuadrados();
  }
}

class Quarto{
  private double largura;
  private double profundidade;
  public  Quarto(double p, double l){
    this.profundidade = p;
    this.largura = l;
  }
  public double getLargura(){
    return this.largura;
  }

  public double getProfudidade(){
    return this.profundidade;
  }

  public double getMetrosQuadrados(){
    return this.profundidade*this.largura;
  }
  public String getNome(){
    return "Quarto";
  }
}

class Cozinha{
  private double largura;
  private double profundidade;
  public  Cozinha(double p, double l){
    this.profundidade = p;
    this.largura = l;
  }
  public double getLargura(){
    return this.largura;
  }

  public double getProfudidade(){
    return this.profundidade;
  }

  public double getMetrosQuadrados(){
    return this.profundidade*this.largura;
  }
    public String getNome(){
    return "Cozinha";
  }
}

class Sala{
  private double largura;
  private double profundidade;
  
  public  Sala(double p, double l){
    this.profundidade = p;
    this.largura = l;
  }
  public double getLargura(){
    return this.largura;
  }

  public double getProfudidade(){
    return this.profundidade;
  }

  public double getMetrosQuadrados(){
    return this.profundidade*this.largura;
  }
}

class Banheiro{
  private double largura;
  private double profundidade;
  public  Banheiro(double p, double l){
    this.profundidade = p;
    this.largura = l;
  }
  public double getLargura(){
    return this.largura;
  }

  public double getProfudidade(){
    return this.profundidade;
  }

  public double getMetrosQuadrados(){
    return this.profundidade*this.largura;
  }
    public String getNome(){
    return "Banheiro";
  }
}