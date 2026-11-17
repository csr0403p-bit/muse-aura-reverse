package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.FRe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8051FRe extends C8053FRg {
    public final C8053FRg A00;

    @Override // X.C8053FRg
    public FRa getAccessibilityNodeProvider(View view) {
        FRa accessibilityNodeProvider;
        C7384Etj.A0Y(view, 0);
        C8053FRg c8053FRg = this.A00;
        return (c8053FRg == null || (accessibilityNodeProvider = c8053FRg.getAccessibilityNodeProvider(view)) == null) ? super.getAccessibilityNodeProvider(view) : accessibilityNodeProvider;
    }

    @Override // X.C8053FRg
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        C7384Etj.A0Y(view, 0);
        C8053FRg c8053FRg = this.A00;
        return c8053FRg != null ? c8053FRg.performAccessibilityAction(view, i, bundle) : super.performAccessibilityAction(view, i, bundle);
    }

    @Override // X.C8053FRg
    public final void sendAccessibilityEvent(View view, int i) {
        C7384Etj.A0Y(view, 0);
        C8053FRg c8053FRg = this.A00;
        if (c8053FRg != null) {
            c8053FRg.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    public AbstractC8051FRe(C8053FRg c8053FRg) {
        this.A00 = c8053FRg;
    }

    @Override // X.C8053FRg
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass003.A0u(view, accessibilityEvent);
        C8053FRg c8053FRg = this.A00;
        return c8053FRg != null ? c8053FRg.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass003.A0u(view, accessibilityEvent);
        C8053FRg c8053FRg = this.A00;
        if (c8053FRg != null) {
            c8053FRg.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C8053FRg
    public void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        AnonymousClass003.A0u(view, c2197BAc);
        C8053FRg c8053FRg = this.A00;
        if (c8053FRg != null) {
            c8053FRg.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        }
    }

    @Override // X.C8053FRg
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass003.A0u(view, accessibilityEvent);
        C8053FRg c8053FRg = this.A00;
        if (c8053FRg != null) {
            c8053FRg.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C8053FRg
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass005.A0x(viewGroup, view, accessibilityEvent);
        C8053FRg c8053FRg = this.A00;
        return c8053FRg != null ? c8053FRg.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // X.C8053FRg
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass003.A0u(view, accessibilityEvent);
        C8053FRg c8053FRg = this.A00;
        if (c8053FRg != null) {
            c8053FRg.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
