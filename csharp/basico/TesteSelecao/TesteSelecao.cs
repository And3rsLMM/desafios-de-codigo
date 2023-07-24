using System; 

namespace Basico;
class TesteSelecao {

    static void Main(string[] args) { 

        string [] selections = Console.ReadLine().Split(' ');
        int A = int.Parse(selections[0]);
        int B = int.Parse(selections[1]);
        int C = int.Parse(selections[2]);
        int D = int.Parse(selections[3]);

        // Implemente a condição abaixo para ter o resultado esperado
        if (B>C && D>A && C+D > A+B && C>0 && D>0 && (A % 2 == 0 ))
		{
          Console.WriteLine("Valores aceitos");
        } else 
        {
          Console.WriteLine("Valores nao aceitos");
        }
    }

}