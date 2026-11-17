package X;

/* renamed from: X.Ada, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1171Ada implements Ae1 {
    public final int A00;
    public final Object[] A01;
    public final Ae9<Object> A02;

    @Override // X.Ae1
    public final int AGP(Object obj) {
        Ae9<Object> ae9 = this.A02;
        int iA04 = ae9.A04(obj);
        if (iA04 >= 0) {
            return ae9.A02[iA04];
        }
        return -1;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ADq;LX/AdZ<*>;)V */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d A[LOOP:1: B:15:0x006d->B:21:0x008d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1171Ada(X.AdZ r15, X.ADq r16) {
        /*
            r14 = this;
            r14.<init>()
            X.Adm r4 = r15.A00()
            r0 = r16
            int r12 = r0.A00
            r3 = 1
            r2 = 0
            if (r12 < 0) goto Laa
            int r1 = r0.A01
            X.AdV r4 = (X.C1170AdV) r4
            int r0 = r4.A00
            int r11 = X.C8j3.A0F(r0, r3, r1)
            if (r11 >= r12) goto L24
            X.AeA<java.lang.Object> r0 = X.AbstractC1189Ads.A00
            r14.A02 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r14.A01 = r0
            return
        L24:
            int r0 = r11 - r12
            int r1 = r0 + 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r14.A01 = r0
            r14.A00 = r12
            X.AeA r10 = new X.AeA
            r10.<init>(r1)
            java.lang.String r2 = ", size "
            java.lang.String r0 = "Index "
            int r1 = r4.A00
            if (r12 >= r1) goto L97
            if (r11 >= r1) goto L9c
            X.AHm<X.Adk<T>> r9 = r4.A02
            int r13 = X.AbstractC1177Adg.A00(r9, r12)
            T[] r0 = r9.A01
            r0 = r0[r13]
            X.Adk r0 = (X.C1181Adk) r0
            int r8 = r0.A01
        L4b:
            if (r8 > r11) goto L94
            T[] r0 = r9.A01
            r1 = r0[r13]
            X.Adk r1 = (X.C1181Adk) r1
            T r0 = r1.A02
            X.Adp r0 = (X.InterfaceC1186Adp) r0
            X.G0U r7 = r0.AGn()
            int r6 = r1.A01
            int r5 = java.lang.Math.max(r12, r6)
            int r4 = r1.A00
            int r0 = r6 + r4
            int r0 = r0 + (-1)
            int r3 = java.lang.Math.min(r11, r0)
            if (r5 > r3) goto L90
        L6d:
            if (r7 == 0) goto L7b
            int r0 = r5 - r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r7.invoke(r0)
            if (r2 != 0) goto L80
        L7b:
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r2 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r2.<init>(r5)
        L80:
            r10.A07(r2, r5)
            java.lang.Object[] r1 = r14.A01
            int r0 = r14.A00
            int r0 = r5 - r0
            r1[r0] = r2
            if (r5 == r3) goto L90
            int r5 = r5 + 1
            goto L6d
        L90:
            int r8 = r8 + r4
            int r13 = r13 + 1
            goto L4b
        L94:
            r14.A02 = r10
            return
        L97:
            java.lang.StringBuilder r0 = X.C60O.A0y(r0, r12)
            goto La0
        L9c:
            java.lang.StringBuilder r0 = X.C60O.A0y(r0, r11)
        La0:
            java.lang.String r0 = X.C60P.A1O(r2, r0, r1)
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        Laa:
            java.lang.String r0 = "negative nearestRange.first"
            java.lang.IllegalStateException r1 = X.C3cG.A0Q(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1171Ada.<init>(X.AdZ, X.ADq):void");
    }
}
