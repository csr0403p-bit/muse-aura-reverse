package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.AYp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1103AYp {
    public static final C1110AYw A00(int i, BFM bfm, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        AFs<C1110AYw, ?> aFs = C1110AYw.A0A;
        if ((((i2 & 14) ^ 6) <= 4 || !bfm.A63(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objAaT = bfm.AaT();
        if (z || objAaT == C78N.A00) {
            objAaT = new C2287BSn(i, 0);
            bfm.Ai0(objAaT);
        }
        return (C1110AYw) AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
    }

    public static final BRg A01(C1110AYw c1110AYw, BRg bRg, boolean z) {
        return bRg.then(C11U.A03(BRg.A00, C1098AYi.A00)).then(new C1105AYr(null, null, null, EnumC1108AYu.A02, c1110AYw, c1110AYw.A02, z, false, true)).then(new AYo(c1110AYw, false));
    }

    public static final BRg A02(C1110AYw c1110AYw, BRg bRg, boolean z) {
        return bRg.then(C11U.A03(BRg.A00, C1099AYj.A00)).then(new C1105AYr(null, null, null, EnumC1108AYu.A03, c1110AYw, c1110AYw.A02, z, false, true)).then(new AYo(c1110AYw, true));
    }
}
