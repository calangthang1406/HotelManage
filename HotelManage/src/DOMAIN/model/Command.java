package DOMAIN.model;

import PRESENTATION.view.frmDKPhong;

public abstract class Command {

    protected frmDKPhong LoaiPhongRemote;
//THUC THI 
    public abstract void execute();

    public void setLoaiPhongRemote(frmDKPhong LoaiPhongRemote) {
        this.LoaiPhongRemote = LoaiPhongRemote;
    }

    public Command(){}

    public Command(frmDKPhong LoaiPhongRemote) {
        this.LoaiPhongRemote = LoaiPhongRemote;
    }
    
}

