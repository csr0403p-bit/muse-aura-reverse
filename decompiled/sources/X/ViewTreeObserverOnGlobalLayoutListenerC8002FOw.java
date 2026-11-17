package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.FOw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC8002FOw implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver A01;
    public final /* synthetic */ Runnable A02;

    public ViewTreeObserverOnGlobalLayoutListenerC8002FOw(View view, ViewTreeObserver viewTreeObserver, Runnable runnable) {
        this.A02 = runnable;
        this.A01 = viewTreeObserver;
        this.A00 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            this.A02.run();
            ViewTreeObserver viewTreeObserver = this.A01;
            if ((!viewTreeObserver.isAlive() && (viewTreeObserver = this.A00.getViewTreeObserver()) == null) || !viewTreeObserver.isAlive()) {
                throw C60O.A0i("Given null or dead view tree observer.");
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } catch (Throwable th) {
            ViewTreeObserver viewTreeObserver2 = this.A01;
            if ((!viewTreeObserver2.isAlive() && (viewTreeObserver2 = this.A00.getViewTreeObserver()) == null) || !viewTreeObserver2.isAlive()) {
                throw C60O.A0i("Given null or dead view tree observer.");
            }
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
            throw th;
        }
    }
}
