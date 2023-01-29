package hastaneOtomasyon.saglikBakanligiVeriSistemi;

import hastaneOtomasyon.model.ParentClass;

import java.util.HashMap;

public class VatandasBilgiSistemi extends ParentClass {



    public VatandasBilgiSistemi() {
    }

    public VatandasBilgiSistemi(String name, String lastNAme, int yas, String kimlikNo) {
        super(name, lastNAme, yas, kimlikNo);
    }

    @Override
    public String toString() {
        return "VatandasBilgiSistemi "+"isim = "+getName()+" Soyisim = " +"yas = "+ getYas()+" TCNO = "+getKimlikNo();
    }
    // buraya vatandaslari HAsMAp ile kaydedebiliriz, key = tcNo

    static HashMap<String, VatandasBilgiSistemi> vatandas = new HashMap<>();


    public static void ekle(){
        VatandasBilgiSistemi vt1=new VatandasBilgiSistemi("METIN","sdsfs",34,"11111111");
        VatandasBilgiSistemi vt2=new VatandasBilgiSistemi("ALI","sdsfs",34,"22222222");
        VatandasBilgiSistemi vt3=new VatandasBilgiSistemi("AYSE","sdsfs",34,"33333333");
        VatandasBilgiSistemi vt4=new VatandasBilgiSistemi("FATMA","sdsfs",34,"44444444");
        VatandasBilgiSistemi vt5=new VatandasBilgiSistemi("hdjsfd","sdsfs",34,"55555555");
        VatandasBilgiSistemi vt6=new VatandasBilgiSistemi("hdjsfd","sdsfs",34,"66666666");
        VatandasBilgiSistemi vt7=new VatandasBilgiSistemi("hdjsfd","sdsfs",34,"77777777");
        VatandasBilgiSistemi vt8=new VatandasBilgiSistemi("hdjsfd","sdsfs",34,"88888888");
        VatandasBilgiSistemi vt9=new VatandasBilgiSistemi("hdjsfd","sdsfs",34,"99999999");
        VatandasBilgiSistemi vt10=new VatandasBilgiSistemi("hdjsfd","sdsfs",34,"00000000");

        vatandas.put(vt1.getKimlikNo(), vt1);
        vatandas.put(vt5.getKimlikNo(), vt5);
        vatandas.put(vt2.getKimlikNo(), vt2);
        vatandas.put(vt3.getKimlikNo(), vt3);
        vatandas.put(vt4.getKimlikNo(), vt4);
        vatandas.put(vt6.getKimlikNo(), vt6);
        vatandas.put(vt7.getKimlikNo(), vt7);
        vatandas.put(vt8.getKimlikNo(), vt8);
        vatandas.put(vt9.getKimlikNo(), vt9);
        vatandas.put(vt10.getKimlikNo(), vt10);

    }

    public VatandasBilgiSistemi getVatandas(String kimlikNo){
        try{
        VatandasBilgiSistemi vatandas2 = vatandas.get(kimlikNo);
            return vatandas2;
        }catch (Exception e){
            return null;
        }

    }
}
