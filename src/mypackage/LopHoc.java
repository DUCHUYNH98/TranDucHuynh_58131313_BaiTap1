/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;

/**
 *
 * @author FPT_2-4
 */
public class LopHoc{
    private IQLDS iqlds;
    public void setIQLDS(IQLDS iqlds) {
        this.iqlds = iqlds;
    }
    
    public LopHoc() {
    }
    ArrayList<HocSinh> s = new ArrayList<>();
    ArrayList<GiaoVien> t = new ArrayList<>();

    public int themHS(HocSinh hs){ 
        s.add(hs);
        return iqlds.them(hs);
    }
    
    public int themGVGD(GiaoVien gv){
        t.add(gv);
        return iqlds.them(gv);
    }
    public void inDSHS(ArrayList<CaNhan> hs){
        
            iqlds.inDS(hs);
       
    }
    public void inDSGVGD(ArrayList<CaNhan> gv){
           iqlds.inDS(gv);
      
    }

}
