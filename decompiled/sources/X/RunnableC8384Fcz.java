package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.Fcz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8384Fcz implements Runnable {
    public static final String __redex_internal_original_name = "BiometricFragment$ShowPromptForAuthenticationRunnable";
    public final WeakReference<BiometricFragment> A00;

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference<BiometricFragment> weakReference = this.A00;
        if (weakReference.get() != null) {
            weakReference.get().A04();
        }
    }

    public RunnableC8384Fcz(BiometricFragment biometricFragment) {
        this.A00 = BV4.A0q(biometricFragment);
    }
}
