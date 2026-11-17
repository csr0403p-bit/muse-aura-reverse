package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.FZc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8209FZc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C8208FZa A00;
    public final /* synthetic */ FZY A01;

    public C8209FZc(C8208FZa c8208FZa, FZY fzy) {
        this.A00 = c8208FZa;
        this.A01 = fzy;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C8208FZa c8208FZa = this.A00;
        FZY fzy = c8208FZa.A04;
        fzy.setSelection(i);
        if (fzy.getOnItemClickListener() != null) {
            fzy.performItemClick(view, i, c8208FZa.A01.getItemId(i));
        }
        c8208FZa.dismiss();
    }
}
