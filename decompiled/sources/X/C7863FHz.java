package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.FHz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7863FHz {
    public final LightweightQuickPerformanceLogger A03;
    public final F8H A02 = HuE.A05.A00();
    public final DKe A01 = new C7644F8j();
    public final HrW A00 = C7723FBz.A00;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.DKY A00(X.C7863FHz r23, int r24, int r25, long r26) {
        /*
            r3 = r23
            r21 = r26
            X.HrW r12 = r3.A00
            long r19 = r12.now()
            X.Hmm r0 = X.Hmm.A03
            java.util.concurrent.atomic.AtomicLong r0 = r0.A02
            long r10 = r0.get()
            long r8 = r0.get()
            r6 = 2001(0x7d1, double:9.886E-321)
            r4 = 0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L65
            long r1 = r19 - r10
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L65
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L65
        L28:
            r4 = -1
            r2 = 0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L61
            long r6 = r19 - r26
            r4 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5f
            long r21 = r19 - r4
            r1 = 1
            r2 = 1
        L3b:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r15 = r3.A03
            X.C7384Etj.A0X(r15)
            X.F8H r14 = r3.A02
            X.DKe r13 = r3.A01
            r16 = 0
            r23 = 1
            X.DKY r11 = new X.DKY
            r17 = r24
            r18 = r25
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r23)
            java.lang.String r0 = "using_backup_start_time"
            r11.AQG(r0, r1)
            java.lang.String r0 = "using_capped_backup_start_time"
            r11.AQG(r0, r2)
            r14.A37(r11)
            return r11
        L5f:
            r1 = 1
            goto L3b
        L61:
            r21 = r10
            r1 = 0
            goto L3b
        L65:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L75
            long r1 = r19 - r8
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L75
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L75
        L73:
            r10 = r8
            goto L28
        L75:
            r8 = -1
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7863FHz.A00(X.FHz, int, int, long):X.DKY");
    }

    public C7863FHz(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A03 = lightweightQuickPerformanceLogger;
    }
}
