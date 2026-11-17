package com.facebook.aura.localbrowser;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class LocalBrowserCpuHoldKt {
    public static final long WAKE_LOCK_RENEW_MS = 300000;
    public static final String WAKE_LOCK_TAG = "Muse:LocalBrowserTask";
    public static final long WAKE_LOCK_TIMEOUT_MS = 600000;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt", f = "LocalBrowserCpuHold.kt", l = {15, 20}, m = "holdCpuAwake", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt$holdCpuAwake$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserCpuHoldKt.holdCpuAwake(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object holdCpuAwake(com.facebook.aura.localbrowser.LocalBrowserUsageMeter r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt.AnonymousClass1
            if (r0 == 0) goto L29
            r4 = r8
            com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt$holdCpuAwake$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L38
            if (r0 == r5) goto L88
            if (r0 != r6) goto L33
            java.lang.Object r2 = r4.L$1
            android.os.PowerManager$WakeLock r2 = (android.os.PowerManager.WakeLock) r2
            java.lang.Object r7 = r4.L$0
            com.facebook.aura.localbrowser.LocalBrowserUsageMeter r7 = (com.facebook.aura.localbrowser.LocalBrowserUsageMeter) r7
            goto L2f
        L29:
            com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt$holdCpuAwake$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt$holdCpuAwake$1
            r4.<init>(r8)
            goto L12
        L2f:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L6e
            goto L58
        L33:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L38:
            X.Hwg.A00(r1)
            android.content.Context r1 = X.C3cG.A06()
            java.lang.Class<android.os.PowerManager> r0 = android.os.PowerManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            if (r1 == 0) goto L7c
            java.lang.String r0 = "Muse:LocalBrowserTask"
            android.os.PowerManager$WakeLock r2 = r1.newWakeLock(r5, r0)
            if (r2 == 0) goto L7c
            r0 = 0
            r2.setReferenceCounted(r0)
            r7.start()
        L58:
            r0 = 600000(0x927c0, double:2.964394E-318)
            r2.acquire(r0)     // Catch: java.lang.Throwable -> L6e
            r4.L$0 = r7     // Catch: java.lang.Throwable -> L6e
            r4.L$1 = r2     // Catch: java.lang.Throwable -> L6e
            r4.label = r6     // Catch: java.lang.Throwable -> L6e
            r0 = 300000(0x493e0, double:1.482197E-318)
            java.lang.Object r0 = X.C7Bq.A01(r0, r4)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r3) goto L58
            return r3
        L6e:
            r1 = move-exception
            boolean r0 = r2.isHeld()
            if (r0 == 0) goto L78
            r2.release()
        L78:
            r7.stop()
            throw r1
        L7c:
            r0 = 0
            r4.L$0 = r0
            r4.label = r5
            X.Hji r0 = X.C7Bq.A02(r4)
            if (r0 != r3) goto L8b
            return r3
        L88:
            X.Hwg.A00(r1)
        L8b:
            kotlin.KotlinNothingValueException r1 = X.C3cG.A0p()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserCpuHoldKt.holdCpuAwake(com.facebook.aura.localbrowser.LocalBrowserUsageMeter, X.HtJ):java.lang.Object");
    }
}
