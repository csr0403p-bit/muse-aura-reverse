package X;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class B1V {
    public static final B1U A00(BFM bfm, Object obj, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new B1U(obj, i, true);
            bfm.Ai0(objAaT);
        }
        B1U b1u = (B1U) objAaT;
        if (!C7384Etj.areEqual(b1u.A01, obj)) {
            boolean z = b1u.A01 == null;
            b1u.A01 = obj;
            if (!z && b1u.A04) {
                ApJ apJ = b1u.A00;
                if (apJ != null) {
                    BBb bBb = (BBb) apJ;
                    InterfaceC2230BCa interfaceC2230BCa = bBb.A05;
                    if (interfaceC2230BCa != null) {
                        interfaceC2230BCa.ANt(bBb, null);
                    }
                    b1u.A00 = null;
                }
                List<ApJ> list = b1u.A02;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        BBb bBb2 = (BBb) list.get(i2);
                        InterfaceC2230BCa interfaceC2230BCa2 = bBb2.A05;
                        if (interfaceC2230BCa2 != null) {
                            interfaceC2230BCa2.ANt(bBb2, null);
                        }
                    }
                    list.clear();
                }
            }
        }
        return b1u;
    }

    public static final B1U A01(Object obj, int i, boolean z) {
        return new B1U(obj, i, z);
    }
}
