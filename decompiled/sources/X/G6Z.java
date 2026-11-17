package X;

import java.util.List;
import org.intellij.markdown.parser.CancellationToken;

/* loaded from: classes6.dex */
public class G6Z {
    public final CharSequence A00;
    public final CancellationToken A01;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r4 <= r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r0.add(new X.G6Q(r6, r9, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r9 = r4 + 1;
        r0.add(new X.G6Q(X.AbstractC9205G6l.A0E, r4, r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<X.G65> A02(X.G72 r8, int r9, int r10) {
        /*
            r7 = this;
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            X.G72 r6 = X.AbstractC9205G6l.A0c
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L4b
            java.util.ArrayList r0 = X.C3cG.A0h()
        L10:
            if (r9 >= r10) goto L40
            java.lang.CharSequence r5 = r7.A00
            r4 = r9
            r3 = 10
            int r2 = r10 + (-1)
            if (r9 > r2) goto L40
        L1b:
            char r1 = r5.charAt(r4)
            if (r1 != r3) goto L3b
            r1 = -1
            if (r4 == r1) goto L40
            if (r4 <= r9) goto L2e
            X.G6Q r1 = new X.G6Q
            r1.<init>(r6, r9, r4)
            r0.add(r1)
        L2e:
            X.G72 r2 = X.AbstractC9205G6l.A0E
            int r9 = r4 + 1
            X.G6Q r1 = new X.G6Q
            r1.<init>(r2, r4, r9)
            r0.add(r1)
            goto L10
        L3b:
            if (r4 == r2) goto L40
            int r4 = r4 + 1
            goto L1b
        L40:
            if (r10 <= r9) goto L4a
            X.G6Q r1 = new X.G6Q
            r1.<init>(r6, r9, r10)
            r0.add(r1)
        L4a:
            return r0
        L4b:
            X.G6Q r0 = new X.G6Q
            r0.<init>(r8, r9, r10)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G6Z.A02(X.G72, int, int):java.util.List");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G72;Ljava/util/List<+LX/G65;>;)LX/G6B; */
    public static final G6B A00(List list, G72 g72) {
        if (g72.equals(AbstractC9206G6m.A0T) || g72.equals(AbstractC9206G6m.A0N)) {
            return new G6Y(list, g72);
        }
        G72 g722 = AbstractC9206G6m.A0L;
        return g72.equals(g722) ? new G6X(list, g722) : new G6B(list, g72);
    }

    public G6Z(CharSequence charSequence, CancellationToken cancellationToken) {
        this.A00 = charSequence;
        this.A01 = cancellationToken;
    }
}
