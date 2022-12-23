package OngkosKirim;

public class OngkosKirim extends DimensiBarang {

    public double VolumeBarang()
    {return this.p * this.l * this.t;}

    public double BeratBarang()
    {return Math.ceil(this.VolumeBarang() / 50);}

    public int HargaBarang()
    {return (int) this.BeratBarang() * 5000;}
}

