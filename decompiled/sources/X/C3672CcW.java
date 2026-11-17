package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.CcW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3672CcW {
    public static AbstractC3804Cen A09;
    public static final C3802Cel A0A;
    public final int A00;
    public final InterfaceC3730CdT A01;
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
        A0A = new C3802Cel(1, objArr);
    }

    public C3672CcW(Context context, InterfaceC3730CdT interfaceC3730CdT, final C3577CUy c3577CUy, String str) {
        context.getPackageName();
        this.A05 = CAA.A00(context);
        this.A04 = c3577CUy;
        this.A01 = interfaceC3730CdT;
        C3518CRs.A00();
        this.A06 = str;
        this.A02 = C3663CcJ.A00().A01(new Callable() { // from class: X.CcS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CA8.A01.A00(this.A00.A06);
            }
        });
        C3663CcJ c3663CcJA00 = C3663CcJ.A00();
        c3577CUy.getClass();
        this.A03 = c3663CcJA00.A01(new Callable() { // from class: X.Ccj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c3577CUy.A00();
            }
        });
        C3802Cel c3802Cel = A0A;
        this.A00 = c3802Cel.containsKey(str) ? Cb9.A01(context, (String) c3802Cel.get(str), false) : -1;
    }
}
