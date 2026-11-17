package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.Fd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8385Fd0 implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$10";
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public RunnableC8385Fd0(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8379Fct c8379Fct = this.A01.A01;
        AbstractC8390Fd5 fd7 = c8379Fct.A03;
        if (fd7 == null) {
            fd7 = new Fd7(c8379Fct);
            c8379Fct.A03 = fd7;
        }
        fd7.onAuthenticationError(this.A00, this.A02);
    }
}
