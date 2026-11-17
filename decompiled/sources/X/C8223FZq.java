package X;

import android.database.DataSetObserver;

/* renamed from: X.FZq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8223FZq extends DataSetObserver {
    public final /* synthetic */ FZZ A00;

    public C8223FZq(FZZ fzz) {
        this.A00 = fzz;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        FZZ fzz = this.A00;
        if (fzz.A09.isShowing()) {
            fzz.Afd();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.dismiss();
    }
}
