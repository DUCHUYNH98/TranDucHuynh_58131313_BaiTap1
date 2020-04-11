/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranduchuynh_58131313_59th3;

import java.util.ArrayList;
import mypackage.CaNhan;
import mypackage.GiaoVien;
import mypackage.HocSinh;
import mypackage.LopHoc;
import mypackage.QLDS;

/**
 *
 * @author FPT_2-4
 */
public class TranDucHuynh_58131313_59TH3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<CaNhan> p = new  ArrayList<>();
        ArrayList<HocSinh> s = new ArrayList<>();
        
        HocSinh hs = new HocSinh("TH2", "Hat", "Tran", "Huynh",22, "Nha Trang");
        GiaoVien gv = new GiaoVien("PHP", "CNPM", "Tran", "Hang", 30, "Nha Trang");
        LopHoc lh = new LopHoc();
        lh.setIQLDS(new QLDS());
        System.out.println(lh.themHS(hs));
        lh.inDSHS(p);
        System.out.println("----------------------------------");
        lh.themGVGD(gv);
       //System.out.println(lh.inDSGVGD());
//        System.out.println(hs.HienThiTT());
//        System.out.println(gv.HienThiTT());
    }
    
}
