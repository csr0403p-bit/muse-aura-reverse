package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Fe2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC8438Fe2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final Runnable A02;

    public static ViewOnAttachStateChangeListenerC8438Fe2 A00(View view, Runnable runnable) {
        if (view == null) {
            throw BV4.A0a("view == null");
        }
        ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = new ViewOnAttachStateChangeListenerC8438Fe2(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewOnAttachStateChangeListenerC8438Fe2);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC8438Fe2);
        return viewOnAttachStateChangeListenerC8438Fe2;
    }

    public final void A01() {
        (this.A00.isAlive() ? this.A00 : this.A01.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.A01.removeOnAttachStateChangeListener(this);
    }

    public ViewOnAttachStateChangeListenerC8438Fe2(View view, Runnable runnable) {
        this.A01 = view;
        this.A00 = view.getViewTreeObserver();
        this.A02 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        A01();
        this.A02.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A00 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A01();
    }
}
