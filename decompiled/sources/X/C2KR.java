package X;

/* renamed from: X.2KR, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2KR {
    public static final C1868Asi A00(BFM bfm, int i, int i2) {
        boolean z = true;
        int i3 = (i2 & 1) != 0 ? 8 : 0;
        C2K7 c2k7 = (C2K7) bfm.A6v(Am0.A06);
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
        boolean zA1H = AnonymousClass003.A1H(bfm, enumC1820ArjA0d, AnonymousClass003.A1K(bfm, c2k7, axnA0Y));
        if ((((i & 14) ^ 6) <= 4 || !bfm.A63(i3)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zA1H | z;
        Object objAaT = bfm.AaT();
        if (z2 || objAaT == C78N.A00) {
            objAaT = new C1868Asi(c2k7, axnA0Y, enumC1820ArjA0d, i3);
            bfm.Ai0(objAaT);
        }
        return (C1868Asi) objAaT;
    }
}
