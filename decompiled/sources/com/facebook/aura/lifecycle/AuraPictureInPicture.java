package com.facebook.aura.lifecycle;

import X.AnonymousClass005;
import android.app.Activity;
import android.app.PictureInPictureParams;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class AuraPictureInPicture {
    public static final AuraPictureInPicture INSTANCE = new AuraPictureInPicture();
    public static final long OUTBOUND_LAUNCH_PAUSE_WINDOW_MS = 1000;
    public static WeakReference<Activity> armedActivity;
    public static WeakReference<Object> armedOwner;
    public static boolean armedSkipsOutboundLaunch;
    public static long outboundLaunchAtMs;

    public final synchronized void arm(Object obj, Activity activity, PictureInPictureParams pictureInPictureParams, boolean z) {
        AnonymousClass005.A0x(obj, activity, pictureInPictureParams);
        activity.setPictureInPictureParams(pictureInPictureParams);
        armedOwner = new WeakReference<>(obj);
        armedActivity = new WeakReference<>(activity);
        armedSkipsOutboundLaunch = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean consumeOutboundLaunch() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r1 = com.facebook.aura.lifecycle.AuraPictureInPicture.outboundLaunchAtMs     // Catch: java.lang.Throwable -> L19
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L14
            long r4 = X.C3cG.A04(r1)     // Catch: java.lang.Throwable -> L19
            r2 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L15
        L14:
            r0 = 0
        L15:
            com.facebook.aura.lifecycle.AuraPictureInPicture.outboundLaunchAtMs = r6     // Catch: java.lang.Throwable -> L19
            monitor-exit(r8)
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.lifecycle.AuraPictureInPicture.consumeOutboundLaunch():boolean");
    }

    public final synchronized void disarm(Object obj, Activity activity, PictureInPictureParams pictureInPictureParams) {
        AnonymousClass005.A10(obj, activity, pictureInPictureParams);
        activity.setPictureInPictureParams(pictureInPictureParams);
        WeakReference<Object> weakReference = armedOwner;
        if (weakReference != null && weakReference.get() == obj) {
            armedOwner = null;
            armedActivity = null;
            armedSkipsOutboundLaunch = false;
        }
    }

    public final synchronized void markOutboundLaunch() {
        outboundLaunchAtMs = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean skipsOutboundLaunch(android.app.Activity r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)     // Catch: java.lang.Throwable -> L19
            boolean r0 = com.facebook.aura.lifecycle.AuraPictureInPicture.armedSkipsOutboundLaunch     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L16
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.facebook.aura.lifecycle.AuraPictureInPicture.armedActivity     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L16
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L19
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Throwable -> L19
            r0 = 1
            if (r1 == r3) goto L17
        L16:
            r0 = 0
        L17:
            monitor-exit(r2)
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.lifecycle.AuraPictureInPicture.skipsOutboundLaunch(android.app.Activity):boolean");
    }
}
