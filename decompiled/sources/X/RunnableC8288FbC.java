package X;

import android.content.Context;
import android.util.Log;
import androidx.biometric.FingerprintDialogFragment;
import com.facebook.aura.R;

/* renamed from: X.FbC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8288FbC implements Runnable {
    public static final String __redex_internal_original_name = "FingerprintDialogFragment$1";
    public final /* synthetic */ FingerprintDialogFragment A00;

    public RunnableC8288FbC(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        Context context = fingerprintDialogFragment.getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        C8379Fct c8379Fct = fingerprintDialogFragment.A04;
        C2934BpC<Integer> c2934BpC = c8379Fct.A0B;
        if (c2934BpC == null) {
            c2934BpC = new C2934BpC<>();
            c8379Fct.A0B = c2934BpC;
        }
        C8379Fct.A03(c2934BpC, 1);
        C8379Fct c8379Fct2 = fingerprintDialogFragment.A04;
        String string = context.getString(R.string._name_removed__res_0x7f1209f7);
        C2934BpC<CharSequence> c2934BpC2 = c8379Fct2.A0A;
        if (c2934BpC2 == null) {
            c2934BpC2 = new C2934BpC<>();
            c8379Fct2.A0A = c2934BpC2;
        }
        C8379Fct.A03(c2934BpC2, string);
    }
}
