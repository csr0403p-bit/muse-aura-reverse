package X;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;
import android.view.animation.LinearInterpolator;

/* renamed from: X.FOh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnShowListenerC7990FOh implements DialogInterface.OnShowListener {
    public final /* synthetic */ C8372Fcm A00;

    public DialogInterfaceOnShowListenerC7990FOh(C8372Fcm c8372Fcm) {
        this.A00 = c8372Fcm;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Window window;
        if (dialogInterface == null || (window = ((Dialog) dialogInterface).getWindow()) == null) {
            return;
        }
        C8372Fcm c8372Fcm = this.A00;
        window.setBackgroundDrawable(c8372Fcm);
        ValueAnimator valueAnimator = new ValueAnimator();
        C8919Ftb.A01(valueAnimator, c8372Fcm, 2);
        valueAnimator.setRepeatCount(0);
        valueAnimator.setDuration(200L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.start();
    }
}
