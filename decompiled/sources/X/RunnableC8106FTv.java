package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FTv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8106FTv implements Runnable {
    public static final String __redex_internal_original_name = "RecyclerView$1";
    public final /* synthetic */ RecyclerView A00;

    public RunnableC8106FTv(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A0U || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.A0W) {
            recyclerView.requestLayout();
        } else if (recyclerView.A0Z) {
            recyclerView.A0a = true;
        } else {
            recyclerView.A0k();
        }
    }
}
