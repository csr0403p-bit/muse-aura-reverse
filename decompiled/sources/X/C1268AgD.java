package X;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: X.AgD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1268AgD {
    public static final C1268AgD A00 = new C1268AgD();

    public static final float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1278AgO.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1278AgO.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static final EdgeEffect A02(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC1278AgO.A02(context) : new C1275AgL(context);
    }

    public static final void A03(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof C1275AgL)) {
            edgeEffect.onRelease();
            return;
        }
        C1275AgL c1275AgL = (C1275AgL) edgeEffect;
        float f2 = c1275AgL.A00 + f;
        c1275AgL.A00 = f2;
        if (Math.abs(f2) > c1275AgL.A01) {
            c1275AgL.onRelease();
        }
    }

    public static final void A04(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float A05(EdgeEffect edgeEffect, AXN axn, float f, float f2) {
        float f3 = AbstractC1276AgM.A02;
        double dAEm = axn.AEm() * 386.0878f * 160.0f * 0.84f;
        double d = AbstractC1276AgM.A02 * dAEm;
        if (((float) (d * Math.exp((AbstractC1276AgM.A01 / AbstractC1276AgM.A00) * Math.log((Math.abs(f) * 0.35f) / d)))) > A00(edgeEffect) * f2) {
            return 0.0f;
        }
        A04(edgeEffect, Ab3.A01(f));
        return f;
    }
}
