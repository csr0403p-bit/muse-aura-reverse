package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.Fd1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8386Fd1 implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$9";
    public final /* synthetic */ BiometricFragment A00;
    public final /* synthetic */ C8391Fd6 A01;

    public RunnableC8386Fd1(BiometricFragment biometricFragment, C8391Fd6 c8391Fd6) {
        this.A00 = biometricFragment;
        this.A01 = c8391Fd6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8379Fct c8379Fct = this.A00.A01;
        AbstractC8390Fd5 fd7 = c8379Fct.A03;
        if (fd7 == null) {
            fd7 = new Fd7(c8379Fct);
            c8379Fct.A03 = fd7;
        }
        fd7.onAuthenticationSucceeded(this.A01);
    }
}
