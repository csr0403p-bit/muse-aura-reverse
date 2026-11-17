package X;

import androidx.compose.ui.Alignment;

/* loaded from: classes4.dex */
public final class AWC implements AeE {
    public long A00 = 0;
    public final InterfaceC2267BNn A01;
    public final Alignment A02;

    @Override // X.AeE
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public final long mo11calculatePositionllwVHH4(BLU blu, long j, EnumC1820Arj enumC1820Arj, long j2) {
        long jAYd = this.A01.AYd();
        if ((9223372034707292159L & jAYd) == 9205357640488583168L) {
            jAYd = this.A00;
        }
        this.A00 = jAYd;
        return C2ae.A02(C2ae.A02(C8j3.A0T(blu.A01, blu.A03), AbstractC1017AQa.A00(jAYd)), this.A02.A4F(enumC1820Arj, j2, 0L));
    }

    public AWC(InterfaceC2267BNn interfaceC2267BNn, Alignment alignment) {
        this.A02 = alignment;
        this.A01 = interfaceC2267BNn;
    }
}
