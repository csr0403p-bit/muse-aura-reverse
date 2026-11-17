package X;

import android.content.DialogInterface;
import androidx.biometric.FingerprintDialogFragment;

/* renamed from: X.Fbi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC8316Fbi implements DialogInterface.OnClickListener {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public DialogInterfaceOnClickListenerC8316Fbi(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A04.A04(true);
    }
}
