package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class AzA extends Az9 {
    public View A00;

    @Override // X.Az9, X.Az8
    public final void A01() {
        WindowInsetsController windowInsetsController;
        View view = this.A00;
        if (view == null || (windowInsetsController = view.getWindowInsetsController()) == null) {
            super.A01();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: X.AzC
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set(AnonymousClass002.A1L(i & 8));
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        if (!atomicBoolean.get()) {
            ((InputMethodManager) C8j4.A0n(view)).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // X.Az9, X.Az8
    public final void A02() {
        View view = this.A00;
        if (view != null) {
            if (Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) C8j4.A0n(view)).isActive();
            }
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
        }
        super.A02();
    }

    public AzA(View view) {
        super(view);
        this.A00 = view;
    }
}
