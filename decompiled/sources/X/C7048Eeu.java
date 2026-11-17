package X;

/* renamed from: X.Eeu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7048Eeu implements InterfaceC7015EeM<C6988Edo> {
    public final InterfaceC7015EeM<C6988Edo> A00;
    public final InterfaceC7005EeA A01;
    public final DV5 A02;

    public static boolean A00(C6988Edo c6988Edo, C7183Eht c7183Eht) {
        if (!c7183Eht.A0N) {
            return false;
        }
        int iA06 = c6988Edo.A06() - 1;
        CVn.A02(AnonymousClass002.A1N(iA06));
        EUs eUs = c7183Eht.A05;
        boolean z = false;
        if (eUs != null && 0 <= eUs.A00 && eUs.A01 <= iA06) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    @Override // X.InterfaceC7015EeM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AYc(X.InterfaceC7028EeZ<X.C6988Edo> r16, X.InterfaceC7029Eea r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7048Eeu.AYc(X.EeZ, X.Eea):void");
    }

    public C7048Eeu(InterfaceC7005EeA interfaceC7005EeA, DV5 dv5, InterfaceC7015EeM interfaceC7015EeM) {
        this.A01 = interfaceC7005EeA;
        this.A02 = dv5;
        this.A00 = interfaceC7015EeM;
    }
}
