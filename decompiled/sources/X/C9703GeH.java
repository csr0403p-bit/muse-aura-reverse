package X;

import com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController;

/* renamed from: X.GeH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9703GeH {
    public final C9699Ge6 A00;
    public final Hwq A01 = new C9701GeF(this);
    public final InterfaceC9568GPa A02;
    public final G3j A03;
    public final IapPurchaseController A04;
    public final C78U A05;
    public final C9716GeU A06;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C10482Hla A00(X.AbstractC10579HwA r6, X.C9723Geb r7, X.C9703GeH r8, X.C9661Gd3 r9) {
        /*
            X.GPa r0 = r8.A02
            java.lang.String r5 = r6.A05()
            X.GPY r4 = r0.ABx(r5)
            r3 = 0
            if (r7 == 0) goto L6b
            X.GfA r0 = r7.A00
        Lf:
            boolean r2 = r0 instanceof X.C9753Gf6
            if (r7 == 0) goto L51
            X.GPY r1 = r7.A02
            X.Hye r0 = r1.AJ9()
            java.lang.String r0 = r0.A03
            boolean r0 = X.C7384Etj.areEqual(r0, r5)
            if (r0 == 0) goto L51
            if (r2 == 0) goto L45
            boolean r0 = r1 instanceof X.GPX
            if (r0 != 0) goto L45
            if (r9 == 0) goto L4f
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.C79.A0P
            if (r1 == r0) goto L4f
            java.lang.String r0 = r9.A05
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 == 0) goto L4f
            X.Hpr r0 = r6.A01()
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r9.A07
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L4f
        L45:
            X.Huh r1 = r7.A00()
        L49:
            X.Hla r0 = new X.Hla
            r0.<init>(r6, r1)
            return r0
        L4f:
            r1 = r3
            goto L49
        L51:
            boolean r0 = r4 instanceof X.GPX
            if (r0 == 0) goto L5e
            r0 = r4
            X.GPX r0 = (X.GPX) r0
            if (r0 == 0) goto L5e
            X.Huh r1 = r0.A00
            if (r1 != 0) goto L49
        L5e:
            if (r4 == 0) goto L69
            X.Huh r1 = r4.AJH()
            if (r1 == 0) goto L69
            if (r2 != 0) goto L69
            goto L49
        L69:
            r1 = r3
            goto L49
        L6b:
            r0 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9703GeH.A00(X.HwA, X.Geb, X.GeH, X.Gd3):X.Hla");
    }

    public C9703GeH(C9699Ge6 c9699Ge6, InterfaceC9568GPa interfaceC9568GPa, G3j g3j, IapPurchaseController iapPurchaseController, C78U c78u, C9716GeU c9716GeU) {
        this.A05 = c78u;
        this.A00 = c9699Ge6;
        this.A04 = iapPurchaseController;
        this.A06 = c9716GeU;
        this.A02 = interfaceC9568GPa;
        this.A03 = g3j;
    }
}
