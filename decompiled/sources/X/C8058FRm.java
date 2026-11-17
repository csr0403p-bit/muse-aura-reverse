package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FRm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8058FRm extends C8053FRg {
    public final RecyclerView A00;
    public final C8052FRf A01;

    public C8058FRm(RecyclerView recyclerView) {
        this.A00 = recyclerView;
        C8052FRf c8052FRf = this.A01;
        this.A01 = c8052FRf == null ? new C8052FRf(this) : c8052FRf;
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        FTN ftn;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.A00.A17() || (ftn = ((RecyclerView) view).A0H) == null) {
            return;
        }
        ftn.A1E(accessibilityEvent);
    }

    @Override // X.C8053FRg
    public void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        FTN ftn;
        super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A17() || (ftn = recyclerView.A0H) == null) {
            return;
        }
        RecyclerView recyclerView2 = ftn.A07;
        ftn.A1F(c2197BAc, recyclerView2.A11, recyclerView2.A13);
    }

    @Override // X.C8053FRg
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        FTN ftn;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A17() || (ftn = recyclerView.A0H) == null) {
            return false;
        }
        return ftn.A1S(i, bundle);
    }
}
