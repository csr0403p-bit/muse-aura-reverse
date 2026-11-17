package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class B08 {
    public final List<B0G> A00;

    public static A48 A00(C1736ApY c1736ApY, int i) {
        B9B[] b9bArr = {new B09(new B08(new B0G[0]), c1736ApY, i)};
        C1847AsK c1847AsK = AbstractC1996Aw5.A03;
        return new A48(Arrays.asList(b9bArr));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof B08) && C7384Etj.areEqual(this.A00, ((B08) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B08(X.B0G... r9) {
        /*
            r8 = this;
            r8.<init>()
            int r5 = r9.length
            r7 = 0
            r4 = 0
        L6:
            if (r7 >= r5) goto L6d
            r3 = r9[r7]
            java.lang.String r6 = r3.ACh()
            r2 = 0
            r1 = 0
        L10:
            if (r2 >= r5) goto L23
            r0 = r9[r2]
            java.lang.String r0 = r0.ACh()
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 == 0) goto L20
            int r1 = r1 + 1
        L20:
            int r2 = r2 + 1
            goto L10
        L23:
            r0 = 1
            if (r1 != r0) goto L33
            if (r4 != 0) goto L2f
            boolean r0 = r3.AHw()
            r4 = 0
            if (r0 == 0) goto L30
        L2f:
            r4 = 1
        L30:
            int r7 = r7 + 1
            goto L6
        L33:
            java.lang.String r0 = "'"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r6)
            java.lang.String r0 = "' must be unique. Actual ["
            r4.append(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
        L48:
            if (r2 >= r5) goto L5c
            r1 = r9[r2]
            java.lang.String r0 = r1.ACh()
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 == 0) goto L59
            r3.add(r1)
        L59:
            int r2 = r2 + 1
            goto L48
        L5c:
            r4.append(r3)
            r0 = 93
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L6d:
            java.util.List r0 = X.BFI.A0G(r9)
            r8.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B08.<init>(X.B0G[]):void");
    }
}
