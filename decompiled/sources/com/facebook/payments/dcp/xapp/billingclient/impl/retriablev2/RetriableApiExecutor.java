package com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2;

import X.AnonymousClass007;
import X.C3cG;
import X.C9699Ge6;
import X.C9jH;
import X.HxE;
import java.util.Map;

/* loaded from: classes6.dex */
public final class RetriableApiExecutor {
    public final C9699Ge6 A00;
    public final CoroutineConnectionManager A01;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:15:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0087 -> B:15:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r10, X.InterfaceC9730Gej r11, java.lang.String r12, X.HtJ r13) throws java.lang.Throwable {
        /*
            r7 = 1
            boolean r0 = r13 instanceof X.C8iV
            if (r0 == 0) goto L8a
            r6 = r13
            X.8iV r6 = (X.C8iV) r6
            int r0 = r6.$t
            if (r0 != r7) goto L8a
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A05
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L2d
            if (r0 == r7) goto L48
            if (r0 != r5) goto L90
            java.lang.Object r12 = r6.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r6.A02
            X.Gej r11 = (X.InterfaceC9730Gej) r11
        L2d:
            X.Hwg.A00(r1)
        L30:
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.CoroutineConnectionManager r1 = r10.A01
            r0 = 0
            X.C7384Etj.A0Y(r12, r0)
            r1.A00 = r12
            r6.A02 = r11
            r6.A03 = r12
            r0 = 0
            r6.A04 = r0
            r6.A00 = r7
            java.lang.Object r1 = r1.A00(r6)
            if (r1 != r8) goto L53
            return r8
        L48:
            java.lang.Object r12 = r6.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r6.A02
            X.Gej r11 = (X.InterfaceC9730Gej) r11
            X.Hwg.A00(r1)
        L53:
            X.HoG r1 = (X.InterfaceC10512HoG) r1
            X.GeK r1 = r1.AJk()
            X.GeK r0 = X.EnumC9706GeK.A0H
            if (r1 == r0) goto L96
            java.util.Set<X.GeK> r0 = X.AbstractC9727Gef.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L95
            boolean r0 = r11.A7B()
            if (r0 == 0) goto L95
            long r1 = r11.AFQ()
            r11.AZk()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L30
            r6.A02 = r11
            r6.A03 = r12
            r0 = 0
            r6.A04 = r0
            r6.A01 = r1
            r6.A00 = r5
            java.lang.Object r0 = X.C7Bq.A01(r1, r6)
            if (r0 != r8) goto L30
            return r8
        L8a:
            X.8iV r6 = new X.8iV
            r6.<init>(r10, r13, r7)
            goto L17
        L90:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L95:
            r9 = 0
        L96:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A01(com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor, X.Gej, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0160, code lost:
    
        if (r1.A7B() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016e, code lost:
    
        if (r1.A7B() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
    
        if (r5.A00(r10) != r14) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x015b, B:47:0x0162], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:47:0x0162, B:53:0x0170], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:53:0x0170, B:51:0x0169], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:53:0x0170, B:61:0x01d4], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:9:0x0030, B:20:0x004d], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d A[PHI: r0 r1 r3 r5 r6 r7 r8 r9 r11 r12
  0x012d: PHI (r0v8 java.lang.Long) = (r0v10 java.lang.Long), (r0v16 java.lang.Long) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r1v2 X.Gej) = (r1v3 X.Gej), (r1v8 X.Gej) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r3v2 java.util.Map<java.lang.String, java.lang.String>) = (r3v9 java.util.Map<java.lang.String, java.lang.String>), (r3v12 java.util.Map<java.lang.String, java.lang.String>) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r5v4 java.lang.Object) = (r5v14 java.lang.Object), (r5v0 java.lang.Object) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r6v2 X.Geq) = (r6v3 X.Geq), (r6v8 X.Geq) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r7v2 java.lang.String) = (r7v3 java.lang.String), (r7v8 java.lang.String) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r8v2 X.G0U) = (r8v3 X.G0U), (r8v8 X.G0U) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r9v5 int) = (r9v16 int), (r9v17 int) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r11v2 boolean) = (r11v4 boolean), (r11v7 boolean) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r12v1 long) = (r12v3 long), (r12v5 long) binds: [B:36:0x0109, B:38:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ab -> B:35:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C9737Geq r22, com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor r23, X.InterfaceC9730Gej r24, java.lang.String r25, X.HtJ r26, X.G0U r27, boolean r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor.A00(X.Geq, com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor, X.Gej, java.lang.String, X.HtJ, X.G0U, boolean):java.lang.Object");
    }

    public static final Map<String, String> A02(Long l) {
        if (l == null) {
            return C9jH.A00;
        }
        HxE hxEA0r = C3cG.A0r("billing_client_post_disconnect_call", "true");
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        return AnonymousClass007.A0d("billing_client_post_disconnect_latency_ms", String.valueOf(jCurrentTimeMillis), hxEA0r);
    }

    public RetriableApiExecutor(C9699Ge6 c9699Ge6, CoroutineConnectionManager coroutineConnectionManager) {
        this.A01 = coroutineConnectionManager;
        this.A00 = c9699Ge6;
    }
}
