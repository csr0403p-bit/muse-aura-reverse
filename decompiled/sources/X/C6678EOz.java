package X;

import java.util.Set;

/* renamed from: X.EOz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6678EOz {
    public static final Set<EOW> A00;
    public static final C6678EOz A01 = new C6678EOz();

    static {
        Set<EOW> setA03 = AbstractC5245DeA.A03(3);
        C7384Etj.A0U(setA03);
        A00 = setA03;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.Hj6 r8, X.F6D r9) {
        /*
            r7 = this;
            java.lang.Object[] r1 = r8.A01
            r0 = 0
            r6 = r1[r0]
            java.lang.String r6 = (java.lang.String) r6
            r0 = 1
            r4 = r1[r0]
            java.lang.String r4 = (java.lang.String) r4
            r0 = 2
            X.HsM r3 = X.C7384Etj.A0B(r1, r0)
            int r0 = r8.A00
            r1 = 3
            if (r0 <= r1) goto La0
            java.lang.Object[] r0 = r8.A01
            java.lang.Object r5 = X.BV6.A0n(r0, r1)
            java.lang.String r5 = (java.lang.String) r5
        L1e:
            X.FBB r0 = r9.A02
            r2 = 0
            if (r0 == 0) goto L4b
            android.content.Context r1 = r0.A00
            if (r1 == 0) goto L4b
            if (r6 == 0) goto L9d
            int r0 = r6.hashCode()
            switch(r0) {
                case -751905909: goto L71;
                case 69888: goto L7c;
                case 561774310: goto L87;
                case 2032871314: goto L92;
                default: goto L30;
            }
        L30:
            X.A3q r8 = X.A3q.A00
        L32:
            if (r4 != 0) goto L4c
            java.util.Set<X.EP1> r0 = X.EP1.A00
        L36:
            X.EOH r4 = new X.EOH
            r4.<init>(r0, r2)
            X.EOB r0 = X.EOB.A05
            X.CNp r4 = r0.A01(r1, r5, r8, r4)
            X.EOy r1 = new X.EOy
            r1.<init>(r3, r9)
            X.EwV r0 = X.ExecutorC7452EwV.A00
            X.CQD.A01(r1, r4, r0)
        L4b:
            return r2
        L4c:
            X.Ey9 r0 = X.EP1.A01
            java.util.Iterator r7 = r0.iterator()
        L52:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.EP1 r0 = (X.EP1) r0
            java.lang.String r0 = r0.accountSourceString
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L52
            if (r6 == 0) goto L6e
            java.util.Set r0 = java.util.Collections.singleton(r6)
            goto L36
        L6e:
            X.A3q r0 = X.A3q.A00
            goto L36
        L71:
            java.lang.String r0 = "Barcelona"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L30
            java.util.Set<X.EP0> r8 = X.EP0.A04
            goto L32
        L7c:
            java.lang.String r0 = "FRL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L30
            java.util.Set<X.EP0> r8 = X.EP0.A02
            goto L32
        L87:
            java.lang.String r0 = "Facebook"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L30
            java.util.Set<X.EP0> r8 = X.EP0.A01
            goto L32
        L92:
            java.lang.String r0 = "Instagram"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L30
            java.util.Set<X.EP0> r8 = X.EP0.A03
            goto L32
        L9d:
            java.util.Set<X.EP0> r8 = X.EP0.A00
            goto L32
        La0:
            java.lang.String r5 = "BKBloksFxActionFetchAllAvailableNativeAuthDataImpl"
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6678EOz.A00(X.Hj6, X.F6D):java.lang.Object");
    }
}
