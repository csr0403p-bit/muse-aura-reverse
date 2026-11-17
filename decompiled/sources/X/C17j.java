package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.17j, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17j {
    public static final float A00(BFM bfm, float f, float f2) {
        long j = ((B6A) bfm.A6v(C17l.A00)).A00;
        boolean zA0A = MutableState.A0A(((C17s) bfm.A6v(C17n.A00)).A02);
        double dA00 = HxS.A00(j);
        if (zA0A) {
            if (dA00 > 0.5d) {
                return f;
            }
        } else if (dA00 < 0.5d) {
            return f;
        }
        return f2;
    }
}
