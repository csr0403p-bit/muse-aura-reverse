package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7L extends G7J {
    public final List<InterfaceC9228G7j<C9242G7x>> A00;

    public G7L(C9236G7r c9236G7r, G7Y g7y) {
        super(c9236G7r, g7y);
        this.A00 = AbstractC0878AGe.A0P(Collections.singletonList(new G7H()), AbstractC0878AGe.A0P(((G7J) this).A01, Collections.singletonList(new G7K())));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    @Override // X.G7J, X.G7E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.G7T r8, X.C9236G7r r9, X.G7Y r10) {
        /*
            r7 = this;
            X.AnonymousClass005.A0x(r8, r10, r9)
            boolean r0 = r10 instanceof X.C9229G7k
            if (r0 == 0) goto L7f
            r0 = r10
            X.G7k r0 = (X.C9229G7k) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L7f
            java.lang.CharSequence r5 = r8.A03
            int r6 = r8.A02
            r2 = r6
        L13:
            int r0 = r5.length()
            if (r2 >= r0) goto L24
            char r1 = r5.charAt(r2)
            r0 = 91
            if (r1 == r0) goto L24
            int r2 = r2 + 1
            goto L13
        L24:
            int r0 = r5.length()
            if (r2 != r0) goto L2e
            super.A03(r8, r9, r10)
            return
        L2e:
            char[] r1 = r10.A01
            int r0 = r1.length
            if (r0 == 0) goto L7c
            int r0 = r0 + (-1)
            char r1 = r1[r0]
            r0 = 62
            if (r1 != r0) goto L71
            X.G72 r4 = X.AbstractC9205G6l.A05
        L3d:
            int r3 = r8.A00
            int r1 = r3 - r6
            int r2 = r2 + r1
            int r0 = X.AbstractC9223G7e.A00(r5, r10)
            int r1 = r1 + r0
            int r0 = r8.A01()
            int r1 = java.lang.Math.min(r1, r0)
            X.ADq r0 = X.AbstractC7607F5u.A1C(r3, r2)
            X.G7A r3 = new X.G7A
            r3.<init>(r0, r4)
            X.ADq r2 = X.AbstractC7607F5u.A1C(r2, r1)
            X.G72 r1 = X.AbstractC9213G6t.A02
            X.G7A r0 = new X.G7A
            r0.<init>(r2, r1)
            X.G7A[] r0 = new X.G7A[]{r3, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.util.List<X.G7A> r0 = r9.A01
            r0.addAll(r1)
            return
        L71:
            r0 = 46
            if (r1 == r0) goto L79
            r0 = 41
            if (r1 != r0) goto L7c
        L79:
            X.G72 r4 = X.AbstractC9205G6l.A0R
            goto L3d
        L7c:
            X.G72 r4 = X.AbstractC9205G6l.A0Q
            goto L3d
        L7f:
            super.A03(r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G7L.A03(X.G7T, X.G7r, X.G7Y):void");
    }
}
