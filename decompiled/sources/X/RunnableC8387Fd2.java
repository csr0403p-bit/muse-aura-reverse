package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.Fd2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8387Fd2 implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$11";
    public final /* synthetic */ BiometricFragment A00;

    public RunnableC8387Fd2(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8379Fct c8379Fct = this.A00.A01;
        if (c8379Fct.A03 == null) {
            c8379Fct.A03 = new Fd7(c8379Fct);
        }
    }
}
