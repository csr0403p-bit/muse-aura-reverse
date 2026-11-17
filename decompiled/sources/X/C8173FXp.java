package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.FXp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8173FXp {
    public C8142FWg A00;
    public C8142FWg A01;
    public C8142FWg A02;
    public final View A03;
    public final C8139FWc A04 = C8139FWc.A00();

    public final void A03() {
        this.A01 = null;
        A02();
        A02();
    }

    public static ColorStateList A00(C8173FXp c8173FXp) {
        C8142FWg c8142FWg = c8173FXp.A00;
        if (c8142FWg != null) {
            return c8142FWg.A00;
        }
        return null;
    }

    public static PorterDuff.Mode A01(C8173FXp c8173FXp) {
        C8142FWg c8142FWg = c8173FXp.A00;
        if (c8142FWg != null) {
            return c8142FWg.A01;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r5 = this;
            android.view.View r4 = r5.A03
            android.graphics.drawable.Drawable r3 = r4.getBackground()
            if (r3 == 0) goto L45
            X.FWg r0 = r5.A01
            if (r0 == 0) goto L46
            X.FWg r2 = r5.A02
            if (r2 != 0) goto L17
            X.FWg r2 = new X.FWg
            r2.<init>()
            r5.A02 = r2
        L17:
            r1 = 0
            r2.A00 = r1
            r0 = 0
            r2.A02 = r0
            r2.A01 = r1
            r2.A03 = r0
            android.content.res.ColorStateList r0 = r4.getBackgroundTintList()
            r1 = 1
            if (r0 == 0) goto L2c
            r2.A02 = r1
            r2.A00 = r0
        L2c:
            android.graphics.PorterDuff$Mode r0 = r4.getBackgroundTintMode()
            if (r0 == 0) goto L36
            r2.A03 = r1
            r2.A01 = r0
        L36:
            boolean r0 = r2.A02
            if (r0 != 0) goto L3e
            boolean r0 = r2.A03
            if (r0 == 0) goto L46
        L3e:
            int[] r0 = r4.getDrawableState()
            X.C8137FWa.A01(r3, r2, r0)
        L45:
            return
        L46:
            X.FWg r2 = r5.A00
            if (r2 != 0) goto L3e
            X.FWg r2 = r5.A01
            if (r2 == 0) goto L45
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8173FXp.A02():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(int r4) {
        /*
            r3 = this;
            X.FWc r2 = r3.A04
            if (r2 == 0) goto L15
            android.view.View r0 = r3.A03
            android.content.Context r1 = r0.getContext()
            monitor-enter(r2)
            X.FWa r0 = r2.A00     // Catch: java.lang.Throwable -> L12
            android.content.res.ColorStateList r0 = r0.A02(r1, r4)     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        L15:
            r0 = 0
            r3.A01 = r0
            goto L2c
        L19:
            monitor-exit(r2)
            if (r0 == 0) goto L15
            X.FWg r1 = r3.A01
            if (r1 != 0) goto L27
            X.FWg r1 = new X.FWg
            r1.<init>()
            r3.A01 = r1
        L27:
            r1.A00 = r0
            r0 = 1
            r1.A02 = r0
        L2c:
            r3.A02()
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8173FXp.A04(int):void");
    }

    public final void A05(ColorStateList colorStateList) {
        C8142FWg c8142FWg = this.A00;
        if (c8142FWg == null) {
            c8142FWg = new C8142FWg();
            this.A00 = c8142FWg;
        }
        c8142FWg.A00 = colorStateList;
        c8142FWg.A02 = true;
        A02();
    }

    public final void A06(PorterDuff.Mode mode) {
        C8142FWg c8142FWg = this.A00;
        if (c8142FWg == null) {
            c8142FWg = new C8142FWg();
            this.A00 = c8142FWg;
        }
        c8142FWg.A01 = mode;
        c8142FWg.A03 = true;
        A02();
    }

    public final void A07(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListA02;
        View view = this.A03;
        Context context = view.getContext();
        int[] iArr = FYT.A0O;
        C8140FWd c8140FWdA00 = C8140FWd.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                int resourceId = typedArray.getResourceId(0, -1);
                C8139FWc c8139FWc = this.A04;
                synchronized (c8139FWc) {
                    colorStateListA02 = c8139FWc.A00.A02(context, resourceId);
                }
                if (colorStateListA02 != null) {
                    C8142FWg c8142FWg = this.A01;
                    if (c8142FWg == null) {
                        c8142FWg = new C8142FWg();
                        this.A01 = c8142FWg;
                    }
                    c8142FWg.A00 = colorStateListA02;
                    c8142FWg.A02 = true;
                    A02();
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c8140FWdA00.A01(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(FWU.A00(null, typedArray.getInt(2, -1)));
            }
        } finally {
            typedArray.recycle();
        }
    }

    public C8173FXp(View view) {
        this.A03 = view;
    }
}
