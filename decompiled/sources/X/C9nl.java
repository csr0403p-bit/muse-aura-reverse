package X;

/* renamed from: X.9nl, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9nl {
    public static final C9nm A00(BFM bfm, EnumC10573Huf enumC10573Huf) {
        BBI bbi = (BBI) bfm;
        Object objA07 = AKO.A07(AIC.A00, bbi);
        boolean zA65 = bfm.A65(objA07);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new C9nm();
            BBI.A0O(bbi, objAaT);
        }
        C9nm c9nm = (C9nm) objAaT;
        boolean zA1M = AnonymousClass003.A1M(bfm, c9nm, objA07);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == C78N.A00) {
            objAaT2 = new BT9(24, c9nm, objA07);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A19(bfm, objAaT2, c9nm, objA07);
        boolean zA67 = bfm.A67(c9nm) | C8j3.A1S(AnonymousClass002.A1U(bfm, enumC10573Huf) ? 1 : 0);
        Object objAaT3 = bfm.AaT();
        if (zA67 || objAaT3 == C78N.A00) {
            objAaT3 = BU6.A0M(enumC10573Huf, c9nm, null, 44);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A1A(bfm, objAaT3, c9nm, enumC10573Huf);
        return c9nm;
    }
}
