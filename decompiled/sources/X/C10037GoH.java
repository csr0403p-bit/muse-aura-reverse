package X;

import X.InterfaceC9827GiL;
import java.io.Serializable;

/* renamed from: X.GoH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10037GoH<F extends InterfaceC9827GiL> implements Serializable {
    public static final long serialVersionUID = 1;
    public int _enabled;

    public static <F extends InterfaceC9827GiL> C10037GoH<F> A00(F[] fArr) {
        int length = fArr.length;
        if (length > 31) {
            throw BV5.A0T("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{C60Q.A0e(fArr[0]), Integer.valueOf(length)});
        }
        int iAHO = 0;
        for (F f : fArr) {
            if (f.AA2()) {
                iAHO |= f.AHO();
            }
        }
        C10037GoH<F> c10037GoH = new C10037GoH<>();
        c10037GoH._enabled = iAHO;
        return c10037GoH;
    }
}
