package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Fcx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8382Fcx implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$StopDelayingPromptRunnable";
    public final WeakReference<C8379Fct> A00;

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference<C8379Fct> weakReference = this.A00;
        if (weakReference.get() != null) {
            weakReference.get().A0H = false;
        }
    }

    public RunnableC8382Fcx(C8379Fct c8379Fct) {
        this.A00 = BV4.A0q(c8379Fct);
    }
}
