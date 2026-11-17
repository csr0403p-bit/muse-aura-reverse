package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Bpi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2947Bpi {
    public static <T> ListenableFuture<T> A00(InterfaceC2940BpU<T> interfaceC2940BpU) {
        C3010Brs<T> c3010Brs = new C3010Brs<>();
        C3009Brr<T> c3009Brr = new C3009Brr<>(c3010Brs);
        c3010Brs.A00 = c3009Brr;
        c3010Brs.A02 = interfaceC2940BpU.getClass();
        try {
            Object objA4r = interfaceC2940BpU.A4r(c3010Brs);
            if (objA4r != null) {
                c3010Brs.A02 = objA4r;
            }
            return c3009Brr;
        } catch (Exception e) {
            c3009Brr.A00(e);
            return c3009Brr;
        }
    }

    public static C3009Brr A01(Object obj, int i) {
        return A00(new EID(obj, i));
    }

    public static C3009Brr A02(Object obj, Object obj2, int i) {
        return A00(new EIC(i, obj, obj2));
    }

    public static C3009Brr A03(Object obj, Object obj2, Object obj3, int i) {
        return A00(new C7424Evc(obj, obj2, obj3, i));
    }
}
