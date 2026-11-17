package X;

import kotlin.Unit;

/* renamed from: X.3U1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3U1 extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public C3TQ A00;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        C3TQ c3tq = this.A00;
        EnumC1820Arj layoutDirection = axy.getLayoutDirection();
        float fA5k = c3tq.A5k(layoutDirection);
        C1DP c1dp = (C1DP) c3tq;
        float f = c1dp.A03;
        float fA5n = c3tq.A5n(layoutDirection);
        float f2 = c1dp.A00;
        boolean z = (C1DG.A01(fA5k, 0.0f) >= 0) & (C1DG.A01(f, 0.0f) >= 0) & (C1DG.A01(fA5n, 0.0f) >= 0);
        if (C1DG.A01(f2, 0.0f) < 0 || (!z || !true)) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        final int iAbr = axy.Abr(fA5k);
        int iAbr2 = axy.Abr(fA5n) + iAbr;
        final int iAbr3 = axy.Abr(f);
        int iAbr4 = axy.Abr(f2) + iAbr3;
        final AZE azeAQW = c3tg.AQW(AYL.A08(j, -iAbr2, -iAbr4));
        return AnonymousClass002.A0X(axy, new G0U() { // from class: X.3U3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                ((AYU) obj).A0A(azeAQW, 0.0f, iAbr, iAbr3);
                return Unit.INSTANCE;
            }
        }, AYL.A02(j, azeAQW.A01 + iAbr2), AYL.A01(j, azeAQW.A00 + iAbr4));
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
