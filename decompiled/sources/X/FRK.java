package X;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;

/* loaded from: classes6.dex */
public final class FRK implements SpanWatcher {
    public final /* synthetic */ FRD A02;
    public int A01 = -1;
    public int A00 = -1;

    public FRK(FRD frd) {
        this.A02 = frd;
    }

    private void A00() {
        FRD frd = this.A02;
        int iA03 = frd.A03();
        int iA02 = frd.A02();
        if (iA03 == this.A01 && iA02 == this.A00) {
            return;
        }
        this.A01 = iA03;
        this.A00 = iA02;
        frd.A08 = true;
        frd.A0F.invalidate();
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (obj == Selection.SELECTION_START || obj == Selection.SELECTION_END) {
            A00();
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (obj == Selection.SELECTION_START || obj == Selection.SELECTION_END) {
            A00();
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (obj == Selection.SELECTION_START || obj == Selection.SELECTION_END) {
            A00();
        }
    }
}
