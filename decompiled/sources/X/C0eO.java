package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.0eO, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0eO {
    public static final C1BO<Boolean> A00(C0dy c0dy, BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
        boolean z = (((i & 14) ^ 6) > 4 && bfm.A65(c0dy)) || (i & 6) == 4;
        Object objAaT2 = bfm.AaT();
        if (z || objAaT2 == obj) {
            objAaT2 = new C05383bk(c0dy, mutableState, null, 1);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, c0dy);
        return mutableState;
    }
}
