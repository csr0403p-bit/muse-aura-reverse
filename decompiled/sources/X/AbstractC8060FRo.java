package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.aura.R;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: X.FRo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8060FRo {
    public static WeakHashMap<View, C8093FSz> A00;
    public static final int[] A02 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final FS3 A01 = new FS3() { // from class: X.FS2
        @Override // X.FS3
        public final C8071FRz AVD(C8071FRz c8071FRz) {
            return c8071FRz;
        }
    };
    public static final ViewOnAttachStateChangeListenerC8062FRq A03 = new ViewOnAttachStateChangeListenerC8062FRq();

    /* JADX WARN: Multi-variable type inference failed */
    public static C8071FRz A01(View view, C8071FRz c8071FRz) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sbA0f = C3cG.A0f(c8071FRz, "performReceiveContent: ");
            sbA0f.append(", view=");
            AbstractC7609F5w.A1L(sbA0f, view);
            sbA0f.append("[");
            sbA0f.append(view.getId());
            Log.d("ViewCompat", AnonymousClass001.A0v("]", sbA0f));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC8063FRr.A00(view, c8071FRz);
        }
        FS1 fs1 = (FS1) view.getTag(R.id.tag_on_receive_content_listener);
        if (fs1 == null || (c8071FRz = fs1.AVC(view, c8071FRz)) != null) {
            return (view instanceof FS3 ? (FS3) view : A01).AVD(c8071FRz);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(android.view.View r4, java.lang.CharSequence r5) {
        /*
            r1 = 1
            X.I0D r0 = new X.I0D
            r0.<init>(r1)
            r0.A02(r4, r5)
            X.FRq r3 = X.AbstractC8060FRo.A03
            if (r5 == 0) goto L35
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r2 = r3.A00
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L1c
            int r1 = r4.getWindowVisibility()
            r0 = 1
            if (r1 == 0) goto L1d
        L1c:
            r0 = 0
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r4, r0)
            r4.addOnAttachStateChangeListener(r3)
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L34
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r3)
        L34:
            return
        L35:
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r3.A00
            r0.remove(r4)
            r4.removeOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8060FRo.A0A(android.view.View, java.lang.CharSequence):void");
    }

    public static void A0B(View view, boolean z) {
        new I0D(3).A02(view, Boolean.valueOf(z));
    }

    @Deprecated
    public static C8093FSz A02(View view) {
        WeakHashMap<View, C8093FSz> weakHashMap = A00;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap<>();
            A00 = weakHashMap;
        }
        C8093FSz c8093FSz = weakHashMap.get(view);
        if (c8093FSz != null) {
            return c8093FSz;
        }
        C8093FSz c8093FSz2 = new C8093FSz(view);
        A00.put(view, c8093FSz2);
        return c8093FSz2;
    }

    public static void A06(View view, C8053FRg c8053FRg) {
        if (c8053FRg == null && (view.getAccessibilityDelegate() instanceof C8054FRh)) {
            c8053FRg = new C8053FRg();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c8053FRg == null ? null : c8053FRg.mBridge);
    }

    public static void A07(View view, FS1 fs1, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC8063FRr.A01(view, fs1, strArr);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        if (fs1 != null) {
            BeS.A06(AnonymousClass002.A1X(strArr), "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                }
                i++;
            }
            BeS.A06(!z, FGI.A0M("A MIME type set here must not start with *: ", Arrays.toString(strArr)));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, fs1);
    }

    public static String[] A0D(View view) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC8063FRr.A02(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static C8053FRg A00(View view) {
        View.AccessibilityDelegate accessibilityDelegate = view.getAccessibilityDelegate();
        if (accessibilityDelegate == null) {
            return null;
        }
        return accessibilityDelegate instanceof C8054FRh ? ((C8054FRh) accessibilityDelegate).A00 : new C8053FRg(accessibilityDelegate);
    }

    public static C8497Ff4 A03(View view, C8497Ff4 c8497Ff4) {
        WindowInsets windowInsetsA02 = c8497Ff4.A02();
        if (windowInsetsA02 != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsA02);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsA02)) {
                return C8497Ff4.A01(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return c8497Ff4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(android.view.View r5, int r6) {
        /*
            android.content.Context r0 = r5.getContext()
            android.view.accessibility.AccessibilityManager r0 = X.AbstractC7608F5v.A0F(r0)
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L77
            r4 = 1
            java.lang.Object r0 = X.I0D.A00(r5, r4)
            if (r0 == 0) goto L22
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L22
            int r0 = r5.getWindowVisibility()
            r3 = 1
            if (r0 == 0) goto L23
        L22:
            r3 = 0
        L23:
            int r1 = r5.getAccessibilityLiveRegion()
            r0 = 32
            if (r1 != 0) goto L50
            if (r3 != 0) goto L50
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L77
            android.view.ViewParent r0 = r5.getParent()
            r0.notifySubtreeAccessibilityStateChanged(r5, r5, r6)     // Catch: java.lang.AbstractMethodError -> L3b
            return
        L3b:
            r2 = move-exception
            android.view.ViewParent r0 = r5.getParent()
            java.lang.String r1 = X.C3cI.A0Y(r0)
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r1, r2)
            return
        L50:
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r3 != 0) goto L58
            r0 = 2048(0x800, float:2.87E-42)
        L58:
            r2.setEventType(r0)
            r2.setContentChangeTypes(r6)
            if (r3 == 0) goto L74
            java.util.List r1 = r2.getText()
            java.lang.Object r0 = X.I0D.A00(r5, r4)
            r1.add(r0)
            int r0 = r5.getImportantForAccessibility()
            if (r0 != 0) goto L74
            r5.setImportantForAccessibility(r4)
        L74:
            r5.sendAccessibilityEventUnchecked(r2)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8060FRo.A04(android.view.View, int):void");
    }

    public static void A05(View view, int i) {
        AbstractList abstractListA0h = (AbstractList) view.getTag(R.id.tag_accessibility_actions);
        if (abstractListA0h == null) {
            abstractListA0h = C3cG.A0h();
            view.setTag(R.id.tag_accessibility_actions, abstractListA0h);
        }
        for (int i2 = 0; i2 < abstractListA0h.size(); i2++) {
            if (((AccessibilityNodeInfo.AccessibilityAction) ((C2203BAi) abstractListA0h.get(i2)).A03).getId() == i) {
                abstractListA0h.remove(i2);
                return;
            }
        }
    }

    public static void A08(View view, C8497Ff4 c8497Ff4) {
        WindowInsets windowInsetsDispatchApplyWindowInsets;
        WindowInsets windowInsetsA02 = c8497Ff4.A02();
        if (windowInsetsA02 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsetsDispatchApplyWindowInsets = AbstractC8059FRn.A00(view, windowInsetsA02);
            } else {
                WindowInsets windowInsets = FS0.A00;
                windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsetsA02);
            }
            if (windowInsetsDispatchApplyWindowInsets.equals(windowInsetsA02)) {
                return;
            }
            C8497Ff4.A01(view, windowInsetsDispatchApplyWindowInsets);
        }
    }

    public static void A09(View view, C2203BAi c2203BAi) {
        C8053FRg c8053FRgA00 = A00(view);
        if (c8053FRgA00 == null) {
            c8053FRgA00 = new C8053FRg();
        }
        A06(view, c8053FRgA00);
        A05(view, ((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03).getId());
        AbstractCollection abstractCollectionA0h = (AbstractCollection) view.getTag(R.id.tag_accessibility_actions);
        if (abstractCollectionA0h == null) {
            abstractCollectionA0h = C3cG.A0h();
            view.setTag(R.id.tag_accessibility_actions, abstractCollectionA0h);
        }
        abstractCollectionA0h.add(c2203BAi);
        A04(view, 0);
    }

    public static void A0C(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        C7384Etj.A0Y(view2, 0);
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }
}
