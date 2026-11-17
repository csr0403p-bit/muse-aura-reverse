package X;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes4.dex */
public final class B9m implements OnBackAnimationCallback {
    public final /* synthetic */ B9s A00;

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        C7384Etj.A0Y(backEvent, 0);
        this.A00.A04(AWj.A00(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        C7384Etj.A0Y(backEvent, 0);
        B9s b9s = this.A00;
        C2193B9y c2193B9yA00 = AWj.A00(backEvent);
        C2183B9b c2183B9b = ((AbstractC2184B9c) b9s).A00;
        if (c2183B9b == null) {
            throw C3cG.A0Q("This input is not added to any dispatcher.");
        }
        if (((AbstractC2184B9c) b9s).A01) {
            return;
        }
        c2183B9b.A01(c2193B9yA00, b9s);
        ((AbstractC2184B9c) b9s).A01 = true;
    }

    public B9m(B9s b9s) {
        this.A00 = b9s;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.A00.A02();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.A00.A03();
    }
}
