package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes6.dex */
public abstract class FUN {
    public final int A00() {
        if (!(this instanceof FVi)) {
            return 0;
        }
        BottomSheetBehavior bottomSheetBehavior = ((FVi) this).A00;
        return bottomSheetBehavior.A0R ? bottomSheetBehavior.A0C : bottomSheetBehavior.A04;
    }

    public final int A01(View view, int i) {
        int width;
        if (this instanceof FVi) {
            return view.getLeft();
        }
        FVZ fvz = (FVZ) this;
        boolean zA1Q = AnonymousClass002.A1Q(view.getLayoutDirection(), 1);
        int i2 = fvz.A02.A02;
        int width2 = fvz.A01;
        if (i2 != 0) {
            width2 -= view.getWidth();
            width = view.getWidth() + fvz.A01;
        } else if (zA1Q) {
            width2 -= view.getWidth();
            width = fvz.A01;
        } else {
            width = view.getWidth() + width2;
        }
        return Math.min(Math.max(width2, i), width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r1 < X.AbstractC7607F5u.A0B(r0, r2)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r2 = r5.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r6 < X.AbstractC7607F5u.A0B(r6, r5.A04)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r0 > r2) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r7, float r8, float r9) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FUN.A02(android.view.View, float, float):void");
    }

    public final void A03(View view, int i) {
        if (this instanceof FVi) {
            ((FVi) this).A00.A08();
            return;
        }
        FVZ fvz = (FVZ) this;
        float f = fvz.A01;
        float fA02 = AbstractC7607F5u.A02(view);
        SwipeDismissBehavior swipeDismissBehavior = fvz.A02;
        float f2 = f + (fA02 * swipeDismissBehavior.A01);
        float fA022 = fvz.A01 + (AbstractC7607F5u.A02(view) * swipeDismissBehavior.A00);
        float f3 = i;
        if (f3 <= f2) {
            view.setAlpha(1.0f);
        } else if (f3 >= fA022) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (fA022 - f2))), 1.0f));
        }
    }
}
