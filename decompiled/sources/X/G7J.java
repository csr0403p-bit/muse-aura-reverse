package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class G7J extends G7E<C9242G7x> {
    public C9242G7x A00;
    public final List<InterfaceC9228G7j<C9242G7x>> A01;

    public G7J(C9236G7r c9236G7r, G7Y g7y) {
        super(c9236G7r, g7y);
        G7Y g7y2 = this.A05;
        this.A00 = new C9242G7x(this.A03, g7y2, g7y2);
        this.A01 = Arrays.asList(new C9221G7c(), new C9220G7b(), new G7R(), new G7S(), new G7W(), new G7U(), new G7V(), new G7Q(), new G7I());
    }

    @Override // X.G7E
    public final List A02(G7T g7t, C9236G7r c9236G7r) {
        AnonymousClass003.A0u(g7t, c9236G7r);
        return g7t.A02 == -1 ? this.A02 : super.A02(g7t, c9236G7r);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // X.G7E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03(X.G7T r4, X.C9236G7r r5, X.G7Y r6) {
        /*
            r3 = this;
            X.AnonymousClass005.A0x(r4, r6, r5)
            int[] r1 = r6.A02
            int r0 = r1.length
            if (r0 == 0) goto L39
            int r0 = r0 + (-1)
            r0 = r1[r0]
            if (r0 == 0) goto L39
            int r3 = r4.A00
            int r0 = r4.A02
            int r1 = r3 - r0
            java.lang.CharSequence r0 = r4.A03
            int r0 = X.AbstractC9223G7e.A00(r0, r6)
            int r1 = r1 + r0
            int r0 = r4.A01()
            int r2 = java.lang.Math.min(r1, r0)
            char[] r1 = r6.A01
            int r0 = r1.length
            if (r0 == 0) goto L45
            int r0 = r0 + (-1)
            char r1 = r1[r0]
            r0 = 62
            if (r1 != r0) goto L3a
            X.G72 r1 = X.AbstractC9205G6l.A05
        L32:
            X.ADq r0 = X.AbstractC7607F5u.A1C(r3, r2)
            X.G7A.A01(r0, r1, r5)
        L39:
            return
        L3a:
            r0 = 46
            if (r1 == r0) goto L42
            r0 = 41
            if (r1 != r0) goto L45
        L42:
            X.G72 r1 = X.AbstractC9205G6l.A0R
            goto L32
        L45:
            X.G72 r1 = X.AbstractC9205G6l.A0Q
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G7J.A03(X.G7T, X.G7r, X.G7Y):void");
    }
}
