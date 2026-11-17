package X;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Deprecated;
import kotlin.Unit;

@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* renamed from: X.AuS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1938AuS {
    public AaC A00;
    public AaC A01;
    public C1958Aux A02;
    public InterfaceC2128Ayu A03;
    public C1805ArO A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1406Aib A0F;
    public final InterfaceC2137Az5 A0G;
    public final Object A0C = C3cG.A0T();
    public G0U<? super C1392AiN, Unit> A05 = new BUU(6);
    public final CursorAnchorInfo.Builder A0E = new CursorAnchorInfo.Builder();
    public final float[] A0H = C1392AiN.A06();
    public final Matrix A0D = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1938AuS r26) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1938AuS.A00(X.AuS):void");
    }

    public static final boolean A01(AaC aaC, float f, float f2) {
        float f3 = aaC.A01;
        if (f <= aaC.A02 && f3 <= f) {
            float f4 = aaC.A03;
            if (f2 <= aaC.A00 && f4 <= f2) {
                return true;
            }
        }
        return false;
    }

    public C1938AuS(InterfaceC1406Aib interfaceC1406Aib, InterfaceC2137Az5 interfaceC2137Az5) {
        this.A0F = interfaceC1406Aib;
        this.A0G = interfaceC2137Az5;
    }
}
