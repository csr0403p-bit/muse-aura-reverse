package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes6.dex */
public final class FU3 implements Runnable {
    public static final String __redex_internal_original_name = "StaggeredGridLayoutManager$1";
    public final /* synthetic */ StaggeredGridLayoutManager A00;

    public FU3(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.A00 = staggeredGridLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A1W();
    }
}
