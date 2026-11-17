package com.facebook.aura.browsertask.control;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public abstract class BrowserTaskStopKt {
    public static final String ERROR_STOP_CLEANUP_PENDING = "browser_stop_cleanup_pending";
    public static final String ERROR_STOP_SETTLING = "browser_stop_owner_settling";
    public static final String ERROR_STOP_UNCONFIRMED = "browser_stop_outcome_unconfirmed";
    public static final int HTTP_CONFLICT = 409;
    public static final int HTTP_OK = 200;
    public static final int HTTP_SERVICE_UNAVAILABLE = 503;
    public static final int STOP_MAX_RETRIES = 3;
    public static final long STOP_RETRY_DELAY_MS = 1000;

    @DebugMetadata(c = "com.facebook.aura.browsertask.control.BrowserTaskStopKt", f = "BrowserTaskStop.kt", l = {21, 32}, m = "stopWithRetry", v = 2)
    /* renamed from: com.facebook.aura.browsertask.control.BrowserTaskStopKt$stopWithRetry$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrowserTaskStopKt.stopWithRetry(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a2 -> B:12:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object stopWithRetry(com.facebook.aura.browsertask.control.BrowserTaskControlTransport r9, java.lang.String r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            boolean r0 = r11 instanceof com.facebook.aura.browsertask.control.BrowserTaskStopKt.AnonymousClass1
            if (r0 == 0) goto Laa
            r6 = r11
            com.facebook.aura.browsertask.control.BrowserTaskStopKt$stopWithRetry$1 r6 = (com.facebook.aura.browsertask.control.BrowserTaskStopKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto La5
            if (r0 == r3) goto L41
            if (r0 != r5) goto Lb1
            int r2 = r6.I$0
            java.lang.Object r10 = r6.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r6.L$0
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport r9 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport) r9
            X.Hwg.A00(r1)
        L2e:
            r6.L$0 = r9
            r6.L$1 = r10
            r6.L$2 = r4
            r6.L$3 = r4
            r6.I$0 = r2
            r6.label = r3
            java.lang.Object r1 = r9.m298stopgIAlus(r10, r6)
            if (r1 != r7) goto L4f
            return r7
        L41:
            int r2 = r6.I$0
            java.lang.Object r10 = r6.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r6.L$0
            com.facebook.aura.browsertask.control.BrowserTaskControlTransport r9 = (com.facebook.aura.browsertask.control.BrowserTaskControlTransport) r9
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L4f:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 != 0) goto Lb7
            java.lang.Throwable r8 = X.HsJ.A00(r1)
            boolean r0 = r8 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto Lb6
            com.facebook.aura.json.NetworkException r8 = (com.facebook.aura.json.NetworkException) r8
            if (r8 == 0) goto Lb6
            int r1 = r8.httpResponseCode
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto Lb7
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto Lb7
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 != r0) goto Lb6
            java.lang.String r1 = r8.errorCode
            java.lang.String r0 = "browser_stop_outcome_unconfirmed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L89
            java.lang.String r0 = "browser_stop_owner_settling"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L89
            java.lang.String r0 = "browser_stop_cleanup_pending"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb6
        L89:
            r0 = 3
            if (r2 >= r0) goto Lb6
            int r2 = r2 + 1
            r6.L$0 = r9
            r6.L$1 = r10
            r6.L$2 = r4
            r6.L$3 = r4
            r6.I$0 = r2
            r6.I$1 = r3
            r6.label = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r6)
            if (r0 != r7) goto L2e
            return r7
        La5:
            X.Hwg.A00(r1)
            r2 = 0
            goto L2e
        Laa:
            com.facebook.aura.browsertask.control.BrowserTaskStopKt$stopWithRetry$1 r6 = new com.facebook.aura.browsertask.control.BrowserTaskStopKt$stopWithRetry$1
            r6.<init>(r11)
            goto L12
        Lb1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb6:
            r3 = 0
        Lb7:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.control.BrowserTaskStopKt.stopWithRetry(com.facebook.aura.browsertask.control.BrowserTaskControlTransport, java.lang.String, X.HtJ):java.lang.Object");
    }
}
