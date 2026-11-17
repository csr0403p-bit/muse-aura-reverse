package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7mU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mU extends C7mT {
    public static C7mU A08;
    public C7mM A02 = null;
    public C7mD A00 = null;
    public C7mF A01 = null;
    public C7n6 A05 = null;
    public C7n4 A03 = null;
    public C7n5 A04 = null;
    public Map<C7381Etf, C7mX> A06 = new HashMap();
    public final Map<C7381Etf, C7n0> A07 = new HashMap();

    public final synchronized C7n4 A03() {
        C7n4 c7n4;
        c7n4 = this.A03;
        if (c7n4 == null) {
            C7mD c7mD = this.A00;
            if (c7mD == null) {
                c7mD = new C7mD(C7mT.A09, C7mT.A08);
                this.A00 = c7mD;
            }
            c7n4 = new C7n4(c7mD, null, super.A05, super.A07);
            this.A03 = c7n4;
        }
        return c7n4;
    }

    public final synchronized C7n5 A04() {
        C7n5 c7n5;
        c7n5 = this.A04;
        if (c7n5 == null) {
            C7mF c7mF = this.A01;
            if (c7mF == null) {
                c7mF = new C7mF(C7mT.A09, C7mT.A08);
                this.A01 = c7mF;
            }
            c7n5 = new C7n5(c7mF, null, super.A05, super.A07);
            this.A04 = c7n5;
        }
        return c7n5;
    }

    public final synchronized C7n6 A05() {
        return A06();
    }

    public final synchronized C7n6 A06() {
        C7n6 c7n6;
        c7n6 = this.A05;
        if (c7n6 == null) {
            C7mM c7mM = this.A02;
            if (c7mM == null) {
                WeakReference<C7381Etf> weakReference = C7mM.A00;
                c7mM = new C7mM(C7mT.A09, C7mT.A08);
                this.A02 = c7mM;
            }
            c7n6 = new C7n6(c7mM, null, super.A05, super.A07);
            this.A05 = c7n6;
        }
        return c7n6;
    }

    public final synchronized C7n0 A07(C7381Etf c7381Etf) {
        Map<C7381Etf, C7n0> map;
        map = super.A06;
        if (!map.containsKey(c7381Etf)) {
            Map<C7381Etf, C7mX> map2 = super.A02;
            if (!map2.containsKey(c7381Etf)) {
                map2.put(c7381Etf, new C7mX(C7mT.A09, C7mT.A08, c7381Etf, "TrustedAppIntentScope"));
            }
            C7mX c7mX = map2.get(c7381Etf);
            map.put(c7381Etf, new C7n0(c7mX, null, super.A05, super.A07));
        }
        return map.get(c7381Etf);
    }

    public static synchronized C7mU A00() {
        C7mU c7mU;
        try {
            c7mU = A08;
            if (c7mU == null) {
                c7mU = new C7mU();
                A08 = c7mU;
            }
        } finally {
        }
        return c7mU;
    }
}
