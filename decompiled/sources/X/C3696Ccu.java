package X;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.Ccu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3696Ccu {
    public static AbstractC3815Cey A09;
    public static final C3812Cev A0A;
    public final int A00;
    public final InterfaceC3731CdU A01;
    public final CSA A02;
    public final CSA A03;
    public final C3577CUy A04;
    public final String A05;
    public final String A06;
    public final Map A07 = BV4.A0u();
    public final Map A08 = BV4.A0u();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        BV7.A1O(objArr);
        A0A = new C3812Cev(1, objArr);
    }

    public static long A00(List list, double d) {
        return C3cG.A05(list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0)));
    }

    public static final boolean A01(EnumC10420Hbt enumC10420Hbt, C3696Ccu c3696Ccu, long j) {
        Map map = c3696Ccu.A07;
        return map.get(enumC10420Hbt) == null || j - C3cG.A05(map.get(enumC10420Hbt)) > 30000;
    }

    public C3696Ccu(Context context, InterfaceC3731CdU interfaceC3731CdU, final C3577CUy c3577CUy, String str) {
        context.getPackageName();
        this.A05 = CAA.A00(context);
        this.A04 = c3577CUy;
        this.A01 = interfaceC3731CdU;
        C3737Cda.A00();
        this.A06 = str;
        this.A02 = C3663CcJ.A00().A01(new Callable() { // from class: X.CdL
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CA8.A01.A00(this.A00.A06);
            }
        });
        C3663CcJ c3663CcJA00 = C3663CcJ.A00();
        c3577CUy.getClass();
        this.A03 = c3663CcJA00.A01(new Callable() { // from class: X.CdQ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c3577CUy.A00();
            }
        });
        C3812Cev c3812Cev = A0A;
        this.A00 = c3812Cev.containsKey(str) ? Cb9.A01(context, (String) c3812Cev.get(str), false) : -1;
    }
}
