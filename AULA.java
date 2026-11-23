public class AULA  {   

public static void main(String[] args) {

double coxaoDuro = 10.0; 
double coxaoMole = 15.0;
double alcatra = 20.0;
double picanha = 25.0;
double patinho = 30.0;
double fraldinha = 40.0;
double contraFile = 45.0;
double cupim = 50.0;
double costela = 55.0;
double maminha = 60.0;
double largato = 65.0;
double fileMignom = 70.0;
double capaDoContraFile = 75.0;
double musculoTraseiro = 80.0;

double pessoa1 ;
double pessoa2;
double pessoa3;

pessoa1 = (coxaoDuro * 5) + (picanha * 4) + (fraldinha * 7);

pessoa2 = (alcatra * 3) + (patinho * 2) + (contraFile * 6);

pessoa3 = (coxaoMole * 8) + (cupim * 5) + (costela * 3) + (maminha * 2) + (largato * 4) + (fileMignom * 1) + (capaDoContraFile * 2) + (musculoTraseiro * 3);

System.out.println ( "pessoa1comprou " + pessoa1 +" reais em carnes"  ) ;
System.out.println ( "pessoa2comprou " + pessoa2 +" reais em carnes"  ) ;
System.out.println ( "pessoa3comprou " + pessoa3 +" reais em carnes"  ) ;

double total = pessoa1 + pessoa2 + pessoa3;
System.out.println ( " o total gasto em carnes foi de " + total + " reais ");

double acem = 30.99;
double mioloDoAcem = 45.99;
double paleta = 44.99;
double peixinho = 39.99; 
double pontaDePeito = 39.99;
double alcatrinha = 49.99; 
double musculoDianteiro = 29.99; 
double chambari =29.99;
double acemComOsso = 28.99;


double pessoa4;
double pessoa5;
double pessoa6;

pessoa4 = (acem * 8) + (mioloDoAcem * 7) + (acemComOsso * 2);
pessoa5 = (paleta * 9) + (peixinho * 3) + (pontaDePeito * 2);
pessoa6 = ( chambari * 6) + ( musculoDianteiro * 4) + ( alcatrinha * 8);

System.out.println (" pesssoa 4 comprou " + pessoa4 + " reais em carnes ");
System.out.println (" pessoa 5 comprou " + pessoa5 + " reais em carnes");
System.out.println (" pessoa 6 comprou " + pessoa6 + " reais em carnes");

double total2 = pessoa4 + pessoa5 + pessoa6;
System.out.println ( " o total gasto em carnes foi de " + total2 + " reais ");





}
}