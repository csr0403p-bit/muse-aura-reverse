package X;

import java.util.List;

/* renamed from: X.ArC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1793ArC {
    public static final AqW A00(C1Z3 c1z3) {
        C1794ArD c1794ArD = new C1794ArD();
        AbstractC1235AfP.A01(c1z3, C1797ArG.A00, BTA.A01(new BUP(c1794ArD, 3), C2294BSu.A00(c1794ArD, 21), 49));
        C0912AHo c0912AHoA00 = C0912AHo.A00();
        C0912AHo<C7dn> c0912AHo = c1794ArD.A00;
        Object[] objArr = c0912AHo.A01;
        int i = ((AbstractC0913AHp) c0912AHo).A00;
        Object obj = null;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            if (!z || obj2 != C7dm.A00) {
                C7dm c7dm = C7dm.A00;
                if (obj2 != c7dm || obj != c7dm) {
                    if (obj2 != c7dm) {
                        C0912AHo<G0U<C7dn, Boolean>> c0912AHo2 = c1794ArD.A01;
                        Object[] objArr2 = c0912AHo2.A01;
                        int i3 = ((AbstractC0913AHp) c0912AHo2).A00;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (!AnonymousClass003.A1X(obj2, (G0U) objArr2[i4])) {
                                break;
                            }
                        }
                        c0912AHoA00.A09(obj2);
                        obj = obj2;
                    } else {
                        c0912AHoA00.A09(obj2);
                        obj = obj2;
                    }
                }
                z = false;
            }
        }
        int i5 = ((AbstractC0913AHp) c0912AHoA00).A00;
        if ((i5 != 0 ? c0912AHoA00.A01[i5 - 1] : null) == C7dm.A00) {
            c0912AHoA00.A05(i5 - 1);
        }
        List list = c0912AHoA00.A00;
        List list2 = list;
        if (list == null) {
            C0911AHn<E> c0911AHn = new C0911AHn(c0912AHoA00);
            c0912AHoA00.A00 = c0911AHn;
            list2 = c0911AHn;
        }
        return new AqW(list2);
    }
}
