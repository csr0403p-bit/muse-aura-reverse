package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FVj extends AbstractC8132FVu {
    public final C8497Ff4 A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FVj(android.view.View r7, X.C8497Ff4 r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.A00 = r8
            int r0 = r7.getSystemUiVisibility()
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            boolean r2 = X.AnonymousClass002.A1L(r0)
            r6.A02 = r2
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof X.C8128FUx
            if (r0 == 0) goto L64
            X.FUx r1 = (X.C8128FUx) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.A0A
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L5d
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            X.FX9 r0 = r1.A0K
            if (r0 == 0) goto L55
            X.FXA r0 = r0.A00
            android.content.res.ColorStateList r0 = r0.A0B
        L2b:
            if (r0 == 0) goto L42
            int r0 = r0.getDefaultColor()
        L31:
            if (r0 == 0) goto L3e
            double r4 = X.EGb.A00(r0)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L3f
        L3e:
            r0 = 0
        L3f:
            r6.A01 = r0
            return
        L42:
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L5a
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L31
        L55:
            android.content.res.ColorStateList r0 = r7.getBackgroundTintList()
            goto L2b
        L5a:
            r6.A01 = r2
            return
        L5d:
            java.lang.String r0 = "The view is not associated with BottomSheetBehavior"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L64:
            java.lang.String r0 = "The view is not a child of CoordinatorLayout"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FVj.<init>(android.view.View, X.Ff4):void");
    }

    public static void A00(View view, FVj fVj) {
        int top = view.getTop();
        C8496Ff3 c8496Ff3 = fVj.A00.A00;
        if (top < c8496Ff3.A0D().A03) {
            boolean z = fVj.A01;
            int systemUiVisibility = view.getSystemUiVisibility();
            int i = systemUiVisibility & (-8193);
            if (z) {
                i = systemUiVisibility | 8192;
            }
            view.setSystemUiVisibility(i);
            view.setPadding(view.getPaddingLeft(), AbstractC7607F5u.A0E(view, c8496Ff3.A0D().A03), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            boolean z2 = fVj.A02;
            int systemUiVisibility2 = view.getSystemUiVisibility();
            int i2 = systemUiVisibility2 & (-8193);
            if (z2) {
                i2 = systemUiVisibility2 | 8192;
            }
            view.setSystemUiVisibility(i2);
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
