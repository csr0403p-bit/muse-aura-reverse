package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.Cd2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3704Cd2 {
    public static final C3772CeF A05;
    public final String A00;
    public final InterfaceC3745Cdi A01;
    public final CSA A02;
    public final CSA A03;
    public final C3577CUy A04;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        BV7.A1O(objArr);
        A05 = new C3772CeF(null, objArr, 1);
    }

    public C3704Cd2(Context context, InterfaceC3745Cdi interfaceC3745Cdi, final C3577CUy c3577CUy, String str) {
        context.getPackageName();
        CAA.A00(context);
        this.A04 = c3577CUy;
        this.A01 = interfaceC3745Cdi;
        synchronized (C3741Cde.class) {
            if (C3741Cde.A00 == null) {
                C3741Cde.A00 = new C3741Cde();
            }
        }
        this.A00 = str;
        this.A02 = C3663CcJ.A00().A01(new Callable() { // from class: X.CdI
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CA8.A01.A00(this.A00.A00);
            }
        });
        C3663CcJ c3663CcJA00 = C3663CcJ.A00();
        c3577CUy.getClass();
        this.A03 = c3663CcJA00.A01(new Callable() { // from class: X.CdO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c3577CUy.A00();
            }
        });
        C3772CeF c3772CeF = A05;
        if (c3772CeF.containsKey(str)) {
            Cb9.A01(context, (String) c3772CeF.get(str), false);
        }
    }
}
