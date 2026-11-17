package X;

import java.io.File;

/* renamed from: X.Efm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7086Efm implements Eg4 {
    public boolean A00;
    public final /* synthetic */ C7083Efj A01;

    public C7086Efm(C7083Efj c7083Efj) {
        this.A01 = c7083Efj;
    }

    @Override // X.Eg4
    public final void AYG(File file) {
        C7083Efj c7083Efj = this.A01;
        if (!c7083Efj.A01.equals(file) && !this.A00) {
            C7384Etj.A0X(file);
            file.delete();
        }
        if (this.A00 && C7384Etj.areEqual(file, c7083Efj.A02)) {
            this.A00 = false;
        }
    }

    @Override // X.Eg4
    public final void AYI(File file) {
        if (this.A00 || !C7384Etj.areEqual(file, this.A01.A02)) {
            return;
        }
        this.A00 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[PHI: r5
  0x0034: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v2 java.lang.String) binds: [B:7:0x002a, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // X.Eg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AiK(java.io.File r9) {
        /*
            r8 = this;
            boolean r0 = r8.A00
            if (r0 == 0) goto L7f
            X.Efj r3 = r8.A01
            X.C7384Etj.A0X(r9)
            r6 = 0
            java.lang.String r8 = r9.getName()
            X.C7384Etj.A0X(r8)
            r7 = 46
            int r0 = r8.length()
            int r0 = r0 + (-1)
            int r2 = X.C7BY.A09(r8, r7, r0)
            if (r2 <= 0) goto L7f
            java.lang.String r1 = r8.substring(r2)
            java.lang.String r5 = ".cnt"
            r4 = r5
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L34
            java.lang.String r5 = ".tmp"
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L7f
        L34:
            java.lang.String r1 = r8.substring(r6, r2)
            java.lang.String r2 = ".tmp"
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L50
            int r0 = r1.length()
            int r0 = r0 + (-1)
            int r0 = X.C7BY.A09(r1, r7, r0)
            if (r0 <= 0) goto L7f
            java.lang.String r1 = r1.substring(r6, r0)
        L50:
            java.lang.String r0 = X.C7083Efj.A00(r3, r1)
            java.io.File r1 = X.BV4.A0G(r0)
            java.io.File r0 = r9.getParentFile()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7f
            r0 = 0
            if (r5 != r2) goto L78
            long r4 = r9.lastModified()
            X.F0o r0 = r3.A00
            long r2 = r0.now()
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7f
            return
        L78:
            if (r5 != r4) goto L7b
            r0 = 1
        L7b:
            X.CVn.A03(r0)
            return
        L7f:
            X.C7384Etj.A0X(r9)
            r9.delete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7086Efm.AiK(java.io.File):void");
    }
}
