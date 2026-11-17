package androidx.biometric;

import X.AbstractC8571FgQ;
import X.BON;
import X.C2934BpC;
import X.C60O;
import X.C8328Fbu;
import X.C8379Fct;
import X.C8381Fcw;
import X.C8391Fd6;
import X.C8392Fd8;
import X.C8573FgU;
import X.EX2;
import X.EX8;
import X.HlR;
import X.RunnableC8382Fcx;
import X.RunnableC8383Fcy;
import X.RunnableC8384Fcz;
import X.RunnableC8385Fd0;
import X.RunnableC8386Fd1;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
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
public class BiometricFragment extends Fragment {
    public Handler A00 = C60O.A02();
    public C8379Fct A01;

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        C8379Fct c8379Fct;
        C8328Fbu c8328Fbu;
        int i;
        this.mCalled = true;
        if (Build.VERSION.SDK_INT != 29 || (c8328Fbu = (c8379Fct = this.A01).A05) == null || (i = c8328Fbu.A00) == 0 || (i & 32768) == 0) {
            return;
        }
        c8379Fct.A0I = true;
        this.A00.postDelayed(new RunnableC8383Fcy(c8379Fct), 250L);
    }

    public static void A00(BiometricFragment biometricFragment, C8391Fd6 c8391Fd6) throws Resources.NotFoundException {
        C8379Fct c8379Fct = biometricFragment.A01;
        if (c8379Fct.A0G) {
            c8379Fct.A0G = false;
            Executor hlR = c8379Fct.A0F;
            if (hlR == null) {
                hlR = new HlR();
            }
            hlR.execute(new RunnableC8386Fd1(biometricFragment, c8391Fd6));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        biometricFragment.A03();
    }

    public static void A01(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        C8379Fct c8379Fct = biometricFragment.A01;
        if (!c8379Fct.A0G) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        c8379Fct.A0G = false;
        Executor hlR = c8379Fct.A0F;
        if (hlR == null) {
            hlR = new HlR();
        }
        hlR.execute(new RunnableC8385Fd0(biometricFragment, charSequence, i));
    }

    public final void A02() {
        C8379Fct c8379Fct = this.A01;
        if (c8379Fct.A0I) {
            return;
        }
        C8392Fd8 c8392Fd8 = c8379Fct.A06;
        if (c8392Fd8 == null) {
            c8392Fd8 = new C8392Fd8();
            c8379Fct.A06 = c8392Fd8;
        }
        CancellationSignal cancellationSignal = c8392Fd8.A00;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.cancel();
            } catch (NullPointerException e) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
            }
            c8392Fd8.A00 = null;
        }
    }

    public final void A03() throws Resources.NotFoundException {
        C8379Fct c8379Fct = this.A01;
        c8379Fct.A0J = false;
        c8379Fct.A0J = false;
        if (isAdded()) {
            AbstractC8571FgQ parentFragmentManager = getParentFragmentManager();
            DialogFragment dialogFragment = (DialogFragment) parentFragmentManager.A0U("androidx.biometric.FingerprintDialogFragment");
            if (dialogFragment != null) {
                if (dialogFragment.isAdded()) {
                    dialogFragment.dismissAllowingStateLoss();
                } else {
                    C8573FgU c8573FgU = new C8573FgU(parentFragmentManager);
                    c8573FgU.A06(dialogFragment);
                    c8573FgU.A03(true, true);
                }
            }
        }
        if (isAdded()) {
            C8573FgU c8573FgU2 = new C8573FgU(getParentFragmentManager());
            c8573FgU2.A06(this);
            c8573FgU2.A03(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29 || str == null) {
                return;
            }
            for (String str2 : context.getResources().getStringArray(R.array._name_removed__res_0x7f030002)) {
                if (str.equals(str2)) {
                    C8379Fct c8379Fct2 = this.A01;
                    c8379Fct2.A0H = true;
                    this.A00.postDelayed(new RunnableC8382Fcx(c8379Fct2), 600L);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A04():void");
    }

    public final void A05(EX8 ex8, C8328Fbu c8328Fbu) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (getActivity() == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        C8379Fct c8379Fct = this.A01;
        c8379Fct.A05 = c8328Fbu;
        int i = c8328Fbu.A00;
        if (i == 0) {
            i = 255;
            if (ex8 != null) {
                i = 15;
            }
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && ex8 == null) {
            ex8 = EX2.A01();
        }
        c8379Fct.A04 = ex8;
        if (this.A01.A0H) {
            this.A00.postDelayed(new RunnableC8384Fcz(this), 600L);
        } else {
            A04();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws Resources.NotFoundException {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                A00(this, new C8391Fd6(null, 1));
            } else {
                A01(this, getString(R.string._name_removed__res_0x7f120a49), 10);
                A03();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws IOException {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C8379Fct c8379Fct = (C8379Fct) new BON(activity).A01(C8379Fct.class);
            this.A01 = c8379Fct;
            C2934BpC<C8391Fd6> c2934BpC = c8379Fct.A09;
            if (c2934BpC == null) {
                c2934BpC = new C2934BpC<>();
                c8379Fct.A09 = c2934BpC;
            }
            Fragment.A04(this, c2934BpC, 0);
            C8379Fct c8379Fct2 = this.A01;
            C2934BpC<C8381Fcw> c2934BpC2 = c8379Fct2.A07;
            if (c2934BpC2 == null) {
                c2934BpC2 = new C2934BpC<>();
                c8379Fct2.A07 = c2934BpC2;
            }
            Fragment.A04(this, c2934BpC2, 1);
            C8379Fct c8379Fct3 = this.A01;
            C2934BpC<CharSequence> c2934BpC3 = c8379Fct3.A08;
            if (c2934BpC3 == null) {
                c2934BpC3 = new C2934BpC<>();
                c8379Fct3.A08 = c2934BpC3;
            }
            Fragment.A04(this, c2934BpC3, 2);
            C8379Fct c8379Fct4 = this.A01;
            C2934BpC<Boolean> c2934BpC4 = c8379Fct4.A0C;
            if (c2934BpC4 == null) {
                c2934BpC4 = new C2934BpC<>();
                c8379Fct4.A0C = c2934BpC4;
            }
            Fragment.A04(this, c2934BpC4, 3);
            C8379Fct c8379Fct5 = this.A01;
            C2934BpC<Boolean> c2934BpC5 = c8379Fct5.A0E;
            if (c2934BpC5 == null) {
                c2934BpC5 = new C2934BpC<>();
                c8379Fct5.A0E = c2934BpC5;
            }
            Fragment.A04(this, c2934BpC5, 4);
            C8379Fct c8379Fct6 = this.A01;
            C2934BpC<Boolean> c2934BpC6 = c8379Fct6.A0D;
            if (c2934BpC6 == null) {
                c2934BpC6 = new C2934BpC<>();
                c8379Fct6.A0D = c2934BpC6;
            }
            Fragment.A04(this, c2934BpC6, 5);
        }
    }
}
