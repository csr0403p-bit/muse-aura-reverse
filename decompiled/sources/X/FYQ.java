package X;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes6.dex */
public final class FYQ implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ FZZ A00;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        FYL fyl;
        if (i == -1 || (fyl = this.A00.A0A) == null) {
            return;
        }
        fyl.A07 = false;
    }

    public FYQ(FZZ fzz) {
        this.A00 = fzz;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
