package X;

/* renamed from: X.HCx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10373HCx {
    public final /* synthetic */ HDB A00;
    public final /* synthetic */ HD4 A01;
    public final /* synthetic */ C10367HCr A02;
    public final /* synthetic */ C10365HCn A03;

    public C10373HCx(HDB hdb, HD4 hd4, C10367HCr c10367HCr, C10365HCn c10365HCn) {
        this.A01 = hd4;
        this.A02 = c10367HCr;
        this.A03 = c10365HCn;
        this.A00 = hdb;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Throwable r7) {
        /*
            r6 = this;
            X.HD4 r0 = r6.A01
            java.lang.String r2 = r7.getMessage()
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r0.A01
            r4 = 536546360(0x1ffb0c38, float:1.0632285E-19)
            int r3 = r0.A00
            java.lang.String r0 = "finish_login_network_end"
            r5.markerPoint(r4, r3, r0)
            java.lang.String r1 = "finish_login_network_call_error"
            r5.markerPoint(r4, r3, r1)
            java.lang.String r0 = "failure_type"
            r5.markerAnnotate(r4, r3, r0, r1)
            java.lang.String r0 = "failure_reason"
            r5.markerAnnotate(r4, r3, r0, r2)
            boolean r0 = r7 instanceof com.meta.vesta.loginclient.VestaLoginException
            if (r0 == 0) goto L55
            r2 = r7
            com.meta.vesta.loginclient.VestaLoginException r2 = (com.meta.vesta.loginclient.VestaLoginException) r2
            java.lang.Integer r0 = r2.vestaErrorCode
            if (r0 == 0) goto L3a
            int r1 = r0.intValue()
            java.lang.String r0 = "vesta_service_error_code"
            r5.markerAnnotate(r4, r3, r0, r1)
            java.lang.String r0 = "vesta_service_error"
            r5.markerPoint(r4, r3, r0)
        L3a:
            java.lang.Integer r0 = r2.vestaErrorCode
            if (r0 != 0) goto L42
            boolean r0 = r2.isVestaServerError
            if (r0 == 0) goto L55
        L42:
            X.HCn r3 = r6.A03
            X.HD2 r0 = X.HD2.A09
            com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException r2 = new com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException
            r2.<init>(r0, r7)
            X.HCr r0 = r6.A02
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = r0.A01
        L51:
            r3.A01(r2, r1, r0)
            return
        L55:
            X.HCn r3 = r6.A03
            X.HD2 r0 = X.HD2.A06
            com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException r2 = new com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException
            r2.<init>(r0, r7)
            X.HCr r0 = r6.A02
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = r0.A01
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10373HCx.A00(java.lang.Throwable):void");
    }
}
