using System;

namespace Basico;
class Diferenca
{
    static void Main(string[] args)
    {
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());
        int C = int.Parse(Console.ReadLine());
        int D = int.Parse(Console.ReadLine());
        int DIF = (A * B - C * D);
        Console.WriteLine($"DIFERENCA = " + DIF);
        Console.ReadKey();
    }
}
