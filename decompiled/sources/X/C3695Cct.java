package X;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.Cct, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3695Cct {
    public static AbstractC3820Cf8 A09;
    public static final C3817Cf5 A0A;
    public final int A00;
    public final InterfaceC3729CdS A01;
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
        A0A = new C3817Cf5(1, objArr);
    }

    public static long A00(List list, double d) {
        return C3cG.A05(list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0)));
    }

    public C3695Cct(Context context, InterfaceC3729CdS interfaceC3729CdS, final C3577CUy c3577CUy, String str) {
        context.getPackageName();
        this.A05 = CAA.A00(context);
        this.A04 = c3577CUy;
        this.A01 = interfaceC3729CdS;
        C3736CdZ.A00();
        this.A06 = str;
        this.A02 = C3663CcJ.A00().A01(new Callable() { // from class: X.CdH
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CA8.A01.A00(this.A00.A06);
            }
        });
        C3663CcJ c3663CcJA00 = C3663CcJ.A00();
        c3577CUy.getClass();
        this.A03 = c3663CcJA00.A01(new Callable() { // from class: X.CdN
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c3577CUy.A00();
            }
        });
        C3817Cf5 c3817Cf5 = A0A;
        this.A00 = c3817Cf5.containsKey(str) ? Cb9.A01(context, (String) c3817Cf5.get(str), false) : -1;
    }
}
