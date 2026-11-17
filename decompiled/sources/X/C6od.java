package X;

import java.util.Collection;

/* renamed from: X.6od, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6od {
    public static void A00(C6t6 c6t6, String str, Collection collection, int i) {
        c6t6.loadUrlWithCookies(str, new C8hx(i), null, collection, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.net.Uri r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C6oL
            if (r0 == 0) goto L31
            X.6oL r6 = (X.C6oL) r6
            if (r7 == 0) goto L3c
            java.lang.String r5 = r7.getHost()
            if (r5 == 0) goto L3c
            java.lang.String[] r4 = r6.A01
            int r3 = r4.length
            r2 = 0
        L12:
            if (r2 >= r3) goto L3c
            r1 = r4[r2]
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L2c
            boolean r0 = r6.A00
            if (r0 == 0) goto L2e
            java.lang.String r0 = "."
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            boolean r0 = r5.endsWith(r0)
            if (r0 == 0) goto L2e
        L2c:
            r4 = 1
        L2d:
            return r4
        L2e:
            int r2 = r2 + 1
            goto L12
        L31:
            boolean r0 = r6 instanceof X.C8hx
            if (r0 == 0) goto L8c
            X.8hx r6 = (X.C8hx) r6
            int r0 = r6.$t
            switch(r0) {
                case 0: goto L85;
                case 1: goto L3e;
                case 2: goto L49;
                case 3: goto L54;
                case 4: goto L63;
                default: goto L3c;
            }
        L3c:
            r4 = 0
            return r4
        L3e:
            if (r7 == 0) goto L3c
            X.6tK r2 = X.C6tK.A00(r7)
            if (r2 == 0) goto L3c
            java.lang.String r0 = "instagram.com"
            goto L5e
        L49:
            if (r7 == 0) goto L3c
            X.6tK r2 = X.C6tK.A00(r7)
            if (r2 == 0) goto L3c
            java.lang.String r0 = "meta.com"
            goto L5e
        L54:
            if (r7 == 0) goto L3c
            X.6tK r2 = X.C6tK.A00(r7)
            if (r2 == 0) goto L3c
            java.lang.String r0 = "meta.ai"
        L5e:
            boolean r0 = X.C6tJ.A01(r2, r0)
            goto L77
        L63:
            if (r7 == 0) goto L3c
            X.6tK r2 = X.C6tK.A00(r7)
            if (r2 == 0) goto L3c
            X.6tK r1 = X.C6tK.A00(r7)
            if (r1 == 0) goto L3c
            java.lang.String r0 = "workplace.com"
            boolean r0 = X.C6tJ.A01(r1, r0)
        L77:
            if (r0 == 0) goto L3c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "https"
            boolean r0 = r1.equals(r0)
            r4 = 1
            if (r0 != 0) goto L2d
            goto L3c
        L85:
            if (r7 == 0) goto L3c
            boolean r4 = X.C6tJ.A00(r7)
            return r4
        L8c:
            boolean r0 = r6 instanceof X.C6to
            if (r0 == 0) goto Lb7
            X.6to r6 = (X.C6to) r6
            r4 = 0
            if (r7 == 0) goto L2d
            java.lang.Integer r1 = r6.A00
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto La6
            java.util.Collection<java.lang.String> r1 = r6.A01
            java.lang.String r0 = r7.getScheme()
            boolean r4 = r1.contains(r0)
            return r4
        La6:
            java.lang.Integer r0 = X.C79.A01
            if (r1 != r0) goto L2d
            java.util.Collection<java.lang.String> r1 = r6.A01
            java.lang.String r0 = r7.getScheme()
            boolean r0 = r1.contains(r0)
            r4 = r0 ^ 1
            return r4
        Lb7:
            X.6tr r6 = (X.C6tr) r6
            r4 = 0
            if (r7 == 0) goto L2d
            X.6od[] r3 = r6.A00
            int r2 = r3.length
            r1 = 0
        Lc0:
            if (r1 >= r2) goto L2c
            r0 = r3[r1]
            boolean r0 = r0.A01(r7)
            if (r0 == 0) goto L2d
            int r1 = r1 + 1
            goto Lc0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6od.A01(android.net.Uri):boolean");
    }
}
