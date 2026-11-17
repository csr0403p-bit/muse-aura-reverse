package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.FbQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC8300FbQ implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment A00;

    public DialogInterfaceOnDismissListenerC8300FbQ(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.mDialog;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
