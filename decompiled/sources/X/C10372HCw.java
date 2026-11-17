package X;

/* renamed from: X.HCw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10372HCw {
    public final /* synthetic */ HD4 A00;
    public final /* synthetic */ C10367HCr A01;
    public final /* synthetic */ C10365HCn A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C10543Hqv<byte[]> A04;
    public final /* synthetic */ byte[] A05;
    public final /* synthetic */ byte[] A06;

    public C10372HCw(HD4 hd4, C10367HCr c10367HCr, C10365HCn c10365HCn, String str, C10543Hqv c10543Hqv, byte[] bArr, byte[] bArr2) {
        this.A00 = hd4;
        this.A01 = c10367HCr;
        this.A02 = c10365HCn;
        this.A06 = bArr;
        this.A04 = c10543Hqv;
        this.A03 = str;
        this.A05 = bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Throwable r10) {
        /*
            r9 = this;
            X.HD4 r0 = r9.A00
            java.lang.String r2 = r10.getMessage()
            com.facebook.quicklog.LightweightQuickPerformanceLogger r7 = r0.A01
            r6 = 536546360(0x1ffb0c38, float:1.0632285E-19)
            int r5 = r0.A00
            java.lang.String r1 = "init_and_begin_login_network_call_error"
            r7.markerPoint(r6, r5, r1)
            java.lang.String r0 = "failure_type"
            r7.markerAnnotate(r6, r5, r0, r1)
            java.lang.String r0 = "failure_reason"
            r7.markerAnnotate(r6, r5, r0, r2)
            boolean r0 = r10 instanceof com.meta.vesta.loginclient.VestaLoginException
            if (r0 == 0) goto L7c
            r8 = r10
            com.meta.vesta.loginclient.VestaLoginException r8 = (com.meta.vesta.loginclient.VestaLoginException) r8
            java.lang.Integer r0 = r8.vestaErrorCode
            if (r0 == 0) goto L68
            int r1 = r0.intValue()
            java.lang.String r0 = "vesta_service_error_code"
            r7.markerAnnotate(r6, r5, r0, r1)
            java.lang.String r0 = "vesta_service_error"
            r7.markerPoint(r6, r5, r0)
            java.lang.Integer r4 = r8.attemptsRemaining
            if (r4 == 0) goto L55
            X.HCr r3 = r9.A01
            int r2 = r4.intValue()
            java.lang.Integer r0 = r8.loginTimeoutRemainingSecs
            if (r0 == 0) goto L55
            int r1 = r0.intValue()
            r3.A00 = r4
            r3.A01 = r0
            java.lang.String r0 = "attempts_remaining"
            r7.markerAnnotate(r6, r5, r0, r2)
            java.lang.String r0 = "backoff_seconds"
            r7.markerAnnotate(r6, r5, r0, r1)
        L55:
            X.HCn r3 = r9.A02
            X.HD2 r0 = X.HD2.A09
            com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException r2 = new com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException
            r2.<init>(r0, r10)
            X.HCr r0 = r9.A01
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = r0.A01
        L64:
            r3.A01(r2, r1, r0)
            return
        L68:
            boolean r0 = r8.isVestaServerError
            if (r0 == 0) goto L7c
            X.HCn r3 = r9.A02
            X.HD2 r0 = X.HD2.A09
            com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException r2 = new com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException
            r2.<init>(r0, r10)
            X.HCr r0 = r9.A01
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = r0.A01
            goto L64
        L7c:
            X.HCn r3 = r9.A02
            X.HD2 r0 = X.HD2.A06
            com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException r2 = new com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException
            r2.<init>(r0, r10)
            X.HCr r0 = r9.A01
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = r0.A01
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10372HCw.A00(java.lang.Throwable):void");
    }
}
