package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BAV extends C8053FRg {
    public static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    public final View mHost;
    public final AccessibilityManager mManager;
    public BAX mNodeProvider;
    public static final Rect INVALID_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final InterfaceC2196BAb<C2197BAc> NODE_ADAPTER = new BAZ();
    public static final InterfaceC2195BAa<Ao1<C2197BAc>, C2197BAc> SPARSE_VALUES_ADAPTER = new BAY();
    public final Rect mTempScreenRect = new Rect();
    public final Rect mTempParentRect = new Rect();
    public final Rect mTempVisibleRect = new Rect();
    public final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mHoveredVirtualViewId = Integer.MIN_VALUE;

    public static int A00(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw C60O.A0i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        return i != -1 ? createEventForChild(i, i2) : createEventForHost(i2);
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect != null && !rect.isEmpty() && this.mHost.getWindowVisibility() == 0) {
            View view = this.mHost;
            while (true) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                        break;
                    }
                } else if (parent != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? onPerformActionForVirtualView(i, i2, bundle) : clearAccessibilityFocus(i) : requestAccessibilityFocus(i) : clearKeyboardFocusForVirtualView(i) : requestKeyboardFocusForVirtualView(i);
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public C2197BAc obtainAccessibilityNodeInfo(int i) {
        return i == -1 ? createNodeForHost() : createNodeForChild(i);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(C2197BAc c2197BAc) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, C2197BAc c2197BAc);

    public boolean performAction(int i, int i2, Bundle bundle) {
        return i != -1 ? performActionForChild(i, i2, bundle) : this.mHost.performAccessibilityAction(i2, bundle);
    }

    public static int A01(Rect rect, Rect rect2, int i) {
        int iHeight;
        int i2;
        int iHeight2;
        if (i == 17) {
            iHeight = rect.top + (rect.height() / 2);
            i2 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw C60O.A0i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = rect.top + (rect.height() / 2);
                i2 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - (i2 + (iHeight2 / 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(android.graphics.Rect r4, android.graphics.Rect r5, int r6) {
        /*
            r0 = 17
            r3 = 1
            r2 = 0
            if (r6 == r0) goto L19
            r0 = 33
            if (r6 == r0) goto L24
            r0 = 66
            if (r6 == r0) goto L19
            r0 = 130(0x82, float:1.82E-43)
            if (r6 == r0) goto L24
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L19:
            int r1 = r5.bottom
            int r0 = r4.top
            if (r1 < r0) goto L31
            int r1 = r5.top
            int r0 = r4.bottom
            goto L2e
        L24:
            int r1 = r5.right
            int r0 = r4.left
            if (r1 < r0) goto L31
            int r1 = r5.left
            int r0 = r4.right
        L2e:
            if (r1 > r0) goto L31
            return r3
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAV.A02(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(android.graphics.Rect r4, android.graphics.Rect r5, int r6) {
        /*
            r0 = 17
            r3 = 1
            r2 = 0
            if (r6 == r0) goto L48
            r0 = 33
            if (r6 == r0) goto L39
            r0 = 66
            if (r6 == r0) goto L23
            r0 = 130(0x82, float:1.82E-43)
            if (r6 != r0) goto L32
            int r0 = r4.top
            int r1 = r5.top
            if (r0 < r1) goto L1c
            int r0 = r4.bottom
            if (r0 > r1) goto L59
        L1c:
            int r1 = r4.bottom
            int r0 = r5.bottom
        L20:
            if (r1 >= r0) goto L59
            return r3
        L23:
            int r0 = r4.left
            int r1 = r5.left
            if (r0 < r1) goto L2d
            int r0 = r4.right
            if (r0 > r1) goto L59
        L2d:
            int r1 = r4.right
            int r0 = r5.right
            goto L20
        L32:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L39:
            int r0 = r4.bottom
            int r1 = r5.bottom
            if (r0 > r1) goto L43
            int r0 = r4.top
            if (r0 < r1) goto L59
        L43:
            int r1 = r4.top
            int r0 = r5.top
            goto L56
        L48:
            int r0 = r4.right
            int r1 = r5.right
            if (r0 > r1) goto L52
            int r0 = r4.left
            if (r0 < r1) goto L59
        L52:
            int r1 = r4.left
            int r0 = r5.left
        L56:
            if (r1 <= r0) goto L59
            return r3
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAV.A03(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    private C2197BAc createNodeForHost() {
        C2197BAc c2197BAc = new C2197BAc(AccessibilityNodeInfo.obtain(this.mHost));
        View view = this.mHost;
        AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList arrayListA0h = C3cG.A0h();
        getVisibleVirtualViews(arrayListA0h);
        if (accessibilityNodeInfo.getChildCount() > 0 && arrayListA0h.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayListA0h.size();
        for (int i = 0; i < size; i++) {
            accessibilityNodeInfo.addChild(this.mHost, AnonymousClass001.A0F(arrayListA0h.get(i)));
        }
        return c2197BAc;
    }

    public static int keyToDirection(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            sendEventForVirtualView(i, 128);
            sendEventForVirtualView(i2, 256);
        }
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                updateHoveredVirtualView(virtualViewAt);
                if (virtualViewAt != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && this.mHoveredVirtualViewId != Integer.MIN_VALUE) {
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // X.C8053FRg
    public FRa getAccessibilityNodeProvider(View view) {
        BAX bax = this.mNodeProvider;
        if (bax != null) {
            return bax;
        }
        BAX bax2 = new BAX(this);
        this.mNodeProvider = bax2;
        return bax2;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((this.mHost.isFocused() || this.mHost.requestFocus()) && (i2 = this.mKeyboardFocusedVirtualViewId) != i) {
            if (i2 != Integer.MIN_VALUE) {
                clearKeyboardFocusForVirtualView(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.mKeyboardFocusedVirtualViewId = i;
                onVirtualViewKeyboardFocusChanged(i, true);
                sendEventForVirtualView(i, 8);
                return true;
            }
        }
        return false;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i, i2));
    }

    public final void setBoundsInScreenFromBoundsInParent(C2197BAc c2197BAc, Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
        accessibilityNodeInfo.setBoundsInParent(rect);
        Rect rect2 = new Rect();
        rect2.set(rect);
        if (c2197BAc.A00 != -1) {
            C2197BAc c2197BAc2 = new C2197BAc(AccessibilityNodeInfo.obtain());
            Rect rect3 = new Rect();
            for (int i = c2197BAc.A00; i != -1; i = c2197BAc2.A00) {
                View view = this.mHost;
                c2197BAc2.A00 = -1;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc2.A02;
                accessibilityNodeInfo2.setParent(view, -1);
                accessibilityNodeInfo2.setBoundsInParent(INVALID_BOUNDS);
                onPopulateNodeForVirtualView(i, c2197BAc2);
                accessibilityNodeInfo2.getBoundsInParent(rect3);
                rect2.offset(rect3.left, rect3.top);
            }
        }
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        rect2.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        accessibilityNodeInfo.setBoundsInScreen(rect2);
    }

    public BAV(View view) {
        if (view == null) {
            throw C60O.A0i("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04(android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8) {
        /*
            boolean r1 = A02(r5, r6, r8)
            boolean r0 = A02(r5, r7, r8)
            r4 = 0
            if (r0 != 0) goto L6d
            if (r1 == 0) goto L6d
            r0 = 17
            if (r8 == r0) goto L51
            r0 = 33
            if (r8 == r0) goto L56
            r0 = 66
            if (r8 == r0) goto L4c
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L66
            int r1 = r5.bottom
            int r0 = r7.top
        L21:
            if (r1 > r0) goto L5d
        L23:
            r0 = 1
        L24:
            r3 = 1
            if (r0 == 0) goto L46
            r0 = 17
            if (r8 == r0) goto L46
            r0 = 66
            if (r8 == r0) goto L46
            int r2 = A00(r5, r6, r8)
            r0 = 33
            if (r8 == r0) goto L47
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L5f
            int r1 = r7.bottom
            int r0 = r5.bottom
        L3f:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            if (r2 >= r0) goto L6d
        L46:
            return r3
        L47:
            int r1 = r5.top
            int r0 = r7.top
            goto L3f
        L4c:
            int r1 = r5.right
            int r0 = r7.left
            goto L21
        L51:
            int r1 = r5.left
            int r0 = r7.right
            goto L5a
        L56:
            int r1 = r5.top
            int r0 = r7.bottom
        L5a:
            if (r1 < r0) goto L5d
            goto L23
        L5d:
            r0 = 0
            goto L24
        L5f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L66:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAV.A04(android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C2197BAc c2197BAcObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c2197BAcObtainAccessibilityNodeInfo.A03());
        AccessibilityNodeInfo accessibilityNodeInfo = c2197BAcObtainAccessibilityNodeInfo.A02;
        accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain.setSource(this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private C2197BAc createNodeForChild(int i) {
        boolean z;
        C2197BAc c2197BAc = new C2197BAc(AccessibilityNodeInfo.obtain());
        AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setClassName(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_BOUNDS;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view = this.mHost;
        c2197BAc.A00 = -1;
        accessibilityNodeInfo.setParent(view);
        onPopulateNodeForVirtualView(i, c2197BAc);
        if (c2197BAc.A03() == null && accessibilityNodeInfo.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfo.getBoundsInParent(this.mTempParentRect);
        accessibilityNodeInfo.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempParentRect.equals(rect) && this.mTempScreenRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfo.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        int i2 = 128;
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfo.setPackageName(this.mHost.getContext().getPackageName());
        View view2 = this.mHost;
        c2197BAc.A01 = i;
        accessibilityNodeInfo.setSource(view2, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            accessibilityNodeInfo.setAccessibilityFocused(true);
        } else {
            accessibilityNodeInfo.setAccessibilityFocused(false);
            i2 = 64;
        }
        accessibilityNodeInfo.addAction(i2);
        if (this.mKeyboardFocusedVirtualViewId == i) {
            z = true;
            accessibilityNodeInfo.addAction(2);
        } else {
            z = false;
            if (accessibilityNodeInfo.isFocusable()) {
                accessibilityNodeInfo.addAction(1);
            }
        }
        accessibilityNodeInfo.setFocused(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        if (this.mTempScreenRect.equals(rect)) {
            setBoundsInScreenFromBoundsInParent(c2197BAc, this.mTempParentRect);
            accessibilityNodeInfo.getBoundsInScreen(this.mTempScreenRect);
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                accessibilityNodeInfo.setBoundsInScreen(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    accessibilityNodeInfo.setVisibleToUser(true);
                }
            }
        }
        return c2197BAc;
    }

    private Ao1<C2197BAc> getAllNodes() {
        ArrayList arrayListA0h = C3cG.A0h();
        getVisibleVirtualViews(arrayListA0h);
        Ao1<C2197BAc> ao1 = new Ao1<>();
        for (int i = 0; i < arrayListA0h.size(); i++) {
            ao1.A03(AnonymousClass001.A0F(arrayListA0h.get(i)), createNodeForChild(AnonymousClass001.A0F(arrayListA0h.get(i))));
        }
        return ao1;
    }

    private void getBoundsInScreen(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).A02.getBoundsInScreen(rect);
    }

    public static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i != 130) {
            throw C60O.A0i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
    
        if (r0 < r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010f, code lost:
    
        r9 = r2.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0134, code lost:
    
        if (r0 >= 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean moveFocus(int r15, android.graphics.Rect r16) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAV.moveFocus(int, android.graphics.Rect):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r5 = 0
            r2 = 1
            if (r0 == r2) goto L18
            int r1 = r7.getKeyCode()
            r0 = 61
            r4 = 0
            if (r1 == r0) goto L46
            r0 = 66
            if (r1 == r0) goto L36
            switch(r1) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            return r5
        L19:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L18
            int r3 = keyToDirection(r1)
            int r0 = r7.getRepeatCount()
            int r2 = r0 + 1
            r1 = 0
        L2a:
            if (r5 >= r2) goto L51
            boolean r0 = r6.moveFocus(r3, r4)
            if (r0 == 0) goto L51
            int r5 = r5 + 1
            r1 = 1
            goto L2a
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L18
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L18
            r6.clickKeyboardFocusedVirtualView()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r0 = 2
            boolean r1 = r6.moveFocus(r0, r4)
        L51:
            return r1
        L52:
            boolean r0 = r7.hasModifiers(r2)
            if (r0 == 0) goto L18
            boolean r1 = r6.moveFocus(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAV.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // X.C8053FRg
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C8053FRg
    public void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.mManager.isEnabled() && (parent = this.mHost.getParent()) != null) {
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, 2048);
            accessibilityEventCreateEvent.setContentChangeTypes(i2);
            parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventCreateEvent);
        }
    }
}
