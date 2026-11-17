package X;

import com.instagram.common.lispy.lexer.LispyParserException;
import java.io.StringReader;
import java.util.List;

/* loaded from: classes6.dex */
public final class FDG implements HsM {
    public final FDS A00;
    public final FDK A01;
    public final Integer A02;
    public final List<Object> A03;

    public FDG(F9H f9h, C7648F8p c7648F8p, Integer num, String str) {
        FDS fds = new FDS();
        fds.A00 = new FDI(fds, null, str, false);
        this(fds, (c7648F8p == null && f9h == null) ? null : new FDK(f9h, c7648F8p), num, (List) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r4 == r3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.FDG A00(X.F9H r6, X.C7648F8p r7) {
        /*
            r5 = this;
            X.FDK r3 = r5.A01
            if (r3 == 0) goto L1f
            X.F9H r2 = r3.A00
            r1 = r2
            if (r6 == 0) goto Lf
            if (r2 == 0) goto Lf
            X.F9H r2 = r2.AQ2(r6)
        Lf:
            X.F8p r0 = r3.A01
            if (r7 != r0) goto L19
            if (r2 != r1) goto L19
            r4 = r3
        L16:
            if (r4 != r3) goto L27
        L18:
            return r5
        L19:
            X.FDK r4 = new X.FDK
            r4.<init>(r2, r7)
            goto L16
        L1f:
            r0 = 0
            if (r7 == 0) goto L18
            X.FDK r4 = new X.FDK
            r4.<init>(r0, r7)
        L27:
            X.FDS r3 = r5.A00
            java.util.List<java.lang.Object> r2 = r5.A03
            java.lang.Integer r1 = r5.A02
            X.FDG r0 = new X.FDG
            r0.<init>(r3, r4, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDG.A00(X.F9H, X.F8p):X.FDG");
    }

    public final void A01() {
        FDS fds = this.A00;
        FDI fdi = fds.A00;
        if (fdi.A02) {
            return;
        }
        String str = fdi.A01;
        C7384Etj.A0Y(str, 0);
        try {
            fds.A00 = new FDI(fdi.A03, C6808EaM.A00(C6808EaM.A00, new C6807EaL(new StringReader(str))), null, true);
        } catch (Exception e) {
            throw new LispyParserException(e);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FDS;LX/FDK;Ljava/util/List<Ljava/lang/Object;>;Ljava/lang/Integer;)V */
    public FDG(FDS fds, FDK fdk, Integer num, List list) {
        this.A00 = fds;
        this.A01 = fdk;
        this.A03 = (list == null || list.isEmpty()) ? null : list;
        this.A02 = num;
    }
}
