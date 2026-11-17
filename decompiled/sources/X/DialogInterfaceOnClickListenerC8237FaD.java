package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.FaD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC8237FaD implements InterfaceC8331Fby, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener {
    public DialogInterfaceC8226FZy A00;
    public C8235FaB A01;
    public C8249FaR A02;

    @Override // X.InterfaceC8331Fby
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        DialogInterfaceC8226FZy dialogInterfaceC8226FZy;
        if ((z || c8249FaR == this.A02) && (dialogInterfaceC8226FZy = this.A00) != null) {
            dialogInterfaceC8226FZy.dismiss();
        }
    }

    @Override // X.InterfaceC8331Fby
    public final boolean AUQ(C8249FaR c8249FaR) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8249FaR c8249FaR = this.A02;
        C8235FaB c8235FaB = this.A01;
        C8238FaE c8238FaE = c8235FaB.A04;
        if (c8238FaE == null) {
            c8238FaE = new C8238FaE(c8235FaB);
            c8235FaB.A04 = c8238FaE;
        }
        c8249FaR.A0I((C8252FaX) c8238FaE.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A01.ASE(this.A02, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0C(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }
}
