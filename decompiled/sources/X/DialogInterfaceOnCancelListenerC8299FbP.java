package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.FbP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC8299FbP implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment A00;

    public DialogInterfaceOnCancelListenerC8299FbP(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.mDialog;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
