package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class B9I implements Drawable.Callback {
    public final /* synthetic */ B9H A00;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C7384Etj.A0Y(runnable, 1);
        ((Handler) B9J.A00.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C7384Etj.A0Y(runnable, 1);
        ((Handler) B9J.A00.getValue()).removeCallbacks(runnable);
    }

    public B9I(B9H b9h) {
        this.A00 = b9h;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        B9H b9h = this.A00;
        MutableState mutableState = b9h.A01;
        MutableState.A07(MutableState.A02(mutableState) + 1, mutableState);
        Drawable drawable2 = b9h.A00;
        F0C f0c = B9J.A00;
        AWA.A05(b9h.A02, (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : C1Wv.A00(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight()));
    }
}
