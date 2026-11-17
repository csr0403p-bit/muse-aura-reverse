package com.facebook.aura.main;

import X.C06H;
import X.C7384Etj;
import X.CFK;
import android.app.Activity;
import android.os.Build;
import android.util.Rational;
import com.facebook.aura.main.api.MainWindowPictureInPicture;
import com.facebook.aura.main.api.MainWindowPipRequest;

/* loaded from: classes.dex */
public final class MainWindowPipController {
    public static final int $stable = 8;

    @Deprecated
    public static final String TAG = "MainWindowPip";
    public final Activity activity;
    public MainWindowPipRequest applied;
    public MainWindowPictureInPicture owner;
    public static final Companion Companion = new Companion();
    public static final Rational MIN_RATIO = new Rational(100, 239);
    public static final Rational MAX_RATIO = new Rational(239, 100);

    public final class Companion {
        public final Rational getMAX_RATIO() {
            return MainWindowPipController.MAX_RATIO;
        }

        public final Rational getMIN_RATIO() {
            return MainWindowPipController.MIN_RATIO;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MainWindowPipController(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        this.activity = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[Catch: RuntimeException -> 0x0032, TryCatch #0 {RuntimeException -> 0x0032, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0013, B:10:0x0022, B:9:0x0020), top: B:15:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean apply(com.facebook.aura.main.api.MainWindowPipRequest r6) {
        /*
            r5 = this;
            r3 = 0
            android.app.Activity r4 = r5.activity     // Catch: java.lang.RuntimeException -> L32
            android.app.PictureInPictureParams$Builder r1 = new android.app.PictureInPictureParams$Builder     // Catch: java.lang.RuntimeException -> L32
            r1.<init>()     // Catch: java.lang.RuntimeException -> L32
            r2 = 1
            boolean r0 = X.AnonymousClass002.A1X(r6)
            android.app.PictureInPictureParams$Builder r1 = r1.setAutoEnterEnabled(r0)     // Catch: java.lang.RuntimeException -> L32
            if (r6 == 0) goto L20
            android.util.Rational r0 = r6.aspectRatio     // Catch: java.lang.RuntimeException -> L32
            android.util.Rational r0 = r5.clamp(r0)     // Catch: java.lang.RuntimeException -> L32
            r1.setAspectRatio(r0)     // Catch: java.lang.RuntimeException -> L32
            java.util.List<android.app.RemoteAction> r0 = r6.actions     // Catch: java.lang.RuntimeException -> L32
            if (r0 != 0) goto L22
        L20:
            X.AGi r0 = X.C0881AGi.A00     // Catch: java.lang.RuntimeException -> L32
        L22:
            android.app.PictureInPictureParams$Builder r0 = r1.setActions(r0)     // Catch: java.lang.RuntimeException -> L32
            android.app.PictureInPictureParams$Builder r0 = r0.setSeamlessResizeEnabled(r3)     // Catch: java.lang.RuntimeException -> L32
            android.app.PictureInPictureParams r0 = r0.build()     // Catch: java.lang.RuntimeException -> L32
            r4.setPictureInPictureParams(r0)     // Catch: java.lang.RuntimeException -> L32
            return r2
        L32:
            r2 = move-exception
            java.lang.String r1 = "Failed to apply main window PiP params"
            java.lang.String r0 = "MainWindowPip"
            X.CFK.A0A(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.MainWindowPipController.apply(com.facebook.aura.main.api.MainWindowPipRequest):boolean");
    }

    public final void release() {
        this.owner = null;
        if (this.applied == null || !apply(null)) {
            return;
        }
        this.applied = null;
    }

    public final void yieldToLiveSession() {
        this.applied = null;
        this.owner = null;
    }

    public final void dismiss() {
        if (this.activity.isInPictureInPictureMode()) {
            release();
            try {
                this.activity.moveTaskToBack(true);
            } catch (RuntimeException e) {
                CFK.A0A(TAG, "Failed to dismiss main window PiP", e);
            }
        }
    }

    public final MainWindowPictureInPicture getOwner() {
        return this.owner;
    }

    public final void update(MainWindowPictureInPicture mainWindowPictureInPicture, MainWindowPipRequest mainWindowPipRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (!this.activity.isInPictureInPictureMode() || (mainWindowPictureInPicture == this.owner && mainWindowPipRequest != null)) {
                if (C7384Etj.areEqual(mainWindowPipRequest, this.applied) || apply(mainWindowPipRequest)) {
                    this.applied = mainWindowPipRequest;
                    if (mainWindowPipRequest != null) {
                        this.owner = mainWindowPictureInPicture;
                    }
                }
            }
        }
    }

    private final Rational clamp(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = MIN_RATIO;
        if (fFloatValue >= rational2.floatValue()) {
            float fFloatValue2 = rational.floatValue();
            rational2 = MAX_RATIO;
            if (fFloatValue2 <= rational2.floatValue()) {
                return rational;
            }
        }
        return rational2;
    }
}
