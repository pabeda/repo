import java.util.Random.*;

public class Main {

    private String Ad;
    private String Yazar;
    private String Yayin;
    private String Durum;
    private String Tip;

  public Main ()
  {

  }
    public Main (String Adı,String Yazar,String Yayin,String Durum,String Tip){

     this.Ad=Adı;
     this.Yazar=Yazar;
     this.Yayin=Yayin;
     this.Durum=Durum;
     this.Tip=Tip;

    }

    public String getAdı(){

            return Ad;

        }

    public void setAdı(String Adı) {

            this.Ad=Adı;
        }

    public String getDurum(){

        return Durum;

    }

    public void setDurum(String Durum){
        this.Durum=Durum;

    }
    public String getTip() {
        return Tip;
    }

    public void setÇeşit(String Çeşit){
        this.Tip=Tip;


        }
    public String getYayin(){

        return Yayin;
    }

    public void setYayin(String yayin){

        this.Yayin=yayin;
    }

    public String getYazar(){

        return Yazar;
    }

    public void setYazar(String Yazar){

        this.Yazar=Yazar;
    }

    }


