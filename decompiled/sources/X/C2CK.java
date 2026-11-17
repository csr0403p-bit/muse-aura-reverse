package X;

import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* renamed from: X.2CK, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2CK {
    public static final MutableState A00(BFM bfm, EnumC10573Huf enumC10573Huf, F2N f2n, Object obj, C78T c78t, C20Q c20q, int i) {
        Object[] objArr = {c20q, f2n, enumC10573Huf, c78t};
        boolean zA67 = ((((i & 7168) ^ 3072) > 2048 && bfm.A63(enumC10573Huf.ordinal())) || (i & 3072) == 2048) | bfm.A67(f2n) | bfm.A67(c78t) | bfm.A67(c20q);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new C05413bn(enumC10573Huf, f2n, c78t, c20q, null, 0);
            bfm.Ai0(objAaT);
        }
        return C3UV.A03(bfm, obj, (G0V) objAaT, objArr);
    }

    public static final C1BO A01(BFM bfm, EnumC10573Huf enumC10573Huf, Object obj, C20Q c20q, int i, int i2) {
        EnumC10573Huf enumC10573Huf2 = enumC10573Huf;
        C1HY c1hy = (C1HY) bfm.A6v(AIC.A00);
        if ((i2 & 4) != 0) {
            enumC10573Huf2 = EnumC10573Huf.A06;
        }
        return A00(bfm, enumC10573Huf2, c1hy.getLifecycle(), obj, C6ys.A00, c20q, AnonymousClass003.A07(i, (i & 14) | (((i >> 3) & 8) << 3) | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)));
    }

    public static final C1BO A02(BFM bfm, C1BN c1bn) {
        C1HY c1hy = (C1HY) bfm.A6v(AIC.A00);
        EnumC10573Huf enumC10573Huf = EnumC10573Huf.A06;
        C6ys c6ys = C6ys.A00;
        return A00(bfm, enumC10573Huf, c1hy.getLifecycle(), c1bn.getValue(), c6ys, c1bn, 0);
    }
}
