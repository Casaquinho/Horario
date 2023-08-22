
public class Horario
{
    private byte segundo;
    private byte minuto;
    private byte hora;

    // implementar getters e setters
    public byte getSegundo()
    {
        return this.segundo;
    }
    public byte getMinuto()
    {
        return this.minuto;
    }
    public byte getHora()
    {
        return this.hora;
    }
    //void (nao retorna true ou false)
    // para colocar o valor (segundo por exemplo) da main nessa class
    public void setSegundo(byte segundo)
    {
        this.segundo = segundo;
    }

    public void setMinuto(byte minuto)
    {
        this.minuto = minuto;
    }

    public void setHora(byte hora)
    {
        this.hora = hora;
    }


    // construtor com msm nome da classe
                            //   hora       minuto       segundo  (msm ordem no main e no construtor)
    public /*void*/ Horario (byte hora, byte minuto, byte segundo) throws Exception
    {
        //tem de settar dnv no construtor
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
        if (this.segundo < 0 || this.segundo > 60)
        {
            //o main n usa bool, ent se cria uma excessao
            throw new Exception("Segundo invalido");
        }
        if (this.minuto < 0 || this.minuto > 60)
        {
            //o main n usa bool, ent se cria uma excessao
            throw new Exception("Minuto invalido");
        }
        if (this.hora < 0 || this.hora > 24)
        {
            //o main n usa bool, ent se cria uma excessao
            throw new Exception("ano invalido");
        }

    }

    public void avance (short qtdSegundos) throws Exception
    {
        this.segundo += qtdSegundos;
        if(this.segundo >= 60) {
            this.minuto+= this.segundo / 60;
            this.segundo = 0;
        }
        if (this.minuto == 60 )
        {
            this.hora++;
            this.minuto = 0;
        }
    }

    public void retroceda (short qtdSegundos) throws Exception
    {
        this.segundo -= qtdSegundos;
        if(this.segundo < 0)

            this.minuto -= this.segundo / 60;
            this.segundo = 0;
            
        if (this.minuto < 0)
        {
            this.hora--;
            this.minuto = 59;
        }
    }
}