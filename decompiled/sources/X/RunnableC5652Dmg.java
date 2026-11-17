package X;

/* renamed from: X.Dmg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5652Dmg implements Runnable {
    public static final String __redex_internal_original_name = "BlackscreenDetector$runnable$1";
    public final /* synthetic */ C5720DoF A00;

    public RunnableC5652Dmg(C5720DoF c5720DoF) {
        this.A00 = c5720DoF;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            X.DoF r5 = r11.A00
            long r6 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r5)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r4 = r5.A02     // Catch: java.lang.Throwable -> La9
            long r8 = r4.blackscreenNoSampleThresholdMs     // Catch: java.lang.Throwable -> La9
            long r1 = r5.A04     // Catch: java.lang.Throwable -> La9
            r10 = -1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L24
            long r10 = r5.A04     // Catch: java.lang.Throwable -> La9
            long r1 = r6 - r10
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L24
            long r0 = r5.A05     // Catch: java.lang.Throwable -> La9
            long r2 = r6 - r0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L25
        L24:
            r0 = 0
        L25:
            monitor-exit(r5)
            if (r0 == 0) goto L90
            java.lang.String r10 = "BackscreenDetector"
            long r0 = r5.A05
            long r8 = r6 - r0
            long r0 = r5.A04
            long r6 = r6 - r0
            long r3 = r5.A04
            long r1 = r5.A05
            java.lang.String r0 = "detected blackscreen. Last frame ms: "
            java.lang.StringBuilder r8 = X.C60O.A0z(r0, r8)
            java.lang.String r0 = " Last Starting Playing Ms: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = " lastStartedPlayingTimeMs: "
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = " mLastSurfaceUpdateTimeMs: "
            java.lang.String r0 = X.BV7.A0z(r0, r8, r1)
            X.CFK.A06(r10, r0)
            X.DtX r0 = r5.A01
            X.DmA r4 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0X
            r1 = 1
            r0.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0W
            r0.set(r1)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r4.A0Q
            X.Dlv r0 = r1.gen
            boolean r0 = r0.notify_black_screen_warning
            if (r0 != 0) goto L8f
            boolean r0 = r1.fixBlackscreenByRecreatingSurface
            if (r0 == 0) goto L8f
            android.view.View r2 = r4.A02
            if (r2 == 0) goto L8f
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8f
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r2)
            r1.addView(r2)
            android.os.Handler r3 = X.C5627DmA.A1B
            X.DsK r2 = new X.DsK
            r2.<init>(r4)
            r0 = 200(0xc8, double:9.9E-322)
        L8c:
            r3.postDelayed(r2, r0)
        L8f:
            return
        L90:
            boolean r0 = r4.blackscreenDetectOnce
            if (r0 != 0) goto L8f
            boolean r0 = r4.enableBlackscreenDetector
            if (r0 != 0) goto L9f
            X.Dlv r0 = r4.gen
            boolean r0 = r0.enable_blackscreen_detector
            if (r0 != 0) goto L9f
            return
        L9f:
            android.os.Handler r3 = r5.A00
            java.lang.Runnable r2 = r5.A03
            r3.removeCallbacks(r2)
            long r0 = r4.blackscreenSampleIntervalMs
            goto L8c
        La9:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC5652Dmg.run():void");
    }
}
