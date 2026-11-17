package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class HnU extends C8058FRm {
    public final /* synthetic */ FS4 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HnU(RecyclerView recyclerView, FS4 fs4) {
        super(recyclerView);
        this.A00 = fs4;
    }

    @Override // X.C8058FRm, X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        FS4 fs4 = this.A00;
        int[] iArr = FS4.A08;
        C8053FRg c8053FRg = fs4.A00;
        if (c8053FRg != null) {
            c8053FRg.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        }
        c2197BAc.A06(C2203BAi.A0e);
        c2197BAc.A06(C2203BAi.A0Y);
        c2197BAc.A06(C2203BAi.A0b);
        c2197BAc.A06(C2203BAi.A0c);
        c2197BAc.A06(C2203BAi.A0Z);
        c2197BAc.A06(C2203BAi.A0X);
        c2197BAc.A02.setScrollable(false);
    }
}
