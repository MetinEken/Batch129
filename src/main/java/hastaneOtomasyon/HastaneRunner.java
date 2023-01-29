package hastaneOtomasyon;

import hastaneOtomasyon.saglikBakanligiVeriSistemi.VatandasBilgiSistemi;

import static hastaneOtomasyon.hastaneVeriSistemi.HastaneVeriBankasi.addDoktor;

public class HastaneRunner {
    public static void main(String[] args) {
        addDoktor();
        VatandasBilgiSistemi.ekle();
        HastaneMenu.hastaneMenu();
    }
}
