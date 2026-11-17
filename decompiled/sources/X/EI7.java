package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class EI7 implements EJV {
    public final EI3 A00;

    public EI7(EI3 ei3) {
        C7384Etj.A0Y(ei3, 0);
        this.A00 = ei3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
    
        if (r4.equals(r0) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0117, code lost:
    
        if (r4.equals("PRA") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0119, code lost:
    
        r4 = new X.EI6(r2, r11);
        r4.A02 = new int[0];
        r4.A03 = new long[0];
        r4.A01 = new double[0];
        r4.A04 = new java.lang.String[0];
        r4.A05 = new byte[0][];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    @Override // X.EJV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EIK AYO(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EI7.AYO(java.lang.String):X.EIK");
    }

    @Override // X.EJV
    public final boolean ANT() {
        return ((EHO) this.A00).A00.inTransaction();
    }

    @Override // X.EJV, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00.close();
    }
}
