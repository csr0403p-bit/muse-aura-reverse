package X;

import com.facebook.aura.network.crudonet.AuraCrudoNet$requestFactory$2;
import java.util.List;

/* renamed from: X.Ck4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4021Ck4 {
    public final AuraCrudoNet$requestFactory$2.AnonymousClass1 A00;
    public final C4033CkZ A01;
    public final C4033CkZ A02;
    public final C4027CkG A03;
    public final CGu A04;

    public C4021Ck4(AuraCrudoNet$requestFactory$2.AnonymousClass1 anonymousClass1, C4026CkF c4026CkF, C4027CkG c4027CkG, CGu cGu) {
        this.A03 = c4027CkG;
        List<InterfaceC4037Ckd> list = c4026CkF.A00;
        int iA00 = C60O.A00(list);
        C4033CkZ c4033CkZ = null;
        while (iA00 >= 0) {
            C4033CkZ c4033CkZ2 = new C4033CkZ(c4033CkZ, list.get(iA00));
            iA00--;
            c4033CkZ = c4033CkZ2;
        }
        this.A02 = c4033CkZ;
        if (anonymousClass1 != null) {
            list.add(new C4029CkK(anonymousClass1));
        }
        int iA002 = C60O.A00(list);
        C4033CkZ c4033CkZ3 = null;
        while (iA002 >= 0) {
            C4033CkZ c4033CkZ4 = new C4033CkZ(c4033CkZ3, list.get(iA002));
            iA002--;
            c4033CkZ3 = c4033CkZ4;
        }
        this.A01 = c4033CkZ3;
        this.A00 = anonymousClass1;
        this.A04 = cGu;
    }

    public C4021Ck4(AuraCrudoNet$requestFactory$2.AnonymousClass1 anonymousClass1, C4026CkF c4026CkF, C4027CkG c4027CkG) {
        this.A03 = c4027CkG;
        List<InterfaceC4037Ckd> list = c4026CkF.A00;
        int iA00 = C60O.A00(list);
        C4033CkZ c4033CkZ = null;
        while (iA00 >= 0) {
            C4033CkZ c4033CkZ2 = new C4033CkZ(c4033CkZ, list.get(iA00));
            iA00--;
            c4033CkZ = c4033CkZ2;
        }
        this.A02 = c4033CkZ;
        if (anonymousClass1 != null) {
            list.add(new C4029CkK(anonymousClass1));
        }
        int iA002 = C60O.A00(list);
        C4033CkZ c4033CkZ3 = null;
        while (iA002 >= 0) {
            C4033CkZ c4033CkZ4 = new C4033CkZ(c4033CkZ3, list.get(iA002));
            iA002--;
            c4033CkZ3 = c4033CkZ4;
        }
        this.A01 = c4033CkZ3;
        this.A00 = anonymousClass1;
        this.A04 = null;
    }
}
