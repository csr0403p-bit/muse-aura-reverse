package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* loaded from: classes6.dex */
public final class FYP implements AdapterView.OnItemClickListener {
    public final /* synthetic */ FYK A00;

    public FYP(FYK fyk) {
        this.A00 = fyk;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        FYK fyk = this.A00;
        if (i < 0) {
            FZZ fzz = fyk.A02;
            item = !fzz.A09.isShowing() ? null : fzz.A0A.getSelectedItem();
        } else {
            item = fyk.getAdapter().getItem(i);
        }
        FYK.A00(fyk, item);
        AdapterView.OnItemClickListener onItemClickListener = fyk.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                FZZ fzz2 = fyk.A02;
                PopupWindow popupWindow = fzz2.A09;
                view = !popupWindow.isShowing() ? null : fzz2.A0A.getSelectedView();
                i = !popupWindow.isShowing() ? -1 : fzz2.A0A.getSelectedItemPosition();
                j = !popupWindow.isShowing() ? Long.MIN_VALUE : fzz2.A0A.getSelectedItemId();
            }
            onItemClickListener.onItemClick(fyk.A02.A0A, view, i, j);
        }
        fyk.A02.dismiss();
    }
}
