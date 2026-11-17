package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.FZi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8215FZi implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C8229Fa1 A00;
    public final /* synthetic */ C8227FZz A01;

    public C8215FZi(C8229Fa1 c8229Fa1, C8227FZz c8227FZz) {
        this.A00 = c8229Fa1;
        this.A01 = c8227FZz;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C8229Fa1 c8229Fa1 = this.A00;
        DialogInterface.OnClickListener onClickListener = c8229Fa1.A02;
        AbstractDialogC8260Fag abstractDialogC8260Fag = this.A01.A0P;
        onClickListener.onClick(abstractDialogC8260Fag, i);
        if (c8229Fa1.A0A) {
            return;
        }
        abstractDialogC8260Fag.dismiss();
    }
}
