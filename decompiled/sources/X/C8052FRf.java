package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.FRf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8052FRf extends C8053FRg {
    public Map<View, C8053FRg> A00 = new WeakHashMap();
    public final C8058FRm A01;

    public static C8053FRg A00(C8052FRf c8052FRf, Object obj) {
        return c8052FRf.A00.get(obj);
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        FTN ftn;
        RecyclerView recyclerView = this.A01.A00;
        if (recyclerView.A17() || (ftn = recyclerView.A0H) == null) {
            super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
            return;
        }
        ftn.A1D(view, c2197BAc);
        C8053FRg c8053FRgA00 = A00(this, view);
        if (c8053FRgA00 != null) {
            c8053FRgA00.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        }
    }

    @Override // X.C8053FRg
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.A01.A00;
        if (recyclerView.A17() || recyclerView.A0H == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        C8053FRg c8053FRgA00 = A00(this, view);
        return c8053FRgA00 != null ? c8053FRgA00.performAccessibilityAction(view, i, bundle) : super.performAccessibilityAction(view, i, bundle);
    }

    public C8052FRf(C8058FRm c8058FRm) {
        this.A01 = c8058FRm;
    }

    @Override // X.C8053FRg
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C8053FRg c8053FRgA00 = A00(this, view);
        return c8053FRgA00 != null ? c8053FRgA00.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C8053FRg
    public final FRa getAccessibilityNodeProvider(View view) {
        C8053FRg c8053FRgA00 = A00(this, view);
        return c8053FRgA00 != null ? c8053FRgA00.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C8053FRg c8053FRgA00 = A00(this, view);
        if (c8053FRgA00 != null) {
            c8053FRgA00.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C8053FRg
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C8053FRg c8053FRgA00 = A00(this, view);
        if (c8053FRgA00 != null) {
            c8053FRgA00.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C8053FRg
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C8053FRg c8053FRgA00 = A00(this, viewGroup);
        return c8053FRgA00 != null ? c8053FRgA00.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // X.C8053FRg
    public final void sendAccessibilityEvent(View view, int i) {
        C8053FRg c8053FRgA00 = A00(this, view);
        if (c8053FRgA00 != null) {
            c8053FRgA00.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // X.C8053FRg
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C8053FRg c8053FRgA00 = A00(this, view);
        if (c8053FRgA00 != null) {
            c8053FRgA00.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
