package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FTc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8096FTc extends FFO {
    public final /* synthetic */ RecyclerView A00;

    public C8096FTc(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public static final void A00(C8096FTc c8096FTc) {
        RecyclerView recyclerView = c8096FTc.A00;
        if (recyclerView.A0V && recyclerView.A0W) {
            recyclerView.postOnAnimation(recyclerView.A17);
        } else {
            recyclerView.A0Q = true;
            recyclerView.requestLayout();
        }
    }
}
