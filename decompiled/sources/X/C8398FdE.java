package X;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.FdE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8398FdE extends AbstractC8429Fds {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r5.A01 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r1 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r5.A03 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C8402FdI A00(X.Hi2 r8, X.Hi2 r9) {
        /*
            X.FdI r5 = new X.FdI
            r5.<init>()
            r6 = 0
            r5.A05 = r6
            r5.A04 = r6
            java.lang.String r7 = "android:visibility:parent"
            r4 = 0
            r3 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r8 == 0) goto L72
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L72
            int r0 = X.BV7.A0H(r2, r1)
            r5.A01 = r0
            java.lang.Object r0 = r1.get(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A03 = r0
        L28:
            if (r9 == 0) goto L6f
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L6f
            int r0 = X.BV7.A0H(r2, r1)
            r5.A00 = r0
            java.lang.Object r4 = r1.get(r7)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L3e:
            r5.A02 = r4
            r3 = 1
            if (r8 == 0) goto L50
            if (r9 == 0) goto L56
            int r2 = r5.A01
            int r1 = r5.A00
            if (r2 != r1) goto L5f
            android.view.ViewGroup r0 = r5.A03
            if (r0 != r4) goto L5f
        L4f:
            return r5
        L50:
            int r0 = r5.A00
            if (r0 == 0) goto L65
            if (r9 != 0) goto L4f
        L56:
            int r0 = r5.A01
            if (r0 != 0) goto L4f
        L5a:
            r5.A04 = r6
        L5c:
            r5.A05 = r3
            return r5
        L5f:
            if (r2 == r1) goto L68
            if (r2 == 0) goto L5a
            if (r1 != 0) goto L4f
        L65:
            r5.A04 = r3
            goto L5c
        L68:
            if (r4 == 0) goto L5a
            android.view.ViewGroup r0 = r5.A03
            if (r0 != 0) goto L4f
            goto L65
        L6f:
            r5.A00 = r3
            goto L3e
        L72:
            r5.A01 = r3
            r5.A03 = r4
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8398FdE.A00(X.Hi2, X.Hi2):X.FdI");
    }

    public static void A01(Hi2 hi2) {
        View view = hi2.A00;
        int visibility = view.getVisibility();
        Map<String, Object> map = hi2.A02;
        BV4.A1H("android:visibility:visibility", map, visibility);
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator A0h(View view, Hi2 hi2, Hi2 hi22) {
        Number numberA0b;
        Property<View, Rect> property = AbstractC8405FdM.A00;
        Number numberA0b2 = BV4.A0b("android:fade:transitionAlpha", hi2.A02);
        float fFloatValue = numberA0b2 != null ? numberA0b2.floatValue() : 1.0f;
        if (fFloatValue == 0.0f) {
            view.setTransitionAlpha((hi22 == null || (numberA0b = BV4.A0b("android:fade:transitionAlpha", hi22.A02)) == null) ? 1.0f : numberA0b.floatValue());
            return null;
        }
        view.setTransitionAlpha(fFloatValue);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC8405FdM.A01, 0.0f);
        C8400FdG c8400FdG = new C8400FdG(view);
        objectAnimatorOfFloat.addListener(c8400FdG);
        A0B().A0Y(c8400FdG);
        return objectAnimatorOfFloat;
    }

    public C8398FdE() {
    }

    public C8398FdE(int i, int i2) {
    }
}
