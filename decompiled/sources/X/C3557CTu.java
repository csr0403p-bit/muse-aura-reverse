package X;

import java.util.Arrays;

/* renamed from: X.CTu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3557CTu {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3557CTu)) {
            return false;
        }
        C3557CTu c3557CTu = (C3557CTu) obj;
        if (CS7.A01(this.A00, c3557CTu.A00) && CS7.A01(this.A02, c3557CTu.A02) && CS7.A01(this.A03, c3557CTu.A03) && CS7.A01(this.A04, c3557CTu.A04) && CS7.A01(this.A01, c3557CTu.A01) && CS7.A01(this.A06, c3557CTu.A06)) {
            return CS7.A00(this.A05, c3557CTu.A05);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A04, this.A01, this.A06, this.A05});
    }

    public final String toString() {
        C7392EuT c7392EuT = new C7392EuT(this);
        c7392EuT.A00(this.A00, "applicationId");
        c7392EuT.A00(this.A02, "apiKey");
        c7392EuT.A00(this.A03, "databaseUrl");
        c7392EuT.A00(this.A01, "gcmSenderId");
        c7392EuT.A00(this.A06, "storageBucket");
        c7392EuT.A00(this.A05, "projectId");
        return c7392EuT.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3557CTu(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto Lc
            boolean r1 = X.C60Q.A1V(r3)
            r0 = 0
            if (r1 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.CRy.A09(r1, r0)
            r2.A00 = r3
            r2.A02 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A01 = r7
            r2.A06 = r8
            r2.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3557CTu.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
