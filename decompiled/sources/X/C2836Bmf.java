package X;

import android.os.Build;

/* renamed from: X.Bmf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2836Bmf {
    public final InterfaceC2839Bmi A00;

    public static C2836Bmf A00() {
        return new C2836Bmf(Build.VERSION.SDK_INT >= 30 ? new C2844Bmn() : new C2840Bmj());
    }

    public C2836Bmf(InterfaceC2839Bmi interfaceC2839Bmi) {
        this.A00 = interfaceC2839Bmi;
    }
}
