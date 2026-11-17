package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.Ff4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8497Ff4 {
    public static final C8497Ff4 A01;
    public final C8496Ff3 A00;

    static {
        int i = Build.VERSION.SDK_INT;
        A01 = i >= 34 ? C8502Ff9.A00 : i >= 30 ? C8501Ff8.A00 : C8496Ff3.A01;
    }

    public static C8345FcJ A00(C8345FcJ c8345FcJ, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c8345FcJ.A01 - i);
        int iA0D = AbstractC7607F5u.A0D(c8345FcJ.A03, i2, 0);
        int iA0D2 = AbstractC7607F5u.A0D(c8345FcJ.A02, i3, 0);
        int iA0D3 = AbstractC7607F5u.A0D(c8345FcJ.A00, i4, 0);
        return (iMax == i && iA0D == i2 && iA0D2 == i3 && iA0D3 == i4) ? c8345FcJ : C8345FcJ.A00(iMax, iA0D, iA0D2, iA0D3);
    }

    public final WindowInsets A02() {
        C8496Ff3 c8496Ff3 = this.A00;
        if (c8496Ff3 instanceof C8495Ff2) {
            return ((C8495Ff2) c8496Ff3).A0A;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8497Ff4) {
            return Ht0.A00(this.A00, ((C8497Ff4) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8497Ff4(X.C8497Ff4 r5) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8497Ff4.<init>(X.Ff4):void");
    }

    public static C8497Ff4 A01(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C8497Ff4 c8497Ff4 = new C8497Ff4(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            C8497Ff4 c8497Ff4A00 = AbstractC8508FfF.A00(view);
            C8496Ff3 c8496Ff3 = c8497Ff4.A00;
            c8496Ff3.A0L(c8497Ff4A00);
            View rootView = view.getRootView();
            c8496Ff3.A0I(rootView);
            c8496Ff3.A0J(rootView);
            c8496Ff3.A0G();
            c8496Ff3.A0H(view.getWindowSystemUiVisibility());
        }
        return c8497Ff4;
    }

    public C8497Ff4(WindowInsets windowInsets) {
        C8503FfA c8503FfA;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c8503FfA = new C8505FfC(this, windowInsets);
        } else if (i >= 34) {
            c8503FfA = new C8502Ff9(this, windowInsets);
        } else if (i >= 31) {
            c8503FfA = new C8512FfJ(this, windowInsets);
        } else if (i >= 30) {
            c8503FfA = new C8501Ff8(this, windowInsets);
        } else {
            c8503FfA = new C8503FfA(this, windowInsets);
            ((C8511FfI) c8503FfA).A00 = null;
            c8503FfA.A01 = null;
            c8503FfA.A00 = null;
            c8503FfA.A02 = null;
        }
        this.A00 = c8503FfA;
    }
}
