package X;

import android.view.ViewTreeObserver;

/* renamed from: X.FOy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC8004FOy implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C8372Fcm A00;
    public final /* synthetic */ FOS A01;
    public final /* synthetic */ FOV A02;

    public ViewTreeObserverOnPreDrawListenerC8004FOy(C8372Fcm c8372Fcm, FOS fos, FOV fov) {
        this.A00 = c8372Fcm;
        this.A02 = fov;
        this.A01 = fos;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A02.getTop();
        C8005FOz c8005FOz = this.A01.A0C;
        if (c8005FOz == null) {
            return true;
        }
        c8005FOz.getPaddingTop();
        return true;
    }
}
