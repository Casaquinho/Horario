
public class Main
{
    public static void main (String[] args)
    {
        try
        {                             // hora    minuto   segundo
            Horario agora = new Horario((byte)8,(byte)23,(byte)30);
            System.out.println (agora.getHora());
            System.out.println (agora.getMinuto());
            System.out.println (agora.getSegundo());
            agora.avance((short)30/*segundos*/);
            System.out.println (agora.getHora());
            System.out.println (agora.getMinuto());
            System.out.println (agora.getSegundo());
            agora.retroceda((short)30/*segundos*/);
            System.out.println (agora.getHora());
            System.out.println (agora.getMinuto());
            System.out.println (agora.getSegundo());
        }
        catch (Exception erro)
        {
            System.err.println (erro.getMessage());
        }
    }
}