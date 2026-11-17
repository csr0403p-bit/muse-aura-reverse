package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.FZd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC8210FZd implements InterfaceC8216FZj, DialogInterface.OnClickListener {
    public DialogInterfaceC8226FZy A00;
    public CharSequence A01;
    public ListAdapter A02;
    public final /* synthetic */ FZY A03;

    public DialogInterfaceOnClickListenerC8210FZd(FZY fzy) {
        this.A03 = fzy;
    }

    @Override // X.InterfaceC8216FZj
    public final Drawable ACj() {
        return null;
    }

    @Override // X.InterfaceC8216FZj
    public final CharSequence AGG() {
        return this.A01;
    }

    @Override // X.InterfaceC8216FZj
    public final int AGH() {
        return 0;
    }

    @Override // X.InterfaceC8216FZj
    public final int AMc() {
        return 0;
    }

    @Override // X.InterfaceC8216FZj
    public final boolean AP1() {
        DialogInterfaceC8226FZy dialogInterfaceC8226FZy = this.A00;
        if (dialogInterfaceC8226FZy != null) {
            return dialogInterfaceC8226FZy.isShowing();
        }
        return false;
    }

    @Override // X.InterfaceC8216FZj
    public final void Aci(ListAdapter listAdapter) {
        this.A02 = listAdapter;
    }

    @Override // X.InterfaceC8216FZj
    public final void Acs(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC8216FZj
    public final void AdU(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC8216FZj
    public final void AdV(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC8216FZj
    public final void AeH(CharSequence charSequence) {
        this.A01 = charSequence;
    }

    @Override // X.InterfaceC8216FZj
    public final void AfB(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC8216FZj
    public final void Afe(int i, int i2) {
        if (this.A02 != null) {
            FZY fzy = this.A03;
            Context context = fzy.A04;
            int iA00 = DialogInterfaceC8226FZy.A00(context, 0);
            C8229Fa1 c8229Fa1 = new C8229Fa1(new ContextThemeWrapper(context, DialogInterfaceC8226FZy.A00(context, iA00)));
            CharSequence charSequence = this.A01;
            if (charSequence != null) {
                c8229Fa1.A09 = charSequence;
            }
            ListAdapter listAdapter = this.A02;
            int selectedItemPosition = fzy.getSelectedItemPosition();
            c8229Fa1.A07 = listAdapter;
            c8229Fa1.A02 = this;
            c8229Fa1.A00 = selectedItemPosition;
            c8229Fa1.A0A = true;
            DialogInterfaceC8226FZy dialogInterfaceC8226FZyA00 = AbstractC8228Fa0.A00(c8229Fa1, iA00);
            this.A00 = dialogInterfaceC8226FZyA00;
            ListView listView = dialogInterfaceC8226FZyA00.A00.A0F;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.A00.show();
        }
    }

    @Override // X.InterfaceC8216FZj
    public final void dismiss() {
        DialogInterfaceC8226FZy dialogInterfaceC8226FZy = this.A00;
        if (dialogInterfaceC8226FZy != null) {
            dialogInterfaceC8226FZy.dismiss();
            this.A00 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FZY fzy = this.A03;
        fzy.setSelection(i);
        if (fzy.getOnItemClickListener() != null) {
            fzy.performItemClick(null, i, this.A02.getItemId(i));
        }
        dismiss();
    }
}
