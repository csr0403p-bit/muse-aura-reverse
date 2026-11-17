package X;

import com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException;

/* renamed from: X.HCn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10365HCn {
    public final /* synthetic */ ACv<Hrl> A00;
    public final /* synthetic */ HD4 A01;
    public final /* synthetic */ C10371HCv A02;

    public C10365HCn(ACv aCv, HD4 hd4, C10371HCv c10371HCv) {
        this.A01 = hd4;
        this.A00 = aCv;
        this.A02 = c10371HCv;
    }

    public static void A00(HD2 hd2, C10367HCr c10367HCr, C10365HCn c10365HCn, String str) {
        c10365HCn.A01(new BackupException(hd2, new Throwable(str)), c10367HCr.A00, c10367HCr.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException r7, java.lang.Integer r8, java.lang.Integer r9) {
        /*
            r6 = this;
            java.lang.Throwable r1 = r7.failureReason
            boolean r0 = r1 instanceof com.meta.vesta.loginclient.VestaLoginException
            if (r0 == 0) goto L5d
            com.meta.vesta.loginclient.VestaLoginException r1 = (com.meta.vesta.loginclient.VestaLoginException) r1
            java.lang.Integer r0 = r1.vestaErrorCode
            if (r0 == 0) goto L5d
            int r1 = r0.intValue()
            X.HCk r0 = X.EnumC10363HCk.A02
            int r0 = r0.value
            if (r1 != r0) goto L48
            X.HCl r5 = X.EnumC10364HCl.A09
        L18:
            X.HD4 r0 = r6.A01
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = r0.A01
            r3 = 536546360(0x1ffb0c38, float:1.0632285E-19)
            int r2 = r0.A00
            java.lang.String r1 = r5.loggingName
            if (r1 != 0) goto L27
            java.lang.String r1 = "MISSING_ERROR_CODE"
        L27:
            java.lang.String r0 = "error_code"
            r4.markerAnnotate(r3, r2, r0, r1)
            X.HCl r0 = X.EnumC10364HCl.A08
            if (r5 == r0) goto L39
            X.HCl r0 = X.EnumC10364HCl.A05
            if (r5 == r0) goto L39
            X.HCl r1 = X.EnumC10364HCl.A03
            r0 = 3
            if (r5 != r1) goto L3a
        L39:
            r0 = 2
        L3a:
            r4.markerEnd(r3, r2, r0)
            X.ACv<X.Hrl> r1 = r6.A00
            X.ADB r0 = new X.ADB
            r0.<init>(r5, r8, r9)
            r1.A00(r0)
            return
        L48:
            X.HCk r0 = X.EnumC10363HCk.A03
            int r0 = r0.value
            if (r1 == r0) goto L7b
            X.HCk r0 = X.EnumC10363HCk.A04
            int r0 = r0.value
            if (r1 == r0) goto L75
            X.HCk r0 = X.EnumC10363HCk.A05
            int r0 = r0.value
            if (r1 != r0) goto L72
            X.HCl r5 = X.EnumC10364HCl.A08
            goto L18
        L5d:
            X.HD2 r0 = r7.exceptionType
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L7e
            r0 = 9
            if (r1 == r0) goto L7b
            r0 = 8
            if (r1 == r0) goto L78
            r0 = 13
            if (r1 == r0) goto L75
        L72:
            X.HCl r5 = X.EnumC10364HCl.A06
            goto L18
        L75:
            X.HCl r5 = X.EnumC10364HCl.A03
            goto L18
        L78:
            X.HCl r5 = X.EnumC10364HCl.A04
            goto L18
        L7b:
            X.HCl r5 = X.EnumC10364HCl.A07
            goto L18
        L7e:
            X.HCl r5 = X.EnumC10364HCl.A05
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10365HCn.A01(com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException, java.lang.Integer, java.lang.Integer):void");
    }
}
