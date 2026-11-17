package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class Ad7 {
    public static final Ad2 A00;

    static {
        BSX bsx = new BSX(1);
        C0881AGi c0881AGi = C0881AGi.A00;
        A00 = new Ad2(EnumC1108AYu.A03, null, bsx, new ATH(1.0f, 1.0f), c0881AGi, new C2279BSf(0), new C2279BSf(1), Hxb.A02(C6ys.A00), 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, false, false, false);
    }

    public static final LazyGridState A00(BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        AFs<LazyGridState, ?> aFs = LazyGridState.A0O;
        boolean zA1S = C8j3.A1S(bfm.A63(i) ? 1 : 0) | (bfm.A63(0));
        Object objAaT = bfm.AaT();
        if (zA1S || objAaT == C78N.A00) {
            objAaT = new C2287BSn(i, 1);
            bfm.Ai0(objAaT);
        }
        return (LazyGridState) AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
    }
}
