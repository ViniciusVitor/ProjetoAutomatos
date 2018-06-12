/*
{WW contem a cadeia aba ou um númerpo par de a's}
 */
package projetoautomato;

import java.util.Scanner;

/**
 *
 * @author Vinícius
 */
public class Automato {

    char cadeia[];
    int contador;

    public static void main(String[] args) {
        Automato auto = new Automato();
        String subCadeia;
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque sua cadeia: ");
        subCadeia = input.nextLine();
        auto.cadeia = subCadeia.toCharArray();
        auto.Inicio();

    }

    public void Inicio() {
        contador = 0;
        q0();
    }

    public void q0() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q5();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q0();
            } else {
                qErro();
            }
        } else {
           End();
        }
    }

    public void q1() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q5();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q2();
            } else {
               qErro();
            }
        }  else {
            End();
        }

    }

    public void q2() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q7();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q0();
            } else {
                qErro();
            }
        }  else {
            End();
        }
    }

    public void q3() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q7();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q3();
            } else {
                qErro();
            }
        }  else {
            End();
        }

    }

    public void q4() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q1();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q4();
            } else {
                qErro();
            }
        } else {
            qErro();
        }

    }

    public void q5() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q1();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q6();
            } else{
                qErro();
            }
        } else {
            qErro();
        }

    }

    public void q6() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q3();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q4();
            } else{
                qErro();
            }
        } else {
            qErro();
        }

    }

    public void q7() {
        if (contador < cadeia.length) {
            if (cadeia[contador] == 'a') {
                contador++;
                q4();
            } else if (cadeia[contador] == 'b') {
                contador++;
                q7();
            } else{
                qErro();
            }
        } else {
            End();
        }

    }

    public void End() {
        System.out.println("Cadeia aceita!");

    }

    public void qErro() {
        System.out.println("Cadeia NÃO aceita!");

    }
   

}
