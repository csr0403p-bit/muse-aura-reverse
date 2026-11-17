package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class ELK implements ELR {
    public final ELR A00;
    public final Object A01 = C3cG.A0T();

    @Override // X.ELR
    public final EMx AaX(C6630ELa c6630ELa) {
        EMx eMxAaX;
        C7384Etj.A0Y(c6630ELa, 0);
        synchronized (this.A01) {
            eMxAaX = this.A00.AaX(c6630ELa);
        }
        return eMxAaX;
    }

    @Override // X.ELR
    public final List<EMx> AaY(String str) {
        List<EMx> listAaY;
        C7384Etj.A0Y(str, 0);
        synchronized (this.A01) {
            listAaY = this.A00.AaY(str);
        }
        return listAaY;
    }

    @Override // X.ELR
    public final EMx AhB(C6630ELa c6630ELa) {
        EMx eMxAhB;
        C7384Etj.A0Y(c6630ELa, 0);
        synchronized (this.A01) {
            eMxAhB = this.A00.AhB(c6630ELa);
        }
        return eMxAhB;
    }

    @Override // X.ELR
    public final boolean A73(C6630ELa c6630ELa) {
        boolean zA73;
        synchronized (this.A01) {
            zA73 = this.A00.A73(c6630ELa);
        }
        return zA73;
    }

    public ELK(ELR elr) {
        this.A00 = elr;
    }
}
