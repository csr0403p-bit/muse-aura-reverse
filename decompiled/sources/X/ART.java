package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ART {
    public static void A01(C1EQ c1eq, AT3 at3) {
        at3.A9f(c1eq, null, C16a.A00, 1.0f, 3, 0L, A00(at3.AKb(), 0L));
    }

    public static void A02(C1EQ c1eq, AT3 at3, long j) {
        at3.A9i(c1eq, null, C16a.A00, 1.0f, 3, 0L, A00(at3.AKb(), 0L), j);
    }

    public static /* synthetic */ void A03(C1423Ais c1423Ais, AT3 at3, float f, int i, long j, long j2, long j3) {
        C1423Ais c1423Ais2 = c1423Ais;
        float f2 = f;
        long j4 = j2;
        long jA00 = j3;
        if ((i & 2) != 0) {
            j4 = 0;
        }
        if ((i & 4) != 0) {
            jA00 = A00(at3.AKb(), j4);
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        C16a c16a = C16a.A00;
        if ((i & 32) != 0) {
            c1423Ais2 = null;
        }
        at3.A9g(c1423Ais2, c16a, f2, (i & 64) != 0 ? 3 : 0, j, j4, jA00);
    }

    public static long A00(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ void A04(AT3 at3, GraphicsLayer graphicsLayer, G0U g0u) {
        long jAKb = at3.AKb();
        at3.AZj(graphicsLayer, g0u, C8j3.A0S((int) AnonymousClass001.A00(jAKb), (int) AnonymousClass001.A01(jAKb, 4294967295L)));
    }
}
