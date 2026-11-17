package X;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes4.dex */
public abstract class B9s extends AbstractC2184B9c {
    public boolean A00;
    public final int A01;
    public final OnBackInvokedCallback A02;
    public final OnBackInvokedDispatcher A03;

    private final OnBackInvokedCallback A00() {
        return new B9m(this);
    }

    @Override // X.AbstractC2184B9c
    public final void A05() {
        if (this.A00) {
            this.A03.unregisterOnBackInvokedCallback(this.A02);
            this.A00 = false;
        }
    }

    @Override // X.AbstractC2184B9c
    public final void A06(boolean z) {
        boolean z2;
        boolean z3 = this.A00;
        if (z) {
            if (z3) {
                return;
            }
            this.A03.registerOnBackInvokedCallback(this.A01, this.A02);
            z2 = true;
        } else {
            if (!z3) {
                return;
            }
            this.A03.unregisterOnBackInvokedCallback(this.A02);
            z2 = false;
        }
        this.A00 = z2;
    }

    public /* synthetic */ B9s(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.A03 = onBackInvokedDispatcher;
        this.A01 = i;
        this.A02 = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: X.B9x
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                B9s.A01(this.A00);
            }
        } : A00();
    }

    public static final void A01(B9s b9s) {
        b9s.A03();
    }
}
