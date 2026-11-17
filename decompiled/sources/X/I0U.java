package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes6.dex */
public final class I0U implements View.OnAttachStateChangeListener {
    public final int $t;
    public final Object A00;

    public I0U(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        int i = this.$t;
        Object obj = this.A00;
        if (i != 0) {
            ViewOnKeyListenerC8234FaA viewOnKeyListenerC8234FaA = (ViewOnKeyListenerC8234FaA) obj;
            ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC8234FaA.A04;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    viewOnKeyListenerC8234FaA.A04 = view.getViewTreeObserver();
                }
                viewTreeObserver = viewOnKeyListenerC8234FaA.A04;
                onGlobalLayoutListener = viewOnKeyListenerC8234FaA.A0D;
                viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
        } else {
            ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9 = (ViewOnKeyListenerC8233Fa9) obj;
            ViewTreeObserver viewTreeObserver3 = viewOnKeyListenerC8233Fa9.A07;
            if (viewTreeObserver3 != null) {
                if (!viewTreeObserver3.isAlive()) {
                    viewOnKeyListenerC8233Fa9.A07 = view.getViewTreeObserver();
                }
                viewTreeObserver = viewOnKeyListenerC8233Fa9.A07;
                onGlobalLayoutListener = viewOnKeyListenerC8233Fa9.A0J;
                viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
