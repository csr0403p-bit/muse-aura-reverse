package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: X.Fbv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC8329Fbv implements DialogInterface.OnClickListener {
    public final WeakReference<C8379Fct> A00;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        WeakReference<C8379Fct> weakReference = this.A00;
        if (weakReference.get() != null) {
            weakReference.get().A04(true);
        }
    }

    public DialogInterfaceOnClickListenerC8329Fbv(C8379Fct c8379Fct) {
        this.A00 = BV4.A0q(c8379Fct);
    }
}
