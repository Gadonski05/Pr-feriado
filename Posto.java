public class Posto{

    private String Combustivel;
    private double ValL;
    private double QtdCom;

    public Posto(String Combustivel, double ValL, double QtdCom){

        this.Combustivel = Combustivel;
        this.ValL = ValL;
        this.QtdCom = QtdCom;

    }

    public void Abastece(double Val){
        double LitrosAb = Val / ValL;
        if (LitrosAb <= QtdCom) {
            System.out.println("Você abasteceu: " + LitrosAb + "Litros de: " + Combustivel);
            QtdCom -= LitrosAb;
            
        } else {
            System.out.println("Nãi é possivel abastecer !!");
        }
    }

    public void AbasteceLit(double Litros){
        double ValPag = Litros * ValL;

        if (Litros <= QtdCom) {
            System.out.println("Valor: R$" + ValPag);
            QtdCom -= Litros;
            
        } else {
            System.out.println("Não é possivel abastecer !!");
        }
    }

    public void Trocaval(double NVal){
        this.ValL = NVal;
        
    }

    public void TrocaCom(String NCom){
        this.Combustivel = NCom;
        
    }

    public void TrocaQtd(double NQtd){
        this.QtdCom = NQtd;
        
    }

    public void MostraInf(){
        System.out.println("Quantidade de combustível: " + QtdCom + "L");

    }
}