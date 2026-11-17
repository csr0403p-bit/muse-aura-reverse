package X;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class AW4 extends AbstractC1439Aj8 implements InterfaceC1476Ajj, InterfaceC1332AhJ, InterfaceC1451AjK {
    public float A00;
    public long A01;
    public long A02;
    public C1EQ A03;
    public AbstractC1555AlK A04;
    public AbstractC1555AlK A05;
    public C1DM A06;
    public C1DM A07;
    public EnumC1820Arj A08;

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        interfaceC0857A6e.Aca(AbstractC1671Anw.A0Y, this.A07);
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final boolean AOU() {
        return false;
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        AbstractC1555AlK abstractC1555AlK;
        C1EQ c1eq;
        float f;
        C1423Ais c1423Ais;
        C16a c16a;
        int i;
        InterfaceC1068ATy interfaceC1068ATy;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        C1DM c1dm = this.A07;
        if (c1dm == C1OM.A00) {
            long j = this.A01;
            if (j != B6A.A07) {
                ART.A03(null, c16z, 0.0f, 126, j, 0L, 0L);
            }
            c1eq = this.A03;
            if (c1eq != null) {
                f = this.A00;
                c1423Ais = null;
                jFloatToRawIntBits2 = ART.A00(c16z.AKb(), 0L);
                c16a = C16a.A00;
                i = 3;
                jFloatToRawIntBits = 0;
                c16z.A9f(c1eq, c1423Ais, c16a, f, i, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        } else {
            if (c16z.AKb() == this.A02 && c16z.getLayoutDirection() == this.A08 && C7384Etj.areEqual(this.A06, c1dm)) {
                abstractC1555AlK = this.A04;
                C7384Etj.A0X(abstractC1555AlK);
            } else {
                AbstractC1441AjA.A00(this, new BTB(2, this, c16z));
                abstractC1555AlK = this.A05;
                this.A05 = null;
            }
            this.A04 = abstractC1555AlK;
            this.A02 = c16z.AKb();
            this.A08 = c16z.getLayoutDirection();
            this.A06 = this.A07;
            C7384Etj.A0X(abstractC1555AlK);
            long j2 = this.A01;
            if (j2 != B6A.A07) {
                AW3.A00(abstractC1555AlK, c16z, j2);
            }
            c1eq = this.A03;
            if (c1eq != null) {
                f = this.A00;
                c1423Ais = null;
                c16a = C16a.A00;
                i = 3;
                if (abstractC1555AlK instanceof C1097AYh) {
                    AaC aaC = ((C1097AYh) abstractC1555AlK).A00;
                    float f2 = aaC.A01;
                    float f3 = aaC.A03;
                    jFloatToRawIntBits = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                    float f4 = aaC.A02 - f2;
                    float f5 = aaC.A00 - f3;
                    jFloatToRawIntBits2 = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
                    c16z.A9f(c1eq, c1423Ais, c16a, f, i, jFloatToRawIntBits, jFloatToRawIntBits2);
                } else {
                    if (abstractC1555AlK instanceof AW6) {
                        AW6 aw6 = (AW6) abstractC1555AlK;
                        interfaceC1068ATy = aw6.A01;
                        if (interfaceC1068ATy == null) {
                            AW7 aw7 = aw6.A00;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (aw7.A04 >> 32));
                            float f6 = aw7.A01;
                            float f7 = aw7.A03;
                            float f8 = aw7.A02 - f6;
                            float f9 = aw7.A00 - f7;
                            long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L);
                            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat);
                            c16z.A9i(c1eq, null, c16a, f, 3, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), jFloatToRawIntBits3, (jFloatToRawIntBits4 & 4294967295L) | (jFloatToRawIntBits4 << 32));
                        }
                    } else {
                        if (!(abstractC1555AlK instanceof C1069ATz)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC1068ATy = ((C1069ATz) abstractC1555AlK).A00;
                    }
                    c16z.A9c(c1eq, null, interfaceC1068ATy, c16a, f, 3);
                }
            }
        }
        c16z.A9O();
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        this.A02 = 9205357640488583168L;
        this.A08 = null;
        this.A04 = null;
        this.A06 = null;
        AaD.A00(this);
    }
}
