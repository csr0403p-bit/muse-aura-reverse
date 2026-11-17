package X;

/* renamed from: X.GeU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9716GeU {
    public final C9699Ge6 A00;
    public final C9685Gdp A01;

    public C9716GeU(C9699Ge6 c9699Ge6, C9685Gdp c9685Gdp) {
        C7384Etj.A0Y(c9685Gdp, 0);
        this.A01 = c9685Gdp;
        this.A00 = c9699Ge6;
    }

    public static final void A00(C9717GeV c9717GeV, String str) {
        C7384Etj.A0Y(c9717GeV, 0);
        InterfaceC10552Hsd interfaceC10552Hsd = c9717GeV.A0A;
        if (interfaceC10552Hsd != null) {
            interfaceC10552Hsd.AWE(new C10553Hse(str));
        }
    }

    public final synchronized C9717GeV A01() {
        return this.A01.A01.A00;
    }

    public final synchronized C9717GeV A02(C9717GeV c9717GeV) {
        C9717GeV c9717GeV2 = this.A01.A01.A00;
        if ((c9717GeV2 != null ? c9717GeV2.A08 : null) != c9717GeV.A08 || c9717GeV2.A03 || c9717GeV2.A04) {
            return null;
        }
        c9717GeV2.A03 = true;
        return c9717GeV2;
    }

    public final synchronized void A03(C9717GeV c9717GeV, C9720GeY c9720GeY) {
        C7384Etj.A0Y(c9717GeV, 0);
        c9717GeV.A00 = c9720GeY;
    }
}
