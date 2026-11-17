package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: X.FRq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC8062FRq implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakHashMap<View, Boolean> A00 = new WeakHashMap<>();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
