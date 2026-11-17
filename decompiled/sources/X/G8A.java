package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
public final class G8A implements InterfaceC9243G7y {
    public static final G8I A00(G75 g75) {
        G72 g72;
        int i;
        G72 g72A02 = G75.A02(g75, 0);
        G72 g722 = AbstractC9205G6l.A0N;
        if (!C7384Etj.areEqual(g72A02, g722)) {
            return null;
        }
        int i2 = g75.A00;
        G8L g8l = new G8L();
        do {
            g75 = g75.A07();
            G72 g72A022 = G75.A02(g75, 0);
            g72 = AbstractC9205G6l.A0U;
            if (C7384Etj.areEqual(g72A022, g72) || G75.A02(g75, 0) == null) {
                break;
            }
            g8l.A01(g75.A00);
        } while (!G75.A04(g722, g75));
        if (!G75.A04(g72, g75) || (i = g75.A00) == i2 + 1) {
            return null;
        }
        return new G8I(G7A.A00(AbstractC7607F5u.A1C(i2, i + 1), AbstractC9206G6m.A0I), Collections.singletonList(g8l.A00()), g75);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G8I A01(X.G75 r8) {
        /*
            r3 = 0
            int r7 = r8.A00
            X.G8I r6 = X.G8B.A01(r8)
            if (r6 == 0) goto L4c
            X.G75 r0 = r6.A02
            X.G75 r2 = r0.A07()
            X.G72 r1 = X.G75.A02(r2, r3)
            X.G72 r0 = X.AbstractC9205G6l.A0E
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L1f
            X.G75 r2 = r2.A07()
        L1f:
            X.G8I r4 = A00(r2)
            if (r4 == 0) goto L4c
            X.G75 r5 = r4.A02
            java.util.Collection<X.G7A> r1 = r6.A00
            java.util.Collection<X.G7A> r0 = r4.A00
            java.util.ArrayList r3 = X.AbstractC0878AGe.A0P(r0, r1)
            X.ADq r2 = X.G75.A01(r5, r7)
            X.G72 r1 = X.AbstractC9206G6m.A0C
            X.G7A r0 = new X.G7A
            r0.<init>(r2, r1)
            java.util.ArrayList r2 = X.AbstractC0878AGe.A0Q(r0, r3)
            java.util.Collection<java.util.List<X.ADq>> r1 = r6.A01
            java.util.Collection<java.util.List<X.ADq>> r0 = r4.A01
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0P(r0, r1)
        L46:
            X.G8I r1 = new X.G8I
            r1.<init>(r2, r0, r5)
            return r1
        L4c:
            X.G8I r4 = A00(r8)
            if (r4 != 0) goto L54
            r1 = 0
            return r1
        L54:
            X.G75 r5 = r4.A02
            X.G75 r2 = r5.A07()
            X.G72 r1 = X.G75.A02(r2, r3)
            X.G72 r0 = X.AbstractC9205G6l.A0E
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L6a
            X.G75 r2 = r2.A07()
        L6a:
            X.G72 r1 = X.G75.A02(r2, r3)
            X.G72 r0 = X.AbstractC9205G6l.A0N
            boolean r1 = X.C7384Etj.areEqual(r1, r0)
            r0 = 1
            if (r1 == 0) goto L87
            X.G72 r1 = r2.A06(r0)
            X.G72 r0 = X.AbstractC9205G6l.A0U
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L87
            X.G75 r5 = r2.A07()
        L87:
            java.util.Collection<X.G7A> r3 = r4.A00
            X.ADq r2 = X.G75.A01(r5, r7)
            X.G72 r1 = X.AbstractC9206G6m.A0R
            X.G7A r0 = new X.G7A
            r0.<init>(r2, r1)
            java.util.ArrayList r2 = X.AbstractC0878AGe.A0Q(r0, r3)
            java.util.Collection<java.util.List<X.ADq>> r0 = r4.A01
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8A.A01(X.G75):X.G8I");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G7B;Ljava/util/List<LX/ADq;>;)LX/G8M; */
    @Override // X.InterfaceC9243G7y
    public final G8K AXe(List list, G7B g7b) {
        G8I g8iA01;
        AnonymousClass003.A0u(g7b, list);
        G8K g8k = new G8K();
        G8L g8l = new G8L();
        G75 g78 = new G78(list, g7b);
        HashSet hashSetA00 = G8B.A00(list, C8631Fhi.A00(38), g7b);
        while (G75.A02(g78, 0) != null) {
            if (C7384Etj.areEqual(G75.A02(g78, 0), AbstractC9205G6l.A0N) && AbstractC7608F5v.A1Y(hashSetA00, g78.A00) && (g8iA01 = A01(g78)) != null) {
                g78 = g8iA01.A02.A07();
                g8k.A01(g8iA01);
            } else {
                g8l.A01(g78.A00);
                g78 = g78.A07();
            }
        }
        G8K.A00(g8l, g8k);
        return g8k;
    }
}
