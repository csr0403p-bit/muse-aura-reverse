package X;

import com.facebook.aura.network.crudonet.AuraCrudoNet$requestFactory$2;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class Ck3 {
    public final C4021Ck4 A00;
    public final C4021Ck4 A01;
    public final InterfaceC4039Ckg A02;
    public final C9g A03;
    public final C3339CFj A04;
    public final List<InterfaceC4037Ckd> A05;

    public final C4018Cjz A00(String str) {
        C3339CFj c3339CFj = this.A04;
        C4021Ck4 c4021Ck4 = this.A00;
        C4027CkG c4027CkG = c4021Ck4.A03;
        CYD cyd = new CYD();
        cyd.A03 = str;
        C4028CkJ c4028CkJ = new C4028CkJ(cyd);
        c4028CkJ.A03 = str;
        c4028CkJ.A02 = c4021Ck4.A04;
        c4028CkJ.A01 = c4021Ck4.A01;
        return new C4018Cjz(new C4030CkL(c4028CkJ, c4027CkG, c4021Ck4), this.A03, c3339CFj);
    }

    public Ck3(C4021Ck4 c4021Ck4, InterfaceC4039Ckg interfaceC4039Ckg, C9g c9g) {
        this.A01 = c4021Ck4;
        List<InterfaceC4037Ckd> list = Collections.EMPTY_LIST;
        this.A05 = list;
        C4027CkG c4027CkG = c4021Ck4.A03;
        C4026CkF c4026CkF = new C4026CkF(c4021Ck4.A02);
        AuraCrudoNet$requestFactory$2.AnonymousClass1 anonymousClass1 = c4021Ck4.A00;
        CGu cGu = c4021Ck4.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c4026CkF.A00.add(this.A05.get(i));
        }
        this.A02 = interfaceC4039Ckg;
        if (interfaceC4039Ckg != null) {
            c4026CkF.A00.add(new C4024CkD(interfaceC4039Ckg));
        }
        this.A03 = c9g;
        CGu cEy = new CEy();
        this.A00 = new C4021Ck4(anonymousClass1, c4026CkF, c4027CkG, cGu != null ? new CGv(new CGu[]{cEy, cGu}) : cEy);
        this.A04 = new C3339CFj();
    }
}
