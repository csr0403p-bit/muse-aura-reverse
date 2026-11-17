package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public final class AYM extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1332AhJ {
    public float A00;
    public Alignment A01;
    public C1423Ais A02;
    public AVy A03;
    public ARL A04;
    public boolean A05;

    public static final long A01(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    private final boolean A02() {
        return this.A05 && this.A03.mo0getIntrinsicSizeNHjbRc() != 9205357640488583168L;
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        long jMo0getIntrinsicSizeNHjbRc = this.A03.mo0getIntrinsicSizeNHjbRc();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (A04(jMo0getIntrinsicSizeNHjbRc) ? jMo0getIntrinsicSizeNHjbRc >> 32 : c16z.AKb() >> 32));
        if (!A03(jMo0getIntrinsicSizeNHjbRc)) {
            jMo0getIntrinsicSizeNHjbRc = c16z.AKb();
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo0getIntrinsicSizeNHjbRc & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        long jAKb = c16z.AKb();
        long jA01 = (Float.intBitsToFloat((int) (jAKb >> 32)) == 0.0f || Float.intBitsToFloat((int) (jAKb & 4294967295L)) == 0.0f) ? 0L : A01(jFloatToRawIntBits, this.A04.A6j(jFloatToRawIntBits, jAKb));
        long jA4F = this.A01.A4F(c16z.getLayoutDirection(), (Math.round(Float.intBitsToFloat((int) (jA01 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jA01 >> 32))) << 32), (Math.round(r9) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jAKb & 4294967295L)))));
        float f = (int) (jA4F >> 32);
        float fA09 = AnonymousClass002.A09(jA4F);
        AT2 at2 = ((AaI) c16z.AEq()).A01;
        at2.AhL(f, fA09);
        try {
            this.A03.m10drawx_KDEd0(c16z, jA01, this.A00, this.A02);
            at2.AhL(-f, -fA09);
            c16z.A9O();
        } catch (Throwable th) {
            at2.AhL(-f, -fA09);
            throw th;
        }
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PainterModifier(painter=");
        sbA0x.append(this.A03);
        sbA0x.append(", sizeToIntrinsics=");
        sbA0x.append(this.A05);
        sbA0x.append(", alignment=");
        sbA0x.append(this.A01);
        sbA0x.append(", alpha=");
        sbA0x.append(this.A00);
        sbA0x.append(", colorFilter=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A00(long r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AYM.A00(long):long");
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!A02()) {
            return c3Tr.AQM(i);
        }
        long jA00 = A00(AYL.A04(i));
        return Math.max(Constraints.A02(jA00), c3Tr.AQM(i));
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!A02()) {
            return c3Tr.AQO(i);
        }
        long jA00 = A00(AYL.A03(i));
        return Math.max(Constraints.A03(jA00), c3Tr.AQO(i));
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW = c3tg.AQW(A00(j));
        int i = azeAQW.A01;
        int i2 = azeAQW.A00;
        return axy.APV(C9jH.A00, new BUX(azeAQW, 16), i, i2);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!A02()) {
            return c3Tr.AQo(i);
        }
        long jA00 = A00(AYL.A04(i));
        return Math.max(Constraints.A02(jA00), c3Tr.AQo(i));
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!A02()) {
            return c3Tr.AQq(i);
        }
        long jA00 = A00(AYL.A03(i));
        return Math.max(Constraints.A03(jA00), c3Tr.AQq(i));
    }

    public static final boolean A03(long j) {
        return j != 9205357640488583168L && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean A04(long j) {
        return j != 9205357640488583168L && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }
}
