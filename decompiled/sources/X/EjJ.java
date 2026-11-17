package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class EjJ implements Drawable.Callback {
    public final /* synthetic */ C7240EjB A00;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C7384Etj.A0Y(drawable, 0);
        C7240EjB c7240EjB = this.A00;
        C00r c00r = c7240EjB.A07;
        c00r.AdX(c00r.AGd() + 1);
        C7267Ejs.A00();
        long jA0A = (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AnonymousClass007.A0A(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        C7267Ejs.A00();
        c7240EjB.A00 = jA0A;
        c7240EjB.A08.Af8(new AWA(jA0A));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C7384Etj.A0Y(runnable, 1);
        C7240EjB.A0J.postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C7384Etj.A0Y(runnable, 1);
        C7240EjB.A0J.removeCallbacks(runnable);
    }

    public EjJ(C7240EjB c7240EjB) {
        this.A00 = c7240EjB;
    }
}
