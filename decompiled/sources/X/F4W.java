package X;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public final class F4W implements CEF {
    public final int $t;
    public final Object A00;

    public F4W(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.CEF
    public final void onComplete(CSA<List<CJN>> csa) {
        String strA00;
        Object objA0s;
        HtJ htJ;
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(csa, 0);
                if (csa.A0C()) {
                    List<CJN> listA08 = csa.A08();
                    if (listA08 == null) {
                        throw BV4.A0U();
                    }
                    strA00 = FGI.A08(listA08.size(), " states");
                } else {
                    strA00 = CF9.A00(csa);
                }
                ((CF9) this.A00).A02("getSessionStates completed: %s ", strA00);
                return;
            case 1:
                ((CountDownLatch) this.A00).countDown();
                return;
            case 2:
                C7384Etj.A0Y(csa, 0);
                if (csa.A0C()) {
                    List<CJN> listA082 = csa.A08();
                    C7384Etj.A0U(listA082);
                    List<CJN> list = listA082;
                    C3313CDn c3313CDn = (C3313CDn) this.A00;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C3313CDn.A03(c3313CDn, list.get(i), false);
                    }
                }
                C3313CDn c3313CDn2 = (C3313CDn) this.A00;
                synchronized (c3313CDn2) {
                    c3313CDn2.A05 = true;
                    c3313CDn2.A00 = false;
                    c3313CDn2.A03 = false;
                }
                C3313CDn.A02(c3313CDn2);
                return;
            default:
                Exception excA07 = csa.A07();
                if (excA07 == null) {
                    boolean z = ((CSC) csa).A05;
                    Hm1 hm1 = (Hm1) this.A00;
                    if (z) {
                        hm1.A5x(null);
                        return;
                    } else {
                        objA0s = csa.A08();
                        htJ = hm1;
                    }
                } else {
                    HtJ htJ2 = (HtJ) this.A00;
                    objA0s = C3cG.A0s(excA07);
                    htJ = htJ2;
                }
                htJ.resumeWith(objA0s);
                return;
        }
    }
}
