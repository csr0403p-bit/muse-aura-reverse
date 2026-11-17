package X;

import android.view.ViewTreeObserver;
import com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager;

/* loaded from: classes6.dex */
public final class FR9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ StickyItemsLinearLayoutManager A01;

    public FR9(ViewTreeObserver viewTreeObserver, StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager) {
        this.A00 = viewTreeObserver;
        this.A01 = stickyItemsLinearLayoutManager;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.A00.removeOnGlobalLayoutListener(this);
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager = this.A01;
        int i = stickyItemsLinearLayoutManager.A01;
        if (i != -1) {
            stickyItemsLinearLayoutManager.A1c(i, stickyItemsLinearLayoutManager.A00);
            stickyItemsLinearLayoutManager.A01 = -1;
            stickyItemsLinearLayoutManager.A00 = Integer.MIN_VALUE;
        }
    }
}
