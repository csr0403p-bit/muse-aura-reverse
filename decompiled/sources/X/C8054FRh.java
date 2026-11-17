package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: X.FRh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8054FRh extends View.AccessibilityDelegate {
    public final C8053FRg A00;

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        FRa accessibilityNodeProvider = this.A00.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.A00;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.View.AccessibilityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.View r5, android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r4 = this;
            X.BAc r3 = new X.BAc
            r3.<init>(r6)
            r0 = 0
            java.lang.Object r0 = X.I0D.A00(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L15
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L16
        L15:
            r0 = 0
        L16:
            android.view.accessibility.AccessibilityNodeInfo r2 = r3.A02
            r2.setScreenReaderFocusable(r0)
            r0 = 3
            java.lang.Object r0 = X.I0D.A00(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L2b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L2c
        L2b:
            r0 = 0
        L2c:
            r2.setHeading(r0)
            r0 = 1
            java.lang.Object r0 = X.I0D.A00(r5, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setPaneTitle(r0)
            r0 = 2
            java.lang.Object r0 = X.I0D.A00(r5, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.A08(r0)
            X.FRg r0 = r4.A00
            r0.onInitializeAccessibilityNodeInfo(r5, r3)
            r6.getText()
            java.util.List r2 = X.C8053FRg.getActionList(r5)
            r1 = 0
        L50:
            int r0 = r2.size()
            if (r1 >= r0) goto L62
            java.lang.Object r0 = r2.get(r1)
            X.BAi r0 = (X.C2203BAi) r0
            r3.A05(r0)
            int r1 = r1 + 1
            goto L50
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8054FRh.onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.A00.performAccessibilityAction(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.A00.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C8054FRh(C8053FRg c8053FRg) {
        this.A00 = c8053FRg;
    }
}
