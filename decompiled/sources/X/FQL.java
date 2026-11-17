package X;

import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.fragment.app.FragmentActivity;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.concurrent.Executor;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes6.dex */
public final class FQL {
    public AbstractC8571FgQ A00;

    private void A00(EX8 ex8, C8328Fbu c8328Fbu) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String str;
        AbstractC8571FgQ abstractC8571FgQ = this.A00;
        if (abstractC8571FgQ == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else {
            if (!abstractC8571FgQ.A0J && !abstractC8571FgQ.A0K) {
                BiometricFragment biometricFragment = (BiometricFragment) abstractC8571FgQ.A0U("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    biometricFragment = new BiometricFragment();
                    C8573FgU c8573FgU = new C8573FgU(abstractC8571FgQ);
                    c8573FgU.A01(biometricFragment, "androidx.biometric.BiometricFragment", 0, 1);
                    c8573FgU.A03(true, true);
                    abstractC8571FgQ.A0s(true);
                    AbstractC8571FgQ.A0E(abstractC8571FgQ);
                }
                biometricFragment.A05(ex8, c8328Fbu);
                return;
            }
            str = "Unable to start authentication. Called after onSaveInstanceState().";
        }
        Log.e("BiometricPromptCompat", str);
    }

    public final void A01(EX8 ex8, C8328Fbu c8328Fbu) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (c8328Fbu == null) {
            throw C60O.A0i("PromptInfo cannot be null.");
        }
        int i = c8328Fbu.A00;
        if (i == 0) {
            i = 15;
        } else if ((i & 255) == 255) {
            throw C60O.A0i("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && (i & 32768) != 0) {
            throw C60O.A0i("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        A00(ex8, c8328Fbu);
    }

    public final void A02(C8328Fbu c8328Fbu) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (c8328Fbu == null) {
            throw C60O.A0i("PromptInfo cannot be null.");
        }
        A00(null, c8328Fbu);
    }

    public FQL(AbstractC8390Fd5 abstractC8390Fd5, FragmentActivity fragmentActivity, Executor executor) {
        if (fragmentActivity == null) {
            throw C60O.A0i("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw C60O.A0i("Executor must not be null.");
        }
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(fragmentActivity);
        C8379Fct c8379Fct = (C8379Fct) new BON(fragmentActivity).A01(C8379Fct.class);
        this.A00 = abstractC8571FgQA00;
        if (c8379Fct != null) {
            c8379Fct.A0F = executor;
            c8379Fct.A03 = abstractC8390Fd5;
        }
    }
}
