package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes6.dex */
public final class HjG extends C8053FRg {
    @Override // X.C8053FRg
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(AnonymousClass002.A1N(nestedScrollView.getScrollRange()));
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        int scrollRange;
        super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        String name = ScrollView.class.getName();
        AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
        accessibilityNodeInfo.setClassName(name);
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            c2197BAc.A05(C2203BAi.A0X);
            c2197BAc.A05(C2203BAi.A0e);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            c2197BAc.A05(C2203BAi.A0Z);
            c2197BAc.A05(C2203BAi.A0Y);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r6 != 16908346) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // X.C8053FRg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r0 = super.performAccessibilityAction(r5, r6, r7)
            r3 = 1
            if (r0 != 0) goto L7d
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r0 = r5.isEnabled()
            r4 = 0
            if (r0 == 0) goto L3e
            int r2 = r5.getHeight()
            android.graphics.Rect r1 = X.AbstractC7607F5u.A0X()
            android.graphics.Matrix r0 = r5.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L2c
            boolean r0 = r5.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L2c
            int r2 = r1.height()
        L2c:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r6 == r0) goto L53
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r6 == r0) goto L3f
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r0) goto L3f
            r0 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r0) goto L53
        L3e:
            return r4
        L3f:
            int r0 = r5.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r5.getPaddingTop()
            int r2 = r2 - r0
            int r0 = r5.getScrollY()
            int r0 = r0 - r2
            int r2 = java.lang.Math.max(r0, r4)
            goto L6a
        L53:
            int r0 = r5.getPaddingBottom()
            int r2 = r2 - r0
            int r0 = r5.getPaddingTop()
            int r2 = r2 - r0
            int r1 = r5.getScrollY()
            int r1 = r1 + r2
            int r0 = r5.getScrollRange()
            int r2 = java.lang.Math.min(r1, r0)
        L6a:
            int r0 = r5.getScrollY()
            if (r2 == r0) goto L3e
            int r0 = r5.getScrollX()
            int r1 = -r0
            int r0 = r5.getScrollY()
            int r2 = r2 - r0
            androidx.core.widget.NestedScrollView.A04(r5, r1, r2, r3)
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HjG.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }
}
