package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes4.dex */
public final class B9H extends AVy implements InterfaceC1559AlZ {
    public final Drawable A00;
    public final MutableState A01;
    public final MutableState A02;
    public final F0C A03;

    public B9H(Drawable drawable) {
        this.A00 = drawable;
        AGE age = AGE.A00;
        this.A01 = new ParcelableSnapshotMutableState(age, 0);
        F0C f0c = B9J.A00;
        this.A02 = new ParcelableSnapshotMutableState(age, new AWA((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : C1Wv.A00(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.A03 = AbstractC5321DgF.A03(new C2293BSt(this, 38));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // X.AVy
    public final boolean applyLayoutDirection(EnumC1820Arj enumC1820Arj) {
        C7384Etj.A0Y(enumC1820Arj, 0);
        int i = 0;
        Drawable drawable = this.A00;
        int iOrdinal = enumC1820Arj.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
        }
        return drawable.setLayoutDirection(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x001b, B:5:0x0024, B:7:0x002a, B:8:0x0055, B:9:0x0060), top: B:15:0x001b }] */
    @Override // X.AVy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(X.AT3 r9) {
        /*
            r8 = this;
            r7 = 0
            X.C7384Etj.A0Y(r9, r7)
            X.AgP r0 = r9.AEq()
            X.AaI r0 = (X.AaI) r0
            X.AhC r0 = r0.A02
            X.AW9 r0 = r0.A02
            X.AhE r5 = r0.A01
            androidx.compose.runtime.MutableState r0 = r8.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            r5.Ac2()     // Catch: java.lang.Throwable -> L83
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L83
            r0 = 31
            if (r1 >= r0) goto L60
            android.graphics.drawable.Drawable r6 = r8.A00     // Catch: java.lang.Throwable -> L83
            boolean r0 = r6 instanceof android.graphics.drawable.AnimatedImageDrawable     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L60
            long r1 = r9.AKb()     // Catch: java.lang.Throwable -> L83
            r4 = 32
            long r1 = r1 >> r4
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L83
            float r3 = java.lang.Float.intBitsToFloat(r0)     // Catch: java.lang.Throwable -> L83
            long r1 = r8.mo0getIntrinsicSizeNHjbRc()     // Catch: java.lang.Throwable -> L83
            long r1 = r1 >> r4
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L83
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch: java.lang.Throwable -> L83
            float r3 = r3 / r0
            long r0 = r9.AKb()     // Catch: java.lang.Throwable -> L83
            float r2 = X.AWA.A00(r0)     // Catch: java.lang.Throwable -> L83
            long r0 = r8.mo0getIntrinsicSizeNHjbRc()     // Catch: java.lang.Throwable -> L83
            float r0 = X.AWA.A00(r0)     // Catch: java.lang.Throwable -> L83
            float r2 = r2 / r0
            r5.Ac5(r3, r2)     // Catch: java.lang.Throwable -> L83
        L55:
            android.graphics.Canvas r0 = X.AbstractC1290Aga.A00     // Catch: java.lang.Throwable -> L83
            r0 = r5
            X.Alm r0 = (X.C1572Alm) r0     // Catch: java.lang.Throwable -> L83
            android.graphics.Canvas r0 = r0.A00     // Catch: java.lang.Throwable -> L83
            r6.draw(r0)     // Catch: java.lang.Throwable -> L83
            goto L7f
        L60:
            android.graphics.drawable.Drawable r6 = r8.A00     // Catch: java.lang.Throwable -> L83
            long r3 = r9.AKb()     // Catch: java.lang.Throwable -> L83
            r0 = 32
            long r1 = r3 >> r0
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L83
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch: java.lang.Throwable -> L83
            int r1 = X.Ab3.A01(r0)     // Catch: java.lang.Throwable -> L83
            float r0 = X.AWA.A00(r3)     // Catch: java.lang.Throwable -> L83
            int r0 = X.Ab3.A01(r0)     // Catch: java.lang.Throwable -> L83
            r6.setBounds(r7, r7, r1, r0)     // Catch: java.lang.Throwable -> L83
            goto L55
        L7f:
            r5.Abc()
            return
        L83:
            r0 = move-exception
            r5.Abc()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B9H.onDraw(X.AT3):void");
    }

    @Override // X.AVy
    public final boolean applyAlpha(float f) {
        Drawable drawable = this.A00;
        int iA02 = Ab3.A02(f, 255.0f);
        if (iA02 < 0) {
            iA02 = 0;
        } else if (iA02 > 255) {
            iA02 = 255;
        }
        drawable.setAlpha(iA02);
        return true;
    }

    @Override // X.AVy
    public final boolean applyColorFilter(C1423Ais c1423Ais) {
        this.A00.setColorFilter(c1423Ais != null ? c1423Ais.A00 : null);
        return true;
    }

    @Override // X.AVy
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return ((AWA) this.A02.getValue()).A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        Drawable drawable = this.A00;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
        Drawable drawable = this.A00;
        drawable.setCallback((Drawable.Callback) this.A03.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        onForgotten();
    }
}
