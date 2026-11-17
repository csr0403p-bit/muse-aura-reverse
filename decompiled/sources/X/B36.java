package X;

/* loaded from: classes4.dex */
public abstract class B36 {
    public static final float A00(C6837Eap c6837Eap, B3E b3e, float f) {
        if (f < 0.0f) {
            if (c6837Eap != null) {
            }
            return 1.0f;
        }
        if (c6837Eap != null) {
        }
        return 0.0f;
        if (f < 0.0f) {
            if (b3e != null) {
                return ((B39) b3e).A00;
            }
            return 1.0f;
        }
        if (b3e != null) {
            return ((B39) b3e).A01;
        }
        return 0.0f;
    }

    public static final C18j A01(BFM bfm) {
        bfm.AgF(-610207901);
        bfm.AgF(-3687241);
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new B33();
            BBI.A0T(bfm, objAaT);
        }
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        C18j c18j = (C18j) objAaT;
        BBI.A0R(bbi, false);
        return c18j;
    }
}
